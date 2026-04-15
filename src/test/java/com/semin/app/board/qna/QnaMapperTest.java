package com.semin.app.board.qna;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class QnaMapperTest {

	@Autowired
	private QnaMapper qnaMapper;
	
	@Test
	void testCreate() throws Exception{
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setNoticeTitle("답글2");
		qnaDTO.setNoticeContents("답글 내용2");
		qnaDTO.setProfessorNo("user2");
		qnaDTO.setNoticeRef(26L);
		qnaDTO.setNoticeStep(2L);
		qnaDTO.setNoticeDepth(2L);
		
		int result = qnaMapper.create(qnaDTO);
		assertEquals(1, result);
	}

}
