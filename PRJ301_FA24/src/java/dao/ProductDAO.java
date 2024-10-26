/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import dal.DBContext;
import java.util.ArrayList;
import java.util.List;
import model.Inventory;

/**
 *
 * @author DUCDUY2003
 */
public class ProductDAO extends DBContext {

    PreparedStatement stm;
    ResultSet rs;

    // Create or insert product
    public void insert(String ProductID, String ProductType, String Name, String Brand, String MadeIn, String Price, String ProductTypeID) {
        String sql = "INSERT INTO [dbo].[Inventory] ([ProductID], [ProductType], [Name], [Brand], [MadeIn], [Price], [ProductTypeID]) VALUES (?,?,?,?,?,?,?)";
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, ProductID);
            stm.setString(2, ProductType);
            stm.setString(3, Name);
            stm.setString(4, Brand);
            stm.setString(5, MadeIn);
            stm.setString(6, Price);
            stm.setString(7, ProductTypeID);
            stm.executeUpdate();
            System.out.println("Product inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Error inserting product: " + e.getMessage());
        }
    }

    // Select product by ID
    public Inventory select(String ProductID) {
        String sql = "select ProductID,ProductType,Name,Brand,MadeIn,Price from Inventory where ProductID =?";
        Inventory inventory = null;
        try (PreparedStatement pst = connection.prepareStatement(sql);) {
            pst.setString(1, "ProductID");
            try (ResultSet rs = pst.executeQuery();) {
                if (rs.next()) {
                    String ProductType = rs.getString("ProductType");
                    String Name = rs.getString("Name");
                    String Brand = rs.getString("Brand");
                    String MadeIn = rs.getString("MadeIn");
                    double Price = rs.getDouble("Price");
                    inventory = new Inventory(ProductID, ProductType, Name, Brand, MadeIn, Brand, ProductType);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error selecting product: " + e.getMessage());
        }
        return inventory;
    }

    //select all product
    public List<Inventory> getAll() {
        List<Inventory> list = new ArrayList<Inventory>();
        try {
            String sql = "select * from Inventory";
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                String ProductID = String.valueOf(rs.getInt(1));
                String ProductType = rs.getString(2);
                String Name = rs.getString(3);
                String Brand = rs.getString(4);
                String MadeIn = rs.getString(5);
                String Price = String.valueOf(rs.getDouble(6));

                Inventory i = new Inventory(ProductID, ProductType, Name, Brand, MadeIn, Price, ProductType);
                list.add(i);
            }
        } catch (SQLException e) {
            System.out.println("getAll(): " + e.getMessage());
        }
        return list;
    }

    // Delete product
    public void deleteProduct(String ProductID) {
        String sql = "DELETE FROM Inventory\n"
                + "      WHERE ProductID = ?";
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, ProductID);
            stm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // Edit product
    public void updateProduct(String ProductID, String ProductType, String Name, String Brand, String MadeIn, String Price, String ProductTypeID) {
        String sql = "UPDATE [dbo].[Inventory]\n"
                + "   SET [ProductType] = ?\n"
                + "      ,[Name] = ?\n"
                + "      ,[Brand] = ?\n"
                + "      ,[MadeIn] = ?\n"
                + "      ,[Price] = ?\n"
                + "      ,[ProductTypeID] = ?\n"
                + " WHERE [ProductID] =?";
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, ProductType);
            stm.setString(2, Name);
            stm.setString(3, Brand);
            stm.setString(4, MadeIn);
            stm.setString(5, Price);
            stm.setString(6, ProductTypeID);
            stm.setString(7, ProductID);
            stm.executeUpdate();
        } catch (SQLException e) {
        }
    }

}
