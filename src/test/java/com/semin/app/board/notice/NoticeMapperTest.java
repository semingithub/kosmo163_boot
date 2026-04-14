package com.semin.app.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.semin.app.page.Pager;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class NoticeMapperTest {

	@Autowired
	private NoticeMapper noticeMapper;
	
	//@Test
	void getCount(Pager pager) throws Exception {
		Long result = noticeMapper.getCount(pager);
		assertNotEquals(0, result);
	}
	
//	@Test
//	void testList() throws Exception {
//		List<NoticeDTO> li = noticeMapper.list();
//		assertNotEquals(0, li.size());
//		System.out.println(li.size());
//	}
	
	@Test
	void testDetail() throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNoticeNo(166L);
		
		noticeDTO = noticeMapper.detail(noticeDTO);
		
		log.info("Map: {}", noticeDTO);
		assertNotNull(noticeDTO);
	}
	
	//@Test
	void testCreate() throws Exception{
		int idx = 1;
		for(int i = 0; i <100; i++) {		
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setNoticeTitle("Title" + i);
			noticeDTO.setNoticeContents("Contents" + i);
			noticeDTO.setProfessorNo("P00"+idx);
			noticeDTO.setNoticeHits(0L);
			int DTO = noticeMapper.create(noticeDTO);
			idx++;
			
			if(idx>9) {
				idx = 1;
			}
			if(i%10==0) {
				Thread.sleep(1000);
			}
		}
		System.out.println("Finish");
	}
	
	//@Test
	void testDelete() throws Exception {
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNoticeNo(3L);
		
		int DTO = noticeMapper.delete(noticeDTO);
		assertEquals(1, DTO);
	}
}
