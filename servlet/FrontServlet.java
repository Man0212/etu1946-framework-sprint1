package etu1946.framework.servlet

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FrontServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String url=request.getServletPath();
        String requete=request.getQueryString();
        url=url+"?"+requete;
        request.setAttribute("url",url);
        RequestDispatcher dispat=request.getRequestDispatcher("show.jsp");
        dispat.forward(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
