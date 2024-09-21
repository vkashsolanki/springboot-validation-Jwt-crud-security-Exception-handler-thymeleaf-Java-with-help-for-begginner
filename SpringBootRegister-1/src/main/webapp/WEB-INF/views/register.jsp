<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.container{
text-align: center;

}

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="register" method="post">
<div class="container">
<h1>Sing up Page</h1>
<label style="">Enter the Name </label>
<input type="text" name="name" placeholder="Enter the name ">
<br><br>
<label>Enter the Email </label>
<input type="email" name="email" placeholder="Enter the email ">
<br><br>
<label>Enter the Mobile </label>
<input type="tel" name="mobile" placeholder="Enter the mobile number ">
<br><br>
<label>Enter the Password </label>
<input type="password" name="password" placeholder="Enter the password ">
<br><br><br><br>
<button type="submit" value="Submit">Submit</button> <br><br>

<br><a href="login">click here for Login</a>
</div>
</form>

</body>
</html>