/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dal.DBContext;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.ProductTypeList;

/**
 *
 * @author DUCDUY2003
 */
public class ProductTypeDAO extends DBContext {

    PreparedStatement stm;
    ResultSet rs;

    //select all 
    public List<ProductTypeList> getAllPro() {
        List<ProductTypeList> list = new ArrayList<>();
        String sql = "SELECT * FROM [dbo].[ProductTypeList]";
        try {
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                String ProductTypeID = String.valueOf(rs.getInt(1));
                String Name = rs.getString(2);

                ProductTypeList pr = new ProductTypeList(ProductTypeID, Name);
                list.add(pr);
            }
        } catch (SQLException e) {
            System.out.println("getAllPro(): " + e.getMessage());
        }
        return list;
    }
}
