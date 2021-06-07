
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hello Gradle Web App</title>
</head>
<body> <jsp:useBean id="greeting" class="com.nuoen.ServerStation.TestServlet"/>
        <h3>${greeting.hello}</h3>
</body>
</html>