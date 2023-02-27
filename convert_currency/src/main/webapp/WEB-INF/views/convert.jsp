<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2/27/2023
  Time: 3:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>
<h1>Convert Money</h1>
<form action="/convert" method="post">
<div class="input-group">
    <span class="input-group-text">Convert</span>
    <input type="text" aria-label="USD" class="form-control" name="amount">
    <input type="text" aria-label="Rate" class="form-control" name="rate">
    <button type="submit">Change</button>
</div>
</form>
<p>Result: ${result}</p>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</html>
