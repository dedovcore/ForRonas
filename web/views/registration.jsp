<%--
  Created by IntelliJ IDEA.
  User: dedovcore
  Date: 28.08.2020
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Registration</title>
  </head>
  <body>
  <h1>Заполните форму</h1>
  <h2>Ваши данные</h2>
  <form action="/Registration" method="post">
      <p>Имя<input type="text" name = "name" required></p>
      <p>Пароль<input type="password" name = "password" required></p>
      <p>Краткое имя<input type="text" name = "shortName" required></p>
      <p>Адрес<input type="text" name = "address" required></p>
      <p>LLC<input type="text" name = "LLC" required></p>
      <p><input type = "submit" value = "окей" /><p>
  </form>
  </body>
</html>
