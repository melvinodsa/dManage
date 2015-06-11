package org.dManage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dmanage
 */
@WebServlet(description = "simple servlet", urlPatterns = { "/Dmanage" })
public class Dmanage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET method");
		PrintWriter writer = response.getWriter();
		writer.println("<html><h3>Hello me again. But I am <em>dynamic</em> now</h3></html>");
	}

}
