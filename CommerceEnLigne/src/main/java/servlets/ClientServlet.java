package servlets;

import java.io.IOException;

import beans.Client;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ClientServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/creation_client.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String adresse = req.getParameter("adresse");
		String numeroTel = req.getParameter("numeroTel");
		String mail = req.getParameter("mail");
		
		Client client = new Client();
		
		client.setAdresse(adresse);
		client.setMail(mail);
		client.setNom(nom);
		client.setNumeroTel(numeroTel);
		client.setPrenom(prenom);
		
		req.setAttribute("client", client);
		req.getRequestDispatcher("/WEB-INF/afficherClient.jsp").forward(req, resp);
	}
}
