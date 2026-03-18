package jeu;

public class CaseArme extends CasesSpeciales {
	public CaseArme(int numeroCase, Armes arme) {
		super(numeroCase, arme);
	}
	
	@Override
	public void effet(Pirate pirateSurCase, Pirate autrePirate, Armes arme, Affichage affichage) {
		autrePirate.perdreVie(arme);
		affichage.affichageCaseArme(pirateSurCase.getNom());

	}
	


}
