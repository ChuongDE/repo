/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import dao.OrderDAO;
import dao.ProductDAO;
import entity.Account;
import entity.Cart;
import entity.Item;
import entity.Product;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author PC
 */
public class CheckOutControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
//        Cart cart = null;
//        Object o = session.getAttribute("cart");
//
//        if (o != null) {
//            cart = (Cart) o;
//        } else {
//            cart = new Cart();
//        }

        ProductDAO p = new ProductDAO();
        List<Product> list = p.getAllProduct();
        Cookie[] arr = request.getCookies();
        String txt = "";
        if (arr != null) {
            for (Cookie o : arr) {
                if (o.getName().equals("cart")) {
                    txt = txt + o.getValue();
                    o.setMaxAge(0);
                    response.addCookie(o);
                }
            }
        }
            Cart cart = new Cart(txt, list);
            List<Item> listItem = cart.getItems();
            

        Account account = null;
        Object a = session.getAttribute("account");
//        int total = cart.getTotal();
//        session.setAttribute("total", total);
        if (a != null) {
            account = (Account) a;
            OrderDAO oderdao = new OrderDAO();
            oderdao.addOrder(account, cart, listItem);
            
            session.removeAttribute("cart");
            session.setAttribute("size", 0);
            response.sendRedirect("home");

        } else {
            response.sendRedirect("Login.jsp");
        }
    }
}
