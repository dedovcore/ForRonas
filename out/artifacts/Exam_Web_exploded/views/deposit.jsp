<%--
  Created by IntelliJ IDEA.
  User: dedovcore
  Date: 28.08.2020
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Депозит</title>
</head>
<body>
<h1>Заполните форму</h1>
<h2>Условия депозита</h2>
<form action="/AddDeposit" method="post">
    <p>Дата открытия<input type="date" name = "dateOfOpen" required></p>
    <p>Процент<input type="number" name = "percent" required></p>
    <p>Срок в месяцах<input type="number" name = "tempInMonths" required></p>
    <p><input type = "submit" value = "окей" /><p>
</form>
</body>
</html>
