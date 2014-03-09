<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ch07 JSP init params test</title>
</head>
<body>
<%!
// public void jspInit() {
// 	ServletConfig servletConfig = getServletConfig();
// 	String emailAddr = servletConfig.getInitParameter("email");
// 	ServletContext servletContext = servletConfig.getServletContext();
// 	servletContext.setAttribute("mail", emailAddr);
// }
%>

<%= application.getAttribute("mail") %>
<%--<%= getServletContext().getAttribute("mail") --%>
<%--<%= pageContext.getAttribute("mail", PageContext.APPLICATION_SCOPE) --%>
<%--<%= application.getAttribute("mail") --%>
<%--<%= pageContext.findAttribute("mail") --%>
</body>
</html>