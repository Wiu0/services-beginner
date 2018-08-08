package com.w.servlet.v2.pag2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UsuarioCadastrar extends HttpServlet{

	
	//TODO quando service é override, o doget e doPosto nao são chamados
	/*@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Sou Service");
	}
	*/
	
	/***/
	private static final long serialVersionUID = 1L;

	//TODO se for chamado o get, o client recebera HTTP Status 405 – Method Not Allowed
	/*@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Sou Get");
	}
	*/
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("Sou Post");
		System.out.println(req.getContentType());
		System.out.println("Salvando no banco de dados id: " + req.getParameter("id") + " nome: " + req.getParameter("nome") + 
				" get parametro errado: " +req.getParameter("param")) ;
		resp.getWriter().write("{\"descricao\":\"Salvo com suceso\"}");
	}
	
}
