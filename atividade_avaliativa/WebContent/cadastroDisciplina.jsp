<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de disciplinas e notas</title>
</head>
<body>
<script type="text/javascript">
function verificaNota() {
	var formulario = document.getElementById("formulario");
	var nota = document.getElementById("nota").value;
	if (isNaN(nota) || nota < 0 || nota > 10) {
		alert("Digite apenas números maiores que 0 e menores que 10.");
	} else {
		formulario.submit();
		<%-- Cria um script para verificar o campo "nota" e impedir que seja digitado letras, ou números miores que 10 e menores que 0 --%>
	}
}
</script>
<%@ include file="header.jsp" %>
	<%-- Inclui um cabeçalho no código --%>
<form id="formulario" action="ServletControlador" method= "post">
	<%-- Envia os inputs abaixo para a ServletAutentica --%>
<input type="hidden" name="acao" value = "confirmarCadastro">
<p align="center"> Disciplina: <input type="text" name="usuarioDisciplina"></p>
<p align="center"> Nota: <input id="nota" type="text" name="usuarioNota" ></p>
<p align="center"><input type="button" value="Cadastrar"  onclick='verificaNota();'> </p>
																 <%-- Implementa a verificação no campo "nota" --%>
 	<%-- Cria inputs para que o usuário digite os dados --%>	  
</form>
<p align="center"><a href="ServletControlador">Clique aqui</a> para voltar ao menu principal.</p>
<%-- Cria um link que permite o usuário retornar ao "menu.jsp" --%>
</body>
</html>