<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/addCustomer" method="post">
			<table style="with: 50%">
			<tr>
					<td>Customer ID</td>
					<td><input type="text" name="custId" /></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" /></td>
				</tr>
				<tr>
					<td>Contact No</td>
					<td><input type="text" name="phoneNumber" /></td>
				</tr></table>
			<input type="submit" value="Submit" /></form>

</body>
</html>