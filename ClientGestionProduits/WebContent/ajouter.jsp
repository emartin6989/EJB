<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<link rel="stylesheet" href="css/style.css" />
<title>Ajouter Produit</title>
</head>
<body>
	<h2>Ajouter un produit</h2>
	<form method="post" action="AjoutServlet">
		<label for="nom">Saisir le nom du produit :</label> <input type="text"
			name="nom" id="nom" /><br /> <label for="quantite">Saisir
			la quantite du produit :</label> <input type="text" name="quantite"
			id="quantite" /><br /> <label for="prix">Saisir le prix du
			produit :</label> <input type="text" name="prix" id="prix" /><br /> <input
			type="submit" value="valider" />
	</form><br/>
	<a href="${pageContext.request.contextPath}/index.jsp">pour
		retourner � l'accueil</a>
	<br />
</body>
</html>