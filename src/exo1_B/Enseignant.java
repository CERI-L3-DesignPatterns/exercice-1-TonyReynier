package exo1_B;

public class Enseignant {
	protected String nom;
	protected String prenom;

	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom(){
		return this.nom;
	}
	public String getPrenom(){
		return this.prenom;
	}
}
