package com.jeremyallenshepherd.HFServletsJSP.ch06m;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jeremyallenshepherd.HFServletsJSP.ch06m.*;

/**
 * Servlet implementation class SessionNewOrExistingCheck
 */
@SuppressWarnings("serial")
public class SessionURLRewriting extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		int activeSessionCount = BeerSessionCounter.getActiveSessions();
		
		String dog = "Geordi";
		session.setAttribute("myDog", dog);
		
		out.println("<html><body>");
		out.println("<a href=\"" + response.encodeURL("SessionNewOrExistingCheck.do") + "\">click me (encodeURL) to SessionNewOrExistingCheck.do</a><br>");
		out.println("<a href=\"" + response.encodeRedirectURL("SessionPreExistingOnlyCheck.do") + "\">click me (encodeRedirectURL) to SessionPreExistingOnlyCheck.do</a><br>");
		out.println("<a href=\"" + response.encodeURL("CookieTest.do") + "\">click me (encodeURL) to CookieTest.do</a><br>");
		out.println("<a href=\"" + response.encodeRedirectURL("../ch03/form.html") + "\">click me (encodeRedirectURL) to the Beer app</a><br>");
		out.println("<a href=\"" + response.encodeURL("../ch05/ListenTest.do") + "\">click me (encodeRedirectURL) to ListenTest.do</a><br>");
		out.println("<br>active sessions = " + activeSessionCount + "<br>");
		out.println("</body></html>");
	}

}
