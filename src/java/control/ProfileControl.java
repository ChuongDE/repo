package control;

import dao.ProfileDAO;
import entity.Account;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String Username = request.getParameter("username");

        ProfileDAO data = new ProfileDAO();
        
//        Lấy thông tin chi tiết từ database để đưa lên Profile.jsp khi có Username
        Account a = data.getProfileUser(Username);
        request.setAttribute("Account", a);
        request.getRequestDispatcher("Profile.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        Dùng tạm khi chưa kết nối với Login tài khoản
//        String Username = "admin2";  
        
//        Lấy Username từ jsp khi đã login vào tài khoản
        String Username = request.getParameter("username");

        ProfileDAO data = new ProfileDAO();
        
//        Lấy thông tin chi tiết từ database để đưa lên Profile.jsp khi có Username
        Account a = data.getProfileUser(Username);
        request.setAttribute("Account", a);
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
        Account a = data.getProfileUser(user);
        request.setAttribute("Account", a);
        request.getRequestDispatcher("Profile.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
