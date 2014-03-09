<%@ page import="foo.Counter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ch07 Exercise</title>
</head>
<body>
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
</body>
</html>