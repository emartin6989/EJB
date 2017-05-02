<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="CalculServlet">
X : <input type ="text" name = "x"><br/>
Y : <input type ="text" name = "y"><br/>
<input type="submit" value="Valider"/>
</form>
<c:if test="${!empty(resultat1) || !empty(resultat2) || !empty(resultat3) || !empty(resultat4)}">
Resultat addition : ${resultat1}<br/>
Resultat soustraction : ${resultat2}<br/>
Resultat division : ${resultat3}<br/>
Resultat multiplication: ${resultat4}<br/>
</c:if>
</body>
</html>