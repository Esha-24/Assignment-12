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
<body>
<body bgcolor="chocolate">
<form:form action="status" modelAttribute="valentine">
	Day: <form:input path="day" /><br><br>
	Gift: <form:input path="gift" /><br><br>
	Location: <form:input path="location" /><br><br>
	<input type="submit" value="submit">
</form:form>
</body>
</body>
</html>