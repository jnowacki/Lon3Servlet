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

//    zadanie:
//    1. pobrac 3 paramsy (a, b, dzialanie) + parsowanie
//    2. sprawdzić czy paramsy są obecne
//    3. obsłużyć sytuację, gdy argumenty nie są liczbami
//    4. obliczyć i wyswietlic wynik
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String a = req.getParameter("a");

        resp.getWriter().println(a);

    }
}
