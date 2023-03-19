package dao;

import context.DBContext;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ProfileDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public ProfileDAO() {
        try {
            conn = new DBContext().getConnection();
        } catch (Exception e) {
        }

    }

//    Hi?n th? th�ng tin ng�?i d�ng l?y t? data khi �? ��ng nh?p v� v�o th�ng tin chi ti?t 
    public Account getProfileUser(String username) {
        try {
            String query = "Select UserName, Password, Name, Address, Phone \n"
                    + "from tbAccount a inner join tbUserInfor b \n"
                    + "on a.UserID = b.UserID and a.UserName = ?";

            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();

            while (rs.next()) {
                Account a = new Account(rs.getNString(1), rs.getNString(2), rs.getNString(3), rs.getNString(4), rs.getNString(5));
                return a;
            }
        } catch (Exception e) {
        }

        return null;
    }

//    C?p nh?t password cho t�i kho?n
    public void UpdatePassword(String username, String password) {
        String query = "Update tbAccount \n"
                + "set Password = ? \n"
                + "Where UserName = ?";

        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, password);
            ps.setString(2, username);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

//    C?p nh?t th�ng tin cho t�i kho?n
    public void UpdateProfile(int userID, String name, String phone, String address) {
        String query = "Update tbUserInfor\n"
                + "set [Name] = ?,\n"
                + "[Phone] = ?,\n"
                + "[Address] = ?\n"
                + "where UserID = ? ";

        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, phone);
            ps.setString(3, address);
            ps.setInt(4, userID);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public int getUserID(String username) {
//            L?y UserID khi c� Username nh?m l?y ch�nh x�c ID c?a �?i t�?ng c?n c?p nh?t
        int UserID = 0;

        try {
            String query = "Select UserID from tbAccount\n"
                    + "Where UserName = ?";

            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                UserID = rs.getInt(1);
            }
            return UserID;
        } catch (Exception e) {
            e.getMessage();
            return 0;
        }
    }

}
