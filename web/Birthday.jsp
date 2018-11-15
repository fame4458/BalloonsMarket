<%-- 
    Document   : Birthday
    Created on : Nov 15, 2018, 7:44:06 PM
    Author     : SarinratBeauty
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="include/Navbar.jsp" />
        <div class="container mt-5">
            <div class="row mt-5">
                <c:forEach items="${product}" var="p" varStatus="vs">
                    <div class="col-lg-4 col-sm-6 portfolio-item mt-5">
                        <div class="card h-100">
                            <a href="#"><img class="card-img-top" src="${p.productphoto}" alt=""></a>
                            <div class="card-body">
                                <h4 class="card-title">
                                    ${p.productname}
                                </h4>
                                <p class="card-text">${p.productdescription}</p>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </body>
</html>
