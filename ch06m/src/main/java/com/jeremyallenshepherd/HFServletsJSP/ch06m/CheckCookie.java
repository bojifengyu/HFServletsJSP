package com.jeremyallenshepherd.HFServletsJSP.ch06m;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 */
@SuppressWarnings("serial")
public class CheckCookie extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h1 style=\"text-align: center;\">Chapter 6 - Cookie Check</h1>");
		Cookie[] cookies = request.getCookies();
		
		if (cookies != null) {
			String cookieValue = "";
			for (int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				if (cookie.getName().equals("myTestCookie")) {
					cookieValue = cookie.getValue();
					out.println("Cookie Name: " + cookie.getName() + " Cookie Value: " + cookieValue);
					break;
				}
			}
			if (cookieValue.equals(""))
				out.println("I don't know any valid cookies");
		} else {
			out.println("You have your cookies disabled you dolt!");
		}
		
		out.println("<p><a href=\"" + response.encodeURL("Index.do") + "\">Go back to Chapter 6 Index</a></p>");
		int activeSessionCount = Ch6SessionListener.getActiveSessions();
		out.println("<p>active sessions = " + activeSessionCount + "</p>");
	}

}
