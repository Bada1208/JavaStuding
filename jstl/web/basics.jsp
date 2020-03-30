<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>First jstl user info</title>
</head>
<body>
<ul>
    <c:forEach var="user" items="${users}">
        <li><c:out value="${user}"/></li>
    </c:forEach>
</ul>
</body>
</html>