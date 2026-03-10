package jeu;

public class CaseFilet extends CasesSpeciales {

	public CaseFilet(int numeroCase, Armes arme) {
		super(numeroCase, arme);
		
	}
	
	@Override
	public void effet(Pirate pirateSurCase, Pirate autrePirate, Armes arme) {
		pirateSurCase.dansFilet();
	}
	
	

}
