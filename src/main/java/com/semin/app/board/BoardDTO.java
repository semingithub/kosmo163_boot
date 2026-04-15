package com.semin.app.board;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {

	private Long noticeNo;
	private String noticeTitle;
	private String noticeContents;
	private String professorNo;
	private LocalDateTime noticeDate;
	private Long noticeHits;
	
}
