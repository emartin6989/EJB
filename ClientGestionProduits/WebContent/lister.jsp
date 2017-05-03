<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<link rel="stylesheet" href="css/style.css"/>
<title>Lister les Produits</title>
</head>
<body>
	<h2>Lister les Produits</h2>
	<form method="post" action="ListServlet">
	<input type="submit" value="Lister" />
	</form>
		<table>
	<tr>
	<th>Id produit</th>
	<th>Nom produit</th>
	<th>Quantité produit</th>
	<th>Prix produit</th>
	</tr>
	<c:forEach items="${listeP}" var="produit">
	<tr>
	<td>${produit.getId()}</td>
	<td>${produit.getNom()}</td>
	<td>${produit.getQuantite()}</td>
	<td>${produit.getPrix()}</td>
	</tr>
	</c:forEach>
	</table><br/>
 <a href="${pageContext.request.contextPath}/index.jsp">pour retourner à l'accueil</a> <br/>
</body>
</html>