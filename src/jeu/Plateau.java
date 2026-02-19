package jeu;

public class Plateau {
	private Case[] casesSpeciale;
	private int nbCasesMax = 30;

	public Plateau() {
		//TODO je dois faire un tableau de mes cases spé
		

		

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
