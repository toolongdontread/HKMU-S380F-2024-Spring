<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2/21/2024
  Time: 12:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Map" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Product List</h1>
<a href="<c:url value="/shop?action=viewCart" />">View Cart</a><br/><br/>
<%
    @SuppressWarnings("unchecked")
    Map<Integer, String> products = (Map<Integer, String>) request.getAttribute("products");
    for (int id : products.keySet()) {
%>
<a href="<c:url value="/shop">
<c:param name="action" value="addToCart" />
<c:param name="productId" value="<%= Integer.toString(id) %>" />
</c:url>"><%= products.get(id) %></a><br/>
<% } %>
</body>
</html>
