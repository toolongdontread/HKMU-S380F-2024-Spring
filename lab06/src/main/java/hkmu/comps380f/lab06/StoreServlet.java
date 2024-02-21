package hkmu.comps380f.lab06;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@WebServlet(
        name = "storeServlet",
        value = "/shop"
)

public class StoreServlet extends HttpServlet {
    private final Map<Integer, String> products = new ConcurrentHashMap<>();

    public StoreServlet(){
        this.products.put(1, "Sandpaper");
        this.products.put(2, "Nails");
        this.products.put(3, "Glue");
        this.products.put(4, "Paint");
        this.products.put(5, "Tape");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null)
            action = "browse";

        switch(action){
            case "addToCart":
                this.addToCart(req, res);
                break;
            case "viewCart":
                this.viewCart(req, res);
                break;
            case "emptyCart":
                this.emptyCart(req, res);
                break;
            case "browse":
            default:
                this.browse(req, res);
                break;
        }
    }

    private void viewCart(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        req.setAttribute("products", this.products);
        req.getRequestDispatcher("/WEB-INF/jsp/viewCart.jsp")
                .forward(req, res);
    }

    private void browse(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
        req.setAttribute("products", this.products);
        req.getRequestDispatcher("/WEB-INF/jsp/browse.jsp")
                .forward(req, res);
    }

    private void addToCart(HttpServletRequest req, HttpServletResponse res)
            throws IOException {
        int productId;
        try {
            productId = Integer.parseInt(req.getParameter("productId"));

        } catch(Exception e){
            res.sendRedirect("shop");
            return;
        }

        HttpSession session = req.getSession();
        if(session.getAttribute("cart") == null)
            session.setAttribute("cart", new ConcurrentHashMap<>());

        @SuppressWarnings("unchecked")
        Map<Integer, Integer> cart = (Map<Integer, Integer>) session.getAttribute("cart");
        if(!cart.containsKey(productId))
            cart.put(productId, 0);
        cart.put(productId, cart.get(productId) + 1);

        res.sendRedirect("shop?action=viewCart");
    }

    private void emptyCart(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        request.getSession().removeAttribute("cart");
        response.sendRedirect("shop?action=viewCart");
    }
}
