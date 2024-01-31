package hkmu.comps380f;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.getWriter().println("Hello World!");
    }

    @Override public void init() throws ServletException {
        System.out.println("Servlet " + this.getServletName() + " has started.");
    }

    @Override public void destroy() {
        System.out.println("Servlet " + this.getServletName() + " has stopped.");
    }
}
