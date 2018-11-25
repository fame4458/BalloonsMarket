<%-- 
    Document   : Register
    Created on : Nov 25, 2018, 12:03:58 AM
    Author     : POM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <title>JSP Page</title>
</head>

<body style="background-color: darksalmon">


    <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <div class="panel panel-login">
                    <div class="panel-heading">
                        <div class="row">
                            <div class="col-6" >
                                <h2 class="text-center mt-5">Register</h2>       
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
                                        <input type="password" name="name" id="name" tabindex="2" class="form-control" placeholder="Name">
                                    </div>
                                    <div class="form-group">
                                        <input type="email" name="email" id="email" tabindex="1" class="form-control" placeholder="Email Address" value="">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" name="username" id="username" tabindex="1" class="form-control" placeholder="Username" value="">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" name="password" id="password" tabindex="2" class="form-control" placeholder="Password">
                                    </div>

                                    <br>
                                    <br>
                                    <div class="login">
                                        <center>
                                            <a href="Login.jsp">Login</a>   
                                        </center>
                                        <br>
                                    </div>

                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-sm-6 col-sm-offset-3">
                                                <input type="submit" name="register-submit" id="register-submit" tabindex="4" class="form-control btn btn-register" 
                                                       value="Register Now" style="background-color: peru ;color: #fff;" >
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
