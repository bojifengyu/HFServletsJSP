<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ch7 JSP init params test using scriptels, declarations, and expressions</title>
</head>
<body>
<h1 style="text-align: center;">Head First Servlets/JSP Chapter 7 - JSPs</h1>
<h2>Ch7 JSP init params test using scriptels, declarations, and expressions</h2>
<%!
// Override the jspInit() and get the servlet init parameter 'email' and put it into a context scoped
// attribute 'mail'. 
public void jspInit() {
	ServletConfig servletConfig = getServletConfig();
	String emailAddr = servletConfig.getInitParameter("email");
	ServletContext servletContext = servletConfig.getServletContext();
	servletContext.setAttribute("mail", emailAddr);
}
%>
<p>
	Display the new "mail" attribute scoped to the ServletContext set in an overridden jspInit() in a declaration in this jsp.  
	We'll get it in a couple of different ways 
	<br><br>
	getServletContext().getAttribute("mail") - 
	<%= getServletContext().getAttribute("mail") %>
	<br>
	pageContext.getAttribute("mail", PageContext.APPLICATION_SCOPE) - 
	<%= pageContext.getAttribute("mail", PageContext.APPLICATION_SCOPE) %>
	<br>
	application.getAttribute("mail") - 
	<%= application.getAttribute("mail") %>
	<br>
	pageContext.findAttribute("mail") - 
	<%= pageContext.findAttribute("mail") %>
</p>
<a href="<c:url value='/' />">Back to Chapter 7 index</a>
</body>
</html>