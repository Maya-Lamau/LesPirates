package jeu;

public abstract class CasesSpeciales {
	private int numeroCase;
	private String typeCase;
	private Armes arme;

	protected CasesSpeciales(int numeroCase, Armes arme) {
		this.numeroCase = numeroCase;
		this.arme = arme;
	}
	

	public int getNumeroCase() {
		return numeroCase;
	}
	
	public Armes getArme() {
		return arme;
	}
	
	public abstract void effet(Pirate pirateSurCase, Pirate autrePirate, Armes arme);
	

}