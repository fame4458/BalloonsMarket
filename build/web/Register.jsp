<%-- 
    Document   : Register
    Created on : Nov 25, 2018, 12:03:58 AM
    Author     : POM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <title>Register</title>
    </head>

    <body style="background-color: darksalmon;">
        <div class="container" style="margin-top: 100px;">
            <div class="row" >
                <div class="col-md-6 col-md-offset-3">
                    <div class="panel panel-login">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-12" >
                                    <h2 class="text-center m-5">Register</h2>       
                                </div>

                            </div>
                            <hr>
                        </div>

                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-12">

                                    <!--<form id="register-form" action="Register" method="post" role="form" style="display: none;">-->
                                    <form href="Register" method="post" >
                                        <div class="form-group">
                                            <input type="text" name="username" tabindex="1" class="form-control" placeholder="Username" >
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="password"  tabindex="1" class="form-control" placeholder="Password">
                                        </div>
                                        <div class="form-group">
                                            <input type="email" name="email" tabindex="1" class="form-control" placeholder="Email Address">
                                        </div>
                                        <div class="form-group">
                                            <div class="form-group">
                                                <div class="row">
                                                    <div class="col-lg-6">
                                                        <a href="Login" class="btn btn-block" style="background-color: peru ;color: #fff;"> Login </a>
                                                    </div>
                                                    <div class="col-lg-6">
                                                        <input type="submit" tabindex="4" class="btn btn-block" 
                                                               value="Register Now" style="background-color: peru ;color: #fff;" >
                                                    </div>
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
    </body>

</html>
