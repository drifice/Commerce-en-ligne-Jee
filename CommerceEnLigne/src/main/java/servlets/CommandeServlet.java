package servlets;

import java.io.IOException;
import java.sql.Date;

import beans.Commande;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CommandeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/creation_commande.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String date = req.getParameter("date");
		String montant = req.getParameter("montant");
		String modeDePaiement = req.getParameter("modeDePaiement");
		String modeDeLivraison = req.getParameter("modeDeLivraison");
		String statutLivraison = req.getParameter("statutLivraison");
		
		Commande commande = new Commande();
		commande.setDate(date);
		commande.setModeDeLivraison(modeDeLivraison);
		commande.setModeDeLivraison(modeDeLivraison);
		commande.setModeDePaiement(modeDePaiement);
		commande.setStatutLivraison(statutLivraison);
		
		req.setAttribute("commande", commande);
	}
	
}
