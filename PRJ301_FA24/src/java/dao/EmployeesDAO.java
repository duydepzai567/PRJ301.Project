/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dal.DBContext;
import model.Employees;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DUCDUY2003
 */
public class EmployeesDAO extends DBContext {

    PreparedStatement stm;
    ResultSet rs;

    //select all 
    public List<Employees> getAllselectE() {
        List<Employees> list = new ArrayList<>();
        String sql = "SELECT * FROM [dbo].[Employees]";
        try {
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                String EmployeesID = rs.getString(1);
                String Name = rs.getString(2);
                String Birthday = rs.getString(3);
                String JoinDate = rs.getString(4);
                String Address = rs.getString(5);
                String Phone = rs.getString(6);
                String Email = rs.getString(7);
                
                Employees em = new Employees(EmployeesID, Name, Birthday, JoinDate, Address, Phone, Email);
                list.add(em);
            }
        } catch (SQLException e) {
            System.out.println("getAllselectE(): " + e.getMessage());
        }
        return list;
    }
}
