package jeu;
import java.util.Scanner;


public class JournalJackEtBill implements Affichage{
	private Scanner scanner = new Scanner(System.in);
	
	@Override
	public void affichageDebutJeu() {
		System.out.println("Ohé ! Du bateau ! Le jeu va commencer. Soyez prêt !");
	}
	@Override
	public void affichageDes(String pirate, int valeur) {
		System.out.println(pirate + " : " + "Mon peroquet me dit que mon dé à fait : " + valeur );
	}
	@Override
	public void affichageCase(String pirate, int place) {
		System.out.println(pirate + " : " + "Attention matelos, je suis maintenant à la case " + place + ".");
	}
	@Override
	public void affichageGagnant(String pirate) {
		System.out.println(pirate + " : " + " YO OH OH ! Peronne ne m'arrive à la cheville ! Je suis le le maître des 7 mers ! Qu'on fasse subire le scrifice de la planche à ce pirate d'eau douce !");
	}
	@Override
	public void affichageFinJeu() {
		System.out.println("Bravo à vous jeunes pirates, le jeu est terminé, vous pouvez vous reposez.");
	}
	@Override
	public void affichageAQuiDeJouer(String pirate) {
		System.out.println(pirate + " : " + "J'appel ma flotte ! C'est à mon tour de jouer !");
	}
	@Override
	public void affichageCaseSpeciale(String pirate) {
		System.out.println(pirate + " : " + "Mille sabords ! Je suis sur une case speciale !");
	}
	@Override
	public void affichageCaseNormale(String pirate) {
		System.out.println(pirate + " : " + "Par un coup de chance, je suis sur une case normale !");
	}
	@Override
	public void affichagePresenceFilet(String pirate) {
		System.out.println(pirate + " : " + "Espèce de merinos mal peigner ! Je suis bloqué dans un filet, je ne peux plus bouger !");
	}
	@Override
	public void affichageVie(String pirate, int vie) {
		System.out.println(pirate + " : " + "Aïe ! je n'ai plus que " + vie + " coeurs !");
	}
	@Override
	public void affichageCaseFilet(String pirate) {
		System.out.println(pirate + " : " + "Tonnerre de Brest ! Je me suis coincé dans un filet ! ");
	}
	@Override
	public void affichageCaseArme(String pirate) {
		System.out.println(pirate + " : " + "Prend ça sale gredin ! ");
	}
	@Override
	public void affichageEnter() {
		System.out.println("Passez au tour suivant avec m");
		scanner.next();
	}
	
}

