package tn.iit.auth.model;

public class Utilisateur {
	private String nom="", prenom="", login="", pwd="";

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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public Utilisateur(String nom, String prenom, String login, String pwd) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.pwd = pwd;
	}

	public Utilisateur() {
		super();
	}

}
