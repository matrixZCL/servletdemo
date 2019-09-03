import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SessionServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession httpSession=req.getSession();
        httpSession.setAttribute("1","zcl");
        httpSession.setAttribute("2","sss");
        String id=httpSession.getId();
        PrintWriter printWriter=resp.getWriter();
        printWriter.println(id);
        printWriter.flush();
    }
}
