<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List All Lead</title>
</head>
<body>
	<h2>List All Lead </h2>
	<br>
	<table>
		<tr>
			<th>FIRST NAME</th>
			<th>MIDDLE NAME</th>
			<th>LAST NAME</th>
			<th>EMAIL ID</th>
			<th>MOBILE NUMBER</th>
		</tr>
		<c:forEach items="${allLead }" var ="lead">
			<tr>
				<td><a href = "findByLeadId?id=${lead.id}">${lead.firstName}</a></td>
				<td>${lead.middleName}</td>
				<td>${lead.lastName }</td>
				<td>${lead.emailId }</td>
				<td>${lead.mobileNumber }</td>
			</tr>
		
		
		</c:forEach>
	
	</table>
</body>
</html>