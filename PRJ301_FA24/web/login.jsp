<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" type="image/x-icon" href="https://media.istockphoto.com/id/1323626703/vi/vec-to/bi%E1%BB%83u-t%C6%B0%E1%BB%A3ng-logo-nh%C3%A0-ch%E1%BB%AF-h-home-house.jpg?s=612x612&w=0&k=20&c=ppjNTys-kNJzarTudonu0wL8thGAz3o_zlaZHocA1Fk=" />
    <title>LogIn Your Account</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #f7f7f7;
        }
        .container {
            display: flex;
            width: 70%;
            max-width: 900px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .form-section {
            flex: 1;
            padding: 2em;
            background-color: white;
        }
        .form-section h2 {
            margin-bottom: 1em;
        }
        .form-group {
            margin-bottom: 1em;
        }
        .form-group input {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .social-buttons {
            display: flex;
            gap: 10px;
            margin-top: 1em;
        }
        .social-buttons a {
            text-decoration: none;
            color: white;
            padding: 10px;
            border-radius: 5px;
            text-align: center;
            width: 100%;
        }
        .facebook {
            background-color: #3b5998;
        }
        .google {
            background-color: #db4437;
        }
        .twitter {
            background-color: #1da1f2;
        }
        .newsletter {
            margin: 1em 0;
        }
        .signup-btn {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 1em;
        }
        .login-link {
            display: block;
            margin-top: 1em;
            text-align: center;
        }
        .image-section {
            flex: 1;
            background: url('https://anhdephd.vn/wp-content/uploads/2022/05/background-dep-khoi-tron.jpg') center center/cover no-repeat;
        }
        .footer {
            text-align: center;
            margin-top: 1em;
            font-size: 0.8em;
            color: #888;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="form-section">
            <h2>Login your account</h2>
            <form action="login" method="POST">

                <div class="form-group">
                    <label>User Name</label>
                    <input type="text" placeholder="username" name="username" required>
                </div>

                <div class="form-group">
                    <label>Password</label>
                    <input type="password" placeholder="password" name="password" required>
                </div>

                <div class="social-buttons">
                    <a href="https://www.facebook.com/login.php/" class="facebook">Facebook</a>
                    <a href="https://accounts.google.com" class="google">Google</a>
                    <a href="https://x.com/i/flow/login" class="twitter">Twitter</a>
                </div>
                <div class="newsletter">
                    <input type="checkbox"> Remember Password
                </div>
                <button class="signup-btn" type="submit">Login</button>
                <a href="#" class="login-link">Don't have an account? Sign up</a>
                <div class="footer">
                    Copyright &copy; Website by diey 2024
                </div>
            </form>

        </div>
        <div class="image-section"></div>
    </div>
</body>
</html>



