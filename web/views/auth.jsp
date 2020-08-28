<%--
  Created by IntelliJ IDEA.
  User: dedovcore
  Date: 19.08.2020
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Авторизация</title>
</head>
<body>
<h1>
    <p>Авторизируйтесь либо, если вы новый пользователь, нажмите "Далее"</p>
</h1>
<form action="/", method="post">
    <p>Имя<input type="text" name = "name" required></p>
    <p>Пароль<input type="text" name = "password" required></p>
    <p><input type = "submit" value = "окей" /><p>
</form>
<a href="/Registration"><button>Далее</button></a>
</body>
</html>
