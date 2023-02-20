<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="olive">
${usr}<br>
<h3>UserName: ${usr.name}</h3>
<h3>Gender: ${usr.gender}</h3>
<h3>Gender: ${usr.country}</h3>
<c:forEach items="${usr.language}" var="item">
<h3>Language: <li>${item}</li></h3>
</c:forEach>
</body>
</html>