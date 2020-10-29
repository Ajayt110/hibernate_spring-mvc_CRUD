<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>

<style>
.error
{
color:red;
}
</style>
<meta charset="ISO-8859-1">
<title>Customer Reg Form</title>
</head>
<body>
	<sp:form action="customerDetails" modelAttribute="customer">
	
	Enter First Name: <sp:input path="firstName"/>
	<sp:errors path="firstName" cssClass="error"/> 
	<br><br>
	Enter Last Name: <sp:input path="lastName"/>
	<sp:errors path="lastName" cssClass="error"/> 
	<br><br>
	Enter your UserName: <sp:input path="userName"/>
	<sp:errors path="userName" cssClass="error"/> 
	<br><br>
	Enter number of Tickets: <sp:input path="tickets"/>
	<sp:errors path="tickets" cssClass="error"/> 
	<br><br>
	<input type="submit" value="Submit">
	</sp:form>
	
</body>
</html>