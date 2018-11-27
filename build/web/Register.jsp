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
        <title>Balloons Market</title>
        <link href="https://fonts.googleapis.com/css?family=Caveat:400,700" rel="stylesheet">
    </head>

    <body style="background-color: darksalmon;font-family: 'Caveat', cursive;">

        <div class="container ">
            <div class="row">
                <div class="col-md-6 col-md-offset-3">
                    <div class="panel panel-regis">
                        <div class="panel-heading">
                            <div class="row" style="color: black" >
                                <div class="text-center" >
                                    <h2>Register</h2>                        
                                </div>
                                <hr>
                            </div>
                            
                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <form id="regis-form" action="Register" method="post" role="form" style="display: block;">
                                            <div class="form-group">
                                                <input type="text" name="user" tabindex="1" class="form-control" placeholder="Username" >
                                            </div>
                                            <div class="form-group">
                                                <input type="password" name="pass"  tabindex="1" class="form-control" placeholder="Password">
                                            </div>
                                            <div class="form-group">
                                                <input type="email" name="mail" tabindex="1" class="form-control" placeholder="Email Address">
                                            </div>

                                             <div class="form-group">
                                                <div class="row">
                                                    <div class="col-lg-6">
                                                        <input type="submit" name="login" tabindex="4" class="btn btn-block" 
                                                               value="Login" style="background-color: peru ;color: #fff;" >
                                                    </div>
                                                    <div class="col-lg-6">
                                                        <a href="Register" class="btn btn-block" style="background-color: peru ;color: #fff;">Register Now</a>
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
        </div>
    </div>
</body>

</html>
