<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Page</title>
</head>
<body>
		
	<h2>Contact Details</h2>
	<br>
	<table>
				<tr>
					<td>
						<form action = "update" method = "post">
						<input type = "hidden" name = "id" value = "${contact.id}"/>
						<input type = "submit" value = "Edit"/>
						</form>
					</td>
				</tr>
		</table>
	<table>
		<tr>
			<td>
				FIRST NAME	:- ${contact.firstName}
			</td>
		</tr>
		<tr>
			<td>
					MIDDLE NAME :- ${contact.middleName}
			</td>
		</tr>
		<tr>
			<td>
					LAST NAME	:- ${contact.lastName}
			</td>
		</tr>
		<tr>
			<td>
					EMAIL ID 	:- ${contact.emailId}
			</td>
		</tr>
		<tr>
			<td>
					MOBILE NUMBER :- ${contact.mobileNumber}
			</td>
		</tr>
	
	</table>
	
</body>
</html>