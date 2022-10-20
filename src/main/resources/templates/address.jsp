<html>
<head>
    <title>
        Address page
    </title>
    <link rel="stylesheet" th:href="@{/login.css}">
</head>
<body>
<center>
    <form method="post">
        <input type="text" name="location" placeholder="Address" />
        <br/>
        <button type="submit">getLocation</button>
    </form>
    <h1 th:text="${address}"></h1>
</center>
</body>
</html>