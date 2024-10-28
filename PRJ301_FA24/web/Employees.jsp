<%-- 
    Document   : Employees
    Created on : Oct 28, 2024, 7:26:11 AM
    Author     : DUCDUY2003
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Employee List</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <h2 class="mt-4">Employee List</h2>
            <a href="#" class="btn btn-success mb-3">➕ Add New</a>
            <a href="http://localhost:8080/PRJ301_FA24/home.jsp" class="btn btn-success mb-3">🏠 Home</a>
            <a href="logout" class="btn btn-success mb-3">Logout</a>


            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Employees ID</th>
                        <th>Name</th>
                        <th>Birthday</th>
                        <th>Join Date</th>
                        <th>Address</th>
                        <th>Phone</th>
                        <th>Email</th>
                    </tr>
                <c:forEach items="${LisT}" var="x" >
                    </thead>
                    <tbody>                   
                        <tr>
                            <td>${x.getEmployeesID()}</td>
                            <td>${x.getName()}</td>               
                            <td>${x.getBirthday()}</td>               
                            <td>${x.getJoinDate()}</td>               
                            <td>${x.getAddress()}</td>               
                            <td>${x.getPhone()}</td>               
                            <td>${x.getEmail()}</td>               
                            <td>
                                <a href="#" class="btn btn-primary">Edit</a>
                                <a href="#" class="btn btn-danger" onclick="return confirm('Are you sure?')">Delete</a>
                            </td>
                        </tr>
                    </tbody>
                </c:forEach>
            </table>
        </div>
    </body>
</html>