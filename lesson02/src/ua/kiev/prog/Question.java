package ua.kiev.prog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class Question extends javax.servlet.http.HttpServlet {

    private HashMap<String, String> map = new HashMap();
    private int v = 1;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String answer = req.getParameter("dzen");

//        resp.sendRedirect("index.jsp");

        HttpSession session = req.getSession(true);
        session.setAttribute("answ", answer);
        if (session.getAttributeNames().nextElement().equals(null)){
            map.put(v++ +" "+"answ" ,answer);

        }else {
            map.put(v++ +" "+session.getAttributeNames().nextElement(), answer);
        }
        session.setAttribute("answ", map.toString());

        resp.sendRedirect("ind.jsp");
        System.out.println(session.getAttributeNames().nextElement()+"  QQQQQQQQ  "+session.getAttributeNames().nextElement());


//        PrintWriter pw = resp.getWriter();
//        pw.println("<html><head><title>Prog.kiev.ua Test</title></head>");
//        pw.println("<body>"+map.toString()+"</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String sessionUser = request.getParameter("session");
        String st ="";
        System.out.println(sessionUser);
        if (sessionUser.equals("sig")) {
            for (String s : map.keySet()) {
                if (s.contains("user_login")) {
                    st += map;
                }
            }
            System.out.println(st);
            PrintWriter pw = response.getWriter();
            pw.println("<html><head><title>Prog.kiev.ua Test</title></head>");
            pw.println("<body>"+st+"</body></html>");

        }
    }
}
