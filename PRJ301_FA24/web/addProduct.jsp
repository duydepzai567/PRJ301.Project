<%-- 
    Document   : addProduct
    Created on : Oct 23, 2024, 3:26:26 PM
    Author     : DUCDUY2003
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Add New Product</title>
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
            <h2>Add New Product</h2>
            <form action="add" method="post">
                <div class="form-group">
                    <label for="productID">Product ID:</label>
                    <input type="text" id="productID" name="ProductID" required>
                </div>
                <div class="form-group">
                    <label for="productType">Product Type:</label>
                    <select id="productType" name="ProductType" required>
                        <option value="">-- Select a Product Type --</option>
                        <option value="Thiết bị điện tử">Thiết bị điện tử</option>
                        <option value="Đồ gia dụng">Đồ gia dụng</option>
                        <option value="Vật kiệu xây dựng">Vật liệu xây dựng</option>
                        <option value="Thiết bị văn Phòng">Thiết bị văn Phòng</option>
                        <option value="Thực phẩm">Thực phẩm</option>
                        <option value="Nội thất">Nội thất</option>
                        <option value="Dụng cụ sửa chữa">Dụng cụ sửa chữa</option>
                        <option value="Phương tiện">Phương tiện</option>
                        <option value="Sức khỏe">Sức khỏe</option>
                        <option value="Làm đẹp">Làm đẹp</option>
                        <option value="Giải trí">Giải trí</option>
                        <option value="Học tập">Học tập</option>
                        <option value="Thiết bị điện lạnh">Thiết bị điện lạnh</option>
                        <option value="Đồ thủ công, mỹ nghệ">Đồ thủ công, mỹ nghệ</option>
                        <option value="Thời trang">Thời trang</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="name">Product Name:</label>
                    <input type="text" id="name" name="Name" required>
                </div>
                <div class="form-group">
                    <label for="brand">Brand:</label>
                    <input type="text" id="brand" name="Brand" required>
                </div>
                <div class="form-group">
                    <label for="madeIn">Made In:</label>
                    <input type="text" id="madeIn" name="MadeIn" required>
                </div>
                <div class="form-group">
                    <label for="price">Price:</label>
                    <input type="number" id="price" name="Price" step="1" required>
                </div>
                <div class="form-group">
                    <button type="submit">Add Product</button>
                </div>
            </form>
        </div>

    </body>
</html>
