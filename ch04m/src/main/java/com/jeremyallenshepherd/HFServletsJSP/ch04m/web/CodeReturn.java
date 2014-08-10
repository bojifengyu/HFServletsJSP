package com.jeremyallenshepherd.HFServletsJSP.ch04m.web;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * This servlet supplies a particular file called bookCode.jar in a response
 * 
 * @author Jeremy Shepherd
 *
 */
@SuppressWarnings("serial")
public class CodeReturn extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		response.setContentType("application/jar");
		response.setHeader("Content-Disposition", "attachment; filename=bookCode.jar");
		ServletContext ctx = getServletContext();
		InputStream is = ctx.getResourceAsStream("/bookCode.jar");
		
		int read = 0;
		byte[] bytes = new byte[1024];

		OutputStream os = response.getOutputStream();
		while ((read = is.read(bytes)) != -1) {
			os.write(bytes, 0, read);
		}
	}
	
}