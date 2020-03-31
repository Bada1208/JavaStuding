<%@ page import="java.io.*,java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<html>
<head>
    <title>JINSERT Operation</title>
</head>

<body>
<!--http://localhost:8082/jstl_war_exploded/insert.jsp-->
<sql:setDataSource var="jstl_test" driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"
                   user="root" password="root"/>

<sql:update var="result" dataSource="${jstl_test}" >
    INSERT INTO Employees VALUES (104, 2, 'Kolia', 'Begi');
</sql:update>

<sql:query var="result" dataSource="${jstl_test}" >
    SELECT * from Employees;
</sql:query>

<table border="1" width="100%">
    <tr>
        <th>Emp ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
    </tr>

    <c:forEach var="row" items="${result.rows}">
        <tr>
            <td><c:out value="${row.id}"/></td>
            <td><c:out value="${row.first}"/></td>
            <td><c:out value="${row.last}"/></td>
            <td><c:out value="${row.age}"/></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>