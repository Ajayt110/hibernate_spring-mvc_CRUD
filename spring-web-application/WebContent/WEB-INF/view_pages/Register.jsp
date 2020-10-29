<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="stag"%>
    
<!DOCTYPE html>
<html>
<head>

<title>Register Page</title>

</head>

<body>

<stag:form action="register" method="POST" modelAttribute="user">
		<table style="align:center;">
			<tr>
				<td class="errorMsgs">${errMgs}</td>
			</tr>
			<tr>
				<td><label>Fullname</label></td>
				<td><stag:input path="fullname" /></td>
				<td class="errorMsgs">${erMsg.fullnameError}</td>
			</tr>
			<tr>
				<td><label>Email</label></td>
				<td><stag:input path="email" /></td>
				<td class="errorMsgs">${erMsg.emailError}</td>
			</tr>
			<tr>
				<td><label>Mobile</label></td>
				<td><stag:input path="mobile" /></td>
				<td class="errorMsgs">${erMsg.mobileError}</td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><stag:password path="password" /></td>
				<td class="errorMsgs">${erMsg.passwordError}</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><stag:button type="submit">Register</stag:button></td>
			</tr>

		</table>

	</stag:form>

</body>
</html>