package com.jeremyallenshepherd.HFServletsJSP.ch05m;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This Servlet is an exercise for demonstrating context parameters
 * 
 * @author Jeremy Shepherd
 */
public class TestContextParams extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println("Test Context Parameters<br>");
		
		Enumeration<String> contextParams = getServletContext().getInitParameterNames();
		while (contextParams.hasMoreElements()) {
			String contextParam = (String) contextParams.nextElement();
			out.print("<br>context param name = " + contextParam + "<br>");
			out.print("context param value = " + getServletContext().getInitParameter(contextParam) + "<br>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
