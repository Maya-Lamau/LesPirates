package jeu;

public class Plateau {
	private int nbCasesMax = 30;
	private int nbCasesSpeciales = 12;
	private CasesSpeciales[] lesCasesSpeciales = new CasesSpeciales[nbCasesSpeciales];

	public Plateau() {
		CaseArme caseArme1 = new CaseArme(2, Armes.FUSIL);
		CaseFilet caseFilet1 = new CaseFilet(4, Armes.FILET);
		CaseArme caseArme2 = new CaseArme(5, Armes.EPEE);
		CaseFilet caseFilet2 = new CaseFilet(9, Armes.FILET);
		CaseArme caseArme3 = new CaseArme(11, Armes.FUSIL);
		CaseFilet caseFilet3 = new CaseFilet(13, Armes.FILET);
		CaseArme caseArme4 = new CaseArme(14, Armes.EPEE);
		CaseArme caseArme5 = new CaseArme(17, Armes.CANNON);
		CaseArme caseArme6 = new CaseArme(21, Armes.EPEE);
		CaseFilet caseFilet4 = new CaseFilet(23, Armes.FILET);
		CaseArme caseArme7 = new CaseArme(26, Armes.FUSIL);
		CaseFilet caseFilet5 = new CaseFilet(29, Armes.FILET);
		
		lesCasesSpeciales[0] = caseArme1;
		lesCasesSpeciales[1] = caseFilet1;
		lesCasesSpeciales[2] = caseArme2;
		lesCasesSpeciales[3] = caseFilet2;
		lesCasesSpeciales[4] = caseArme3;
		lesCasesSpeciales[5] = caseFilet3;
		lesCasesSpeciales[6] = caseArme4;
		lesCasesSpeciales[7] = caseArme5;
		lesCasesSpeciales[8] = caseArme6;
		lesCasesSpeciales[9] = caseFilet4;
		lesCasesSpeciales[10] = caseArme7;
		lesCasesSpeciales[11] = caseFilet5;
		
	}
	
	public int positionCaseSpeciale(int caseActuelle) {
		int indiceTableau = -1;
		for (int i = 0; i < nbCasesSpeciales ; i++) {
			if (caseActuelle == lesCasesSpeciales[i].getNumeroCase()){
				indiceTableau = i;
			}
		}
		return indiceTableau;
	}
	
	
	public boolean estSurCaseSpeciale(int caseActuelle) {
		boolean caseSpecialeOK = false;
		for(int j = 0; j<nbCasesSpeciales; j++) {
			if(caseActuelle == lesCasesSpeciales[j].getNumeroCase()) {
				caseSpecialeOK = true;
			}
		}
		return caseSpecialeOK;
	}
	
	public Armes armeDeLaCase(int indiceCase) {
		Armes armeCase;
		armeCase = lesCasesSpeciales[indiceCase].getArme();
		return armeCase;
	}
	
	public boolean presenceCaseFilet(int indiceCase, Armes arme) {
		boolean caseFiletOK = false;
		if (lesCasesSpeciales[indiceCase].getArme() == Armes.FILET) {
			caseFiletOK = true;
		}
		return caseFiletOK;
	}
	
	public void actionCase(int indiceCase, Pirate pirateSurCase, Pirate autrePirate, Armes arme,Affichage affichage) {
		if (lesCasesSpeciales[indiceCase].getArme() == Armes.FILET) {
			
			lesCasesSpeciales[indiceCase].effet(pirateSurCase, autrePirate, arme,affichage);

		}else {
			 lesCasesSpeciales[indiceCase].effet(pirateSurCase, autrePirate, arme, affichage);
		}
	}
	

	public int mouvement(int valeurDes, int caseDuPirate) {
		
		caseDuPirate = caseDuPirate + valeurDes;
		
		if ((caseDuPirate) > nbCasesMax) {
			int difference;
			difference = caseDuPirate - nbCasesMax;
			caseDuPirate = nbCasesMax - difference;
		}
		
		return caseDuPirate;
	}

	public int getNbCaseMax() {
		return nbCasesMax;
	}

}
