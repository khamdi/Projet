package fr.utt.a16.lo02.projet;

import java.util.*;

public class Capacite {
	public void capaciteMoine(Joueur joueur) {
    	// Donne un point d'action d'origine jour
       joueur.action[Origine.Jour.ordinal()] += 1 ;
    }

	public void capaciteTravailleurs1 (Joueur joueur){
		//Emp�che une Divinit� poss�dant le Dogme Nature
		//ou Mystique de sacrifier une de ses cartes de Croyant durant ce tour.
	}
	
	public void capaciteTravailleurs2 (Joueur joueur){
		//Emp�che une Divinit� poss�dant le Dogme Chaos ou Mystique de sacrifier un de
		//ses Guides Spirituels durant ce tour.
	}
	
	public void capaciteTravailleurs3 (Joueur joueur){
		//Vous piochez deux cartes au hasard dans la main d'une autre Divinit�.
		Scanner sc = new Scanner(System.in);
		System.out.println("Sur quel joueur voulez-vous piochez deux cartes (choisir le num�ro correspondant au joueur ? " + Divinae.joueurs );
		int j = sc.nextInt();
		
		for (int i=1 ; i<3 ; i++){
			int a = joueur.main.size(); 
			int b = (int) (Math.random()*a);
			joueur.main.add() ;
		}
	}

		public void capaciteDemons(Joueur joueur) {
	    	// Donne un point d'action d'origine jour
	        joueur.action[Origine.Nuit.ordinal()] += 1 ;
	    }
		
		public void capaciteEsprits(Joueur joueur) {
	    	// Donne un point d'action d'origine jour
	        joueur.action[Origine.Neant.ordinal()] += 1 ;
	    }
		
		public void capaciteAlchimistes3 (Joueur joueur){
			//Vous piochez deux cartes au hasard dans la main d'une autre Divinit�.
			Scanner sc = new Scanner(System.in);
			System.out.println("Sur quel joueur voulez-vous piochez deux cartes (choisir le num�ro correspondant au joueur ? " + Divinae.joueurs );
			int j = sc.nextInt();
			
			for (int i=1 ; i<3 ; i++){
				int a = joueur.main.size(); 
				int b = (int) (Math.random()*a);
				joueur.main.add() ;
			}
			
		 
		}
	}

