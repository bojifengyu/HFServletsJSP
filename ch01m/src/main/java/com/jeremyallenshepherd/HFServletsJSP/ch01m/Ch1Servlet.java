package com.jeremyallenshepherd.HFServletsJSP.ch01m;

import javax.servlet.http.*;
import java.io.*;

@SuppressWarnings("serial")
public class Ch1Servlet extends HttpServlet {

	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		java.util.Date today = new java.util.Date();
		out.println(
				"<!DOCTYPE html>" +
				"<html>" +
				"<head>" +
				"<meta charset=\"UTF-8\">" +
				"<title>Head First 1st Servlet</title>" +
				"</head>" +
				"<body>" +
				"<h1 style=\"text-align: center\">HF\'s Chapter1 Servlet</h1>" +
				"<br>" + today + "</body>" + 
				"</html>");
	}
}
