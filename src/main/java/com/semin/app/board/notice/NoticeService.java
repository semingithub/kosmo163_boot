package com.semin.app.board.notice;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.semin.app.page.Pager;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class NoticeService {

	@Autowired
	private NoticeMapper noticeMapper;

	@Value("${app.upload.base}")
	private String filePath;

	public List<NoticeDTO> list(Pager pager) throws Exception {
		pager.makePageNumber(noticeMapper.getCount(pager));
//		pager.makeRowNumber();

		return noticeMapper.list(pager);
	}

	public NoticeDTO detail(NoticeDTO noticeDTO) throws Exception {
		return noticeMapper.detail(noticeDTO);
	}

	public int create(NoticeDTO noticeDTO, MultipartFile attach) throws Exception {
		// 1. 어느 위치에 저장할지
		log.info(filePath);
		String filePath = this.filePath + "notice";

		// 2. 어떤 이름으로 저장할지
		String fileName = UUID.randomUUID().toString();
//		log.warn(fileName);
//
//		// 3. 확장자 처리
//		log.error(attach.getOriginalFilename());
//		String f = attach.getOriginalFilename();
//		f = f.substring(f.lastIndexOf("."));
//		log.info(f);
		
		fileName = fileName + "_" + attach.getOriginalFilename();
		
		// 3. 저장
		File file = new File(filePath);
		if(!file.exists()) {
			file.mkdirs();
		}
		
		file = new File(file, fileName);
		
		// a. 파일 저장
		attach.transferTo(file);
		
		return 0;// noticeMapper.create(noticeDTO);
	}
}