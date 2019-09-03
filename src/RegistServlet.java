import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class RegistServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String username=req.getParameter("username");
        System.out.println(username);

        String[] hobby=req.getParameterValues("hobby");

        System.out.println(hobby);
    }
}
