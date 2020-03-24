package com.sysoiev.mapping_parameters;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MappingParametersServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message = getServletContext().getInitParameter("message");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        try {
            writer.println("<h2>" + message + "</h2>");
        } finally {
            writer.close();
        }
        /*
        * http://localhost:8080/servlets_war_exploded/params result: Hello from params !!!*/
    }
}
