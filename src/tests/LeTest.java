package tests;

import jeu.*;

public class LeTest {
	public static void main(String[] args) {
		
		Affichage journal = new JournalJackEtBill();
		Jeu jeu = new Jeu(journal);
		jeu.leJeu();
	}
	
}
