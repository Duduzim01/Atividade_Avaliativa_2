/**
 * 
 */
function verificaNota() {
	var formulario = document.getElementById("formulario");
	var nota = document.getElementById("nota").value;
	if (isNaN(nota) || nota < 0 || nota > 10) {
		alert("Digite apenas números.");
	} else {
		formulario.submit();
	}
}

