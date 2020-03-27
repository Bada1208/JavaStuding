package com.sysoiev.data_transfer_from_servlet_to_jsp.application;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/app")
public class AppServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext servletContext = getServletContext();
        servletContext.setAttribute("name", "Tom");
        servletContext.setAttribute("age", 35);

        getServletContext().getRequestDispatcher("/transfer.jsp").forward(request, response);
    }
}
