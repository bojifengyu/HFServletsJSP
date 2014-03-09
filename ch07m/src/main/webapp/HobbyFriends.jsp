<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
The friends who share your hobby of 
<%= request.getParameter("hobby") %>
are: <br>
<% ArrayList<String> al = (ArrayList<String>) request.getAttribute("names"); %>
<% Iterator<?> it = al.iterator(); 
while (it.hasNext()) { %>
	<%= it.next() %>
	<br>
<% } %>
</body>
</html>