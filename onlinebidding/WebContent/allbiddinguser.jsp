<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Accounts</title>
    <style type="text/css">
        body {
            font-family: Hind SemiBold, Arial, sans-serif;
        }
        table {
            width: 80%;
            margin: 0 auto;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid #ccc;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
    </style>
</head>
<body>
    <h1>User Accounts</h1>
    <a href="http://localhost:8090/onlinebidding/bidinsert.jsp">
    <button>Add New Item </button>
    </a>
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
            <c:choose>
                <c:when test="${binding.access == 0}">
                    <span style="color: gray;">Update</span>
                </c:when>
                <c:when test="${binding.access == 1}">
                    <a href="updatebidlist.jsp?id=${binding.id}&name=${binding.name}&category=${binding.category}&price=${binding.price}&image=${binding.image}&access=${binding.access}">Update</a>
                </c:when>
            </c:choose>
            |
            <a href="deletebindts.jsp?id=${binding.id}&name=${binding.name}&category=${binding.category}&price=${binding.price}&access=${binding.access}">Delete</a>
        </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
