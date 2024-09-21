<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.container{
text-align: center;
}
h1{
margin-top: 50px;
}

</style>

<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="login" method="post">

<div class="container">
<h1>Sing up Page</h1>

<label>Enter the Email </label>
<input type="email" name="email" placeholder="Enter the email ">
<br><br>
<label>Enter the Password </label>
<input type="password" name="password" placeholder="Enter the password ">
<br><br><br><br>
<button type="submit" value="login">Login</button><br><br><br>
<br>

<a href="show">Show All Data</a>
</div>


</form>
</body>
</html>