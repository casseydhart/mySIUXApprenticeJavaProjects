package com.beginwithjava.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/Counter")
public class Counter extends HttpServlet
{
    int count;

    public void init(ServletConfig config)
            throws ServletException
    {
        super.init(config);
        count = 0;
    }

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException
    {
        // increment the counter
        ++count;
        
        // display the message
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html><head><title>Request Counter</title></head><body>");
        out.println("<p>Since loading, this servlet has been accessed "
                + count + " times.</p>");
        out.println("</body></html>");
    }
}
