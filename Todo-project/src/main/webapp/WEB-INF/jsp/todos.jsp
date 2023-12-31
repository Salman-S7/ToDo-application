<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="/webjars/bootstrap/5.3.1/css/bootstrap.min.css" rel="stylesheet">

<title>To do</title>
</head>
<body>
<%@ include file="navbar.jsp"%>
<div class="container">

<h1>welcome ${name} to todos page</h1>
	<h2>Todos are</h2>
	<table class="table">
		<thead>
			<tr>
				<th>Description</th>
				<th>Target Date</th>
				<th>Is Done?</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var = "todo">
				<tr>
					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
					<td><a href="delete?id=${todo.id}" class="btn btn-warning">Delete</a></td>
					<td><a href="update?id=${todo.id}" class="btn btn-success">Update</a></td>
				</tr>
			</c:forEach>
		</tbody>
		
	</table>
	<a href="todo" class="btn btn-success">Add Todo</a>
	<script src="webjars/jquery/3.7.0/jquery.min.js"></script>
	<script src="webjars/bootstrap/5.3.1/js/bootstrap.min.js"></script>
</div>
	
</body>
</html>