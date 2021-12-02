package br.com.cadastro.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;



import br.com.cadastro.model.SistemaCadastro;

@WebListener
public class Context_Listener implements ServletContextListener{
	
	public static final String SISTEMA_CADASTROS = "sistemaCadastros";

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext context = event.getServletContext(); 
		context.setAttribute(SISTEMA_CADASTROS, new SistemaCadastro());
	}
	// Cria o inicializador para o evento listener do programa 
	@Override
	public void contextDestroyed(ServletContextEvent event) {
		ServletContext context = event.getServletContext(); 
		context.removeAttribute(SISTEMA_CADASTROS);
		
	}
	// Destroi o evento listener do programa 
}
