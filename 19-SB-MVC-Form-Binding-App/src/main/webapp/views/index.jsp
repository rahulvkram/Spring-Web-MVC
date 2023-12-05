<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3>Student Information</h3>
	<p>${succMsg}</p>
	<table>
		<form:form action="saveStudent" method="POST" modelAttribute="student">

			<tr>
				<td>Student ID</td>
				<td><form:input path="sid" /></td>
			</tr>

			<tr>
				<td>Student Name</td>
				<td><form:input path="sname" /></td>
			</tr>

			<tr>
				<td>Student Rank</td>
				<td><form:input path="srank" /></td>
			</tr>
			
			<tr>
				<td></td>
				<td><input type="submit" value="Register"/></td>
			</tr>

		</form:form>

	</table>

</body>
</html>