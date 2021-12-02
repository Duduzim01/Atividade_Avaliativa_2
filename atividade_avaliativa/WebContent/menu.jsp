<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MENU</title>
</head>
<body>
<%@ include file="header.jsp" %>
<%-- Inclui um cabeçalho no código --%>
<p align="center">Selecione uma das opções abaixo:</p>   
<p align="center"><a href="ServletControlador?acao=cadastro">Cadastrar disciplinas e notas.</a></p>  
<p align="center"><a href="ServletControlador?acao=listar">Consultar disciplinas e notas.</a></p>
<%-- Cria links para permitir que o usuário acesse a página correspondente à sua necessidade --%>
</body>
</html> 