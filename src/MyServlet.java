import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class MyServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        List<Person> list=new ArrayList<>();
        list.add(new Person("1","123",1,11,"123","123"));

        PrintWriter pw=res.getWriter();
        pw.println(list.get(0).toString());

    }
}
