<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<link rel="stylesheet" href="css/style.css"/>
<title>Supprimer Produit</title>
</head>
<body>
	<h2>Supprimer un produit</h2>
	<form method="post" action="SupprServlet">
		<label for="id">Saisir l'identifiant du produit à supprimer :</label>
		<input type="text" name="id" id="id" /><br />
		<input type="submit"
			value="valider" />
	</form><br/>
	<a href="${pageContext.request.contextPath}/index.jsp">pour retourner à l'accueil</a> <br/>
</body>
</html>