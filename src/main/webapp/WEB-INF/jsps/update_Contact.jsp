<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>
<body>
	<h2>Update Contact </h2>
	<form action = "updatePage"  Method = "post">
	<table border = '1'>
			<tr><td><input type = "hidden" name = "id" value = "${byId.id}"/></td></tr>
		<tr>
			<td>FIRST NAME</td>
			<td><input type = "text" name = "firstName" value = "${byId.firstName}"/></td>
		
		</tr>
		
		<tr>
			<td>MIDDLE NAME</td>
			<td><input type = "text" name = "middleName" value = "${byId.middleName}"/></td>
		
		</tr>
		
		<tr>
			<td>LAST NAME</td>
			<td><input type = "text" name = "lastName" value = "${byId.lastName}"/></td>
		
		</tr>
		
		<tr>
			<td>EMAIL ID</td>
			<td><input type = "text" name = "emailId" value = "${byId.emailId}"/></td>
		
		</tr>
		
		<tr>
			<td>MOBILE NUMBER</td>
		<td><input type = "text" name = "mobileNumber" value = "${byId.mobileNumber}"/></td>
		
		</tr>
		<tr>
		<td style="text-align: center;" colspan="5"><input type = "submit"  value = "Update"/></td>
		
		</tr>
	
	
	</table>
	
	</form>
</body>
</html>