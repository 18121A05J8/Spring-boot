<html>
<head>
<title>
    welcome page
</title>
</head>
<body>
<center>
    <form method="post">
        <h6 th:text="${msg}"></h6>
        <input type="text" name="userid" placeholder="userid"/>
        <br/>
        <input type="password" name="password" placeholder="password"/>
        <br/>
        <button type="submit">submit</button>
    </form>
</center>
</body>
</html>