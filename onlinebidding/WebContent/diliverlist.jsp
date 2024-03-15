<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Courier Services</title>
    <style >
        body {
            font-family: Arial, sans-serif;
            background-color: #8ecae6;
        }

        h1 {
            text-align: center;
            background-color: #023047;
            color: white;
            padding: 20px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px auto;
            background-color: #219ebc;
            border: 1px solid #ccc;
            box-shadow: 0px 0px 10px #aaa;
        }

        th, td {
            padding: 12px 15px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #023047;
            color: white;
        }

        tr:hover {
            background-color: #219ebc;
        }

        a {
            text-decoration: none;
        }

        .actions {
            display: flex;
            gap: 10px;
        }
        
		.add-seller-button {
    		display: inline-block;
   			padding: 10px 20px;
		    background-color: #3c096c; 
		    color: white; 
		    border: none; 
		    border-radius: 5px; 
		    text-align: center;
		    text-decoration: none;
		    font-size: 16px;
		    cursor: pointer;
		    transition: background-color 0.3s;
			}
			
			.add-seller-button:hover {
			    background-color: #240046; 
			}
			        
			}
			
			.add-seller-button:hover {
			    background-color: #45a049; 
			}
			
			
			.update-button {
			    padding: 6px 12px;
			    background-color: #14213d; 
			    color: white; 
			    border: none; 
			    border-radius: 5px; 
			    text-align: center;
			    text-decoration: none;
			    font-size: 14px;
			    cursor: pointer;
			    transition: background-color 0.3s;
			    margin-right: 5px;
			}
			
			.update-button:hover {
			    background-color: #000000;
			}
			
			
			.delete-button {
			    padding: 6px 12px;
			    background-color: #dc3545; 
			    color: white; 
			    border: none; 
			    border-radius: 5px; 
			    text-align: center;
			    text-decoration: none;
			    font-size: 14px;
			    cursor: pointer;
			    transition: background-color 0.3s;
			}
			
			.delete-button:hover {
			    background-color: #d62828; 
			}
    </style>
</head>
<body>
    <h1>Courier Services</h1>
    <a href="/onlinebidding/diliverinsert.jsp"class="add-seller-button">
    Add delivery
    </a>
    <table>
        <tr>
            <th>Deliver ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Username</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="cus" items="${diliverDetails}">
            <tr>
                <td>${cus.id}</td>
                <td>${cus.name}</td>
                <td>${cus.email}</td>
                <td>${cus.phone}</td>
                <td>${cus.userName}</td>
                
                <td>
                    <a href="diliverupdate.jsp?id=${cus.id}&name=${cus.name}&email=${cus.email}&phone=${cus.phone}&uname=${cus.userName}&pass=${cus.password}"class="update-button">Update</a>
                    |
                    <a href="diliverdelete.jsp?id=${cus.id}&name=${cus.name}&email=${cus.email}&phone=${cus.phone}&uname=${cus.userName}&pass=${cus.password}"class="delete-button">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
