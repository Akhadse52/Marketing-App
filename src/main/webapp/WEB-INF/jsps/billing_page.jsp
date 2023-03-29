<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
</head>
<body>
<h2>Billing To Contacts</h2>
<br>

	<form action = "billingAmount" method = "post">
		<table border='1'>
			<tr>
				<td>First Name</td>
				<td><input type = "text" name = "firstName" value = "${contact.firstName} "/></td>
			</tr>
			
			<tr>
				<td>Middle Name</td>
				<td><input type = "text" name = "middleName" value = "${contact.middleName} "/></td>
			</tr>
			
			<tr>
				<td>Last Name</td>
				<td><input type = "text" name = "lastName" value = "${contact.lastName} "/></td>
			</tr>
			
			<tr>
				<td>Email Id</td>
				<td><input type = "email" name = "emailId" value = "${contact.emailId} "/></td>
			</tr>
			
			<tr>
				<td>Mobile Number</td>
				<td><input type = "text" name = "mobileNumber" value = "${contact.mobileNumber} "/></td>
			</tr>
			
			<tr>
				<td>Product</td>
				<td><input type = "text" name = "product"/></td>
			</tr>
			
			<tr>
				<td>Amount</td>
				<td><input type = "number" name = "amount"/></td>
			</tr>
			<tr>
			
				<td><input type = "hidden" name = "id" value = "${contact.id} "/></td>
			</tr>
			
			<tr>
			
				<td><input type = "submit" value = "Generate Bill"/></td>
			</tr>
			
			
		
		</table>
		${succefully}
	
	</form>
</body>
</html>