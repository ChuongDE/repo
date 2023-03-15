/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import dao.LoginDAO;
import entity.Account;
import java.io.IOException;
import java.io.PrintWriter;
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
public class LoginControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        if (session != null && session.getAttribute("account") != null) {
            resp.sendRedirect(req.getContextPath());
            return;
        }

        // Check cookie
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    session = req.getSession(true);
                    session.setAttribute("username", cookie.getValue());
                    resp.sendRedirect(req.getContextPath());
                    return;
                }
            }
        }
        req.getRequestDispatcher("Login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);

        try {
            String user = request.getParameter("username");
            String pass = request.getParameter("password");
            LoginDAO loginDAO = new LoginDAO();

            Account a = loginDAO.checkLogin(user, pass);

            Cookie userCookie = new Cookie("name", user);
            Cookie passwordCookie = new Cookie("pass", pass);
            //dat time ton tai
            userCookie.setMaxAge(60 * 60 * 24);
            passwordCookie.setMaxAge(60 * 60 * 24);
            //add browser cua nguoi dung
            response.addCookie(userCookie);
            response.addCookie(passwordCookie);
            
            if (a == null) {
                request.setAttribute("error", "Account not existed");
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            } else if (a.getRole() == 1) {
                HttpSession session = request.getSession();
                session.setAttribute("account", a);
                response.sendRedirect("admin");
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("account", a);
                response.sendRedirect("home");
            }
        } catch (Exception e) {
        }
    }

}
