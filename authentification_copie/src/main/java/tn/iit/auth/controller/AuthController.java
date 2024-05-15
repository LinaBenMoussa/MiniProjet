package tn.iit.auth.controller;

import jakarta.servlet.RequestDispatcher;
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
 * Servlet implementation class AuthController
 */
public class AuthController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String pwd = request.getParameter("pwd");
		ServletContext application = getServletContext();
		List<Utilisateur> l = (List<Utilisateur>) application.getAttribute("listU");
		boolean trouve = false;
		if(l == null) {
			request.setAttribute("erreur", "Aucune personne n'est inscrite !!");
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/auth.jsp");
			rd.forward(request, response);
		}
		else {
			for (Utilisateur utilisateur : l) {
				if(utilisateur.getLogin().equals(login)&&utilisateur.getPwd().equals(pwd)) {
					trouve = true;
					HttpSession session = request.getSession();
					session.setAttribute("userCourant", utilisateur);
					break;
				}
			}
			if(trouve == true) {
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/index.jsp");
				rd.forward(request, response);
			}
			else {
				request.setAttribute("erreur", "Veuillez vérifier vos paramètres !!");
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/auth.jsp");
				rd.forward(request, response);
			}
		}
	}

}
