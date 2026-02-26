package jeu;

public abstract class CasesSpeciales {
	private int numeroCase;

	public CasesSpeciales(int numeroCase) {
		this.numeroCase = numeroCase;
	}

	public int getNumeroCase() {
		return numeroCase;
	}
	
	public abstract int effet(int caseActuelle, Pirate pirateSurCase, Pirate autrePirate, Armes arme);
	

}