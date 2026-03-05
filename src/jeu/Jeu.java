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
			affichage.affichageAQuiDeJouer(bill.getNom());
			affichage.affichageDes(bill.getNom(), bill.deplacement());
			affichage.affichageCase(bill.getNom(), bill.getCaseActuelle());
			if (bill.getCaseActuelle() != plateau.getNbCaseMax()) {
				affichage.affichageAQuiDeJouer(jack.getNom());
				affichage.affichageDes(jack.getNom(), jack.deplacement());
				affichage.affichageCase(jack.getNom(), jack.getCaseActuelle());
			}

		}
		if (bill.getCaseActuelle() == plateau.getNbCaseMax()) {
			affichage.affichageGagnant(bill.getNom());
		} else {
			affichage.affichageGagnant(jack.getNom());
		}
		affichage.affichageFinJeu();

	}

}
