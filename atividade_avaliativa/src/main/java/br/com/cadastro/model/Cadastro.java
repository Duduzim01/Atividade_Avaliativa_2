package br.com.cadastro.model;

public class Cadastro {

	private String disciplina;
	private Double nota;
	private String resultado;
	// Define os objetos e os tipos de dados que ir�o receber
	
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public String getResultado() {
		return resultado;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	public  String getAprovacao() {
		if (this.nota >= 5) {
			return "Aprovado";
		} else {
			return "Reprovado";	
		}
	// Cria os m�todos geters e seters para cada objeto e faz uma condi��o para verificar nostas e retornar uma situa��o(aprovado ou reprovado)
	}
	
	
}