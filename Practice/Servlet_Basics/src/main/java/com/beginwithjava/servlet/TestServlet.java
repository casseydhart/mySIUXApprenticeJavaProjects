package com.beginwithjava.servlet;
		  
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
          
@WebServlet("/test")
public class TestServlet extends HttpServlet
{
    // process "get" requests from clients
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException
    {
          
        response.setContentType("text");
        PrintWriter out = response.getWriter();

        // send HTML page to client
        out.println("<html>");
        out.println("<head><title>A Test Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Test</h1>");
        out.println("<p>Simple servlet for testing.</p>");
        out.println("</body></html>");
    }
}
