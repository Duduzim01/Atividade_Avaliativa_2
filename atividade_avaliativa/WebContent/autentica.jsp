<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<script>
function validarUsuario(){
	var formulario = document.getElementById("formulario");
	var teclado = event.keyCode;
	if (teclado >= 48 && teclado <= 57){
		event.preventDefault();
		alert("Este campo não aceita números.");
		<%-- Cria um script para verificar o campo "usuário" e impedir que seja digitado números dentro do mesmo --%>
	}
}
</script>
<h1 align="center">Login</h1>
<form action="ServletAutentica" method="post">
 <%-- Envia os inputs abaixo para a ServletAutentica --%>
<p align="center">Usuário: <input type="text" name="usuario" onkeypress="validarUsuario()"></p> 
<p align="center">Senha: <input type="password" name="senha"></p> 
<p align="center"><input type="submit" value="Proseguir"></p> 
 <%-- Cria inputs para que o usuário digite dados --%>
</form>
</body>
</html>