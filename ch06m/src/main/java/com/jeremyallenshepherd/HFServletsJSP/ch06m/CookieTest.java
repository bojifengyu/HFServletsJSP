package com.jeremyallenshepherd.HFServletsJSP.ch06m;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 * 
 */
@SuppressWarnings("serial")
public class CookieTest extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		String name = "Jeremy";
		Cookie cookie = new Cookie("myTestCookie", name);
		cookie.setMaxAge(20);		// for testing purposes, set cookie expiration to a few seconds.
		response.addCookie(cookie);
		
		RequestDispatcher view = request.getRequestDispatcher("cookieResult.jsp");
		view.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
}
