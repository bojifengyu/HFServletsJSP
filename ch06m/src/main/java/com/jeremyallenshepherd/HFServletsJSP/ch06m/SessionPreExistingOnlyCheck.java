package com.jeremyallenshepherd.HFServletsJSP.ch06m;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 */
@SuppressWarnings("serial")
public class SessionPreExistingOnlyCheck extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1 style=\"text-align: center;\">Chapter 6 - test pre-existing session</h1>");
		
		// In the real world, the only time you'd want to use getSession(false) is if you do NOT want to create a new session
		HttpSession session = request.getSession(false);
		
		if (session == null) {
			out.println("<p>no session was available<br>");
			out.println("making one...</p>");
			session = request.getSession();
		} else
			out.println("There was a session!");
		
		out.println("<p><a href=\"" + response.encodeURL("Index.do") + "\">Go back to Chapter 6 Index</a></p>");
		int activeSessionCount = Ch6SessionListener.getActiveSessions();
		out.println("<p>active sessions = " + activeSessionCount + "</p>");

	}

}