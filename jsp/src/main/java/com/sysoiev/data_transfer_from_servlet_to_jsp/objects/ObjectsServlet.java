package com.sysoiev.data_transfer_from_servlet_to_jsp.objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/objects")
public class ObjectsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<String> users = Arrays.asList("Tom", "Bob", "Sam");
        request.setAttribute("users", users);
        getServletContext().getRequestDispatcher("/objects.jsp").forward(request, response);
    }
}
