<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p align="right"><a href="inscription.jsp">Inscription</a></p>
${error}
	<form method="post" action="AuthController">
		<table>
			<tr>
				<td>Login :</td>
				<td><input name="login"></td>
			</tr>
			<tr>
				<td>Mot de passe :</td>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td><input type="submit" value="valider"></td>
				<td><input type="reset" value="annuler"></td>
			</tr>
		</table>
	</form>
</body>
</html>