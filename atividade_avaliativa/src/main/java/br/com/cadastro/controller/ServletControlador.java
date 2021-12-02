package br.com.cadastro.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.cadastro.model.Cadastro;
import br.com.cadastro.model.SistemaCadastro;

/**
 * Servlet implementation class ServletControlador
 */
@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		// Define uma vari�vel e faz um request para um pr�metro j� existente 
		SistemaCadastro sistema = (SistemaCadastro) getServletContext().getAttribute(Context_Listener.SISTEMA_CADASTROS);
		// Define uma vari�vel e faz um request para um pr�metro j� existente 
		String resposta = "menu.jsp";
		// O usu�rio ser� redirecionado para autom�ticamente para esta p�gina assim que entrar e quando for necess�rio fazer a verifica��o
		HttpSession id = request.getSession(false);
		// Define uma vari�vel e faz um request para um pr�metro j� existente 
		if (id == null || id.getAttribute(ServletAutentica.USUARIO) == null) {
        	resposta = "autentica.jsp";
        	// Redireciona o usu�rio para a p�gina de autentical��o, se o mesmo tiver o valor "null", opu seja, na�o estiver autenticado
        } else {
        	if ("cadastro".equals(acao)) {
        		resposta = "cadastroDisciplina.jsp";
        	} else if ("confirmarCadastro".equals(acao)) {
        		Cadastro c = new Cadastro();
        		c.setDisciplina(request.getParameter("usuarioDisciplina"));
        		c.setNota(Double.valueOf(request.getParameter("usuarioNota")));
        		c.setResultado(c.getAprovacao());
        		sistema.adicionar(c);
        		request.setAttribute("lista", sistema.listarCadastros());
        		resposta = "listaDisciplina.jsp";
        		// Grava os dados inseridos pelo usu�rio nos sets, adiciona os mesmos em uma lista e apresenta a lista posteriormente (listaDisciplina)
        	} else if ("listar".equals(acao)) {
        		request.setAttribute("lista", sistema.listarCadastros());
        		resposta = "listaDisciplina.jsp";
        	} 
        	// Verifica para qual a a��o o usu�rio desja realizar e o redireciona para tal �rea
		}
		
		request.getRequestDispatcher(resposta).forward(request, response);
	}

}
