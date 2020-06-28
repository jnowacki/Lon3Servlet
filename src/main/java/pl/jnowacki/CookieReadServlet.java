package pl.jnowacki;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;

@WebServlet("/myCookieRead")
public class CookieReadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        iteration
        for(Cookie cookie: req.getCookies()) {
            if(cookie.getName().equals("mojaNazwaCiasteczka")) {
                resp.getWriter().printf("%s : %s", cookie.getName(), cookie.getValue());
                return;
            }
        }

//        by filter list

//        Optional<Cookie> oCk = Arrays
//                .stream(req.getCookies())
//                .filter(cookie -> cookie.getName().equals("mojaNazwaCiasteczka"))
//                .findFirst();
//
//        if(oCk.isPresent()) {
//            resp.getWriter().println(oCk.get().getValue());
//        } else {
//            resp.getWriter().println("No cookie with that name!");
//        }
    }
}
