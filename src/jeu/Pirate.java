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

	public int deplacement() {
		Plateau plateau = new Plateau();
		Des des = new Des();
		int valeur = des.lancerDes();
				
		caseActuelle = caseActuelle + valeur;
		
		if ((caseActuelle) > plateau.getNbCase()) {
			int difference;
			difference = caseActuelle - plateau.getNbCase();
			caseActuelle = plateau.getNbCase() - difference;
		}
		return valeur;

	}
	
	
	public int getCaseActuelle() {
		return caseActuelle;
	}
	
	public String getNom() {
		return nom;
	}

}
