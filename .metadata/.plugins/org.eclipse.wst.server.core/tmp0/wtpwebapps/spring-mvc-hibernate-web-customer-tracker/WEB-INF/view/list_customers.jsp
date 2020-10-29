<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">

<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
</head>
<body>
	
	<div id="wrapper">
		<div id="heading">
			<h2>Customer Relationship Manager</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
		<!-- Button for adding customer -->
		<input type="button" value="Add Customer" class="add-button" onclick="window.location.href='add-customer-form' ;return false;">
		
			<table>
				<tr>
					<th>FIRST NAME</th>
					<th>LAST NAME</th>
					<th>EMAIL ID</th>
					<th>ACTION</th>
				</tr>
				
				<c:forEach var="tempCustomer" items="${customers}">
	
				<!-- Update Link Embedding -->
				<c:url var="updateLink" value="/customer/showFormForUpdate">
					<c:param name="customerId" value="${tempCustomer.id}"></c:param>
				</c:url>
					
					<!-- Delete Link Embedding -->
				<c:url var="deleteLink" value="/customer/delete">
					<c:param name="customerId" value="${tempCustomer.id}"></c:param>
				</c:url>
				<tr>
				<tr>
					<td>${tempCustomer.firstName}</td>
					<td>${tempCustomer.lastName}</td>
					<td>${tempCustomer.email}</td>
					
					<td>
						<a href="${updateLink}">Update</a> ||
						<a href="${deleteLink}" onclick="if(!confirm('Are you sure you want to delete this Customer ?')) return false">Delete</a>
					</td>
				</tr>
				
				</c:forEach>
			</table>
		</div>
	</div>
	
</body>
</html>