import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        // Hardcoded validation (can be replaced with DB check)
        if (user.equals("admin") && pass.equals("1234")) {
            out.println("<h2>Welcome, " + user + "!</h2>");
        } else {
            out.println("<h3>Invalid username or password. Please try again.</h3>");
        }
        out.close();
    }
}
