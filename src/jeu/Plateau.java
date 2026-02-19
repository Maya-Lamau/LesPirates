package jeu;

public class Plateau {
	private Case[] cases;
	private int nbCasesMax = 30;

	public Plateau() {
		cases = new Case[nbCasesMax];

		for (int i = 0; i < nbCasesMax; i++) {
			cases[i] = new Case(i + 1);
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
