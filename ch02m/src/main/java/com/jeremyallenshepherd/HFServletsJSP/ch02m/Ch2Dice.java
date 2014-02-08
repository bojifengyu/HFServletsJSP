package com.jeremyallenshepherd.HFServletsJSP.ch02m;
import javax.servlet.http.*;
import java.io.*;

/**
 * <p>
 * Ch2Dice servlet is a very simple servlet and doesn't even utilize a JSP for the response. What it does do is
 * create some local variables and then uses them as part of the output of the response
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
public class Ch2Dice extends HttpServlet {
	
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		
		String d1 = Integer.toString((int) ((Math.random() * 6) + 1));
		String d2 = Integer.toString((int) ((Math.random() * 6) + 1));
		
		out.println(
				"<!DOCTYPE html>" +
				"<html>" +
				"<head>" +
				"<meta charset=\"UTF-8\">" +
				"<title>Head First Dice Servlet</title>" +
				"</head>" +
				"<body>" +
				"<h1 style=\"text-align: center\">HF\'s Chap 2 Dice Roller</h1>" +
				"<p>" + d1 + " and " + d2 + " were rolled" +
				"</body> </html>"
		);
	}
}
