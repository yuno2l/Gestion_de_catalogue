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
<nav class="navbar navbar-expand-lg bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="">Gestion Produit</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link" aria-current="page" href="Controleur">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link active" href="Controleur?&action=pageCategorie">Gestion categorie</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<div class="container">
<div class="card text-center">
	<div class="card-header">
		<h2>Liste des categorie</h2>	
	</div>
	<div class="card-body">
	
	
	
	<form class="form-inline" method="get" action="Controleur">
  		<div class="form-group mb-2">
    		<label for="mot"><b>Mot clé:</b> </label>
    		<input type="text" id="mot" name="mc">
    		<button type="submit" name="action" value="rechercherCat" class="btn btn-primary mx-2 fa fa-search"></button>		  		
			
			
  		</div>
  		<div style="text-align: left; margin-left: 33px;">
  			<a href="Controleur?&action=addCatPage" class="btn btn-info fa fa-add"></a>
  		</div>
	</form>


		<table class="table">
	<tr>
		<th>#</th>
		<th>Nom</th>
		<th>Action</th>
		
	</tr>
		<c:forEach items="${categorie}" var="p">
		<tr>
			<td>${p.id}</td>
			<td>${p.nom}</td>
			<td>
				<div>
					<a href="Controleur?id=${p.id}&action=deleteCat" class="btn btn-danger fa fa-trash"></a>
					<a href="Controleur?id=${p.id}&nom=${p.nom}&action=editCatPage" class="btn btn-warning fa fa-edit"></a>
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