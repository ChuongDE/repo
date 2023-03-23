/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import dao.CookieDAO;
import java.io.IOException;
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
public class LogOutControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            String username = null;
            String cartValues = null;
            for (Cookie cookie : cookies) {  
                if (cookie.getName().equals("name")) {
                    username = cookie.getValue();
                    cookie.setMaxAge(0);
                    System.out.println("Name Cookie: "+ cookie.getName() + "\nValues Cookie: " + cookie.getValue()+ "\nAge Cookie: " + cookie.getMaxAge());
                }
                
                if (cookie.getName().equals("cart")) {
                    cartValues = cookie.getValue();
                    cookie.setMaxAge(0);
                    System.out.println("Name Cookie: "+ cookie.getName() + "\nValues Cookie: " + cookie.getValue()+ "\nAge Cookie: " + cookie.getMaxAge());
                }
                
                if(username != null && cartValues != null){
                    CookieDAO data = new CookieDAO();
                    data.removeCookie(username);
                    data.insertCookie(username, "cart", cartValues);
                }
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        }
        
        session.removeAttribute("account");
        response.sendRedirect("home");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
