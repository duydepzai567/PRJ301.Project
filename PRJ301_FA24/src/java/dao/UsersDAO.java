/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dal.DBContext;
import java.sql.*;
import java.util.ArrayList;
import model.Users;
import java.util.List;

/**
 *
 * @author DUCDUY2003
 */
public class UsersDAO extends DBContext {

    public List<Users> getAll() {
        List<Users> userList = new ArrayList<>();
        String sql = "SELECT [username]\n"
                + "      ,[password]\n"
                + "      ,[displayname]\n"
                + "      ,[gender]\n"
                + "      ,[email]\n"
                + "      ,[address]\n"
                + "      ,[phone]\n"
                + "  FROM [dbo].[Users]";
        try {
            // Initialize the statement and result set
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);

            // Loop through the result set and map the data to the Users object
            while (rs.next()) {
                Users user = new Users(
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("displayname"),
                        rs.getString("gender"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("phone")
                );
                userList.add(user);
            }

            // Close resources
            rs.close();
            st.close();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return userList;
    }

    //Them 1 user moi
    public int insertUser(Users user) {
        int result = 0;
        String sql = "INSERT INTO [dbo].[Users]\n"
                + "           ([username]\n"
                + "           ,[password]\n"
                + "           ,[displayname]\n"
                + "           ,[gender]\n"
                + "           ,[email]\n"
                + "           ,[address]\n"
                + "           ,[phone])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?)";
        try {
            // Prepare the statement
            PreparedStatement pre = connection.prepareStatement(sql);

            // Set the parameters for the query
            pre.setString(1, user.getUsername());
            pre.setString(2, user.getPassword());
            pre.setString(3, user.getDisplayname());
            pre.setString(4, user.getGender());
            pre.setString(5, user.getEmail());
            pre.setString(6, user.getAddress());
            pre.setString(7, user.getPhone());

            // Execute the update and get the result
            result = pre.executeUpdate();

            // Close the statement
            pre.close();

        } catch (SQLException e) {
            System.out.println("Error inserting user: " + e.getMessage());
        }
        return result;
    }

    //Tim username and password
    public Users findUsernameANDPass(String username, String password) {
        String sql = "select username, [password]  from Users where username = ? and [password] = ?";
        Users user = null;
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);

            // Execute query
            ResultSet rs = pst.executeQuery();

            // If user is found, map the result set to the Users object
            if (rs.next()) {
                user = new Users(
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("displayname"),
                        rs.getString("gender"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("phone")
                );
            }

            // Close resources
            rs.close();
            pst.close();

        } catch (SQLException e) {
            System.out.println("Error finding user: " + e.getMessage());
        }

        return user;
    }

    public Users viewAll(String username) {
        String sql = "SELECT [username]\n"
                + "      ,[password]\n"
                + "      ,[displayname]\n"
                + "      ,[gender]\n"
                + "      ,[email]\n"
                + "      ,[address]\n"
                + "      ,[phone]\n"
                + "  FROM [dbo].[Users]\n"
                + "  where username = ?";
        Users user = null;
        try {
            // Prepare the statement
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, username);

            // Execute the query
            ResultSet rs = pst.executeQuery();

            // If user is found, map the result set to the Users object
            if (rs.next()) {
                user = new Users(
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("displayname"),
                        rs.getString("gender"),
                        rs.getString("email"),
                        rs.getString("address"),
                        rs.getString("phone")
                );
            }

            // Close resources
            rs.close();
            pst.close();

        } catch (SQLException e) {
            System.out.println("Error retrieving user: " + e.getMessage());
        }

        return user;
    }

    //xoa 
    public void deleteUsers(String username) {
        String sql = "DELETE FROM [dbo].[Users] WHERE username = ?";

        try (PreparedStatement pst = connection.prepareStatement(sql)) {  // Use try-with-resources to auto-close
            pst.setString(1, username);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error deleting user: " + e.getMessage());
        }
    }

//sua
    public Users edit(Users user) {
        String sql = "UPDATE [dbo].[Users] "
                + "SET [password] = ?, "
                + "[displayname] = ?, "
                + "[gender] = ?, "
                + "[email] = ?, "
                + "[address] = ?, "
                + "[phone] = ? "
                + "WHERE [username] = ?";
        try {
            // Prepare the statement
            PreparedStatement pst = connection.prepareStatement(sql);

            // Set the parameters based on the Users object
            pst.setString(1, user.getPassword());
            pst.setString(2, user.getDisplayname());
            pst.setString(3, user.getGender());
            pst.setString(4, user.getEmail());
            pst.setString(5, user.getAddress());
            pst.setString(6, user.getPhone());
            pst.setString(7, user.getUsername());  // Assuming username is the identifier for the search condition

            // Execute update
            pst.executeUpdate();

            // Close the statement
            pst.close();

        } catch (SQLException e) {
            System.out.println("Error updating user: " + e.getMessage());
        }
        return user;
    }
}
