package pl.jnowacki;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/myParams")
public class ParamServlet extends HttpServlet {

//    zadanie:
//    1. pobrac 3 paramsy (a, b, dzialanie) + parsowanie D
//    2. sprawdzić czy paramsy są obecne D
//    3. obsłużyć sytuację, gdy argumenty nie są liczbami D
//    4. obliczyć i wyswietlic wynik D
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int a, b;

        try {
            a = Integer.parseInt(req.getParameter("a"));
            b = Integer.parseInt(req.getParameter("b"));
        } catch (NumberFormatException ex) {
            resp.getWriter().println("Argument format not recognized, try again!");
            return;
        }

        String action = req.getParameter("action");

        if(Objects.isNull(action)) {
            resp.getWriter().println("Unknown action");
            return;
        }

        switch (action) {
            case "add":
                resp.getWriter().println("Result: " + (a + b));
                break;
            case "sub":
                resp.getWriter().println("Result: " + (a - b));
                break;
            default:
                resp.getWriter().println("Unknown action");
        }

    }
}
