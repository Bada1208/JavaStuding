package com.sysoiev.javabean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/javabean")
public class UserServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User tom = new User("Tom", 25);
        request.setAttribute("user", tom);
        getServletContext()
                .getRequestDispatcher("/user.jsp")
                .forward(request, response);
    }
}
