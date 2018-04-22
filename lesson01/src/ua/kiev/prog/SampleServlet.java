package ua.kiev.prog;

import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("serial")
public class SampleServlet extends HttpServlet {
    @Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html"); // Content-Type: text/html

        PrintWriter pw = resp.getWriter();
        pw.println("<html><head><title>Prog.kiev.ua Test</title></head>");
        pw.println("<body>Hello, Java Junior :)</body></html>");
	}
}