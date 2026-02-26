package jeu;

public class CaseArme extends CasesSpeciales {

	public CaseArme(int numeroCase) {
		super(numeroCase);
	}
	
	@Override
	public int effet(int caseActuelle, Pirate pirateSurCase, Pirate autrePirate, Armes arme) {
		int viePirate;
		viePirate = autrePirate.perdreVie(arme);
		return viePirate;
	}

}
