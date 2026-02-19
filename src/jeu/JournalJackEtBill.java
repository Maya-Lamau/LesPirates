package jeu;


public class JournalJackEtBill implements Affichage{
	@Override
	public void affichageDebutJeu() {
		System.out.println("Ohé ! Du bateau ! Le jeu va commencer. Soyez prêt !");
	}
	public void affichageDes(Pirate pirate, int valeur) {
		System.out.println(pirate.getNom() + " : " + "Voici la valeur de mon dé : " + valeur );
	}
	public void affichageCase(Pirate pirate, int place) {
		System.out.println(pirate.getNom() + " : " + "Je suis maintenant à la case " + place + ".");
	}
	public void affichageGagnant(Pirate pirate) {
		System.out.println(pirate.getNom() + " : " + " YO OH OH ! Peronne ne m'arrive à la cheville ! Je suis le le maître des 7 mers ! Qu'on fasse subire le scrifice de la planche à ce pirate d'eau douce !");
	}
	public void affichageFinJeu() {
		System.out.println("Bravo à vous jeunes pirates, le jeu est terminé, vous pouvez vous reposez.");
	}
	public void affichageAQuiDeJouer(Pirate pirate) {
		System.out.println(pirate.getNom() + " : " + "C'est à mon tour de jouer !");
	}
	
}
