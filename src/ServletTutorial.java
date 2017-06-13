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
@WebServlet("/HomePage")
public class ServletTutorial extends HttpServlet {

    public ServletTutorial(){

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().append("Request method :").append(req.getMethod());
        resp.getWriter().append("Request URI : ").append(req.getRequestURI());
        resp.getWriter().append("Request URL : ").append(req.getRequestURL());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
