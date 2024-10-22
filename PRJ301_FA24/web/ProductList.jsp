<%-- 
    Document   : ProductList
    Created on : Oct 22, 2024, 8:02:14 PM
    Author     : DUCDUY2003
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Product List</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <h2 class="mt-4">Product List</h2>
            <a href="new" class="btn btn-success mb-3">+ Add New</a>

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
                </thead>
                <tbody>
                    <%
                        List<Product> listProduct = (List<Product>) request.getAttribute("listProduct");
                        for (Product product : listProduct) {
                    %>
                    <tr>
                        <td><%= product.getId() %></td>
                        <td><%= product.getType() %></td>
                        <td><%= product.getName() %></td>
                        <td><%= product.getBrand() %></td>
                        <td><%= product.getMadeIn() %></td>
                        <td><%= product.getPrice() %></td>
                        <td>
                            <a href="edit?id=<%= product.getId() %>" class="btn btn-primary">Edit</a>
                            <a href="delete?id=<%= product.getId() %>" class="btn btn-danger" onclick="return confirm('Are you sure?')">Delete</a>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>