package com.semin.app.board.notice;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.semin.app.page.Pager;

@Mapper
public interface NoticeMapper {

	public int createFile(NoticeFileDTO noticeFileDTO) throws Exception;
	
	public List<NoticeDTO> list(Pager pager) throws Exception;
	
	public Long getCount(Pager pager) throws Exception;
	
	public NoticeDTO detail(NoticeDTO noticeDTO) throws Exception;
	
	public int create(NoticeDTO noticeDTO) throws Exception;
	
	public int delete(NoticeDTO noticeDTO) throws Exception;
	
	public int update(NoticeDTO noticeDTO) throws Exception;
}
