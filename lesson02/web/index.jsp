<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Prog.kiev.ua</title>
  </head>
  <body>
    <% String login = (String)session.getAttribute("user_login"); %>

    <% if (login == null || "".equals(login)) { %>
    <div style="display: flex; justify-content: center; align-items: center; height: 350px; flex-direction: column;
    padding: 25px;">

        <div style="background-color: #b7b1f1; padding: 20px;">
            <h1 style="padding: 20px">Sign Up</h1>
        <form action="/indexQ" method="POST">
            Login:    <input type="text" name="login"><br>
            Password: <input type="password" name="password"><br>
            <input type="submit" />
        </form>
        </div>
    <% } else { %>
        <h1>You are logged in as: <%= login %></h1>
        <br>Click this link to <a href="/indexQ?session=exit">logout</a>
    <% } %>
    </div>
  </body>
</html>
