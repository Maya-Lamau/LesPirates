package jeu;

public interface Affichage {
	
	public void affichageDebutJeu();
	public void affichageDes(Pirate pirate, int valeur);
	public void affichageCase(Pirate pirate, int place);
	public void affichageGagnant(Pirate pirate);
	public void affichageFinJeu();
	public void affichageAQuiDeJouer(Pirate pirate);
	
}
