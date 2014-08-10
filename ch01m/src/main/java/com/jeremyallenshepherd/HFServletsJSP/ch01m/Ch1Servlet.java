package com.jeremyallenshepherd.HFServletsJSP.ch01m;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>Ch1Servlet is a very basic servlet that does not even utilize a JSP. It merely writes html to the output response.</p>
 * 
 * <p>
 * This exercise is from pages 30-31 of the book Head First Servlets &amp; JSP</br>
 * It is meant to be just a quick guide to writing, deploying, and running a servlet. Take notice of how painful it could be 
 * if we had to write html to the output this way. JSPs will make life easier for us in this regard.
 * </p>
 * 
 * <p>
 * Explanation of @SuppressWarnings -   
 * The compiler will warn about the absence of a serialVersionUID and this is beyond the scope of this demo, hence it 
 * is suppressed
 * </p>
 * 
 * @author Jeremy Shepherd
 *
 */
@SuppressWarnings("serial")
public class Ch1Servlet extends HttpServlet {

	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		Date today = new Date();
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
