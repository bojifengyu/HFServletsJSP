package com.jeremyallenshepherd.HFServletsJSP.ch07m;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HobbyServlet
 */
public class HobbyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		ArrayList<String> al = new ArrayList<String>();
		al.add("Fred");
		al.add("Pradeep");
		al.add("Philippe");
		
		request.setAttribute("names", al);
		
		RequestDispatcher view = request.getRequestDispatcher("HobbyFriends.jsp");
		view.forward(request, response);
	}

}
