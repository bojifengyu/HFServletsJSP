<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@page import="java.util.*" %>
<!DOCTYPE HTML>

<html>
<head>
	<meta charset="utf-8">
	<title>Beer Selection Servlet</title>
</head>

<body>
	<h1 style="text-align: center;">Beer Recommendations JSP</h1>
	<p>
	<%
	List<?> styles = (List<?>) request.getAttribute("styles");
	Iterator<?> it= styles.iterator();
	while(it.hasNext()) {
		out.print("<br>try: " + it.next());
	}
	%>
	</p>

</body>
</html>