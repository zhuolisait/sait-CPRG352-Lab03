<%-- 
    Document   : arithmeticcalculator
    Created on : 1-Jun-2022, 11:35:32 AM
    Author     : i5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <br><br>
        <form method="POST" ACTION="arithmetic">
            <label>First:</label>
            <input type="text" name="first" value="${first}">
            <br>
            <label>Second:</label>
            <input type="text" name="second" value="${second}">
            <br><br>
            <input type="submit" name="calc_type" value="+">
            <input type="submit" name="calc_type" value="-">
            <input type="submit" name="calc_type" value="*">
            <input type="submit" name="calc_type" value="%">
            <br>
            <p>Result: ${message}</p>
            <br>
        </form>
        <p><a href="age">Age Calculator</a></p>
        
    </body>
</html>
