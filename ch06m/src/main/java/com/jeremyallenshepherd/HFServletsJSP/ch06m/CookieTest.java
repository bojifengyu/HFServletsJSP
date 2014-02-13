package com.jeremyallenshepherd.HFServletsJSP.ch06m;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class CookieTest
 */
@SuppressWarnings("serial")
public class CookieTest extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		String name = "Jeremy";
		Cookie cookie = new Cookie("username", name);
		cookie.setMaxAge(5);		// for testing purposes, set cookie expiration to a few seconds.
		response.addCookie(cookie);
		
		RequestDispatcher view = request.getRequestDispatcher("cookieResult.jsp");
		view.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
}
