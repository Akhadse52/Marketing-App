<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose mail page</title>
</head>
<body>
	<h2>Compose Mail </h2>
	<br>
	<form action = "triggerMail" method = "post">
		To :- <input type = "text" name = "to" value = "${emailId}"/><br>
		subject :- <input type = "text" name = "subject" /><br>
		<textarea  name="messege" rows="10" cols="50">
		
		</textarea>
		<br>
		<input type = "submit" value = "send"/>
	</form>
	<br>
	${send}
</body>
</html>