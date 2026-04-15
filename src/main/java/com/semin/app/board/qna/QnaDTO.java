package com.semin.app.board.qna;

import java.util.List;

import com.semin.app.board.BoardDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QnaDTO extends BoardDTO{

	private List<QnaFileDTO> list;
	
	private Long noticeRef;
	private Long noticeStep;
	private Long noticeDepth;
	
}
