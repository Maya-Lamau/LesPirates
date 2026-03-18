package jeu;

public class CaseFilet extends CasesSpeciales {

	public CaseFilet(int numeroCase, Armes arme) {
		super(numeroCase, arme);
		
	}
	
	@Override
	public void effet(Pirate pirateSurCase, Pirate autrePirate, Armes arme, Affichage affichage) {
		pirateSurCase.estDansFilet();
		affichage.affichageCaseFilet(pirateSurCase.getNom());
	}
	
	

}
