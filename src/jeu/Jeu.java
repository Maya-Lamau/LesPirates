package jeu;

public class Jeu {

	private Affichage affichage;

	public Jeu(Affichage affichage) {
		this.affichage = affichage;
	}

	public void leJeu() {
		Plateau plateau = new Plateau();
		Pirate jack = new Pirate("Jack", Couleur.JAUNE, 1, 5);
		Pirate bill = new Pirate("Bill", Couleur.ROSE, 1, 5);
		affichage.affichageDebutJeu();
		while (jack.getCaseActuelle() != plateau.getNbCaseMax() && bill.getCaseActuelle() != plateau.getNbCaseMax()) {
			affichage.affichageAQuiDeJouer(bill);
			affichage.affichageDes(bill, bill.deplacement());
			affichage.affichageCase(bill, bill.getCaseActuelle());
			if (bill.getCaseActuelle() != plateau.getNbCaseMax()) {
				affichage.affichageAQuiDeJouer(jack);
				affichage.affichageDes(jack, jack.deplacement());
				affichage.affichageCase(jack, jack.getCaseActuelle());
			}

		}
		if (bill.getCaseActuelle() == plateau.getNbCaseMax()) {
			affichage.affichageGagnant(bill);
		} else {
			affichage.affichageGagnant(jack);
		}
		affichage.affichageFinJeu();

	}

}
