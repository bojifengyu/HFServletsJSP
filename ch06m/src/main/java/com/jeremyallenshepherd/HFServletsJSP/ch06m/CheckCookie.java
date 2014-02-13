package com.jeremyallenshepherd.HFServletsJSP.ch06m;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckCookie
 */
@SuppressWarnings("serial")
public class CheckCookie extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie[] cookies = request.getCookies();
		
		if (cookies != null) {
			String userName = "";
			for (int i = 0; i < cookies.length; i++) {
				Cookie cookie = cookies[i];
				if (cookie.getName().equals("username")) {
					userName = cookie.getValue();
					out.println("Hello " + userName);
					break;
				}
			}
			if (userName.equals(""))
				out.println("I don't know you, sorry!");
		} else {
			out.println("You have your cookies disabled you dolt!");
		}
	}

}
