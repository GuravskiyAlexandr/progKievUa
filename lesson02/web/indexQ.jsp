<%--
  Created by IntelliJ IDEA.
  User: Alexsandr
  Date: 16.04.2018
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/ind" method="post">
    <p><b>Какое у вас состояние разума?</b></p>
    <p><input name="dzen" type="radio" value="nedzen"> Не дзен</p>
    <p><input name="dzen" type="radio" value="dzen"> Дзен</p>
    <p><input name="dzen" type="radio" value="pdzen" checked> Полный дзен</p>
    <p><input type="submit" value="Выбрать"></p>
</form>

<a href="index.jsp"> Main page</a>

</body>
</html>
