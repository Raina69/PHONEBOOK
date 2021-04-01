<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <script type="text/javascript">
function confirmDelete(){

return confirm("Are you sure, to delete ?");


</script>
</head>
<body>
<h3> View Contacts</h3>
<a href="load-form">+Add New Contact</a>
<table>
  <thead>
    <tr>
<th>Contact ID</th>
<th>Contact Name</th>
<th>Contact Number</th>
<th>Contact Email</th>
<th>Action</th>
</tr>
</thead>
<tbody>
<c:forEach items="${contacts}" var="contacts">
<tr>
<td>${contact.contactId}</td>
<td>${contact.contactName}</td>
<td>${contact.contactNumber}</td>
<td>${contact.contactEmail}</td>
<td>
<a href="edit?cid=${contact.contactId}">Edit</a> 
<a href="delete?cid=${contact.contactId}" onClick="return confirmDelete()">Delete</a> 
</td>
</tr>
 </c:forEach>
</tbody>
</table>
</body>
</html>