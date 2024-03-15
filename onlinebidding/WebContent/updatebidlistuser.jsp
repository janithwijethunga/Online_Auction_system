<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<style type="text/css">
		table {
  			border-collapse: collapse;
		}

		table, th, td {
		  border: 1px solid black;
		}
	</style>
</head>
<body>

	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String category = request.getParameter("category");
		String price = request.getParameter("price");
		String image = request.getParameter("image");
		String accessString = request.getParameter("access");
		Integer access = null;

		if (accessString != null) {
		    try {
		        access = Integer.parseInt(accessString);
		    } catch (NumberFormatException e) {
		        // Handle parsing error, e.g., invalid input
		    }
		}

	%>
	
	
	<form action="bidupdate" method="post">
	<table>
		<tr>
			<td>Customer ID</td>
			<td><input type="text" name="cusid" value="<%= id %>"  readonly></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value="<%= name %>" readonly></td>
		</tr>
		<tr>
		<td>category</td>
		<td><input type="text" name="category" value="<%= category %>" readonly></td>
	</tr>
	<tr>
		<td>price</td>
		<td><input type="text" name="price" value="<%= price %>"></td>
	</tr>
		
	</table>
	<br>
	<input type="submit" name="submit" value="Update My Data">
	</form>

</body>
</html>