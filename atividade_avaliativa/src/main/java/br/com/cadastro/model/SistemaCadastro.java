package br.com.cadastro.model;

import java.util.ArrayList;
import java.util.List;

public class SistemaCadastro {

	private List<Cadastro> cadastros = new ArrayList<Cadastro>();
	
	public void adicionar(Cadastro c) {
		cadastros.add(c);
		//Adiciona o objeto c na lista: "cadastros"
	}
	public List<Cadastro> listarCadastros(){
		return cadastros;
		// Faz a consulta de cadastros dentro da lista 
	}
}
