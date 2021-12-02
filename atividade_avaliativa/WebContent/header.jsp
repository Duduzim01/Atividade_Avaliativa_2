<%@page import="br.com.cadastro.controller.ServletAutentica"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
</head>
<body>
<% SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss"); %>
<%-- Pega a data e hora atual para apresentar no programa quando for requisitada --%>
<p align="left" > Data e hora atual: <%= format.format(new Date()) %></p>
<h2 align="center" >Seja bem vindo, <%= session.getAttribute(ServletAutentica.USUARIO) %>!</h2>
<%-- Alinha as mensagens de cabeçalho no centro da página --%>
</body>
</html>