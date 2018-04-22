package ua.kiev.prog;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends javax.servlet.http.HttpServlet {
    static final String LOGIN = "admin";
    static final String PASS = "admin";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (LOGIN.equals(login) && PASS.equals(password)) {
            HttpSession session = request.getSession(true);
            session.setAttribute("user_login", login);
            System.out.println("LLLLL  "+session.getId() + "   "+session.getAttributeNames().nextElement().toString());
        }


        response.sendRedirect("indexQ.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String sessionUser = request.getParameter("session");
        HttpSession session = request.getSession(false);

        if ("exit".equals(sessionUser) && (session != null))
            session.removeAttribute("user_login");

        response.sendRedirect("index.jsp");
    }
}
