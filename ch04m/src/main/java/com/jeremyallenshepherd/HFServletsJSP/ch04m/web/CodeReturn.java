package com.jeremyallenshepherd.HFServletsJSP.ch04m.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

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