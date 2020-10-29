<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details Display Page</title>
</head>
<body>
	Welcome Student: ${student.firstName} ${student.lastName}
	<br>
	<br>
	Your Country is: ${student.country}
	
	<br>
	<br>
	
	Your Favourite Anime is : ${student.anime}
	
	<br>
	<br>
	
	Your preferred anime genre is : 
	<ul>
	<c:forEach var="temp" items="${student.animeGenre}">
	<li>${temp}</li>
	</c:forEach>
	</ul>
	
	
</body>
</html>