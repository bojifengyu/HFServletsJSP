package com.jeremyallenshepherd.HFServletsJSP.ch06m;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jeremyallenshepherd.HFServletsJSP.ch05m.Dog;

@SuppressWarnings("serial")
public class MainController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		
		out.println("<html><body><h1 style=\"text-align: center;\">Chapter 6 - Sessions - Cookies - Listeners</h1>");
		if (session.isNew()) {
			out.println("<p>Simply by coming to this page, a session has been created for you! But it is set for a 1 minute expiration from your last click</p>");
		} else {
			out.println("<p>Welcome Back! You are still in session! </p>");
		}
		
		out.println("<br>You have the following attributes in session: <br>");
		out.println(procureAttributesInSession(session));
		
		out.println("<br><a href=\"" + response.encodeRedirectURL("SessionPreExistingOnlyCheck.do") + "\">click me (encodeRedirectURL) to SessionPreExistingOnlyCheck.do</a><br>");
		out.println("<a href=\"" + response.encodeURL("CookieTest.do") + "\">click me (encodeURL) to create a cookie and go to CookieTest.do</a><br>");
		out.println("<a href=\"" + response.encodeURL("CheckCookie.do") + "\">click me (encodeURL) to check the cookie and go to CheckCookie.do</a><br>");
		out.println("<a href=\"" + response.encodeURL("DogInSession.do") + "\">click me to create Dog object and have it placed in your session</a><br>");
		
		// the session will be lost if you follow either of the two links below because they are in different web apps
		// with different contexts and you can't share sessions between contexts
		out.println("<br>The session will not be available to these other webapps if you follow either of the next two links because they are in different app contexts<br>");
		out.println("<a href=\"" + response.encodeRedirectURL("../ch03m/form.html") + "\">click me (encodeRedirectURL) to go to the Beer app of chapter 3</a><br>");
		out.println("<a href=\"" + response.encodeURL("../ch05m/ListenTest.do") + "\">click me (encodeRedirectURL) to ListenTest.do of chapter 5</a><br>");
		
		int activeSessionCount = Ch6SessionListener.getActiveSessions();
		out.println("<br>active sessions = " + activeSessionCount + "<br>");
		out.println("</body></html>");
	}
	
	private String procureAttributesInSession(HttpSession session) {
		
		Enumeration<?> sessionAttributeNames = (Enumeration<?>) session.getAttributeNames();
		StringBuilder sb = new StringBuilder();
		while (sessionAttributeNames.hasMoreElements()) {
			String sessionAttributeName = (String)sessionAttributeNames.nextElement();
			Object sessionAttribute = session.getAttribute(sessionAttributeName);
			if (sessionAttribute instanceof String) {
				sb.append("Session Attribute Name: " + sessionAttributeName + "  Session Attribute Type: " 
						+ sessionAttribute.getClass() + "  Session Attribute Value: " 
						+ ((String)sessionAttribute) + "<br>");
			} else if (sessionAttribute instanceof Dog) {
				sb.append("Session Attribute Name: " + sessionAttributeName + "  Session Attribute Type: " 
						+ sessionAttribute.getClass() + "  Session Attribute Dog name: " 
						+ ((Dog)sessionAttribute).getName() + "<br>");
			}
		}
		return sb.toString();
	}
}
