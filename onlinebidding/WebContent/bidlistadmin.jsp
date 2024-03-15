<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Accounts</title>
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
    <h1>User Accounts</h1>
    <table>
        <tr>
            <th>Bidding ID</th>
            <th>Name</th>
            <th>category</th>
            <th>price</th>
            <th>image</th>
            <th>access</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="binding" items="${bindDetails}">
            <tr>
                <td>${binding.id}</td>
                <td>${binding.name}</td>
                <td>${binding.category}</td>
                <td>${binding.price}</td>
                <td>${binding.image}</td>
                <td>${binding.access}</td>
                <td>
                    <a href="updatebidlist.jsp?id=${binding.id}&name=${binding.name}&category=${binding.category}&price=${binding.price}&image=${binding.image}&access=${binging.access}">Update</a>
                    |
                    <a href="deletebindts.jsp?id=${binding.id}&name=${binding.name}&category=${binding.category}&price=${binding.price}&access=${binding.access}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
