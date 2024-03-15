<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
 <style type="text/css">
        /* styles.css */
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: #f2f2f2;
  margin: 0;
  padding: 0;
}

header {
  
  background: linear-gradient(to bottom, #90e0ef, #3498db);	
  color: #fff;
  padding: 20px 0;
  text-align: center;
}

nav ul {
  list-style-type: none;
  background-color: #333;
  text-align: center;
  padding: 10px 0;
}

nav ul li {
  display: inline;
  margin: 0 20px;
}

nav a {
  text-decoration: none;
  color: #fff;
  font-weight: bold;
  font-size: 18px;
}

main {
  margin: 20px;
  background-color: #fff;
  border-radius: 5px;
  padding: 20px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
  
}

form {
  text-align: center;
}

label {
  font-size: 18px;
  margin-right: 10px;
}

input[type="text"] {
  width: 200px;
  padding: 10px;
  font-size: 16px;
  border: 1px solid #ccc;
  border-radius: 5px;
}

input[type="submit"] {
  background-color: #3498db;
  color: #fff;
  padding: 10px 20px;
  font-size: 18px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  margin-top: 10px;
}

input[type="submit"]:hover {
  background-color: #2980b9;
}

h2 {
  font-size: 24px;
  margin-top: 20px;
}

p {
  font-size: 16px;
  margin: 10px 0;
}

footer {
  background-color: #333;
  color: #fff;
  text-align: center;
  padding: 10px;
}

	/* CSS for the Management Console section */
.management-buttons {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
    gap: 20px;
}

.management-button {
    text-decoration: none;
    text-align: center;
    display: inline-block;
    border: 2px solid #3498db;
    border-radius: 20px;
    overflow: hidden;
    transition: background-color 0.3s, color 0.3s;
}

.management-button button {
    background-color: transparent;
    color: #3498db;
    padding: 15px 30px;
    font-size: 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
}

.management-button:hover {
    background-color: #03045e;
}

.management-button:hover button {
    color: #fff;
}
.gradient-bg {
        background: linear-gradient(to bottom, #0096c7, #03045e);	

    </style>
</head>
<body class="gradient-bg">
  <header>
    <h1 style= "font-size: 40px;">Welcome to the Admin Page</h1>
  </header>
  <nav>
    <ul>
      <li><a href="http://localhost:8030/Payment/paymentlist"></a></li>
      <li><a href="#"></a></li>
      <li><a href="#"></a></li>
    </ul>
  </nav>
  <main>
    <h2 style="color: #3498db; font-size: 32px; text-align: center; margin-bottom: 30px;">Management Console</h2>
   
    <div class="management-buttons">
        <a href="/onlinebidding/userList" class="management-button">
            <button>User Management</button>
        </a>
        <a href="/onlinebidding/sellerlist" class="management-button">
            <button>Seller Management</button>
        </a>
        <a href="/onlinebidding/itemlist" class="management-button">
            <button>Item Management</button>
        </a>
        <a href="/onlinebidding/bidlist" class="management-button">
            <button>Bid Management</button>
        </a>
        <a href="/onlinebidding/diliverlist" class="management-button">
            <button>Delivery Management</button>
        </a>
    </div>
</main>

  <footer>
    <p>&copy; 2023 OnlineBiddingsystem.com</p>
  </footer>
</body>
</html>
