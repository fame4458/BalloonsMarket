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
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>

<!--<<<<<<< HEAD-->
<body style="background-color: darksalmon">


    <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <div class="panel panel-login">
                    <div class="panel-heading">
                        <div class="row">
                            <div class="col-6" >
                                <h2 class="text-center mt-5">Login</h2>       
                            </div>

                        </div>
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

                                    <div class="register">
                                        <center>
                                            <a href="Register.jsp">Register</a>   
                                        </center>
                                        <br>
                                    </div>

                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-sm-6 col-sm-offset-3">

                                                <input type="submit" name="submit" id="login-submit" tabindex="4" class="form-control btn btn-login" 
                                                       value="Log In" style="background-color: peru ;color: #fff;" >                                       
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
