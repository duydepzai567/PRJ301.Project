<%-- 
    Document   : edit
    Created on : Oct 23, 2024, 3:26:02 PM
    Author     : DUCDUY2003
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Edit Product</title>
        <link rel="icon" type="image/x-icon" href="https://media.istockphoto.com/id/1323626703/vi/vec-to/bi%E1%BB%83u-t%C6%B0%E1%BB%A3ng-logo-nh%C3%A0-ch%E1%BB%AF-h-home-house.jpg?s=612x612&w=0&k=20&c=ppjNTys-kNJzarTudonu0wL8thGAz3o_zlaZHocA1Fk=" />
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
            <h2>Edit Product List</h2>

            <form action="update" method="post">

                <div class="form-group">
                    <label for="productID">Product ID:</label>
                    <input type="text" id="productID" name="ProductID" value="">
                </div>
                <div class="form-group">
                    <label for="productType">Product Type:</label>
                    <select id="productType" name="ProductType" required>
                        <option value="">-- Select a Product Type --</option>
                        <option value="Thiết bị điện tử">Thiết bị điện tử</option>
                        <option value="Đồ gia dụng">Đồ gia dụng</option>
                        <option value="Vật kiệu xây dựng">Vật kiệu xây dựng</option>
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
                    <input type="text" id="name" name="Name" value="" required>
                </div>
                <div class="form-group">
                    <label for="brand">Brand:</label>
                    <input type="text" id="brand" name="Brand" value="" required>
                </div>
                <div class="form-group">
                    <label for="madeIn">Made In:</label>
                    <input type="text" id="madeIn" name="MadeIn" value="" required>
                </div>
                <div class="form-group">
                    <label for="price">Price:</label>
                    <input type="number" id="price" name="Price" value="" required>
                </div>
                <div class="form-group">
                    <label for="price">Product Type ID: </label>
                    <input type="text" name="ProductTypeID" value="" required>
                </div>
                <div class="form-group">
                    <button type="submit" value="Update">Update</button>
                </div>
            </form>
        </div>

    </body>
</html>