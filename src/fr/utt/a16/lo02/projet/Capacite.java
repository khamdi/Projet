package test;

import java.util.*;

public class Capacite {
	///////////////////////////////CROYANT////////////////////////////////////
	
	public void capaciteMoine(Joueur joueur) {
    	// Donne un point d'action d'origine jour
        Joueur.action[0] += 1 ;
		// TODO implement here
    }

	public void capaciteTravailleurs1 (Joueur joueur){
		//Empêche une Divinité possédant le Dogme Nature
		//ou Mystique de sacrifier une de ses cartes de Croyant durant ce tour.
		if (joueur.divinite.dogmes.contains(Dogmes.Nature) || joueur.divinite.dogmes.contains(Dogmes.Mystique)){
			joueur.sacrificeCroyant = false ;
		}
	}
	
	public void capaciteTravailleurs2 (Joueur joueur){
		//Empêche une Divinité possédant le Dogme Chaos ou Mystique de sacrifier un de
		//ses Guides Spirituels durant ce tour.
		if (joueur.divinite.dogmes.contains(Dogmes.Chaos) || joueur.divinite.dogmes.contains(Dogmes.Mystique)){
			joueur.sacrifieGuide = false ;
		}
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

		public void capaciteErmite() {
//Impose le sacrifice d'un Croyant d'un autre joueur, qui choisit la carte. 
//La capacité spéciale du sacrifice est jouée.		
		}
		
		public void capaciteIntegristes() {
//Impose le sacrifice d'un Guide Spirituel d'un autre joueur, qui choisit la carte. 
//La capacité spéciale du sacrifice est jouée.		
		}
		
		public void capaciteGuerrierSaint() {
//Un Guide Spirituel revient dans la main de sa Divinité. Ses Croyants reviennent au
//centre de la table.
			
		}
		
		public void capaciteDiplomates() {
//Relancez le dé de Cosmogonie. Le tour se finit normalement sous la nouvelle influence.	
		}
		
		public void capaciteDemons(Joueur joueur) {
	    	// Donne un point d'action d'origine jour
	        Joueur.action[1] += 1 ;
			// TODO implement here
	    }
		
		public void capaciteAlchimistes3 (Joueur joueur){
			//Vous piochez deux cartes au hasard dans la main d'une autre Divinité.
			//Scanner sc = new Scanner(System.in);
			//System.out.println("Sur quel joueur voulez-vous piochez deux cartes (choisir le numéro correspondant au joueur) ? " + Divinae.joueurs );
			//int j = sc.nextInt();
			 
			for (int i=1 ; i<3 ; i++){ 
				int a = Joueur.main.size(); 
				int b = (int) (Math.random()*a);
				Joueur.main.add() ;
			}
			
		 
		}
		
		public void capaciteVampire(Joueur joueur) {
//Impose le sacrifice d'un Croyant d'un autre joueur. Celui-ci choisit le sacrifié. 
//La capacité spéciale du sacrifice est jouée.	
		}
		
		public void capaciteLycanthropes(Joueur joueur) {
//Retirez tous les Croyants attachés à l'un des Guides Spirituels d'une autre
//Divinité. Les Croyants reviennent au milieu de la table, le Guide Spirituel est  défaussé.			
Divinae.table.addAll(Joueur.plateau.get(0).croyants);
joueur.plateau.get(0).croyants.clear();
		}
		
		public void capacitePillards(Joueur joueur) {
//Récupérez les points d'Action d'une Divinité n'ayant pas encore joué durant ce tour.
//Les points d'Action gardent leur Origine. La Divinité  perd ses points.
if (joueur.dejaJoue == false){


joueur.action = null;
}
		}
		
		public void capaciteIllusionnistes() {
//Vous bénéficiez de la capacité spéciale de sacrifice d'une carte de Croyants
//appartenant à une autre Divinité. La carte en question reste en jeu.			
		}
		
		public void capaciteEsprits(Joueur joueur) {
	    	// Donne un point d'action d'origine jour
	        Joueur.action[2] += 1 ;
			// TODO implement here
	    }
		
		public void capaciteAliénés1(Joueur joueur) {
//Empêche une Divinité possédant le Dogme Nature ou Mystique de sacrifier une
//de ses cartes de Croyants durant ce tour de jeu.	
if(joueur.divinite.dogmes.contains(Dogmes.Nature) || joueur.divinite.dogmes.contains(Dogmes.Mystique)){
	joueur.sacrificeCroyant = false;
}
		}
		
		public void capaciteAliénés2(Joueur joueur) {
//Empêche une Divinité possédant le Dogme Mystique ou Chaos de sacrifier un de ses
//Guides Spirituels durant ce tour de jeu.	
			if(joueur.divinite.dogmes.contains(Dogmes.Mystique) || joueur.divinite.dogmes.contains(Dogmes.Chaos)){
				joueur.sacrifieGuide = false;
			}
		}
		
		public void capaciteAliénés3() {
// Vous piochez deux cartes au hasard dans la main d'une autre Divinité.			
		}	
		
		public void capaciteRevenant() {
//Lancez le dé de Cosmogonie.Le tour se fini normalement,mais sous cette nouvelle influence.
		
		}	

		public void capaciteRévolutionnaires() {
//Imposez le sacrifice d'une carte de Croyants à autant de Divinités que vous le voulez.
//Chaque Divinité choisit la carte à sacrifier. Les capacités spéciales sont jouées.			
		}
		
		public void capaciteNihillistes() {
//Jusqu'à la fin du tour, plus aucune Divinité ne reçoit de points d'Action.			
		}	
		
///////////////////////////////GUIDE////////////////////////////////////
		
		public void capaciteMartyr() {
		//Equivalent à la pose d'une carte apocalypse
			
		}	
		
		public void capaciteClerc(Origine origine) {
// Fait gagner un nombre de points d'Action égal au nombre de cartes de Croyants rattachées. 
//L'Origine des points d'Action est au choix du joueur.
	
			if (origine == Origine.Jour){
	
			for(int i = 0 ;  i<Joueur.plateau.size() ; i++){
		
			Joueur.action[0] += Joueur.plateau.get(i).croyants.size();
			}
				}

			if (origine == Origine.Nuit){
				
				for(int i = 0 ;  i<Joueur.plateau.size() ; i++){
					
				Joueur.action[1] += Joueur.plateau.get(i).croyants.size();
				}
					}	
			if (origine == Origine.Neant){
				
				for(int i = 0 ;  i<Joueur.plateau.size() ; i++){
					
				Joueur.action[2] += Joueur.plateau.get(i).croyants.size();
				}
					}	
		}
		public void capaciteShaman() {
//Sacrifie tous les Croyants d'Origine Néant d'une Divinité ayant le Dogme Humain.
//Les capacités spécials sont jouées normalement.			
		}

		public void capaciteAnarchiste() {
//Sacrifie un Guide Spirituel, si lui ou sa Divinité ne croit pas au Dogme Chaos. 
//Les capacités spéciales sont jouées normalement.			
			if (Joueur.divinite.dogmes.contains(Dogmes.Chaos) || ){
				
			}
		}
		
		public void capacitePaladin() {
//Tous les Croyants, d'Origine Nuit ou Néant et ayant le Dogme Nature, actuellement 
//sur la table sont défaussés.Les capacités spéciales ne sont pas jouées.
		List<Croyant> Nature = new ArrayList<Croyant>() ; 
		Nature = Divinae.table ; 
		Divinae.cimetiere.addAll(Nature);
		}

		public void capaciteAscète() {
//Sacrifie 2 cartes Croyants d'une Divinité ayant le Dogme Humain ou Symboles.
//Les capacités spéciales sont jouées normalement.			
		}	
		
		public void capaciteDevin(Joueur joueur) {
//Oblige une Divinité ayant le Dogme Nature ou Mystique à sacrifier l'un de ses Guides Spirituels.			
		}	
		
		public void capaciteExorcistes() {
//Une Divinité d'Origine Nuit ou ayant les Dogmes Mystique et Chaos reprend dans sa main l'un de ses
//Guides Spirituels. Les Croyants qui y étaient attachés sont défaussés.			
		}	
		
		public void capaciteSorcier() {
//Echangez l'un de vos Guides Spirituels avec un d'une autre Divinité. Vous choisissez les
//deux guides Spirituels en question. Les Croyants restent attachés aux mêmes cartes.			
		}	
		
		public void capaciteTyran() {
//Défausse tous les Croyants ayant le Dogme Mystique actuellement au centre de la table.			
		}
		
		public void capaciteMessie() {
//Le joueur pose le dé de Cosmogonie sur la face qu'il désire et commence un nouveau tour de jeu.			
		}	
		
///////////////////////////////DEUS EX////////////////////////////////////
	}

