<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Professor List Page</h1>
	<button type="button" onclick="location.href='./create'">추가</button>
	<form action="./list" method="get">
		<input type="text" name="search">
		<button type="submit">검색</button>
	</form>
	<div>
		<table border="1" style="text-align: center;">
			<thead>
				<tr>
					<th>NO</th>
					<th>교수명</th>
					<th>부서번호</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="d">
					<tr>
						<td>${d.professorNo}</td>
						<td>${d.professorName}</td>
						<td>${d.departmentNo}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<li style="display: inline"><a href="./list?page=${pager.pre ? pager.start-1 : pager.start}&search=${pager.search}" style="text-decoration: none">◀</a></li>
			<c:forEach begin="${pager.start}" end="${pager.end}" var="i">
				<li style="display: inline;"><a href="./list?page=${i}&search=${pager.search}" style="text-decoration: none">${i}</a></li>
			</c:forEach>
			<li style="display: inline"><a href="./list?page=${pager.next ? pager.end+1 : pager.end}&search=${pager.search}" style="text-decoration: none">▶</a></li>
		</div>
	</div>
</body>
</html>