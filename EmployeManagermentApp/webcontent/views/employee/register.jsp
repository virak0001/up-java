<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
<h1 class="text-center">Add new employee</h1>
	<div class="container-sm">
		<form action = "${pageContext.request.contextPath}/EmployeeController" method="POST">
		  <div class="mb-3">
		    <label class="form-label">Name</label>
		    <input type="text" class="form-control" name = "name" placeholder = "Enter Name" value = "${employee.name}">
		  </div>
		  <div class="mb-3">
		    <label class="form-label">Department</label>
		    <input type="text" class="form-control" placeholder="department" name="department" value = "${employee.department}">
		  </div>
		  <div class="mb-3">
		  	<label class="form-label">Description</label>
		    <input type="text" class="form-control" name="description" placeholder="description" value="${employee.description}">
		  </div>
		  <input type = "hidden" name = "id" value = "${employee.id}"/>
		  <button type="submit" class="btn btn-primary">save</button>
		  <a href = "${pageContext.request.contextPath}/EmployeeController?action=LIST">Back to list</a>
		</form>
	</div>
</body>
</html>