<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<html>
<head>
    <title>Money Transfer</title>
</head>
<body>
<h1>Convert Money</h1>
<form action="/convert" method="post">
    <p>USD: <input type="text" name="amount"></p>
    <p>Rate: <input type="text" name="rate"></p>
    <button type="submit">Change</button>
</form>
<p>Result: ${result}</p>
</body>
</html>