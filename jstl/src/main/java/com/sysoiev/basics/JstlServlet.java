package com.sysoiev.basics;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/basics")
public class JstlServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String[] users = new String[]{"Tom", "Bob", "Sam"};
        request.setAttribute("users", users);
        getServletContext().getRequestDispatcher("/basics.jsp").forward(request, response);
    }
}
