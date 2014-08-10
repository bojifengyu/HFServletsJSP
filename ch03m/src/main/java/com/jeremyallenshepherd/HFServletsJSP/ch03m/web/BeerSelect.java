package com.jeremyallenshepherd.HFServletsJSP.ch03m.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jeremyallenshepherd.HFServletsJSP.ch03m.model.BeerExpert;

/**
 * <p>
 * This serlvet evaluates the best list of beers according to a user selected beer color.
 * It gets a beer color parameter from the request and then passes that parameter to another 
 * class in order to receive back a list of beers that go with that color. 
 * </p>
 * 
 * <p>
 * Explanation of @SuppressWarnings -   
 * The compiler will warn about the absence of a serialVersionUID and this is beyond the scope of this demo, hence it 
 * is suppressed
 * </p>
 * 
 * @author Jeremy Shepherd
 *
 */
@SuppressWarnings("serial")
public class BeerSelect extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String color = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List<String> result = be.getBrands(color);

		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}

}