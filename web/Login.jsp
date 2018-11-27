<%-- 
    Document   : Login
<<<<<<< HEAD
    Created on : Nov 15, 2018, 6:38:28 PM
    Author     : POM
=======
    Created on : Nov 16, 2018, 9:28:20 AM
    Author     : SarinratBeauty
>>>>>>> 9b6edcba7249a751897b473145d098742e4fcbd8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Balloons Market</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    </head>

    <body style="background-color: darksalmon;color: #fff;">



        <div class="container mt-5 text-center">
            <div class="row">
                <div class="col-md-12 col-md-offset-3">
                    <div class="panel panel-login">
                        <div class="panel-heading">
                            <h2 class="text-center mt-5">Login</h2>       
                            <h4 class="text-center mt-3">${Message}</h4>
                            <hr>
                        </div>

                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-12">
                                    <form id="login-form" action="Login" method="post" role="form" style="display: block;">
                                        <div class="form-group">                 
                                            <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
                                        </div>

                                        <br>
                                        <br>

                                        <div class="form-group">
                                            <div class="row">
                                                <div class="col-lg-6">
                                                    <input type="submit" name="login" tabindex="4" class="btn btn-block" 
                                                           value="Login" style="background-color: peru ;color: #fff;" >
                                                </div>
                                                <div class="col-lg-6">
                                                    <a href="Register" class="btn btn-block" style="background-color: peru ;color: #fff;">Register</a>
                                                </div>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
