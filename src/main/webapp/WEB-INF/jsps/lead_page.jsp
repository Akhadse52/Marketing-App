<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Registration Page</title>
</head>
<body>
	<h1 align="center">Lead Registration </h1>
	<hr>
	<br>
	<form action = "saveLead" method = "post">
		<table border='1'>
			<tr>
				<td> FIRST NAME</td>
				<td><input type = "text" name = "firstName"></td>
			</tr>
			
			<tr>
				<td> MIDDLE NAME</td>
				<td><input type = "text" name = "middleName"></td>
			</tr>
			
			<tr>
				<td> LAST NAME</td>
				<td><input type = "text" name = "lastName"></td>
			</tr>
			
			<tr>
				<td> EMAIL ID</td>
				<td><input type = "email" name = "emailId"></td>
			</tr>
			
			<tr>
				<td> MOBILE NUMBER</td>
				<td><input type = "number" name = "mobileNumber"></td>
			</tr>
			
			<tr>
				<td> SOURCE </td>
					<td>
						<select name="source" >
						  <option value="select">select</option>
						  <option value="radio">radio</option>
						  <option value="newspaper">newspaper</option>
						  <option value="website">website</option>
						  <option value="advertisement">advertisement</option>
						</select>
				
					</td>
			</tr>
			
			<tr>
				<td style="text-align: center;" colspan="5"><input type = "submit" value = "Register"></td>
			</tr>
		
		</table>
	
	</form>
</body>
</html>