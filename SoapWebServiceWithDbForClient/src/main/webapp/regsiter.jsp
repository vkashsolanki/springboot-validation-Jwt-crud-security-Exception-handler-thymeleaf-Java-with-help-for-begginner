<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<jsp:useBean id="user" class="com.dto.User"></jsp:useBean>
<jsp:useBean id="dao" class="com.apna.dao.UserDao"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>

<%
String d = dao.saveData(user);
out.println(d);

%>



</body>
</html>