package test;

import java.util.*;

public class Capacite {
	public void capaciteMoine(Joueur joueur) {
    	// Donne un point d'action d'origine jour
        Joueur.action[0] += 1 ;
		// TODO implement here
    }

	public void capaciteTravailleurs1 (Joueur joueur){
		//Empêche une Divinité possédant le Dogme Nature
		//ou Mystique de sacrifier une de ses cartes de Croyant durant ce tour.
	}
	
	public void capaciteTravailleurs2 (Joueur joueur){
		//Empêche une Divinité possédant le Dogme Chaos ou Mystique de sacrifier un de
		//ses Guides Spirituels durant ce tour.
	}
	
	public void capaciteTravailleurs3 (Joueur joueur){
		//Vous piochez deux cartes au hasard dans la main d'une autre Divinité.
		Scanner sc = new Scanner(System.in);
		System.out.println("Sur quel joueur voulez-vous piochez deux cartes (choisir le numéro correspondant au joueur ? " + Divinae.joueurs );
		int j = sc.nextInt();
		
		for (int i=1 ; i<3 ; i++){
			int a = Joueur.main.size(); 
			int b = (int) (Math.random()*a);
			Joueur.main.add() ;
		}
	}

		public void capaciteDemons(Joueur joueur) {
	    	// Donne un point d'action d'origine jour
	        Joueur.action[1] += 1 ;
			// TODO implement here
	    }
		
		public void capaciteEsprits(Joueur joueur) {
	    	// Donne un point d'action d'origine jour
	        Joueur.action[2] += 1 ;
			// TODO implement here
	    }
		
		public void capaciteAlchimistes3 (Joueur joueur){
			//Vous piochez deux cartes au hasard dans la main d'une autre Divinité.
			Scanner sc = new Scanner(System.in);
			System.out.println("Sur quel joueur voulez-vous piochez deux cartes (choisir le numéro correspondant au joueur ? " + Divinae.joueurs );
			int j = sc.nextInt();
			
			for (int i=1 ; i<3 ; i++){
				int a = Joueur.main.size(); 
				int b = (int) (Math.random()*a);
				Joueur.main.add() ;
			}
			
		 
		}
	}

