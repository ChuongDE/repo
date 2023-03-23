/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class CookieDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public CookieDAO() {
        try {
            conn = new context.DBContext().getConnection();
        } catch (Exception ex) {
        }
    }
    
    public String getCookieAll(String userName){
        String Cookie = null;
        try {
            String query = "Select Name, Value from tbCookie\n" +
                            "Where UserName = ?";
            ps = conn.prepareStatement(query);
            ps.setNString(1, userName);
            rs = ps.executeQuery();
            while (rs.next()){
                Cookie = rs.getNString(1) + ":" + rs.getNString(2);
            };
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
    
    public void removeCookie(String userName){
        try {
            String query = "Delete from tbCookie\n" +
                            "Where UserName = ?";
            ps = conn.prepareStatement(query);
            ps.setNString(1, userName);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
    }
    
    public String insertCookie(String userName, String name, String value){
        String Cookie = null;
        try {
            String query = "Insert into tbCookie\n" +
                            "Values\n" +
                            "(?,?,?)";
            ps = conn.prepareStatement(query);
            ps.setNString(1, userName);
            ps.setNString(2, name);
            ps.setNString(3, value);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
    
    public String getCookieCart(String userName){
        String Cookie = null;
        try {
            String query = "Select Value from tbCookie\n" +
                            "Where UserName = ?";
            ps = conn.prepareStatement(query);
            ps.setNString(1, userName);
            rs = ps.executeQuery();
            while (rs.next()){
                Cookie = rs.getNString(1);
                return Cookie;
            };
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
}