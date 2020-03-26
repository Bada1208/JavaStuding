<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String[] people = new String[]{"Tom", "Bob", "Sam"};
    String header = "Users list";
%>
<%!
    int square(int n){
        return n * n;
    }
%>
<html>
<head>
    <title>Basics</title>
</head>
<body>
<%--JSP Expression
JSP Expression представляет выражение, заключенное между тегами <%= и %>.
При обращении к JSP вычисляется значение этого выражения.--%>
<p>2+2=<%=2 + 2%>
</p>
<p>5>2=<%=5 > 2%>
</p>
<p><%=new String("Hello from Jsp").toUpperCase()%>
</p>
<p>Today: <%=new Date()%>
</p>
<%--JSP Scriplet
JSP Scriplet представляет одну или несколько строк на языке Java. Скриплет заключается внутри следующих тегов:
 <% %>    --%>
<h3><%= header %></h3>
<ul>
    <%

        for(String person: people){
            out.println("<li>" + person + "</li>");
        }
    %>
</ul>
<%--JSP Declaration
JSP Declaration позволяют определить метод, который мы затем можем вызывать в скриплетах или в JSP-выражениях.
Определение метода помещается между тегами <%! и %>. Например, определим следующую JSP-страницу: --%>
<p><%= square(6) %></p>
<ul>
    <%

        for(int i = 1; i <= 5; i++){
            out.println("<li>" + square(i) + "</li>");
        }
    %>
</ul>
</body>
</html>
