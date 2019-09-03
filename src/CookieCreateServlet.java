import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieCreateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie=new Cookie("zcl","666");
        Cookie cookie1=new Cookie("zzz","123");
        resp.addCookie(cookie1);
        resp.addCookie(cookie);

//        cookie.setMaxAge(3000);
        System.out.println("cookie");

    }
}
