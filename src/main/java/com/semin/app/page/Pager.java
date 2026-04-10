package com.semin.app.page;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Pager {

	// 페이지 번호
	private Long page;
	
	// 시작 ROWNUM, 끝 ROWNUM
	private Long first;
	private Long last;

	// 한페이지에 출력할 글의 갯수
	private Long perPage;

	// JSP에 출력할 시작번호
	private Long start;
	// JSP에 출력할 끝번호
	private Long end;
	
	// 이전 블럭 유무, 다음 블럭 유무
	private boolean pre;
	private boolean next;
	
	public Long getPerPage() {
		if(this.perPage == null || this.perPage%5 != 0) {
			this.perPage = 10L;
		}
		
		return this.perPage;
	}

	public Long getPage() {
		if (this.page == null) {
			this.page = 1L;
		}
		return this.page;
	}
	
	// --------------------
	public void makeRowNumber() throws Exception {
		this.first = (this.getPage() - 1) * this.getPerPage() + 1;
		this.last = this.getPage() * this.getPerPage();
	}

	// --------------------
	public void makePageNumber(Long count) throws Exception {

		// (2). 전체 갯수를 이용해서 전체 페이지 수 구하기
		Long totalPage = count / this.getPerPage();
		if (totalPage % this.perPage != 0) {
			totalPage++;
		}
		
		// (3). 전체 페이지수로 전체 블럭수 구하기
		Long perBlock = 5L;
		Long totalBlock = totalPage / perBlock;
		if (totalBlock % perBlock != 0) {
			totalBlock++;
		}
		
		// (4). 현재 페이지 번호로 현재 블럭 번호 구하기
		Long curBlock = this.getPage() / perBlock;
		if (this.getPage() % perBlock != 0) {
			curBlock++;
		}
		
		// (5). 현재 블럭 번호로 시작번호와 끝번호 구하기
		this.start = (curBlock - 1) * perBlock + 1;
		this.end = curBlock * perBlock;

		// 이전 블럭이 존재한다면 true, 아니면 false
		if(curBlock > 1) {
			this.pre = true;
		}
		
		// 다음 블럭이 존재한다면 true, 아니면 false
		
		if(curBlock != totalBlock) {
			this.next = true;
		} else {
			this.setEnd(totalPage);
		}
	}
}
