package com.beginwithjava.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayCounter")
public class DisplayCounter extends HttpServlet
{
    protected void doGet( HttpServletRequest request,
    HttpServletResponse response ) throws ServletException, IOException
    {
        ServletContext servletContext = getServletContext();

        // get the counter
        Integer count = (Integer) servletContext.getAttribute( "counter" );

        // display the message "the counter is incremented"
        PrintWriter out = response.getWriter();

        response.setContentType( "text/html" );
        out.println( "<html><head><title>Display Counter</title></head><body>" );
        out.println( "<p>The counter value is currently: " + count + "</p>" );
        out.println( "</body></html>" );
    }
}
