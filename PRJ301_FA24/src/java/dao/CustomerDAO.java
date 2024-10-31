/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dal.DBContext;
import model.Customers;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUCDUY2003
 */
public class CustomerDAO extends DBContext {

    PreparedStatement stm;
    ResultSet rs;

    //select all 
    public List<Customers> getAllselectC() {
        List<Customers> list = new ArrayList<>();
        String sql = "SELECT * FROM [dbo].[Customers]";
        try {
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                String CustomerID = rs.getString(1);
                String CustomerName = rs.getString(2);
                String Address = rs.getString(3);
                String Phone = rs.getString(4);
                String Email = rs.getString(5);

                Customers cm = new Customers(CustomerID, CustomerName, Address, Phone, Email);
                list.add(cm);
            }
        } catch (SQLException e) {
            System.out.println("getAllselectC(): " + e.getMessage());
        }
        return list;
    }

    // Create or insert management
    public void insert(String CustomerID, String CustomerName, String Address, String Phone, String Email) {
        String sql = "INSERT INTO [dbo].[Customers]\n"
                + "           ([CustomerID]\n"
                + "           ,[CustomerName]\n"
                + "           ,[Address]\n"
                + "           ,[Phone]\n"
                + "           ,[Email])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        try (PreparedStatement stm = connection.prepareStatement(sql)) {
            stm.setString(1, CustomerID);
            stm.setString(2, CustomerName);
            stm.setString(3, Address);
            stm.setString(4, Phone);
            stm.setString(5, Email);
            stm.executeUpdate();

            System.out.println("Customer inserted successfully.");

        } catch (SQLException e) {
            System.out.println("Error inserting customer: " + e.getMessage());
        }
    }
}
