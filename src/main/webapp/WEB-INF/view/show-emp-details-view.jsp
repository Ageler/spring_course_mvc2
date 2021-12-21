<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: andrew
  Date: 07.12.2021
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<body>
<h2>Dear employee you are welcome</h2>
<br>
<br>
<%--Your name is ${param.employeeName}--%>

Your name is ${employee.toString()}

<%--Unordered list--%>
<%--для вывода нескольких значений выбираем forEach(jstl/.../core)--%>
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <%--li - listItem(элемент списка)--%>
        <li>
         ${lang}
        </li>
    </c:forEach>
</ul>

Your phone number is: ${employee.phoneNumber}

Your email is: ${employee.email}

</body>
</html>
