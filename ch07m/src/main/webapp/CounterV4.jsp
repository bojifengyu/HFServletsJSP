<%@ page import="foo.Counter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CounterV4 Ch07 Exercise</title>
</head>
<body>
	<h1 style="text-align: center;">Head First Servlets/JSP Chapter 7 - JSPs</h1>
	<p>
		The following is the result of a count declaration variable and an expression, no counter object is needed in order to attempt to display the number of
		times the jsp page has been accessed.  There is an additional double count processing going on.  The double count is meant to show a method declaration.
	</p>
	<p>
		<%-- declaration and expression - no counter class needed 
			declaration of method used to calculate double count --%>
		<%!int count = 0;
		int doubleCount = 0;%>
		<%!int doubleCount() {
			doubleCount = count * 2;
			return doubleCount;
		}%>
	
		The page count is:
		<%=++count%>
		<br> The double page count is:
		<%=doubleCount()%>
	</p>
	<a href="<c:url value='/' />">Back to Chapter 7 index</a>
</body>
</html>