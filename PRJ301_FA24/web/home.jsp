<%-- 
    Document   : home
    Created on : Oct 21, 2024, 1:08:03 AM
    Author     : DUCDUY2003
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Warehouse Management</title>
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
        <!-- AdminLTE CSS -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/admin-lte@3.1/dist/css/adminlte.min.css">
        <link rel="icon" type="image/x-icon" href="https://media.istockphoto.com/id/1323626703/vi/vec-to/bi%E1%BB%83u-t%C6%B0%E1%BB%A3ng-logo-nh%C3%A0-ch%E1%BB%AF-h-home-house.jpg?s=612x612&w=0&k=20&c=ppjNTys-kNJzarTudonu0wL8thGAz3o_zlaZHocA1Fk=" />
    </head>
    <body class="hold-transition sidebar-mini layout-fixed">

        <div class="wrapper">
            <!-- Main Sidebar -->
            <aside class="main-sidebar sidebar-dark-primary elevation-4">
                <!-- Sidebar -->
                <div class="sidebar">
                    <div class="user-panel mt-3 pb-3 mb-3 d-flex">
                        <div class="image">
                            <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTIqf8VBKq3k_d-SiZTFTUfbl4T3Acrk8YiMNhX1ygwsFEwwJrRdmKVfPHBRXowyYKQyLk&usqp=CAU" class="img-circle elevation-2" alt="User Image">
                        </div>
                        <div class="info">
                            <a href="#" class="d-block">${user.displayname}</a>
                        </div>
                    </div>

                    <!-- Sidebar Menu -->
                    <nav class="mt-2">
                        <li class="nav nav-pills nav-sidebar flex-column" role="menu">  </li>               
                            <li class="nav-item">
                                <a href="manalist" class="nav-link">
                                    <i class="nav-icon fas fa-cog"></i>
                                    <p>Quản lý xuất nhập kho</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="productlist" class="nav-link">
                                    <i class="nav-icon fas fa-cog"></i>
                                    <p>Quản lý sản phẩm</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="prolist" class="nav-link">
                                    <i class="nav-icon fas fa-cog"></i>
                                    <p>Danh mục sản phẩm</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="clist" class="nav-link">
                                    <i class="nav-icon fas fa-cog"></i>
                                    <p>Danh sách khách hàng</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="employeelist" class="nav-link">
                                    <i class="nav-icon fas fa-users"></i>
                                    <p>Quản lý nhân viên</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="listaccount" class="nav-link">
                                    <i class="nav-icon fas fa-user-cog"></i>
                                    <p>Tài Khoản</p>
                                </a>
                            </li>
                            <li class="nav-item">
                                <a href="logout" class="nav-link">
                                    <i class="nav-icon fas fa-sign-out-alt"></i>
                                    <p>Logout</p>
                                </a>
                            </li>
                        </ul>
                    </nav>
                    <!-- /.sidebar-menu -->
                </div>
                <!-- /.sidebar -->
            </aside>

            <!-- Content Wrapper -->
            <div class="content-wrapper">
                <!-- Content Header -->
                <section class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1>Dashboard</h1>
                            </div>
                        </div>
                    </div>
                </section>

                <!-- Main content -->
                <section class="content">
                    <div class="container-fluid">
                        <div class="row">
                            <!-- Products Card -->
                            <div class="col-lg-3 col-6">
                                <div class="small-box bg-info">
                                    <div class="inner">
                                        <h3>83</h3>
                                        <p>Products</p>
                                    </div>
                                    <div class="icon">
                                        <i class="fas fa-shopping-cart"></i>
                                    </div>
                                    <a href="#" class="small-box-footer">More info <i class="fas fa-arrow-circle-right"></i></a>
                                </div>
                            </div>
                            <!-- Product Types Card -->
                            <div class="col-lg-3 col-6">
                                <div class="small-box bg-success">
                                    <div class="inner">
                                        <h3>86</h3>
                                        <p>Product Types</p>
                                    </div>
                                    <div class="icon">
                                        <i class="fas fa-tags"></i>
                                    </div>
                                    <a href="#" class="small-box-footer">More info <i class="fas fa-arrow-circle-right"></i></a>
                                </div>
                            </div>
                            <!-- User Registrations Card -->
                            <div class="col-lg-3 col-6">
                                <div class="small-box bg-warning">
                                    <div class="inner">
                                        <h3>66</h3>
                                        <p>User Registrations</p>
                                    </div>
                                    <div class="icon">
                                        <i class="fas fa-user-plus"></i>
                                    </div>
                                    <a href="#" class="small-box-footer">More info <i class="fas fa-arrow-circle-right"></i></a>
                                </div>
                            </div>
                            <!-- Unique Visitors Card -->
                            <div class="col-lg-3 col-6">
                                <div class="small-box bg-danger">
                                    <div class="inner">
                                        <h3>33</h3>
                                        <p>Unique Visitors</p>
                                    </div>
                                    <div class="icon">
                                        <i class="fas fa-chart-pie"></i>
                                    </div>
                                    <a href="#" class="small-box-footer">More info <i class="fas fa-arrow-circle-right"></i></a>
                                </div>
                            </div>
                        </div>

                        <!-- Sales Graph -->
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="card">
                                    <div class="card-header">
                                        <h3 class="card-title">Sales Graph</h3>
                                    </div>
                                    <div class="card-body">
                                        <canvas id="salesChart" style="height: 250px;"></canvas>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </section>
            </div>
            <!-- /.content-wrapper -->
        </div>

        <!-- Bootstrap JS and AdminLTE -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/admin-lte@3.1/dist/js/adminlte.min.js"></script>
        <!-- Chart.js for Sales Graph -->
        <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
        <script>
            // Sales Chart
            const ctx = document.getElementById('salesChart').getContext('2d');
            const salesChart = new Chart(ctx, {
                type: 'line',
                data: {
                    labels: ['2020', '2021', '2022', '2023', '2024'],
                    datasets: [{
                            label: 'Sales',
                            data: [5000, 15000, 10000, 20000, 15000],
                            backgroundColor: 'rgba(60,141,188,0.9)',
                            borderColor: 'rgba(60,141,188,0.8)',
                            fill: true
                        }]
                },
                options: {
                    responsive: true,
                    maintainAspectRatio: false
                }
            });
        </script>

    </body>
</html>

