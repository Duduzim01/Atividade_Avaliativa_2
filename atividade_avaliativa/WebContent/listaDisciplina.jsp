<%@page import="br.com.cadastro.model.SistemaCadastro"%>
<%@page import="java.util.List"%>
<%@page import="br.com.cadastro.model.Cadastro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de disciplina e notas.</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<%-- Inclui um cabeçalho no código --%>
	<h1 align="center">Disciplinas/Notas/Situação</h1>
	<table align="center" border="1">
	<%-- Cria uma tabela com bordas no código --%>
	<tr align="center">
		<td align="center">Disciplina</td> 
		<td align="center">Nota</td>
		<td align="center">Resultado</td>
		<%-- Cria os campos que irão receber os dados da lista "cadastro" --%>
	</tr>
	<%
	List<Cadastro> lista = (List<Cadastro>) request.getAttribute("lista");
	for(Cadastro c: lista){
	%>
	<%-- Cria um loop para adicionar, respectivamente, os dados da lista "cadastro" nas linhas e colunas da tabela --%>
	<tr align="center">
		<td align="center"> <%= c.getDisciplina()%></td> 
		<td align="center"> <%= c.getNota()%></td> 
		<td align="center"> <%= c.getResultado()%></td>
		<%-- Adiciona os respectivos dados em cada um dos campos criados na tabela --%>
	</tr>
	<%
	}
	%>
</table>
<p align="center"><a href="ServletControlador">Clique aqui</a> para voltar ao menu principal.</p>
	<%-- Cria um link que permite o usuário retornar ao "menu.jsp" --%>
</body>
</html>