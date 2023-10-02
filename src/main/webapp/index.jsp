<%@page import="DAO.*" %>
<%@page import="entities.*" %>
<%@page import="java.util.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<% List<Produit> liste=(List<Produit>)request.getAttribute("products"); %>
<div class="container">
<table class="table">
	<tr>
		<th>#</th>
		<th>Nom</th>
		<th>Prix</th>
		<th>quantite</th>
	</tr>
	<% for(Produit p:liste){ %>
		<tr>
			<td><%=p.getId() %></td>
			<td><%=p.getNom() %></td>
			<td><%=p.getPrix() %></td>
			<td><%=p.getQte() %></td>
		</tr>
		
		
	<%}%>
</table>

</div>
</body>
</html>