<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead Details</title>
</head>
<body>
	<h2>Lead Details</h2>
	
	<table >
		<tr>
			<td>
				<form action = "findEmailId" method = "post">
				<input type = "hidden" name = "emailId" value = "${save.emailId}"/>
				<input type = "submit" value = "SendMail"/>
				</form>
			</td>
			<td>
				<form action = "findById" method = "post">
				<input type = "hidden" name = "id" value = "${save.id}"/>
				<input type = "submit" value = "Convert"/>
				</form>
			</td>
			
		
		</tr>
	</table>
	<hr>
	<br>
	 FIRST NAME		:-${save.firstName}<br>
	 MIDDLE NAME 	:-${save.middleName}<br>
	 LAST NAME 		:-${save.lastName}<br>
	 EMAIL ID 		:-${save.emailId}<br>
	 MOBILE NUMBER	:-${save.mobileNumber}<br>
	 SOURCE 		:-${save.source}<br>
</body>
</html>