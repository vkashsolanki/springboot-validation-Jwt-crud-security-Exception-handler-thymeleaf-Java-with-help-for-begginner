<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form page</title>
</head>
<body>
<div>
<h2>WElcome User Page</h2>

</div>
<div>
<form:form method="post" modelAttribute="user" >
<form:input type="text" path="name" name ="name"></form:input>
<form:errors path="name"/><br>
<br>
<form:input path="email" type="email" name = "email"/>
<form:errors path="email"/>
<br>

<input type="submit" value="submit">



</form:form>

</div>

</body>
</html>