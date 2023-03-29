<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Contact </title>
</head>
<body>
	<h2>All Contact List </h2>
	<br>
	<table border ='1'>
		<tr>
			<th>FIRST NAME</th>
			<th>MIDDLE NAME</th>
			<th>LAST NAME</th>
			<th>EMAIL ID</th>
			<th>MOBILE NUMBER</th>
			<th>DELETE</th>
			<th>BILLING</th>
		</tr>
		<c:forEach items="${allContact }" var ="allContact">
			<tr>
				<td><a href = "findByIdContact?id=${allContact.id}">${allContact.firstName }</a></td>
				<td>${allContact.middleName}</td>
				<td>${allContact.lastName }</td>
				<td>${allContact.emailId }</td>
				<td>${allContact.mobileNumber}</td>
				<td><a href = "delete?id=${allContact.id}">Delete</a></td>
				<td><a href  = "billing?id=${allContact.id}">Billing</a></td>
			</tr>
		
		
		</c:forEach>
	
	</table>
</body>
</html>