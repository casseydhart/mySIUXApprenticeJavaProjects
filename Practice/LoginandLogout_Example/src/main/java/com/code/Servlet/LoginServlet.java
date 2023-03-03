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
import com.code.Servlet.LoginDao;
import com.code.Servlet.LoginBean;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		RequestDispatcher dispatcher = request.getRequestDispatcher("link.html");
		dispatcher.include(request, response);
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		LoginBean bean = new LoginBean();
		LoginDao dao = new LoginDao();
		bean.setUserName(uname);
		bean.setPassword(pass);
		if (dao.vaildate(bean)) {
			System.out.println("in :");
			printWriter.println("<br><h1>Welcome " + uname + "</h1>");
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("username", uname);
		} else {
			System.out.println("error");
			printWriter.println("Incorrect Credentials!!!");
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("login.html");
			dispatcher1.include(request, response);
		}
	}
}
