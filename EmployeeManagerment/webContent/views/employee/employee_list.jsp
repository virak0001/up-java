<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
<title>Employee List</title>
</head>
<body>
<h1 class="text-center">Employee List</h1>
<button type="button" class="btn btn-primary float-right">Add new Employee</button>
	<p>${data}</p>
	<table class="table">
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
      <th scope="col">Department</th>
      <th scope="col">Description</th>
    </tr>
  </thead>
  <c:forEach items="${list}" var="employee">
	    <tr>
	      <th>${employee.id}</th>
	      <td>${employee.name}</td>
	      <td>${employee.department}</td>
	      <td>${employee.description}</td>
	    </tr>
    </c:forEach>
  <tbody>
  </tbody>
</table>
</body>
</html>