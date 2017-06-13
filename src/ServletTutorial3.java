import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Burak Köken on 13.6.2017.
 */
@WebServlet("/NewPage")
public class ServletTutorial3 extends HttpServlet {

    public ServletTutorial3(){

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();

        String fullName = req.getParameter("fullName");
        String age = req.getParameter("age");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>AboutPage</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("Hello Servlet Page");
        out.println("full name : " + fullName + ", age : " + age);
        out.println("</body>");
        out.println("</html>");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
