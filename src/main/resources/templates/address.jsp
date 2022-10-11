<html>
<head>
    <title>
        Address page
    </title>
</head>
<body>
<center>
    <form method="post">
        <h1 th:text="${add}"></h1>
        <input type="text" name="location" placeholder="Address"/>
        <br/>
        <button type="submit">submit</button>
    </form>
</center>
</body>
</html>