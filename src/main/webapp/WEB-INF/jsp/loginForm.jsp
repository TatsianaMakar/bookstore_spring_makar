<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/css/style.css">
 <style>
        body{
            background: url("/images/login3.png")
        }
    </style>
    <title>Login</title>
</head>
<body>
<ul>
<li><a href="/">Home</a></li>
</ul>
<form  class="login-form" action="/login" method="post">
       <label>Login: <input name="login" type="text"</label>
       <label>Password: <input name="password" type="password" minlength="4"</label>
       <button>Login</button>
</form>
</body>
</html>