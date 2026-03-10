package jeu;

public class CaseArme extends CasesSpeciales {
	Armes arme;
	public CaseArme(int numeroCase, Armes arme) {
		super(numeroCase, arme);
	}
	
	@Override
	public void effet(Pirate pirateSurCase, Pirate autrePirate, Armes arme) {
		autrePirate.perdreVie(arme);

	}
	


}
