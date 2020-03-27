package com.sysoiev.data_transfer_from_servlet_to_jsp.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/request")
public class RequestServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("name", "Tom");
        request.setAttribute("age", 34);

        getServletContext().getRequestDispatcher("/transfer.jsp").forward(request, response);
    }
}
