package com.code.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ViewServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		RequestDispatcher dispatcher = request.getRequestDispatcher("link.html");
		dispatcher.include(request, response);
		HttpSession httpSession = request.getSession(false);
		if (httpSession != null) {
			String uname = (String) httpSession.getAttribute("username");
			printWriter.println("<h1>Welcome " + uname + " to your profile!!!</h1>");
		} else {
			printWriter.println("<br><h1>Please Login First</h1>");
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("login.html");
			dispatcher1.include(request, response);
		}
	}
}
