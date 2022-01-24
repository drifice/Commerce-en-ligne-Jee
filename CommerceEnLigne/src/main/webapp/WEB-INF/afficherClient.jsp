<%@page import="beans.Client"%>
<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Création d'un client</title>
        <link type="text/css" rel="stylesheet" href="inc/style.css" />
    </head>
    <body>
        <h1> 
		Bonjour 
		<%
			Client client = (Client) request.getAttribute("client");
			out.println(client.getPrenom() + " " + client.getNom());
		%>
	</h1>
    </body>
</html>