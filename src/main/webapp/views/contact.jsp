<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3> Contact Info</h3>
<form:form action="#" method="POST" modelAttribute="contact">
<table>
<tr>
<td>Name: </td>td>
<td><form:input path="contactName"/></td>
</tr>

<tr>
<td>Email: </td>td>
<td><form:input path="contactEmail"/></td>
</tr>
</table>
 </body>
 </form:form>
 
</html>