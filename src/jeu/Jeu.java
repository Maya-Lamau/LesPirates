package jeu;

public class Jeu {

	private Affichage affichage;

	public Jeu(Affichage affichage) {
		this.affichage = affichage;
	}

	public void leJeu() {
		Plateau plateau = new Plateau();
		Pirate jack = new Pirate("Jack", Couleur.JAUNE, 1, 5, false);
		Pirate bill = new Pirate("Bill", Couleur.ROSE, 1, 5, false);
		affichage.affichageDebutJeu();
		while (jack.getCaseActuelle() != plateau.getNbCaseMax() && bill.getCaseActuelle() != plateau.getNbCaseMax()) {
			if (!bill.getPresenceFilet()) {
				System.out.println("BILL : JE NE SUIS PAS DANS UN FILET");
				affichage.affichageAQuiDeJouer(bill.getNom());
				affichage.affichageDes(bill.getNom(), bill.deplacement());
				affichage.affichageCase(bill.getNom(), bill.getCaseActuelle());
				if (plateau.estSurCaseSpeciale(bill.getCaseActuelle())) {
					affichage.affichageCaseSpeciale(bill.getNom());
					
					if (plateau.presenceCaseFilet(plateau.positionCaseSpeciale(bill.getCaseActuelle()), plateau.armeDeLaCase(plateau.positionCaseSpeciale(bill.getCaseActuelle())))) {
						System.out.println("LE TEST : CASE FILET DIT PAR JEU");
						plateau.actionCase(plateau.positionCaseSpeciale(bill.getCaseActuelle()), bill, jack, plateau.armeDeLaCase(plateau.positionCaseSpeciale(bill.getCaseActuelle())));
						
					}else {
						System.out.println("LE TEST : LA VIE DE JACK EST" + jack.getVie());
						plateau.actionCase(plateau.positionCaseSpeciale(bill.getCaseActuelle()), bill, jack, plateau.armeDeLaCase(plateau.positionCaseSpeciale(bill.getCaseActuelle())));
						System.out.println("LE TEST : LA VIE DE JACK EST" + jack.getVie());
					}	
				}else {
					affichage.affichageCaseNormale(bill.getNom());
				}
				jack.plusDansFilet();
				
				if(!jack.getPresenceFilet()) {
					if (bill.getCaseActuelle() != plateau.getNbCaseMax()) {
						System.out.println("JACK JOUE CAR BILL EST PAS DANS FILET");
						affichage.affichageAQuiDeJouer(jack.getNom());
						affichage.affichageDes(jack.getNom(), jack.deplacement());
						affichage.affichageCase(jack.getNom(), jack.getCaseActuelle());
						if(plateau.estSurCaseSpeciale(jack.getCaseActuelle())) {
							affichage.affichageCaseSpeciale(jack.getNom());
							
							if (plateau.presenceCaseFilet(plateau.positionCaseSpeciale(jack.getCaseActuelle()), plateau.armeDeLaCase(plateau.positionCaseSpeciale(jack.getCaseActuelle())))) {
								System.out.println("LE TEST : CASE FILET DIT PAR JEU");
								plateau.actionCase(plateau.positionCaseSpeciale(jack.getCaseActuelle()), jack, bill, plateau.armeDeLaCase(plateau.positionCaseSpeciale(jack.getCaseActuelle())));
							}else {
								System.out.println("LE TEST : LA VIE DE BILL EST" + bill.getVie());
								plateau.actionCase(plateau.positionCaseSpeciale(jack.getCaseActuelle()), jack, bill, plateau.armeDeLaCase(plateau.positionCaseSpeciale(jack.getCaseActuelle())));
								System.out.println("LE TEST : LA VIE DE BILL EST" + bill.getVie());
							}	
						}else {
							affichage.affichageCaseNormale(jack.getNom());
						}
					}
					
					affichage.affichageAQuiDeJouer(bill.getNom());
					affichage.affichageDes(bill.getNom(), bill.deplacement());
					affichage.affichageCase(bill.getNom(), bill.getCaseActuelle());
					if (plateau.estSurCaseSpeciale(bill.getCaseActuelle())) {
						affichage.affichageCaseSpeciale(bill.getNom());
						
						if (plateau.presenceCaseFilet(plateau.positionCaseSpeciale(bill.getCaseActuelle()), plateau.armeDeLaCase(plateau.positionCaseSpeciale(bill.getCaseActuelle())))) {
							System.out.println("LE TEST : CASE FILET DIT PAR JEU");
							plateau.actionCase(plateau.positionCaseSpeciale(bill.getCaseActuelle()), bill, jack, plateau.armeDeLaCase(plateau.positionCaseSpeciale(bill.getCaseActuelle())));
							
						}else {
							System.out.println("LE TEST : LA VIE DE JACK EST" + jack.getVie());
							plateau.actionCase(plateau.positionCaseSpeciale(bill.getCaseActuelle()), bill, jack, plateau.armeDeLaCase(plateau.positionCaseSpeciale(bill.getCaseActuelle())));
							System.out.println("LE TEST : LA VIE DE JACK EST" + jack.getVie());
						}	
					}else {
						affichage.affichageCaseNormale(bill.getNom());
					}
					
					
				}else {
					affichage.affichageAQuiDeJouer(bill.getNom());
					affichage.affichageDes(bill.getNom(), bill.deplacement());
					affichage.affichageCase(bill.getNom(), bill.getCaseActuelle());
					if (plateau.estSurCaseSpeciale(bill.getCaseActuelle())) {
						affichage.affichageCaseSpeciale(bill.getNom());
						
						if (plateau.presenceCaseFilet(plateau.positionCaseSpeciale(bill.getCaseActuelle()), plateau.armeDeLaCase(plateau.positionCaseSpeciale(bill.getCaseActuelle())))) {
							System.out.println("LE TEST : CASE FILET DIT PAR JEU");
							plateau.actionCase(plateau.positionCaseSpeciale(bill.getCaseActuelle()), bill, jack, plateau.armeDeLaCase(plateau.positionCaseSpeciale(bill.getCaseActuelle())));
							
						}else {
							System.out.println("LE TEST : LA VIE DE JACK EST" + jack.getVie());
							plateau.actionCase(plateau.positionCaseSpeciale(bill.getCaseActuelle()), bill, jack, plateau.armeDeLaCase(plateau.positionCaseSpeciale(bill.getCaseActuelle())));
							System.out.println("LE TEST : LA VIE DE JACK EST" + jack.getVie());
						}	
					}else {
						affichage.affichageCaseNormale(bill.getNom());
					}
					
					jack.plusDansFilet();
				}
				
				

				
			}else {
				System.out.println("JACK JOUE CAR BILL EST DANS FILET");
				System.out.println("BILL : JE SUIS DANS UN FILET");
				if (!jack.getPresenceFilet()) {
					if (bill.getCaseActuelle() != plateau.getNbCaseMax()) {
						affichage.affichageAQuiDeJouer(jack.getNom());
						affichage.affichageDes(jack.getNom(), jack.deplacement());
						affichage.affichageCase(jack.getNom(), jack.getCaseActuelle());
						if(plateau.estSurCaseSpeciale(jack.getCaseActuelle())) {
							affichage.affichageCaseSpeciale(jack.getNom());
							
							if (plateau.presenceCaseFilet(plateau.positionCaseSpeciale(jack.getCaseActuelle()), plateau.armeDeLaCase(plateau.positionCaseSpeciale(jack.getCaseActuelle())))) {
								System.out.println("LE TEST : CASE FILET DIT PAR JEU");
								plateau.actionCase(plateau.positionCaseSpeciale(jack.getCaseActuelle()), jack, bill, plateau.armeDeLaCase(plateau.positionCaseSpeciale(jack.getCaseActuelle())));
							}else {
								System.out.println("LE TEST : LA VIE DE BILL EST" + bill.getVie());
								plateau.actionCase(plateau.positionCaseSpeciale(jack.getCaseActuelle()), jack, bill, plateau.armeDeLaCase(plateau.positionCaseSpeciale(jack.getCaseActuelle())));
								System.out.println("LE TEST : LA VIE DE BILL EST" + bill.getVie());
							}	
						}else {
							affichage.affichageCaseNormale(jack.getNom());
						}
					}
					bill.plusDansFilet();
				}
				
					
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
