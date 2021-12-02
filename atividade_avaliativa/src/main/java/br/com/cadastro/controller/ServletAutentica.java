package br.com.cadastro.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletAutentica
 */
@WebServlet("/ServletAutentica")
public class ServletAutentica extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAutentica() {
        super();
        // TODO Auto-generated constructor stub
    }
    public static final String USUARIO = "usuario";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter resposta = response.getWriter();
		
		resposta.write("<html><body>");
		// Cria um código HTML, básico
		String nomeUsuario = request.getParameter(USUARIO);
		String senhaUsuario = request.getParameter("senha");
		// Faz o request dos métodos get "USUARIO" e "senha"
		if (autentica(nomeUsuario,senhaUsuario)) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute(USUARIO, nomeUsuario);
			request.getRequestDispatcher("ServletControlador").forward(request, response);
		} else {
			resposta.write("Usuário e senha inválidos.");
			// Cria uma condiçãio de verificação que, caso seja verdadeiro, envia para a ServletControle e caso seja falsa, apresenta uma mensagem de erro
		}
		
		resposta.write("</body></html>");
		// Fecha o código HTML
	}

	private boolean autentica(String nomeUsuario, String senhaUsuario) {
		// Autenticação do usuário "professor" e senha "Progweb2021"
		if (nomeUsuario.equals("professor") && senhaUsuario.equals("Progweb2021")) {
			return true;
		}
		
		return false;
	} // Cria uma condiçaõ de verificação, que aceita apenas parâmetros pré-determinados "professor" e "Progweb2021"
	}


