<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Delete Seller</title>
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
            background-color: #c1121f;
            color: white;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #780000;
        }
	</style>
</head>
<body>
<div class="form-container">
	<%
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String bod = request.getParameter("bod");
		String nic = request.getParameter("nic");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	%>

	<h1>Delete Seller</h1>

	<form action="slrdelete" method="post">
	<table>
		<tr>
			<td>Seller ID</td>
			<td><input type="text" name="sellerid" value="<%= id %>" readonly></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value="<%= name %>" readonly></td>
		</tr>
		<tr>
		<td>bod</td>
		<td><input type="text" name="bod" value="<%= bod %>" readonly></td>
	</tr>
	<tr>
		<td>nic</td>
		<td><input type="text" name="nic" value="<%= nic %>" readonly></td>
	</tr>
	<tr>
		<td>address</td>
		<td><input type="text" name="address" value="<%= address %>" readonly></td>
	</tr>		
	<tr>
		<td>email</td>
		<td><input type="text" name="email" value="<%= email %>" readonly></td>
	</tr>
	<tr>
		<td>phone</td>
		<td><input type="text" name="phone" value="<%= phone %>" readonly></td>
	</tr>
	<tr>
		<td>User name</td>
		<td><input type="text" name="username" value="<%= username %>" readonly></td>
	</tr>
	
	</table>
	<br>
	<input type="submit" name="submit" value="Delete Seller Account">
	</form>
</div>
</body>
</html>