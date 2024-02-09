<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/9/2024
  Time: 5:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Hello User Application</title>
</head>
<body>
<form action="checkboxes" method="POST">
    Select the fruits you like to eat: <br/>
    <input type="checkbox" name="fruit" value="Banana"/> Banana <br/>
    <input type="checkbox" name="fruit" value="Apple"/> Apple <br/>
    <input type="checkbox" name="fruit" value="Orange"/> Orange <br/>
    <input type="checkbox" name="fruit" value="Guava"/> Guava <br/>
    <input type="checkbox" name="fruit" value="Kiwi"/> Kiwi <br/>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
