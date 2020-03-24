package com.sysoiev.getting_data.array_of_parameters;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello_array_data")
public class HelloArrayDataServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String[] nums = request.getParameterValues("nums");
        writer.print("<h2>Numbers: ");
        /**
         * Если в сервлет передается массив значений, то для его получения у объекта HttpServletRequest применяется
         * метод getParameterValues(), который получает название параметра и возвращает массив строк.
         * В данном случае мы ожидаем, что параметр будет называться nums. Затем значения из этого параметра
         * в цикле передаются в ответ клиенту.
         */
        for (String n : nums)
            writer.print(n + " ");
        writer.println("</h2>");
        writer.close();
        //http://localhost:8080/servlets_war_exploded/hello_array_data?nums=1&nums=2&nums=3
        //output: Numbers: 1 2 3
        }
}
