package com.semin.app.board.notice;

import com.semin.app.files.FileDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NoticeFileDTO extends FileDTO{
	
	private Long noticeNo;

}
