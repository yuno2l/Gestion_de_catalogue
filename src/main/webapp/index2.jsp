
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
<div class="container">
<div class="card text-center">
	<div class="card-header">
		<h2>Liste des Produits</h2>	
	</div>
	<div class="card-body">
	
	
	
	<form class="form-inline" method="get" action="Controleur">
  		<div class="form-group mb-2">
    		<label for="mot"><b>Mot clé:</b> </label>
    		<input type="text" id="mot" name="mc">
    		<button type="submit" name="action" value="rechercher" class="btn btn-primary mx-2 fa fa-search"></button>		  		
  		</div>
  		<div style="text-align: left; margin-left: 33px;">
  			<a href="Controleur?&action=addPage" class="btn btn-info fa fa-add"></a>
  		</div>
	</form>


		<table class="table">
	<tr>
		<th>#</th>
		<th>Nom</th>
		<th>Prix</th>
		<th>Quantite</th>
		<th>Action</th>
	</tr>
		<c:forEach items="${products}" var="p">
		<tr>
			<td>${p.id}</td>
			<td>${p.nom}</td>
			<td>${p.prix}</td>
			<td>${p.qte}</td>
			<td>
				<div>
					<a href="Controleur?id=${p.id}&action=delete" class="btn btn-danger fa fa-trash"></a>
					<a href="Controleur?id=${p.id}&nom=${p.nom}&prix=${p.prix}&qte=${p.qte}&action=editPage" class="btn btn-warning fa fa-edit"></a>
				</div>	
			</td>
		</tr>
		</c:forEach>
		
</table>
	
	</div>
</div>


</div>
</body>
</html>