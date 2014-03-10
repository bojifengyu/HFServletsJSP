<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ch07 page 300</title>
</head>

<body>
<h1 style="text-align: center;">Head First Servlets/JSP Chapter 7 - JSPs</h1>
<form method="post" action="HobbyPage.do">
	<p>Choose a hobby:</p>
	<select name="hobby" size="1">
		<option>horse skiing</option>
		<option>extreme knitting</option>
		<option>alpine scuba</option>
		<option>speed dating</option>
	</select>
	<br><br>
	<input type="submit">
</form>
<a href="<c:url value='/' />">Back to Chapter 7 index</a>
</body>
</html>