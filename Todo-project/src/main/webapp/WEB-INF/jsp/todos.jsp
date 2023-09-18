<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>To do</title>
</head>
<body>
<h1>welcome ${name} to todos page</h1>
	<h2>Todos are</h2>
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Description</th>
				<th>Target Date</th>
				<th>Is Done?</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var = "todo">
				<tr>
					<td>${todo.id}</td>
					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
				</tr>
			</c:forEach>
		</tbody>
		
	</table>
	
</body>
</html>