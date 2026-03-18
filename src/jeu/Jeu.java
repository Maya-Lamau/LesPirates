package jeu;

public class Jeu {

	private Affichage affichage;

	public Jeu(Affichage affichage) {
		this.affichage = affichage;
	}

	private void jouerBill(Pirate bill, Plateau plateau, Pirate jack) {
		if (!bill.getPresenceFilet()) {
			affichage.affichageAQuiDeJouer(bill.getNom());
			affichage.affichageDes(bill.getNom(), bill.deplacement());
			affichage.affichageCase(bill.getNom(), bill.getCaseActuelle());
			if (plateau.estSurCaseSpeciale(bill.getCaseActuelle())) {
				affichage.affichageCaseSpeciale(bill.getNom());

				if (plateau.presenceCaseFilet(plateau.positionCaseSpeciale(bill.getCaseActuelle()),
						plateau.armeDeLaCase(plateau.positionCaseSpeciale(bill.getCaseActuelle())))) {

					plateau.actionCase(plateau.positionCaseSpeciale(bill.getCaseActuelle()), bill, jack,
							plateau.armeDeLaCase(plateau.positionCaseSpeciale(bill.getCaseActuelle())), affichage);
					

				} else {
					plateau.actionCase(plateau.positionCaseSpeciale(bill.getCaseActuelle()), bill, jack,
							plateau.armeDeLaCase(plateau.positionCaseSpeciale(bill.getCaseActuelle())), affichage);
					
					affichage.affichageVie(jack.getNom(), bill.getVie());
				}
			} else {
				affichage.affichageCaseNormale(bill.getNom());
			}

		} else {
			affichage.affichagePresenceFilet(bill.getNom());
			bill.estPlusDansFilet();
		}
	}

	private void jouerJack(Pirate bill, Plateau plateau, Pirate jack) {
		if (!jack.getPresenceFilet()) {
			if (bill.getCaseActuelle() != plateau.getNbCaseMax() && jack.getVie() > 0) {
				affichage.affichageEnter();
				affichage.affichageAQuiDeJouer(jack.getNom());
				affichage.affichageDes(jack.getNom(), jack.deplacement());
				affichage.affichageCase(jack.getNom(), jack.getCaseActuelle());
				if (plateau.estSurCaseSpeciale(jack.getCaseActuelle())) {
					affichage.affichageCaseSpeciale(jack.getNom());

					if (plateau.presenceCaseFilet(plateau.positionCaseSpeciale(jack.getCaseActuelle()),
							plateau.armeDeLaCase(plateau.positionCaseSpeciale(jack.getCaseActuelle())))) {

						plateau.actionCase(plateau.positionCaseSpeciale(jack.getCaseActuelle()), jack, bill,
								plateau.armeDeLaCase(plateau.positionCaseSpeciale(jack.getCaseActuelle())),affichage);

					} else {
						plateau.actionCase(plateau.positionCaseSpeciale(jack.getCaseActuelle()), jack, bill,
								plateau.armeDeLaCase(plateau.positionCaseSpeciale(jack.getCaseActuelle())),affichage);
						
						affichage.affichageVie(bill.getNom(), bill.getVie());
					}
				} else {
					affichage.affichageCaseNormale(jack.getNom());
				}
			}

		} else {
			affichage.affichagePresenceFilet(jack.getNom());
			jack.estPlusDansFilet();
		}
	}

	public void demarrerJeu() {
		Plateau plateau = new Plateau();
		Pirate jack = new Pirate("Jack", Couleur.JAUNE, 1, 5, false);
		Pirate bill = new Pirate("Bill", Couleur.ROSE, 1, 5, false);
		affichage.affichageDebutJeu();
		while (jack.getCaseActuelle() != plateau.getNbCaseMax() && bill.getCaseActuelle() != plateau.getNbCaseMax()
				&& jack.getVie() > 0 && bill.getVie() > 0) {
			affichage.affichageEnter();
			jouerBill(bill, plateau, jack);
			jouerJack(bill, plateau, jack);
		}
		
		if (bill.getCaseActuelle() == plateau.getNbCaseMax() || jack.getVie() <= 0) {
			affichage.affichageGagnant(bill.getNom());
		} else if (jack.getCaseActuelle() == plateau.getNbCaseMax() || bill.getVie() <= 0) {
			affichage.affichageGagnant(jack.getNom());
		}
		affichage.affichageFinJeu();

	}

}
