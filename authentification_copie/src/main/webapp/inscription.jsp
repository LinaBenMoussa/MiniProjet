<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="u" class="tn.iit.auth.model.Utilisateur" scope="session"></jsp:useBean>

	<form method="post" action="verif.jsp">
		<table>
			<tr>
				<td>Nom :</td>
				<td><input name="nom" value='<jsp:getProperty property="nom" name="u"/>'></td>
			</tr>
			<tr>
				<td>Prenom :</td>
				<td><input type="text" name="prenom" value='${u.nom }/>'></td>
			</tr>
			<tr>
				<td>Login :</td>
				<td><input name="login" value='<jsp:getProperty property="login" name="u"/>'></td>
			</tr>
			<tr>
				<td>Mot de passe :</td>
				<td><input type="password" name="pwd" value='<jsp:getProperty property="pwd" name="u"/>'></td>
			</tr>
			<tr>
				<td><input type="submit" value="valider"></td>
				<td><input type="reset" value="annuler"></td>
			</tr>
		</table>
	</form>
</body>
</html>