<%-- 
    Document   : ProductList
    Created on : Oct 22, 2024, 8:02:14 PM
    Author     : DUCDUY2003
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Product List</title>
        <link rel="icon" type="image/x-icon" href="https://media.istockphoto.com/id/1323626703/vi/vec-to/bi%E1%BB%83u-t%C6%B0%E1%BB%A3ng-logo-nh%C3%A0-ch%E1%BB%AF-h-home-house.jpg?s=612x612&w=0&k=20&c=ppjNTys-kNJzarTudonu0wL8thGAz3o_zlaZHocA1Fk=" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <h2 class="mt-4">Product List</h2>
            <a href="addProduct.jsp" class="btn btn-success mb-3">➕ Add New</a>
            <a href="http://localhost:8080/PRJ301_FA24/home.jsp" class="btn btn-success mb-3">🏠 Home</a>
            <a href="logout" class="btn btn-success mb-3">Logout</a>


            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Product ID</th>
                        <th>Product Type</th>
                        <th>Name</th>
                        <th>Brand</th>
                        <th>Made In</th>
                        <th>Price</th>
                        <th>Actions</th>
                    </tr>
                    <c:forEach items="${list}" var="x" >
                    </thead>
                    <tbody>                   
                        <tr>
                            <td>${x.getProductID()}</td>
                            <td>${x.getProductType()}</td>
                            <td>${x.getName()}</td>
                            <td>${x.getBrand()}</td>
                            <td>${x.getMadeIn()}</td>
                            <td>${x.getPrice()}</td>                 
                            <td>
                                <a href="update?ProductID=${x.getProductID()}" class="btn btn-primary">Edit</a>
                                <a href="delete?ProductID=${x.getProductID()}" class="btn btn-danger" onclick="return confirm('Are you sure?')">Delete</a>
                            </td>
                        </tr>
                    </tbody>
                </c:forEach>
            </table>
        </div>
    </body>
</html>