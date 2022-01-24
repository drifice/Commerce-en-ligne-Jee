package beans;

public class Client {
	private String nom;
	private String prenom;
	private String adresse;
	private Integer numeroTel;
	private String mail;
	
	public Client() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Integer getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = Integer.valueOf(numeroTel);
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
