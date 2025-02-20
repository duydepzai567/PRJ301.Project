
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <link rel="icon" type="image/x-icon" href="https://media.istockphoto.com/id/1323626703/vi/vec-to/bi%E1%BB%83u-t%C6%B0%E1%BB%A3ng-logo-nh%C3%A0-ch%E1%BB%AF-h-home-house.jpg?s=612x612&w=0&k=20&c=ppjNTys-kNJzarTudonu0wL8thGAz3o_zlaZHocA1Fk=" />
        <title>Edit Customer</title>
        <style>
            /* Basic styling for the form */
            .form-container {
                width: 400px;
                margin: 0 auto;
                padding: 20px;
                border: 1px solid #ccc;
                border-radius: 5px;
                box-shadow: 2px 2px 12px rgba(0, 0, 0, 0.1);
            }
            .form-container h2 {
                text-align: center;
            }
            .form-group {
                margin-bottom: 15px;
            }
            .form-group label {
                display: block;
                margin-bottom: 5px;
            }
            .form-group input, .form-group select {
                width: 100%;
                padding: 8px;
                box-sizing: border-box;
            }
            .form-group button {
                width: 100%;
                padding: 10px;
                background-color: #28a745;
                color: white;
                border: none;
                border-radius: 5px;
                cursor: pointer;
            }
            .form-group button:hover {
                background-color: #218838;
            }
        </style>
    </head>
    <body>

        <div class="form-container">
            <h2>Edit Customer</h2>
            <form action="updatecu" method="post">
                <div class="form-group">
                    <label for="customerID">Customer ID: </label>
                    <input type="text" id="customerID" name="CustomerID" required>
                </div>
                <div class="form-group">
                    <label for="customerName">Customer Name: </label>
                    <input type="text" id="customerName" name="CustomerName" required>
                </div>
                <div class="form-group">
                    <label for="address">Address: </label>
                    <input type="text" id="address" name="Address" required>
                </div>
                <div class="form-group">
                    <label for="phone">Phone: </label>
                    <input type="text" id="phone" name="Phone" required>
                </div>
                <div class="form-group">
                    <label for="emial">Email: </label>
                    <input type="text" id="email" name="Email" required>
                </div>
                <div class="form-group">
                    <button type="submit">Update</button>
                </div>
            </form>
        </div>

    </body>
</html>
