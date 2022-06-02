<%-- 
    Document   : ageCalcForm
    Created on : 26-May-2022, 10:56:11 AM
    Author     : i5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your age: </label>
            <!--$(age) sets these the age value we got from the user input, so that it stays after submit-->
            <input type="text" name="user_age" value="${age}">
            <br><br>
            <input type="submit" value="submit age">
            <p>${message}</p>
            <br>
            <p><a href="arithmetic">Arithmetic Calculator</a></p>

        </form>
    </body>
</html>
