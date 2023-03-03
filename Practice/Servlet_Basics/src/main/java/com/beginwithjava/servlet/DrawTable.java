package com.beginwithjava.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/table")
public class DrawTable extends HttpServlet
{
    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Table Example</title></head>");
        out.println("<body>");
        out.println("<table border = '1'>");
        out.println("<tr>");

        for (int i = 0; i <= 4; i++)
        {
            for (int j = 0; j <= 3; j++)
            {
                out.println("<td>[" + i + "," + j + "]</td>");
            }
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }
}
