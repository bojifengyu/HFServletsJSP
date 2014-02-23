<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
	<meta charset="UTF-8">
	<title>Chapter 6 Cookie Test</title>
</head>
<body>
	<h1 style="text-align: center;">Chapter 6 Cookie Test</h1>
	<p>
		A cookie has been created and placed in your browser<br>
	</p>
	<p><a href="<c:url value='/CheckCookie.do' />">Check the cookie</a></p>
	<p><a href="<c:url value='/Index.do' />">Back to Chapter 6 index</a></p>
</body>
</html>