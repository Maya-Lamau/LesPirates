package jeu;

public class Plateau {
	private CasesSpeciales[] caseSpeciales;
	private int nbCasesMax = 30;

	public Plateau() {
		
		

		

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
