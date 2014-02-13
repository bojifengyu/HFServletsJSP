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
public class SessionPreExistingOnlyCheck extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("test pre-existing session<br>");
		
		// In the real world, the only time you'd want to use getSession(false) is if you do NOT want to create a new session
		HttpSession session = request.getSession(false);
		
		if (session == null) {
			out.println("no session was available");
			out.println("making one...");
			session = request.getSession();
		} else
			out.println("There was a session!");
	}

}