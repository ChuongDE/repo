/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Account;
import entity.Cart;
import entity.Item;
import entity.OrderAdmin;
import entity.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class OrderDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public OrderDAO() {
        try {
            conn = new context.DBContext().getConnection();
        } catch (Exception e) {
        }
    }

    public void addOrder(Account a, Cart c, List<Item> list) {
        LocalDate curDate = LocalDate.now();
        String date = curDate.toString();
        try {
            String query = "insert into [tbOrder] values(?, ?, ?)";
            ps = conn.prepareStatement(query);
            ps.setInt(1, a.getUserID());
            ps.setString(2, "Order placed");
            ps.setDouble(3, c.getTotal());
            ps.executeUpdate();

            String query1 = "select top 1 OrderID from tbOrder order by OrderID desc";
            ps = conn.prepareStatement(query1);
            rs = ps.executeQuery();

            if (rs.next()) {
                String query2 = "insert into tbOrderDetails\n"
                        + "values (?,?,?,?)";
                int oid = rs.getInt(1);
                String query3 = "Update tbProduct set Quantity = Quantity - ? "
                        + "where ProductID = ?";
                for (Item i : list) {
                    ps = conn.prepareStatement(query2);
                    ps.setInt(1, oid);
                    ps.setInt(2, i.getProduct().getProductID());
                    ps.setString(3, date);
                    ps.setInt(4, i.getQuantity());
                    ps.executeUpdate();

                    PreparedStatement ps1 = conn.prepareStatement(query3);
                    ps1.setInt(1, i.getQuantity());
                    ps1.setInt(2, i.getProduct().getProductID());
                    ps1.executeUpdate();
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public List<OrderAdmin> getAll() {
        List<OrderAdmin> list = new ArrayList<>();

        String query = "select DISTINCT a.OrderID, b.Name, b.Address, b.Phone, a.OrderStatus, c.OrderDate, a.Total\n"
                + "from tbOrder a, tbUserInfor b, tbOrderDetails c\n"
                + "where a.UserID = b.UserID";

        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new OrderAdmin(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getInt(7)));

            }
        } catch (Exception e) {
        }

        return list;
    }

    public int getTotalOrder() {
        String query = "select count(*) from tbOrder";

        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }

        return 0;
    }

    public int getTotalRenevue() {
        String query = "SELECT SUM(a.Total)\n"
                + "  FROM tbOrder a";
        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }

        return 0;
    }

    public List<OrderDetail> getListDetail(String oid) {
        String query = "select b.ProductID, c.ProductName, c.Image, b.Quantity, c.SalePrice\n"
                + "from tbOrder a, tbOrderDetails b, tbProduct c\n"
                + "where a.OrderID = b.OrderID and b.ProductID = c.ProductID\n"
                + "and a.OrderID = ?";
        List<OrderDetail> list = new ArrayList<>();
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, oid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new OrderDetail(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5)));
            }
        } catch (Exception e) {
        }

        return list;
    }

}
