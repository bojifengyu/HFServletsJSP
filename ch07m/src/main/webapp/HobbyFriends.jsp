<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>

<body>
	<h1 style="text-align: center;">Head First Servlets/JSP Chapter 7 - JSPs</h1>
	<p>
		The friends who share your hobby of 
		<%= request.getParameter("hobby") %>
		are: <br>
		<% ArrayList al = (ArrayList) request.getAttribute("names"); %>
		<% Iterator<?> it = al.iterator(); 
		while (it.hasNext()) { %>
			<%= it.next() %>
			<br>
		<% } %>
	</p>
	<a href="<c:url value='/' />">Back to Chapter 7 index</a>
</body>
</html>