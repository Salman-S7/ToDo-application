<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link href="/webjars/bootstrap/5.3.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<%@ include file="navbar.jsp"%>
	<div class="container">		
		<h1>welcome to login page</h1>
			<pre>${errorMessage}</pre>
			<form method="post">
				Name:
				<input type="text" name="name" placeholder="Enter name"><br>
				Password:
				<input type="password" name="password" placeholder="Enter password"><br>
				<input type="submit" >
			</form>
		</div>
</body>
</html>