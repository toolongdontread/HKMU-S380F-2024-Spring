<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/9/2024
  Time: 5:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Hello User Application</title>
</head>
<body>
<h1>Your Selections</h1>
<%
    String[] fruits = request.getParameterValues("fruit");

    if(fruits == null) {
%>
You did not select any fruits
<% } else{ %>
<ul>
<% for(String fruit : fruits) {%>
    <li><%=fruit%></li><% }%>
</ul>
<% }%>
</body>
</html>
