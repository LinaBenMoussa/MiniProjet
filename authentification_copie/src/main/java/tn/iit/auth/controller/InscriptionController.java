package tn.iit.auth.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tn.iit.auth.model.Utilisateur;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class InscriptionController
 */
public class InscriptionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String nom = request.getParameter("nom");
//		String prenom = request.getParameter("prenom");
//		String login = request.getParameter("login");
//		String pwd = request.getParameter("pwd");
//		Utilisateur u = new Utilisateur(nom, prenom,login, pwd);
		HttpSession session = request.getSession();
		Utilisateur u = (Utilisateur) session.getAttribute("u");
		ServletContext application = getServletContext();
		List<Utilisateur> l = (List<Utilisateur>) application.getAttribute("listU");
		if (l == null) {
			l = new ArrayList<>();
		}
		l.add(u);
		application.setAttribute("listU", l);
		response.sendRedirect("auth.jsp");
	}

}
