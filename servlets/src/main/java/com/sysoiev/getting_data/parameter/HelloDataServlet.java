package com.sysoiev.getting_data.parameter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello_data")
public class HelloDataServlet extends HttpServlet {
/**
 * В методы doGet и doPost сервлета, которые обрабатывают запрос, в качестве одного
 * из параметров передается объект HttpServletRequest, с помощью которого можно получить
 * отправленные сервлету данные, то есть параметры запроса. Для этого в классе HttpServletRequest определены два метода:
 *
 * getParameter(String param): возвращает значение определенного параметра, название которого
 * передается в метод. Если указанного параметра в запросе нет, то возвращается значение null.
 *
 * getParameterValues(String param): возвращает массив значений, который представляет определенный
 * параметр. Если указанного параметра в запросе нет, то возвращается значение null.
 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        //getting id parameter
        String id = request.getParameter("id");
        writer.println("<h2>ID:" + id + "</h2>");
        writer.close();
        /*if we will run app by this link http://localhost:8080/servlets_war_exploded/hello_data
        * we will have ID:null
        * in order to have parameters we should write them in a link
        * http://localhost:8080/servlets_war_exploded/hello_data?id=12
        * output: ID:12
        */
    }
}