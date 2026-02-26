package jeu;

public class CaseFilet extends CasesSpeciales {

	public CaseFilet(int numeroCase) {
		super(numeroCase);
	}
	
	@Override
	public int effet(int caseActuelle, Pirate pirateSurCase, Pirate autrePirate, Armes arme) {
		return caseActuelle;
	}
	
	

}
