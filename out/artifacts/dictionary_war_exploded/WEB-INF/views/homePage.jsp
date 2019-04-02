<%--
  Created by IntelliJ IDEA.
  User: Trangs
  Date: 4/2/2019
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form method="post" action="/homePage">
    <h1>Dictionary</h1>
    <input type="text" name="english">
    <button type="submit">Change</button><br>
    <span>Result : ${vietnamese}</span>
</form>
</body>
</html>
