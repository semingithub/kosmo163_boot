package com.semin.app.board.qna;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.semin.app.page.Pager;

@Service
public class QnaService {

	@Autowired
	private QnaMapper qnaMapper;

	@Value("${app.upload.base}")
	private String filePath;

	@Value("${app.board.qna}")
	private String qna;

	public List<QnaDTO> list(Pager pager) throws Exception {

		pager.makePageNumber(qnaMapper.getCount(pager));

		return qnaMapper.list(pager);
	}
	
	public int replyCreate(QnaDTO qnaDTO) throws Exception {
		QnaDTO parent = qnaMapper.detail(qnaDTO);
		
		// 답글의 REF
		qnaDTO.setNoticeRef(parent.getNoticeRef());
		// 답글의 STEP
		qnaDTO.setNoticeStep(parent.getNoticeStep() + 1);
		// 답글의 DEPTH
		qnaDTO.setNoticeDepth(parent.getNoticeDepth() + 1);
		
		int result = qnaMapper.replyUpdate(parent);
		
		result = qnaMapper.create(qnaDTO);
		
		return result;		
	}
	
	public QnaDTO detail(QnaDTO qnaDTO) throws Exception{
		return qnaMapper.detail(qnaDTO);
	}

	public int create(QnaDTO qnaDTO, MultipartFile[] attach) throws Exception {
		
	    if(qnaDTO.getNoticeStep() == null){
	        qnaDTO.setNoticeStep(0L);
	    }
	    if(qnaDTO.getNoticeDepth() == null){
	        qnaDTO.setNoticeDepth(0L);
	    }
	    
		int result = qnaMapper.create(qnaDTO);
		String filePath = this.filePath + this.qna;

		if (attach == null) {
			return result;
		}

		for (MultipartFile m : attach) {
			if (m.isEmpty()) {
				continue;
			}

			String fileName = UUID.randomUUID().toString();

			fileName = fileName + "_" + m.getOriginalFilename();

			File file = new File(filePath);
			if (!file.exists()) {
				file.mkdir();
			}
			
			file = new File(file, fileName);
			
			m.transferTo(file);
			
			QnaFileDTO qnaFileDTO = new QnaFileDTO();
			qnaFileDTO.setFileName(fileName);
			qnaFileDTO.setNoticeNo(qnaDTO.getNoticeNo());
			qnaFileDTO.setOriName(m.getOriginalFilename());
			result = qnaMapper.createFile(qnaFileDTO);
		}
		return result;
	}

}
