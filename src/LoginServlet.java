import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html;charset=UTF-8");
//        req.setCharacterEncoding("UTF-8");
        PrintWriter pw=resp.getWriter();
        String name=req.getParameter("username");
        String pwd=req.getParameter("pwd");
        System.out.println(name+pwd);
        if("zcl".equals(name)&&"123456".equals(pwd)){
            //pw.println("success");
            req.setAttribute("name",name);
            System.out.println(req.getAttribute("name"));
//            RequestDispatcher requestDispatcher=req.getRequestDispatcher("/success");
//            requestDispatcher.forward(req,resp);
            HttpSession httpSession=req.getSession();
            httpSession.setAttribute("user",name);
            resp.sendRedirect("/success");

        }
        else{
            //pw.println("faild");
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("/staff.html");
            requestDispatcher.forward(req,resp);
        }

        pw.flush();
    }
}
