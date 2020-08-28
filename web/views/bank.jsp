<%--
  Created by IntelliJ IDEA.
  User: dedovcore
  Date: 28.08.2020
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Банк</title>
</head>
<body>
<h1>Заполните форму</h1>
<h2>Данные банка</h2>
<form action="/AddBank" method="post">
    <p>Имя<input type="text" name = "name" required></p>
    <p>BIK<input type="text" name = "BIK" required></p>
    <p><input type = "submit" value = "окей" /><p>
</form>
</body>
</html>
