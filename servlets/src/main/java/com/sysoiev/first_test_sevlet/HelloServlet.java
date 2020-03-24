package com.sysoiev.first_test_sevlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //first of all need to delete index.jsp file, in order to tomcat read from the servlet straightly
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h2>Hello from HelloServlet</h2>");
        printWriter.close();

    }
}
