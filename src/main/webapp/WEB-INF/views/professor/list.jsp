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
	<div>
		<table>
			<thead>
				<tr>
					<th>NO</th>
					<th>교수명</th>
					<th>부서번호</th>
				</tr>
			</thead>
			<tbody>
				<tr>
				<c:forEach items="${list}" var="d">
					<td>${d.professorNo}</td>
					<td>${d.professorName}</td>
					<td>${d.departmentNo}</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<button type="button" onclick="location.href='./create'" >추가</button>
	</div>
</body>
</html>