package br.com.cadastro.model;

public class Cadastro {

	private String disciplina;
	private Double nota;
	private String resultado;
	// Define os objetos e os tipos de dados que irão receber
	
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
	// Cria os métodos geters e seters para cada objeto e faz uma condição para verificar nostas e retornar uma situação(aprovado ou reprovado)
	}
	
	
}