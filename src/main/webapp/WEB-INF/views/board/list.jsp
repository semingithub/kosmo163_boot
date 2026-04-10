<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="/WEB-INF/views/temp/head_css.jsp"></c:import>
</head>
<body id="page-top">
	<div id="wrapper">
		<c:import url="/WEB-INF/views/temp/sidebar.jsp"></c:import>
		<div id="content-wrapper" class="d-flex flex-column">
			<div id="content">
				<c:import url="/WEB-INF/views/temp/topbar.jsp"></c:import>
				<!-- Page Content  -->
				<div class="container-fluid">
					<h1 class="h3 mb-4 text-gray-800">Notice List Page</h1>
					<div class="row justify-content-center">
						<div class="col-6">
							<table class="table" style="text-align: center;">
								<thead class="thead-dark">
									<tr>
										<th>번호</th>
										<th>제목</th>
										<th>작성자</th>
										<th>작성시간</th>
										<th>조회수</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${list}" var="l">
										<tr>
											<td>
												<h5>${l.noticeNo}</h5>
											</td>
											<td>
												<h5>${l.noticeTitle}</h5>
											</td>
											<td>
												<h5>${l.professorNo}</h5>
											</td>
											<td>
												<h5>${l.noticeDate}</h5>
											</td>
											<td>
												<h5>${l.noticeHits}</h5>
											</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							<div class="row justify-content-center">
								<nav aria-label="Page navigation example">
									<ul class="pagination">
										<li class="page-item ${pager.pre?'':'disabled'}">
											<a class="page-link" href="./list?page=${pager.pre ? pager.start-1 : pager.start}" aria-label="Previous">
												<span aria-hidden="true">&laquo;</span>
											</a>
										</li>
										<c:forEach begin="${pager.start}" end="${pager.end}" var="i">
											<li class="page-item">
												<a class="page-link" href="./list?page=${i}">${i}</a>
											</li>
										</c:forEach>
										<li class="page-item ${pager.next?'':'disabled'}">
											<a class="page-link" href="./list?page=${pager.next ? pager.end+1 : pager.end}" aria-label="Next">
												<span aria-hidden="true">&raquo;</span>
											</a>
										</li>
									</ul>
								</nav>
							</div>
						</div>
					</div>
					<!-- End Page Content container-fluid-->
				</div>
				<!-- End Content-->
			</div>
			<c:import url="/WEB-INF/views/temp/footer.jsp"></c:import>
			<!-- End content-wrapper -->
		</div>
		<!-- End wrapper -->
	</div>
	<c:import url="/WEB-INF/views/temp/footer_script.jsp"></c:import>
</body>
</html>