<%--
  Created by IntelliJ IDEA.
  User: Alexsandr
  Date: 16.04.2018
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <% String answer = (String)session.getAttribute("answ"); %>
 <h1><%=answer %></h1>
 <br>
<h1>Statistics </h1>
<a href="ind?session=sig"> зарегистрированые пользователи</a> | | <a href="ind?session=notsig"> не зарегистрированые пользователи</a>


</body>
</html>
