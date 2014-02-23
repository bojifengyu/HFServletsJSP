package com.jeremyallenshepherd.HFServletsJSP.ch06m;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jeremyallenshepherd.HFServletsJSP.ch05m.Dog;

@SuppressWarnings("serial")
public class DogControl extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();

		out.println("<html><body><h1 style=\"text-align: center;\">Chapter 6 - Sessions - Cookies - Listeners</h1>");

		Dog dog;
		if (session.getAttribute("myDog") != null) {
			dog = new Dog("Geordi", "Golden Retriever");
			session.setAttribute("myDog", dog);
			out.println("Your dog object has just been created and placed in session. Name: " + dog.getName() + " Breed: " + dog.getBreed());
		} else {
			dog = (Dog) session.getAttribute("myDog");
			out.println("Your dog object is still in the session. Name: " + dog.getName() + " Breed: " + dog.getBreed());
		}
		
		out.println("<p><a href=\"" + response.encodeURL("Index.do") + "\">Go back to Chapter 6 Index</a></p>");
		int activeSessionCount = Ch6SessionListener.getActiveSessions();
		out.println("<br><br>active sessions = " + activeSessionCount + "<br>");
		out.println("</body></html>");
	}

}
