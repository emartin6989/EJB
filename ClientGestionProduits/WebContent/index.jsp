<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/style.css"/>
<title>Accueil</title>
</head>
<body>
 <a href="${pageContext.request.contextPath}/ajouter.jsp">pour ajouter un produit</a> <br/>
  <a href="${pageContext.request.contextPath}/modifier.jsp">pour modifier un produit</a> <br/>
   <a href="${pageContext.request.contextPath}/lister.jsp">pour lister un produit</a> <br/>
    <a href="${pageContext.request.contextPath}/supprimer.jsp">pour supprimer un produit</a> <br/>
</body>
</html>