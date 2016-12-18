package fr.utt.a16.lo02.projet;

import java.util.*;

public class Capacite {
	public int numCapacite;
	public Joueur lanceur;
	public Joueur receveur;
	public Action carteJoue;
	
	public Capacite(int numCapacite) {
		this.numCapacite = numCapacite;
	}
	
	public void activeCapacite(){
		switch (this.numCapacite){
			case 0:
		}
	}
	
	///////////////////////////////CROYANT////////////////////////////////////
	
	public void capaciteMoine() {
        lanceur.action[Origine.Jour.ordinal()] += 1 ;
    }

	public void capaciteTravailleurs1 (){
		if (receveur.divinite.dogmes.contains(Dogmes.Nature) || receveur.divinite.dogmes.contains(Dogmes.Mystique)){
			receveur.sacrificeCroyant = false ;
		}
	}
	
	public void capaciteTravailleurs2 (){
		if (receveur.divinite.dogmes.contains(Dogmes.Chaos) || receveur.divinite.dogmes.contains(Dogmes.Mystique)){
			receveur.sacrifieGuide = false ;
		}
	}
	
	public void capaciteTravailleurs3 (){
		this.lanceur.main.add(this.receveur.main.remove(new Random().nextInt(this.receveur.main.size())));
		this.lanceur.main.add(this.receveur.main.remove(new Random().nextInt(this.receveur.main.size())));
	}

		public void capaciteErmite() {
			receveur.activeCarteCroyantForce();
		}
		
		public void capaciteIntegristes() {
			receveur.activeCarteGuideForce();
		}
		
		public void capaciteGuerrierSaint() {
			int i;
			for (i = 0; i < receveur.plateau.size(); i++){
				if (receveur.plateau.get(i) instanceof Guide ){
					Divinae.table.addAll(receveur.plateau.get(i).croyants);
					receveur.main.add(receveur.plateau.get(i));
					receveur.plateau.remove(i);
				}
			}
		}
		
		public void capaciteDiplomates() {
			Divinae.setOrigineTour(Divinae.lanceDee());
		}
		
		public void capaciteDemons(Joueur joueur) {
			joueur.action[Origine.Nuit.ordinal()] += 1 ;
	    }
		
		public void capaciteAlchimistes1(){
			if (receveur.divinite.dogmes.contains(Dogmes.Humain) || receveur.divinite.dogmes.contains(Dogmes.Mystique)){
				receveur.sacrificeCroyant = false ;
			}
		}
		
		public void capaciteAlchimistes2(){
			if (receveur.divinite.dogmes.contains(Dogmes.Humain) || receveur.divinite.dogmes.contains(Dogmes.Symnoles)){
				receveur.sacrificeCroyant = false ;
			}
		}
		
		public void capaciteAlchimistes3 (){
			this.capaciteTravailleurs3();
		}
		
		public void capaciteVampire() {
			this.capaciteErmite();
		}
		
		public void capaciteLycanthropes() {
			this.capaciteGuerrierSaint();
		}
		
		public void capacitePillards() {
			if (receveur.isDejaJoue() == false){
				for(int i = 0; i < receveur.action.length; i++){
					lanceur.action[i] +=  receveur.action[i];
					receveur.action[i] = 0;
				}
			}
		}
		
		public void capaciteIllusionnistes() {
			//TODO
		}
		
		public void capaciteEsprits() {
	        lanceur.action[Origine.Neant.ordinal()] += 1 ;
	    }
		
		public void capaciteAlienes1() {
			if(receveur.divinite.dogmes.contains(Dogmes.Nature) || receveur.divinite.dogmes.contains(Dogmes.Mystique)){
				receveur.sacrificeCroyant = false;
			}
		}
		
		public void capaciteAlienes2() {
			if(receveur.divinite.dogmes.contains(Dogmes.Mystique) || receveur.divinite.dogmes.contains(Dogmes.Chaos)){
				receveur.sacrifieGuide = false;
			}
		}
		
		public void capaciteAlienes3() {
			this.capaciteAlchimistes3();
		}	
		
		public void capaciteRevenant() {
			this.capaciteDiplomates();
		}	

		public void capaciteRevolutionnaires() {
			this.capaciteErmite();
		}
		
		public void capaciteNihillistes() {
			for(int i = 0; i < Divinae.joueurs.size(); i++){
				Divinae.joueurs.get(i).setGainPtAction(false);
			}
		}	
		
///////////////////////////////GUIDE////////////////////////////////////
		
		public void capaciteMartyr() {
			new Apocalypse(-1, "Martyr", Origine.Neant).activeCapacite();
		}	
		
		public void capaciteClerc(Origine origine) {
			Guide g = (Guide) this.carteJoue;
			
			lanceur.action[lanceur.divinite.origine.ordinal()] += g.croyants.size();
		}
		public void capaciteShaman() {
			for (int i = 0; i < receveur.plateau.size(); i++){
				for (int j = 0; j < receveur.plateau.get(i).croyants.size(); j++)
					if (receveur.plateau.get(i).croyants.get(j).origine == Origine.Neant){
						receveur.plateau.get(i).retirerCroyant(receveur.plateau.get(i).croyants.get(j));
					}
			}
		}

		public void capaciteAnarchiste() {
			// TODO
		}
		
		public void capacitePaladin() {
		List<Croyant> Nature = new ArrayList<Croyant>() ; 
		Nature = Divinae.table ; 
		Divinae.cimetiere.addAll(Nature);
		}

		public void capaciteAscete() {
			//TODO
		}	
		
		public void capaciteDevin(Joueur joueur) {
			//TODO
		}	
		
		public void capaciteExorcistes() {
			//TODO
		}	
		
		public void capaciteSorcier() {
			//TODO
		}	
		
		public void capaciteTyran() {
			//TODO
		}
		
		public void capaciteMessie() {
			//TODO
		}	
		
///////////////////////////////DEUS EX////////////////////////////////////
	}

