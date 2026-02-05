package jeu;

public class Pirate {
	private int caseActuelle = 1;
	private String nom;
	private Couleur couleur;
	
	public Pirate(String nom, Couleur couleur, int caseActuelle) {
		this.nom = nom;
		this.couleur = couleur;
		this.caseActuelle = caseActuelle;
	}
	
	public int deplacement(int casePrecedente) {
		Des des = new Des();
		int valeur = des.lancerDes();
		caseActuelle = casePrecedente + valeur;
		return caseActuelle;
	}
}
