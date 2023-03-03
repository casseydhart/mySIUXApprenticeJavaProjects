package com.beginwithjava.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/numbers")
public class RandomNumbers extends HttpServlet
{
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Four Random Numbers</title></head>");
        out.println("<body>");
        out.println("<ul>");
        for (int i = 1; i <= 4; i++)
        {
            out.println("<li>" + Math.random() + "</li>");
        }
        out.println("</ul>");
        out.println("</body></html>");
    }
}
