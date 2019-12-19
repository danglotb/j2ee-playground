package com.openclassroom.j2ee.tp1.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.openclassroom.j2ee.tp1.beans.ClientBean;

public class ClientServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		ClientBean client = new ClientBean(
					nom,
					prenom,
					adresse,
					telephone,
					email
		);
		request.setAttribute("client", client);
		this.getServletContext()
				.getRequestDispatcher("/afficherClient.jsp")
				.forward(request, response);
	}
	
}
