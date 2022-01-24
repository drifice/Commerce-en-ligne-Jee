package beans;

import java.sql.Date;

public class Commande {
	private Date date;
	private Integer montant;
	private String modeDePaiement;
	private String modeDeLivraison;
	private String statutLivraison;
	
	public Commande() {
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = Date.valueOf(date);
	}
	
	public Integer getMontant() {
		return montant;
	}
	public void setMontant(String montant) {
		this.montant = Integer.valueOf(montant);
	}
	
	public String getModeDePaiement() {
		return modeDePaiement;
	}
	public void setModeDePaiement(String modeDePaiement) {
		this.modeDePaiement = modeDePaiement;
	}
	
	public String getModeDeLivraison() {
		return modeDeLivraison;
	}
	public void setModeDeLivraison(String modeDeLivraison) {
		this.modeDeLivraison = modeDeLivraison;
	}
	
	public String getStatutLivraison() {
		return statutLivraison;
	}
	public void setStatutLivraison(String statutLivraison) {
		this.statutLivraison = statutLivraison;
	}

}
