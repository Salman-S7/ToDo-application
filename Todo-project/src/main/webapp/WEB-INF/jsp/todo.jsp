<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Todo</title>
<link href="/webjars/bootstrap/5.3.1/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<p class="container h2 mt-5">Add Todo</p>
<div class="container mt-2">
	<form:form method="post" modelAttribute="todo">
	Enter Desription:<br>
	<form:errors path="description" cssClass="text-warning"></form:errors>
	<form:textarea class="form-control mb-3" rows="5" cols="50"
	required="required" path="description"></form:textarea>
		<input type="submit" class="btn btn-primary">
	</form:form>
</div>
</body>
</html>