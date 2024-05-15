<%@page import="tn.iit.auth.model.Utilisateur"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%Utilisateur u = (Utilisateur)session.getAttribute("userCourant"); %>
Bienvenu Mr/Mme : <%=u.getNom() +" " +u.getPrenom()%>
</body>
</html>