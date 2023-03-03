package testPackage;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/add")
public class AddNumber extends HttpServlet
{
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException
    {
        String a = request.getParameter("first");
        String b = request.getParameter("second");

        int sum = Integer.parseInt(a) + Integer.parseInt(b);

        response.setContentType("text");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Add</title></head><body>");

        out.println("<p>The sum of " + a + " and " + b
                + " is " + sum + ".</p>");

        out.println("</body></html>");
    }
}
