<%-- 
    Document   : Cart
    Created on : Nov 28, 2018, 3:25:53 AM
    Author     : POM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Balloons Market</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <link href="https://fonts.googleapis.com/css?family=Caveat:400,700" rel="stylesheet">
       
    </head>
    <body style="background-color: darksalmon; color: #fff;font-family: 'Caveat', cursive;">
        <h1 class="m-5 text-center">Your Cart</h1>

        <table class="table mt-5">
            <thead  style="background-color: peru">
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">First</th>
                    <th scope="col">Last</th>
                    <th scope="col">Handle</th>
                </tr>
            </thead>
            <tbody style="background-color: #fff; color: black">
                <tr>
                    <th scope="row">1</th>
                    <td>Mark</td>
                    <td>Otto</td>
                    <td>@mdo</td>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td>Jacob</td>
                    <td>Thornton</td>
                    <td>@fat</td>
                </tr>
                <tr>
                    <th scope="row">3</th>
                    <td>Larry</td>
                    <td>the Bird</td>
                    <td>@twitter</td>
                </tr>
            </tbody>
        </table>

        <div class="col-lg-12 text-center">
            <form action="Address" method="post">
                <input type="submit" name="check" tabindex="4" class="btn px-5 py-2 mt-3" 
                       value="Check Out" style="background-color: peru ;color: #fff;" >
            </form>

        </div>

        <div class="m-2 text-center">
            <a href="index.html" style="color: #fff">Back</a>
        </div>

    </body>

</html>

