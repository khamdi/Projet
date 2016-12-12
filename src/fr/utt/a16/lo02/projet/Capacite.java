package fr.utt.a16.lo02.projet;

import java.util.*;

public class Capacite {
	///////////////////////////////CROYANT////////////////////////////////////
	
	public void capaciteMoine(Joueur joueur) {
    	// Donne un point d'action d'origine jour
        Joueur.action[0] += 1 ;
		// TODO implement here
    }

	public void capaciteTravailleurs1 (Joueur joueur){
		//Emp�che une Divinit� poss�dant le Dogme Nature
		//ou Mystique de sacrifier une de ses cartes de Croyant durant ce tour.
		if (joueur.divinite.dogmes.contains(Dogmes.Nature) || joueur.divinite.dogmes.contains(Dogmes.Mystique)){
			joueur.sacrificeCroyant = false ;
		}
	}
	
	public void capaciteTravailleurs2 (Joueur joueur){
		//Emp�che une Divinit� poss�dant le Dogme Chaos ou Mystique de sacrifier un de
		//ses Guides Spirituels durant ce tour.
		if (joueur.divinite.dogmes.contains(Dogmes.Chaos) || joueur.divinite.dogmes.contains(Dogmes.Mystique)){
			joueur.sacrifieGuide = false ;
		}
	}
	
	public void capaciteTravailleurs3 (Joueur joueur){
		//Vous piochez deux cartes au hasard dans la main d'une autre Divinit�.
		Scanner sc = new Scanner(System.in);
		System.out.println("Sur quel joueur voulez-vous piochez deux cartes (choisir le num�ro correspondant au joueur ? " + Divinae.joueurs );
		int j = sc.nextInt();
		
		for (int i=1 ; i<3 ; i++){
			int a = Joueur.main.size(); 
			int b = (int) (Math.random()*a);
			Joueur.main.add() ;
		}
	}

		public void capaciteErmite() {
//Impose le sacrifice d'un Croyant d'un autre joueur, qui choisit la carte. 
//La capacit� sp�ciale du sacrifice est jou�e.		
		}
		
		public void capaciteIntegristes() {
//Impose le sacrifice d'un Guide Spirituel d'un autre joueur, qui choisit la carte. 
//La capacit� sp�ciale du sacrifice est jou�e.		
		}
		
		public void capaciteGuerrierSaint() {
//Un Guide Spirituel revient dans la main de sa Divinit�. Ses Croyants reviennent au
//centre de la table.
			
		}
		
		public void capaciteDiplomates() {
//Relancez le d� de Cosmogonie. Le tour se finit normalement sous la nouvelle influence.	
		}
		
		public void capaciteDemons(Joueur joueur) {
	    	// Donne un point d'action d'origine jour
	        Joueur.action[1] += 1 ;
			// TODO implement here
	    }
		
		public void capaciteAlchimistes3 (Joueur joueur){
			//Vous piochez deux cartes au hasard dans la main d'une autre Divinit�.
			//Scanner sc = new Scanner(System.in);
			//System.out.println("Sur quel joueur voulez-vous piochez deux cartes (choisir le num�ro correspondant au joueur) ? " + Divinae.joueurs );
			//int j = sc.nextInt();
			 
			for (int i=1 ; i<3 ; i++){ 
				int a = Joueur.main.size(); 
				int b = (int) (Math.random()*a);
				Joueur.main.add() ;
			}
			
		 
		}
		
		public void capaciteVampire(Joueur joueur) {
//Impose le sacrifice d'un Croyant d'un autre joueur. Celui-ci choisit le sacrifi�. 
//La capacit� sp�ciale du sacrifice est jou�e.	
		}
		
		public void capaciteLycanthropes(Joueur joueur) {
//Retirez tous les Croyants attach�s � l'un des Guides Spirituels d'une autre
//Divinit�. Les Croyants reviennent au milieu de la table, le Guide Spirituel est  d�fauss�.			
Divinae.table.addAll(Joueur.plateau.get(0).croyants);
joueur.plateau.get(0).croyants.clear();
		}
		
		public void capacitePillards(Joueur joueur) {
//R�cup�rez les points d'Action d'une Divinit� n'ayant pas encore jou� durant ce tour.
//Les points d'Action gardent leur Origine. La Divinit�  perd ses points.
if (joueur.dejaJoue == false){


joueur.action = null;
}
		}
		
		public void capaciteIllusionnistes() {
//Vous b�n�ficiez de la capacit� sp�ciale de sacrifice d'une carte de Croyants
//appartenant � une autre Divinit�. La carte en question reste en jeu.			
		}
		
		public void capaciteEsprits(Joueur joueur) {
	    	// Donne un point d'action d'origine jour
	        Joueur.action[2] += 1 ;
			// TODO implement here
	    }
		
		public void capaciteAli�n�s1(Joueur joueur) {
//Emp�che une Divinit� poss�dant le Dogme Nature ou Mystique de sacrifier une
//de ses cartes de Croyants durant ce tour de jeu.	
if(joueur.divinite.dogmes.contains(Dogmes.Nature) || joueur.divinite.dogmes.contains(Dogmes.Mystique)){
	joueur.sacrificeCroyant = false;
}
		}
		
		public void capaciteAli�n�s2(Joueur joueur) {
//Emp�che une Divinit� poss�dant le Dogme Mystique ou Chaos de sacrifier un de ses
//Guides Spirituels durant ce tour de jeu.	
			if(joueur.divinite.dogmes.contains(Dogmes.Mystique) || joueur.divinite.dogmes.contains(Dogmes.Chaos)){
				joueur.sacrifieGuide = false;
			}
		}
		
		public void capaciteAli�n�s3() {
// Vous piochez deux cartes au hasard dans la main d'une autre Divinit�.			
		}	
		
		public void capaciteRevenant() {
//Lancez le d� de Cosmogonie.Le tour se fini normalement,mais sous cette nouvelle influence.
		
		}	

		public void capaciteR�volutionnaires() {
//Imposez le sacrifice d'une carte de Croyants � autant de Divinit�s que vous le voulez.
//Chaque Divinit� choisit la carte � sacrifier. Les capacit�s sp�ciales sont jou�es.			
		}
		
		public void capaciteNihillistes() {
//Jusqu'� la fin du tour, plus aucune Divinit� ne re�oit de points d'Action.			
		}	
		
///////////////////////////////GUIDE////////////////////////////////////
		
		public void capaciteMartyr() {
		//Equivalent � la pose d'une carte apocalypse
			
		}	
		
		public void capaciteClerc(Origine origine) {
// Fait gagner un nombre de points d'Action �gal au nombre de cartes de Croyants rattach�es. 
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
//Sacrifie tous les Croyants d'Origine N�ant d'une Divinit� ayant le Dogme Humain.
//Les capacit�s sp�cials sont jou�es normalement.			
		}

		public void capaciteAnarchiste() {
//Sacrifie un Guide Spirituel, si lui ou sa Divinit� ne croit pas au Dogme Chaos. 
//Les capacit�s sp�ciales sont jou�es normalement.			
			if (Joueur.divinite.dogmes.contains(Dogmes.Chaos) || ){
				
			}
		}
		
		public void capacitePaladin() {
//Tous les Croyants, d'Origine Nuit ou N�ant et ayant le Dogme Nature, actuellement 
//sur la table sont d�fauss�s.Les capacit�s sp�ciales ne sont pas jou�es.
		List<Croyant> Nature = new ArrayList<Croyant>() ; 
		Nature = Divinae.table ; 
		Divinae.cimetiere.addAll(Nature);
		}

		public void capaciteAscete() {
//Sacrifie 2 cartes Croyants d'une Divinit� ayant le Dogme Humain ou Symboles.
//Les capacit�s sp�ciales sont jou�es normalement.			
		}	
		
		public void capaciteDevin(Joueur joueur) {
//Oblige une Divinit� ayant le Dogme Nature ou Mystique � sacrifier l'un de ses Guides Spirituels.			
		}	
		
		public void capaciteExorcistes() {
//Une Divinit� d'Origine Nuit ou ayant les Dogmes Mystique et Chaos reprend dans sa main l'un de ses
//Guides Spirituels. Les Croyants qui y �taient attach�s sont d�fauss�s.			
		}	
		
		public void capaciteSorcier() {
//Echangez l'un de vos Guides Spirituels avec un d'une autre Divinit�. Vous choisissez les
//deux guides Spirituels en question. Les Croyants restent attach�s aux m�mes cartes.			
		}	
		
		public void capaciteTyran() {
//D�fausse tous les Croyants ayant le Dogme Mystique actuellement au centre de la table.			
		}
		
		public void capaciteMessie() {
//Le joueur pose le d� de Cosmogonie sur la face qu'il d�sire et commence un nouveau tour de jeu.			
		}	
		
///////////////////////////////DEUS EX////////////////////////////////////
	}

>>>>>>> e5ad3d88e9ebc040623c3a2a48f3edc3e5fbd07d
