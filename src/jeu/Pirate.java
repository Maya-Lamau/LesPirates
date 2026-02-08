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

	public void deplacement() {
		Des des = new Des();
		int valeur = des.lancerDes();
		System.out.println(valeur);
		
		caseActuelle = caseActuelle + valeur;
		
		if ((caseActuelle) > 30) {
			int difference;
			difference = caseActuelle - 30;
			caseActuelle = 30 - difference;
		}

	}
	
	public void parler() {
		System.out.println(caseActuelle);
	}
	
	public int getCaseActuelle() {
		return caseActuelle;
	}

}
