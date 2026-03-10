package jeu;

public class Pirate {
	private String nom;
	private int vie = 5;
	private Couleur couleur;
	private int caseActuelle;
	private boolean presenceFilet = false;

	public Pirate(String nom, Couleur couleur, int caseActuelle, int vie, boolean presenceFilet) {
		this.nom = nom;
		this.couleur = couleur;
		this.vie = vie;
		this.caseActuelle = caseActuelle;
		this.presenceFilet = presenceFilet;
		
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
	
	public void perdreVie(Armes armes) {
		if (armes == Armes.CANNON) {
			vie = vie - 3;
		}else if(armes==Armes.FUSIL) {
			vie = vie - 2;
		}else if(armes == Armes.EPEE) {
			vie = vie - 1;
		}
	}
	
	public void dansFilet() {
		presenceFilet = true;
	}
	
	public void plusDansFilet() {
		presenceFilet = false;
	}
	
	public boolean getPresenceFilet() {
		return presenceFilet;
	}

	public String getNom() {
		return nom;
	}
	
	public int getVie() {
		if(vie < 0) {
			return 0;
		}else {
			return vie;
		}
		
	}

}
