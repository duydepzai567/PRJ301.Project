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
    
    private static final String DELETE_Inventory_SQL = "delete from Inventory where ProductID = ?;";
    private static final String UPDATE_Inventory_SQL = "update products set ProductType = ?, Name= ?, Brand =?, MadeIn =?, Price =?, ProductTypeID =? where ProductID = ?;";

    // Create or insert product
    public void insert(Inventory i) {
        try {
            String sql = "INSERT INTO Inventory\n"
                    + "           (ProductType\n"
                    + "           ,Name\n"
                    + "           ,Brand\n"
                    + "           ,MadeIn\n"
                    + "           ,Price\n"
                    + "           ,ProductTypeID)\n"
                    + "     VALUES\n"
                    + "           (?, ?, ?, ?, ?, ?)";
            stm = connection.prepareStatement(sql);
            stm.setString(1, i.getProductType());
            stm.setString(2, i.getName());
            stm.setString(3, i.getBrand());
            stm.setString(4, i.getMadeIn());
            stm.setDouble(5, Double.parseDouble(i.getPrice()));
            stm.setInt(6, Integer.parseInt(i.getProductTypeID()));
            stm.executeUpdate();
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
    public List<Inventory> selectAll() {
        List<Inventory> inventorysList = new ArrayList<>();
        String sql = "SELECT ProductID\n"
                + "      ,ProductType\n"
                + "      ,Name\n"
                + "      ,Brand\n"
                + "      ,MadeIn\n"
                + "      ,Price\n"
                + "  FROM Inventory";
        
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                Inventory inventory = new Inventory(
                        rs.getString("ProductType"),
                        rs.getString("Name"),
                        rs.getString("Brand"),
                        rs.getString("MadeIn"),
                        rs.getString("Price")
                );
                inventorysList.add(inventory);
            }
            rs.close();
            st.close();
       
        } catch (SQLException e) {
            System.out.println(e);
        }
        return inventorysList;
    }
    
}
