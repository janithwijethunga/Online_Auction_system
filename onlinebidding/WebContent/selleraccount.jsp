<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	
	<style type="text/css">
		body{
			font-family: Hind SemiBold;
		}
	
		table, th, td {
  			border: 1px solid black;
		}
	</style>
</head>
<body>

	<table>
	<c:forEach var="seller" items="${sellerDetails}">
	
	<c:set var="id" value="${seller.id}"/>
	<c:set var="name" value="${seller.name}"/>
	<c:set var="bod" value="${seller.bod}"/>
	<c:set var="nic" value="${seller.nic}"/>
	<c:set var="address" value="${seller.address}"/>
	<c:set var="email" value="${seller.email}"/>
	<c:set var="phone" value="${seller.phone}"/>
	<c:set var="username" value="${seller.username}"/>
	<c:set var="password" value="${seller.password}"/>
	
	<tr>
		<td>Seller ID</td>
		<td>${seller.id}</td>
	</tr>
	<tr>
		<td>Seller Name</td>
		<td>${seller.name}</td>
	</tr>
	<tr>
		<td>Seller bod</td>
		<td>${seller.bod}</td>
	</tr>
	<tr>
		<td>seller nic</td>
		<td>${seller.nic}</td>
	</tr>
	<tr>
		<td>Seller address</td>
		<td>${seller.address}</td>
	</tr>
	<tr>
		<td>Seller Email</td>
		<td>${seller.email}</td>
	</tr>
	<tr>
		<td>Seller Phone</td>
		<td>${seller.phone}</td>
	</tr>
	<tr>
		<td>Seller User Name</td>
		<td>${seller.username}</td>
	</tr>
	

	</c:forEach>
	</table>
	
	<c:url value="sellerupdate.jsp" var="cusupdate">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="bod" value="${bod}"/>
		<c:param name="nic" value="${nic}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="username" value="${username}"/>
		<c:param name="password" value="${password}"/>
	</c:url>
	
	<a href="${cusupdate}">
	<input type="button" name="update" value="Update My Data">
	</a>
	
	<br>
	<c:url value="sellerdeletes.jsp" var="cusdelete">
		<c:param name="id" value="${id}"/>
		<c:param name="name" value="${name}"/>
		<c:param name="bod" value="${bod}"/>
		<c:param name="nic" value="${nic}"/>
		<c:param name="address" value="${address}"/>
		<c:param name="email" value="${email}"/>
		<c:param name="phone" value="${phone}"/>
		<c:param name="username" value="${username}"/>
		<c:param name="password" value="${password}"/>
	</c:url>
	<a href="${cusdelete}">
	<input type="button" name="delete" value="Delete My Account">
	</a>
</body>
</html>