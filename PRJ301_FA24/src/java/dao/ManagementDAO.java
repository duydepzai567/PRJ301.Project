/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import dal.DBContext;
import java.util.ArrayList;
import java.util.List;
import model.Management;

/**
 *
 * @author DUCDUY2003
 */
public class ManagementDAO extends DBContext {

    PreparedStatement stm;
    ResultSet rs;

    // Create or insert management
    public void insert(String EmployeesID, String DateofReceipt, String ShippingDate, String PurchasePrice, String SellingPrice, String IOputID, String CustomerID, String ProductID) {
        String sql = "INSERT INTO [dbo].[Management] "
                + "([IOputID], [CustomerID], [EmployeesID], [ProductID], [DateofReceipt], [ShippingDate], [PurchasePrice], [SellingPrice]) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stm = connection.prepareStatement(sql)) {
            stm.setString(1, IOputID);
            stm.setString(2, CustomerID);
            stm.setString(3, EmployeesID);
            stm.setString(4, ProductID);
            stm.setString(5, DateofReceipt);
            stm.setString(6, ShippingDate);
            stm.setString(7, PurchasePrice);
            stm.setString(8, SellingPrice);
            stm.executeUpdate();

            System.out.println("Management inserted successfully.");

        } catch (SQLException e) {
            System.out.println("Error inserting management: " + e.getMessage());
        }
    }

//------------------------------------------------------------------------------------------------------------------------------------
//select all 
    public List<Management> getAllMana() {
        List<Management> list = new ArrayList<>();
        String sql = "select * from Management";
        try {
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                String IOputID = String.valueOf(rs.getInt(1));
                String CustomerID = String.valueOf(rs.getInt(2));
                String EmployeesID = rs.getString(3);
                String ProductID = String.valueOf(rs.getInt(4));
                String DateofReceipt = String.valueOf(rs.getDate(5));
                String ShippingDate = String.valueOf(rs.getDate(6));
                String PurchasePrice = String.valueOf(rs.getDouble(7));
                String SellingPrice = String.valueOf(rs.getDouble(8));

                Management m = new Management(EmployeesID, DateofReceipt, ShippingDate, PurchasePrice, SellingPrice, IOputID, CustomerID, ProductID);
                list.add(m);
            }
        } catch (SQLException e) {
            System.out.println("getAllMana(): " + e.getMessage());
        }
        return list;
    }
    //---------------------------------------------------------------------------------------------------------------------------------------------------------   

    // Delete 
    public void deleteManage(String IOputID) {
        String sql = "DELETE FROM [dbo].[Management]\n"
                + "      WHERE IOputID = ?";
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, IOputID);
            stm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // Update 
    public void updateManage(String EmployeesID, String DateofReceipt, String ShippingDate, String PurchasePrice, String SellingPrice, String IOputID, String CustomerID, String ProductID) {
        String sql = "UPDATE [dbo].[Management]\n"
                + "   SET [CustomerID] = ?\n"
                + "      ,[EmployeesID] = ?\n"
                + "      ,[ProductID] = ?\n"
                + "      ,[DateofReceipt] = ?\n"
                + "      ,[ShippingDate] = ?\n"
                + "      ,[PurchasePrice] = ?\n"
                + "      ,[SellingPrice] = ?\n"
                + " WHERE [IOputID] =?";
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, CustomerID);
            stm.setString(2, EmployeesID);
            stm.setString(3, ProductID);
            stm.setString(4, DateofReceipt);
            stm.setString(5, ShippingDate);
            stm.setString(6, PurchasePrice);
            stm.setString(7, SellingPrice);
            stm.setString(8, IOputID);

            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

}
