package hkmu.comps380f;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "multiValueParameterServlet",
        urlPatterns = "/checkboxes")
public class MultiValueParameterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/jsp/MultiValueForm.jsp");
        view.forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        RequestDispatcher view = req.getRequestDispatcher("/WEB-INF/jsp/MultiValueResult.jsp");
        view.forward(req, res);
    }
}
