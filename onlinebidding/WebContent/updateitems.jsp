<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Update Items</title>
	<style>
		body {
            background-image: url(loginstyle/assets/img/Background.jpg); /* Add your background image URL */
            background-size: cover;
            background-position: center;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-container {
            background: rgba(0, 0, 0, 0.6); /* Dark overlay with 60% opacity */
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
            padding: 60px;
            width: 500px;
            text-align: center;
            color: white;
        }

        h1 {
            color: white;
        }

        table {
            width: 100%;
        }

        table, th, td {
            border: 1px solid white;
            border-collapse: collapse;
        }

        th, td {
            padding: 10px;
            color: #000814;
        }

        th {
            background-color: #ced4da;;
        }

        td {
            background-color: #ced4da;
            color: #000814;
        }

        input[type="text"],
        input[type="number"] {
            width: 80%;
            padding: 10px;
            margin: 5px 0;
            border: none;
            border-radius: 5px;
            background-color: #ced4da;
        }

        input[type="submit"] {
            width: 50%;
            padding: 10px;
            border: none;
            border-radius: 5px;
            background-color: #003566;
            color: white;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #001d3d;
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
	%>
	<div class="form-container">
	<h1>Update Items</h1>
	
	
		<form action="itmupdate" method="post">
	<table>
		<tr>
			<td>Customer ID</td>
			<td><input type="text" name="itemid" value="<%= id %>" readonly></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value="<%= name %>"></td>
		</tr>
		<tr>
		<td>category</td>
		<td><input type="text" name="category" value="<%= category %>"></td>
	</tr>
	<tr>
		<td> price</td>
		<td><input type="number" name="price" value="<%= price %>"></td>
	</tr>
	<tr>
		<td>image</td>
		<td><input type="text" name="image" value="<%= image %>"></td>
	</tr>
	</table>
	<br><br><br>
	<input type="submit" name="submit" value="Update Item">
	</form>
	</div>
</body>
</html>