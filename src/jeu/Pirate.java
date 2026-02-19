package jeu;

public class Pirate {
	private String nom;
	private int vie = 5;
	private Couleur couleur;
	private int caseActuelle;

	public Pirate(String nom, Couleur couleur, int caseActuelle, int vie) {
		this.nom = nom;
		this.couleur = couleur;
		this.vie = vie;
		this.caseActuelle = caseActuelle;
	}

	public int deplacement() {
		Plateau plateau = new Plateau();
		Des des = new Des();
		int valeur = des.lancerDes();
		caseActuelle = plateau.mouvement(valeur, caseActuelle);
		return valeur;
	}

	public int getCaseActuelle() {
		return caseActuelle;
	}

	public String getNom() {
		return nom;
	}

}
