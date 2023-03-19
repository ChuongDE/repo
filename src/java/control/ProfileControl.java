/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import dao.ProfileDAO;
import entity.Account;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */

public class ProfileControl extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //        Lấy Username từ jsp khi đã login vào tài khoản
        String Username = request.getParameter("username");

        ProfileDAO data = new ProfileDAO();

//        Lấy thông tin chi tiết từ database để đưa lên Profile.jsp khi có Username
        Account a = data.getProfileUser(Username);
        request.setAttribute("account", a);
        request.getRequestDispatcher("Profile.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //        Lấy thông tin muốn cập nhật từ JSP xuống
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");

        ProfileDAO data = new ProfileDAO();
//        Lấy UserID khi muốn cập nhật UserInfor sẽ chính xác hơn
        int userID = data.getUserID(user);
//        Cập nhật password khi lấy được username
        data.UpdatePassword(user, pass);
//        Cập nhật information có UserID trên
        data.UpdateProfile(userID, name, phone, address);
//        Tải lại thông tin Profile sau khi cập nhật
        response.sendRedirect("profile");
    
    }

}


