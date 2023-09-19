<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<form method="post">
	Enter Desription:<br>
	<textarea class="form-control mb-3" rows="5" cols="50" name="desc"></textarea>
		<input type="submit" class="btn btn-primary">
	</form>
</div>
</body>
</html>