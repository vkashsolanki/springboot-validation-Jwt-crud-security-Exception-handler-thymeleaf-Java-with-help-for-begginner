<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<h2>List of user</h2>
</div>

<div>
<div>id :: ${ user.id}</div>
<div> Name :: ${user.name}</div>
<div>email :: ${user.email}</div>

</div>
</body>
</html>