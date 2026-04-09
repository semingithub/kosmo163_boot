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