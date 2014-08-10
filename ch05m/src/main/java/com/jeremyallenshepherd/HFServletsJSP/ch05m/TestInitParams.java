package com.jeremyallenshepherd.HFServletsJSP.ch05m;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This Servlet is an exercise for demonstrating servlet init parameters
 * 
 * @author Jeremy Shepherd
 */
public class TestInitParams extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("test init parameters<br>");
		
		Enumeration<String> initParams = getServletConfig().getInitParameterNames();
		while (initParams.hasMoreElements()) {
			out.println("<br>param name = " + initParams.nextElement() + "<br>");
		}
		out.println("<br>main email is " + getServletConfig().getInitParameter("mainEmail") + "<br>");
		out.println("admin email is " + getServletConfig().getInitParameter("adminEmail") + "<br>");
	}

}
