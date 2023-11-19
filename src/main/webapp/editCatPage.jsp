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
	<div class="card">
	
		<div class="card-header">
		<h2>Modifier la categorie</h2>	
		</div>
		
		<div class="card-body">
		
			<form class="form-inline" method="get" action="Controleur">
		  		
		  			<div class="form-group row">
			  			<label for="id" class="col-sm-2 col-form-label">Id: </label>
			  			<div class="col-sm-10">
							<input type="text" id="i" name="id" value="${id}" readonly>
						</div>
					</div>
					<div class="form-group row">
			    		<label for="nom" class="col-sm-2 col-form-label">Nom: </label>
			    		<div class="col-sm-10">
			    			<input type="text" id="n" name="nom" value="${nom}">
		    			</div>	
		    		</div>
		    		
		    		
		    		
		    		
		    		<div style="margin-left: 23%">
    					<button type="submit" name="action" value="editCat" class="btn btn-primary mb-2">Sauvegarder</button>
		    		</div>
		  		
			</form>
		</div>
	
	</div>
</div>
</body>
</html>