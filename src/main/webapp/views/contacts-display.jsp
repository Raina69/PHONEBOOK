<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

 <script type="text/javascript">
function confirmDelete(){

return confirm("Are you sure, to delete ?");
}
</script>
</head>
<body>
<h3> View Contacts</h3>
<a href="load-form">+Add New Contact</a>
<table border="1">
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
      <c:forEach items="${contacts}" var="contact">
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