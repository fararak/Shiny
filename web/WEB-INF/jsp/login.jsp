<%-- 
    Document   : login
    Created on : 3 janv. 2019, 23:08:25
    Author     : Hp Gamers
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <spring:nestedPath path="">
            <form action="LoginController" method="post">
                <input type="submit" value="OK">
            </form>
        </spring:nestedPath>

    </body>
</html>
