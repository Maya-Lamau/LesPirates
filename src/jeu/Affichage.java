package jeu;

public interface Affichage {
	
	public void affichageDebutJeu();
	public void affichageDes(String pirate, int valeur);
	public void affichageCase(String pirate, int place);
	public void affichageGagnant(String pirate);
	public void affichageFinJeu();
	public void affichageAQuiDeJouer(String pirate);
	public void affichageCaseSpeciale(String pirate);
	public void affichageCaseNormale(String pirate);
	public void affichagePresenceFilet(String pirate);
	public void affichageVie(String pirate, int vie);
	public void affichageCaseFilet(String pirate);
	public void affichageCaseArme(String pirate);
	
}
