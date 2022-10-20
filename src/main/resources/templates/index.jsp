<html>
<head>
    <title>
        welcome page
    </title>
    <link rel="stylesheet" th:href="@{/login.css}">
</head>
<body>
<center>
<form method="post">
    <div class="container">
        <h5 th:text="${msg}" class="invalid"></h5><br/>
        <label ><b>Username</b></label>
        <input type="text" placeholder="Enter Username" name="userid" required><br/>

        <label ><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="password" required><br/>

        <button type="submit">Login</button>
    </div>
</form>
</center>
</body>
</html>