<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Head First Servlets/JSP Chapter 7 - JSPs</title>
</head>
<body>
	<h1 style="text-align: center;">Head First Servlets/JSP Chapter 7 - JSPs</h1>
	<a href="<c:url value='/forward?page=CounterV1' />">Link to CounterV1.jsp</a><br>
	<a href="<c:url value='/forward?page=CounterV2' />">Link to CounterV2.jsp</a><br>
	<a href="<c:url value='/forward?page=CounterV3' />">Link to CounterV3.jsp</a><br>
	<a href="<c:url value='/forward?page=CounterV4' />">Link to CounterV4.jsp</a><br>
	<a href="<c:url value='/forward?page=HobbyForm' />">Link to HobbyForm.jsp</a><br>
	<a href="<c:url value='/forward?page=TestInit' />">Link to TestInit.jsp</a><br>
	<a href="<c:url value='/forward?page=TestInitEL' />">Link to TestInitEL.jsp</a><br>
</body>
</html>