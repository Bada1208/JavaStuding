package com.sysoiev.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/set")
public class SetServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        try {
            response.addCookie(new Cookie("user", "Tom"));
            out.println("Cookie is set");
        } finally {
            out.close();
        }
    }
}
/*http://localhost:8080/servlets_war_exploded/set    output:Cookie is set
  http://localhost:8080/servlets_war_exploded/get    output:Name: Tom
* */