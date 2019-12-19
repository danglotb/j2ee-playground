<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nouveau client !</title>
</head>
<body>
	<p>
		${ empty client.nom || empty client.adresse || empty client.email ? 'Erreur - Vous n\'avez pas remplis certains chanps obligatoires<br/>
		<a href=\'http://localhost:8080/com.openclassroom.j2ee.tp1/creationClient.jsp\'>Cliquez ici</a> pour à nouveau saisir vos données' : '' }
	</p>
	<div>
		Client
		<ul>
			<li>Nom : ${client.nom}</li>
			<li>Prénom : ${client.prenom}</li>
			<li>Adresse : ${client.adresse}</li>
			<li>Téléphone : ${client.telephone}</li>
			<li>Email : ${client.email}</li>
		</ul>
	</div>

</body>
</html>