import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginSuccessView extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter pw=resp.getWriter();
        String name=(String)req.getAttribute("name");
        System.out.println(name);
        HttpSession session=req.getSession();
        String user=(String)session.getAttribute("user");
        if(user==null){
            resp.sendRedirect("/staff.html");
            return;
        }else{
            pw.println("<h1 align='center'><span style='color:green;'>"+user+"loginsuccess</span></h1>");
            pw.println("<hr/>");
            pw.println("<a href='#'>显示员工信息<a/>");
        }


        pw.flush();
    }
}
