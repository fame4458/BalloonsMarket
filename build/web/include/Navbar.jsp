<%-- 
    Document   : Navbar
    Created on : Nov 14, 2018, 9:56:59 PM
    Author     : FAME
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<nav class="navbar navbar-expand-lg navbar-dark fixed-top mb-5" id="mainNav" style="background-color: darksalmon;">
    <div class="container">
        <a class="navbar-brand js-scroll-trigger" href="newIndex">Balloons Market</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="Party">PARTY</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="Birthday">BIRTHDAY</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link js-scroll-trigger" href="Celebrate">CELEBRATE</a>
                </li>
                
            </ul>
            <ul class="navbar-nav ml-auto">
                <c:choose>
                    <c:when test="${sessionScope.account != null}">
                        <li class="nav-item">
                            <a class="nav-link" style="text-transform: uppercase;cursor: default;color:#fff;">${sessionScope.account.username}</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="Logout">LOGOUT</a>
                        </li>
                    </c:when>
                    <c:otherwise>
                        <li class="nav-item">
                            <a class="nav-link js-scroll-trigger" href="Login">LOGIN</a>
                        </li>
                    </c:otherwise>
                </c:choose>
            </ul>
        </div>
    </div>
</nav>
