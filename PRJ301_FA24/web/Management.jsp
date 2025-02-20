<%-- 
    Document   : Management
    Created on : Oct 27, 2024, 6:30:37 PM
    Author     : DUCDUY2003
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Warehouse Entry and Export</title>
        <link rel="icon" type="image/x-icon" href="https://media.istockphoto.com/id/1323626703/vi/vec-to/bi%E1%BB%83u-t%C6%B0%E1%BB%A3ng-logo-nh%C3%A0-ch%E1%BB%AF-h-home-house.jpg?s=612x612&w=0&k=20&c=ppjNTys-kNJzarTudonu0wL8thGAz3o_zlaZHocA1Fk=" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <h2 class="mt-4">Management List</h2>
            <a href="addmanage" class="btn btn-success mb-3">➕ Add New</a>
            <a href="http://localhost:8080/PRJ301_FA24/home.jsp" class="btn btn-success mb-3">🏠 Home</a>
            <a href="logout" class="btn btn-success mb-3">Logout</a>

            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>IOput ID</th>
                        <th>Customer ID</th>
                        <th>Employees ID</th>
                        <th>Product ID</th>
                        <th>Date of Receipt</th>
                        <th>Shipping Date</th>
                        <th>Purchase Price</th>
                        <th>Selling Price</th>
                        <th>Actions</th>
                    </tr>
                    <c:forEach items="${listS}" var="m" >
                    </thead>
                    <tbody>                   
                        <tr>
                            <td>${m.getIOputID()}</td>
                            <td>${m.getCustomerID()}</td>
                            <td>${m.getEmployeesID()}</td>
                            <td>${m.getProductID()}</td>
                            <td>${m.getDateofReceipt()}</td>
                            <td>${m.getShippingDate()}</td>                 
                            <td>${m.getPurchasePrice()}</td>                 
                            <td>${m.getSellingPrice()}</td>                 
                            <td>
                                <a href="updatemana?IOputID=${m.getIOputID()}" class="btn btn-primary">Edit</a><br><br>                               
                                <a href="delete2mana?IOputID=${m.getIOputID()}" class="btn btn-danger" onclick="return confirm('Are you sure?')">Delete</a>
                            </td>
                        </tr>
                    </tbody>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
