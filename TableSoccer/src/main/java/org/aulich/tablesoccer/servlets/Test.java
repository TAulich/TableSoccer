package org.aulich.tablesoccer.servlets;

//Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//Extend HttpServlet class
public class Test extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 319973870860214061L;
	private String message;

	public void init() throws ServletException {
		// Do required initialization
		message = "Test-servlet of table-soccer application ..."
				+ "<br/>Now running as eclipse-project with gradle-plugin"
				+ "<br/>And Git-Support"
				+ "<br/>Changed on 2016-11-15 ;-)";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Set response content type
		response.setContentType("text/html");

		// Actual logic goes here.
		PrintWriter out = response.getWriter();
		out.println(message);
	}

	public void destroy() {
		// do nothing.
	}
}
