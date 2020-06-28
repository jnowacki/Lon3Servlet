package pl.jnowacki;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet("/myParams")
public class ParamServlet extends HttpServlet {

//    zadanie: pobrac 3 paramsy (a, b, dzialanie), wyswietlic wynik
//    * wyswietlic komunikat, gdy liczba nie jest calkowita/nie jest liczba
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String param1 = req.getParameter("param1");

        resp.getWriter().println(param1);
    }
}
