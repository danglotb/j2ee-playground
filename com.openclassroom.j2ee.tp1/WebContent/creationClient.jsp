<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Nouveau client !</title>
	</head>
	<body>
    	<div>
    		<form method='get' action='creationClient'>
    			<fieldset>
    				<legend>Création d'un fichier client</legend>
    				
    				<label for=nom>Nom<span class=requis>*</span></label>
    				<input type=text id=nom name=nom value=""/>
    				<br/>
    				
    				<label for=prenom>Prénom</label>
    				<input type=text id=prenom name=prenom value=""/>
    				<br/>
    				
    				<label for=adresse>Adresse<span class=requis>*</span></label>
    				<input type=text id=adresse name=adresse value=""/>
    				<br/>
    				
    				<label for=telephone>Téléphone</label>
    				<input type=text id=telephone name=telephone value=""/>
    				<br/>
    				
    				<label for=email>Email<span class=requis>*</span></label>
    				<input type=text id=email name=email value=""/>
    				<br/>
    			
    				<input type=submit value="Créer nouveau client"/>
    			
    			</fieldset>
    		</form>
    	</div>
	</body>
</html>
