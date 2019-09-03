import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletLifeCycle extends HttpServlet {

    int count=100;//线程不安全，不应该添加属性

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");//只创建一次
    }



    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");
        count--;
        PrintWriter pw=servletResponse.getWriter();
        pw.println(count);

    }


    @Override
    public void destroy() {
        System.out.println("destroy");//tomcat关闭时候销毁

    }
}
