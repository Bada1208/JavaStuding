<html>
<head>
    <title>get and set properties Example</title>
</head>

<body>
<!--http://localhost:8082/jstl_war_exploded/javabean.jsp-->
<jsp:useBean id = "students" class = "com.sysoiev.javabeans.Student">
    <jsp:setProperty name = "students" property = "firstName" value = "Ana"/>
    <jsp:setProperty name = "students" property = "lastName" value = "Zhyl"/>
    <jsp:setProperty name = "students" property = "age" value = "27"/>
</jsp:useBean>

<p>Student First Name:
    <jsp:getProperty name = "students" property = "firstName"/>
</p>

<p>Student Last Name:
    <jsp:getProperty name = "students" property = "lastName"/>
</p>

<p>Student Age:
    <jsp:getProperty name = "students" property = "age"/>
</p>

</body>
</html>