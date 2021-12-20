<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: andrew
  Date: 07.12.2021
  Time: 15:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Please, enter your name</h2>

<br>
<br>

<form:form action ="showDetails" modelAttribute="employee">

    Name <form:input path="name" />
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department <form:select path="department"/>
    <br><br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>
