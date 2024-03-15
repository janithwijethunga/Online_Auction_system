<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bid insert</title>
<style>
        body {
            background-image: url(loginstyle/assets/img/Background.jpg); 
            background-size: cover;
            background-position: center;
            margin: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-container {
            background: rgba(0, 0, 0, 0.6); 
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.6);
            padding: 50px;
            width: 300px;
            text-align: center;
            color: white;
        }

        h1 {
            color: white;
        }

        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0;
            border: none;
            border-radius: 5px;
            background-color: #ced4da;
        }

        input[type="submit"] {
            width: 50%;
            padding: 5px;
            font-size: 14px;
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
        <h1>Bid Insert</h1>
	<form action="insertbid" method="post">
		Name <input type="text" name="name" required><br>
		category <input type="text" name="category" required><br>
		price <input type="number" name="price"><br>
		
		access <input type="number" name="access"><br>
		
		<input type="submit" name="submit" value="Insert bid">
	</form>
</div>

</body>
</html>