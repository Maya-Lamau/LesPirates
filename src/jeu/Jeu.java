package jeu;

public class Jeu {
	
	private Affichage affichage;
	
	
	public Jeu(Affichage affichage) {
		this.affichage = affichage;
	}
	
	public void  leJeu() {
		Pirate jack = new Pirate("Jack", Couleur.JAUNE, 1);
		Pirate bill = new Pirate("Bill", Couleur.ROSE, 1);
		affichage.affichageDebutJeu();
		//affichage.affichageAQuiDeJouer(bill);
		//affichage.affichageDes(bill, bill.deplacement());
		
		
		
		
		

	}
	
	
	
}
