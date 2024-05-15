<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="u" class="tn.iit.auth.model.Utilisateur" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
Vous avez saisi : <br>
Nom : <jsp:getProperty property="nom" name="u"/><br>
Prénom : <jsp:getProperty property="prenom" name="u"/><br>
Login : <jsp:getProperty property="login" name="u"/><br>
Mot de passe : <jsp:getProperty property="pwd" name="u"/><br>
<input type="button" value="Corriger" onclick="window.location.href='inscription.jsp'">
<input type="button" value="Valider" onclick="window.location.href='InscriptionController'">
</body>
</html>