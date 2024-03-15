<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Seller Update</title>
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
    <div class="form-container">

	<h1>Update Seller Details</h1>
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
	
	
	<form action="slrupdate" method="post">
	<table>
		<tr>
			<td>Seller ID</td>
			<td><input type="text" name="sellerid" value="<%= id %>" readonly></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value="<%= name %>"></td>
		</tr>
		<tr>
			<td>bod</td>
			<td><input type="text" name="bod" value="<%= bod %>"></td>
		</tr>
		<tr>
			<td>nic</td>
			<td><input type="text" name="nic" value="<%= nic %>"></td>
		</tr>
		<tr>
			<td>address</td>
			<td><input type="text" name="address" value="<%= address %>"></td>
		</tr>
		<tr>
			<td>email</td>
			<td><input type="text" name="email" value="<%= email %>"></td>
		</tr>
		<tr>
			<td>phone</td>
			<td><input type="number" name="phone" value="<%= phone %>"></td>
		</tr>
		<tr>
			<td>username</td>
			<td><input type="text" name="username" value="<%= username %>"></td>
		</tr>
		
	
	
			
	</table>
	<br>
	<input type="submit" name="submit" value="Update Seller Data">
	</form>
</div>
</body>
</html>