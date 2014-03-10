<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CounterV1 Ch07 Exercise</title>
</head>
<body>
	<h1 style="text-align: center;">Head First Servlets/JSP Chapter 7 - JSPs</h1>
	<p>
		The following is the result of a scriptlet which uses a counter object in order to attempt to display the number of
		times the jsp page has been accessed
	</p>
	
	<p>
	<!-- scriptlet using the Counter class-->
	The page count is:
	<% out.println(foo.Counter.getCount()); %>
	</p>
	
	<a href="<c:url value='/' />">Back to Chapter 7 index</a>
</body>
</html>