package com.jeremyallenshepherd.HFServletsJSP.ch05m;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ListenerTester<br>
 * 
 * <p>
 * This is the class that tests the ServletContextListener. If everything is working right, by the time the
 * Servlet's doGet() method runs for the first time, the Dog object will be waiting as an attribute in the 
 * ServletContext
 * </p>
 * 
 * @author Jeremy Shepherd
 */
@SuppressWarnings("serial")
public class ListenerTester extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("test context attributes set by listener<br>");
		out.println("<br>");
		Dog dog = (Dog) getServletContext().getAttribute("dog");
		out.println("dog breed is: " + dog.getBreed());
	}

}