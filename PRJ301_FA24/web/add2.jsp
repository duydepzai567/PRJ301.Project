<%-- 
    Document   : add2
    Created on : Oct 28, 2024, 3:28:51 AM
    Author     : DUCDUY2003
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Add New Management</title>
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
            <h2>Add New Management</h2>
            <form action="addmanage" method="post">
                <div class="form-group">
                    <label for="ioputID">IOput ID:</label>
                    <input type="text" id="ioputID" name="IOputID" required>
                </div>
                <div class="form-group">
                    <label for="customerID">Customer ID:</label>
                    <select>
                        <c:forEach var="c" items="${ListX}">
                            <option>${c.getCustomerID()}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label for="employeesID">Employees ID:</label>
                    <select id="employeesID" name="EmployeesID" required>
                        <option value="">-- Select --</option>
                        <option value="A1">A1</option>
                        <option value="A2">A2</option>
                        <option value="B3">B3</option>
                        <option value="B4">B4</option>
                        <option value="C5">C5</option>
                        <option value="C6">C6</option>
                        <option value="D7">D7</option>
                        <option value="D8">D8</option>
                        <option value="E9">E9</option>
                        <option value="E10">E10</option>                      
                    </select>
                </div>
                <div class="form-group">
                    <label for="productID">Product ID: </label>
                    <select id="productID" name="ProductID" required>
                        <option value="">-- Select --</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>                   
                    </select>
                </div>
                <div class="form-group">
                    <label for="dateofReceipt">Date of Receipt: </label>
                    <input type="date" id="dateofReceipt" name="DateofReceipt" step="1" required>
                </div>
                <div class="form-group">
                    <label for="shippingDate">Shipping Date: </label>
                    <input type="date" id="shippingDate" name="ShippingDate" step="1" required>
                </div>
                <div class="form-group">
                    <label for="purchasePrice">Purchase Price: </label>
                    <input type="number" id="purchasePrice" name="PurchasePrice" step="10" required>
                </div>
                <div class="form-group">
                    <label for="sellingPrice">Selling Price: </label>
                    <input type="number" id="sellingPrice" name="SellingPrice" step="10" required>
                </div>
                <div class="form-group">
                    <button type="submit">Add Management</button>
                </div>
            </form>
        </div>

    </body>
</html>
