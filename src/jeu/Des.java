package jeu;

import java.security.SecureRandom;
import java.util.Random;

public class Des{
	private Random random;
	
	public Des() {
		try {
			random = SecureRandom.getInstanceStrong();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int  lancerDes() { 
		return random.nextInt(2, 13);
	}
}
