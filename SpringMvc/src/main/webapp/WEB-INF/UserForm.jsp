<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="chocolate">
<form:form action="userInfo" modelAttribute="user">
	Name: <form:input path="name" /><br>
	Gender: <form:radiobuttons path="gender" items="${gender}"/>
			
	Country: <form:select path="country" items="${country}"></form:select>
	<br>
	Language: Hindi <form:checkbox path="language" value="Hindi"/>
	English <form:checkbox path="language" value="English"/>	
	Tamil <form:checkbox path="language" value="Tamil"/>
	Bangla <form:checkbox path="language" value="Bangla"/>
	<input type="submit" value="submit">
</form:form>
</body>
</html>