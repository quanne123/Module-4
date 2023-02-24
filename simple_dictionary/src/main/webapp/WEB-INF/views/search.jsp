<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2/24/2023
  Time: 4:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Translate</title>
</head>
<body>
<form action="/search">
  <label>Search</label>
  <input type="text" name="word">
  <input type="submit" value="submit">
</form>
<div>${search}</div>
</body>
</html>
