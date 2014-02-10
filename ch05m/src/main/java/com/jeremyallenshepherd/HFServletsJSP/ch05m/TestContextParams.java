package com.jeremyallenshepherd.HFServletsJSP.ch05m;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestContextParams
 * 
 * @author Jeremy Shepherd
 */
public class TestContextParams extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Test Context Parameters<br>");
		
		Enumeration<?> contextParams = getServletContext().getInitParameterNames();
		while (contextParams.hasMoreElements()) {
			out.print("<br>context param name = " + contextParams.nextElement() + "<br>");
		}
		out.println("<br>breed is " + getServletContext().getInitParameter("breed") + "<br>");
		out.println("<br>my context param is " + getServletContext().getInitParameter("my context param") + "<br>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
