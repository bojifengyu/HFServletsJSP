package com.jeremyallenshepherd.HFServletsJSP.ch06m;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionNewOrExistingCheck
 */
@SuppressWarnings("serial")
public class SessionNewOrExistingCheck extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("test session attributes<br>");
		
		HttpSession session = request.getSession();
		
		if (session.isNew())
			out.println("This is a new session.");
		else
			out.println("Welcome Back!");
	}

}
