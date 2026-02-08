package tests;
import jeu.*;

public class Tests {
	
	public static void main(String[] args) {
		Pirate jack = new Pirate("Jack", Couleur.JAUNE, 1);
		Pirate lautre = new Pirate("lautre", Couleur.ROSE, 1);
		while(jack.getCaseActuelle()!= 30 && lautre.getCaseActuelle()!= 30) {
			System.out.println("au tour de jack");
			jack.deplacement();
			jack.parler();
			System.out.println("au tour de lautre");
			lautre.deplacement();
			lautre.parler();
		}
		if (jack.getCaseActuelle() == 30) {
			System.out.println("jack a gagné");
		}else if (lautre.getCaseActuelle() == 30) {
			System.out.println("Lautre a gagné");
		}
	}
	
}
