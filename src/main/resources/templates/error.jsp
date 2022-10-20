<html>
<head>
    <title>error page</title>
    <link rel="stylesheet" th:href="@{/login.css}"/>
</head>
<body>
<h1 th:text="${error}" align="center"></h1>
<h1 th:text="${status}" align="center" class="invalid"></h1>
</body>
</html>