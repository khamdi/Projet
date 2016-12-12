package fr.utt.a16.lo02.projet;

import java.util.*;

public class Croyant extends Personnage {
	/**
     * Default constructor
     */
    public Croyant(int numCarte, String nomCarte, Origine origine, Dogmes dogme1, Dogmes dogme2, Dogmes dogme3,int nbCroyant) {
        super(numCarte, nomCarte, TypesCartes.Croyant, origine, dogme1, dogme2);
        this.nbCroyant = nbCroyant;
        this.dogmes.add(dogme3);
        this.lie = false;
        this.malInvocation = false;
    }
    
    private static int DEBUTNUMCARTE = 400;

    /**
     * 
     */
    private final int nbCroyant;

    /**
     * 
     */
    private boolean lie;

    /**
     * 
     */
    private boolean malInvocation;
    
    
    public static LinkedList<Croyant> creationCroyant (){
    	LinkedList<Croyant> tmp = new LinkedList<>();
    	int numCarte = DEBUTNUMCARTE;
    		//Moines
    	tmp.add(new Croyant(numCarte++,"Moines",Origine.Jour,Dogmes.Nature,Dogmes.Mystique,Dogmes.Humain,2));
    	tmp.add(new Croyant(numCarte++,"Moines",Origine.Jour,Dogmes.Chaos,Dogmes.Mystique,Dogmes.Symnoles,2));
        tmp.add(new Croyant(numCarte++,"Moines",Origine.Jour,Dogmes.Nature,Dogmes.Mystique,Dogmes.Symnoles,2));
        tmp.add(new Croyant(numCarte++,"Moines",Origine.Jour,Dogmes.Nature,Dogmes.Mystique,Dogmes.Chaos,2));
        	
        		//Travailleurs
        tmp.add(new Croyant(numCarte++,"Travailleurs",Origine.Jour,Dogmes.Chaos,Dogmes.Symnoles,Dogmes.Humain,2));
        tmp.add(new Croyant(numCarte++,"Travailleurs",Origine.Jour,Dogmes.Nature,Dogmes.Symnoles,Dogmes.Humain,2));
        tmp.add(new Croyant(numCarte++,"Travailleurs",Origine.Jour,Dogmes.Chaos,Dogmes.Mystique,Dogmes.Humain,2));
        		
        		//Ermite
        tmp.add(new Croyant(numCarte++,"Ermite",Origine.Jour,Dogmes.Nature,Dogmes.Mystique,Dogmes.Chaos,1));
        tmp.add(new Croyant(numCarte++,"Ermite",Origine.Jour,Dogmes.Symnoles,Dogmes.Mystique,Dogmes.Nature,1));
        		
        		//Int�gristes
        tmp.add(new Croyant(numCarte++,"Int�gristes",Origine.Jour,Dogmes.Nature,Dogmes.Humain,Dogmes.Chaos,1));
        		
        		//Guerriers Saints
        tmp.add(new Croyant(numCarte++,"Guerriers Saints",Origine.Jour,Dogmes.Nature,Dogmes.Mystique,Dogmes.Symnoles,4));
        		
        		//Diplomates
        tmp.add(new Croyant(numCarte++,"Diplomates",Origine.Jour,Dogmes.Humain,Dogmes.Chaos,Dogmes.Symnoles,4));
        		
        		//D�mons
        tmp.add(new Croyant(numCarte++,"D�mons",Origine.Nuit,Dogmes.Nature,Dogmes.Mystique,Dogmes.Humain,2));
        tmp.add(new Croyant(numCarte++,"D�mons",Origine.Nuit,Dogmes.Chaos,Dogmes.Mystique,Dogmes.Symnoles,2));
        tmp.add(new Croyant(numCarte++,"D�mons",Origine.Nuit,Dogmes.Chaos,Dogmes.Mystique,Dogmes.Symnoles,2));
        tmp.add(new Croyant(numCarte++,"D�mons",Origine.Nuit,Dogmes.Nature,Dogmes.Mystique,Dogmes.Symnoles,2));
        tmp.add(new Croyant(numCarte++,"D�mons",Origine.Nuit,Dogmes.Nature,Dogmes.Mystique,Dogmes.Chaos,2));
        		
        		//Alchimistes
        tmp.add(new Croyant(numCarte++,"Alchimistes",Origine.Nuit,Dogmes.Nature,Dogmes.Chaos,Dogmes.Symnoles,2));
        tmp.add(new Croyant(numCarte++,"Alchimistes",Origine.Nuit,Dogmes.Nature,Dogmes.Mystique,Dogmes.Chaos,2));
        tmp.add(new Croyant(numCarte++,"Alchimistes",Origine.Nuit,Dogmes.Nature,Dogmes.Chaos,Dogmes.Symnoles,2));
        		
        		//Vampire
        tmp.add(new Croyant(numCarte++,"Vampire",Origine.Nuit,Dogmes.Nature,Dogmes.Humain,Dogmes.Symnoles,1));
        tmp.add(new Croyant(numCarte++,"Vampire",Origine.Nuit,Dogmes.Mystique,Dogmes.Chaos,Dogmes.Humain,1));		
        		
        		//Lycanthropes
        tmp.add(new Croyant(numCarte++,"Lycanthropes",Origine.Nuit,Dogmes.Nature,Dogmes.Chaos,Dogmes.Humain,4));
        		
        		//Pillards
        tmp.add(new Croyant(numCarte++,"Pillards",Origine.Nuit,Dogmes.Nature,Dogmes.Mystique,Dogmes.Symnoles,4));
        		
        		//illusionnistes
        tmp.add(new Croyant(numCarte++,"Illusionistes",Origine.Nuit,Dogmes.Humain,Dogmes.Chaos,Dogmes.Symnoles,4));
        		
        		//Esprits
        tmp.add(new Croyant(numCarte++,"Esprits",Origine.Neant,Dogmes.Nature,Dogmes.Humain,Dogmes.Mystique,2));
        tmp.add(new Croyant(numCarte++,"Esprits",Origine.Neant,Dogmes.Mystique,Dogmes.Chaos,Dogmes.Humain,2));
        tmp.add(new Croyant(numCarte++,"Esprits",Origine.Neant,Dogmes.Mystique,Dogmes.Chaos,Dogmes.Symnoles,2));
        tmp.add(new Croyant(numCarte++,"Esprits",Origine.Neant,Dogmes.Nature,Dogmes.Mystique,Dogmes.Symnoles,2));
        tmp.add(new Croyant(numCarte++,"Esprits",Origine.Neant,Dogmes.Nature,Dogmes.Mystique,Dogmes.Chaos,2));

        		//Ali�n�s
        tmp.add(new Croyant(numCarte++,"Ali�n�s",Origine.Neant,Dogmes.Humain,Dogmes.Chaos,Dogmes.Symnoles,2));
        tmp.add(new Croyant(numCarte++,"Ali�n�s",Origine.Neant,Dogmes.Nature,Dogmes.Humain,Dogmes.Symnoles,2));
        tmp.add(new Croyant(numCarte++,"Ali�n�s",Origine.Neant,Dogmes.Humain,Dogmes.Mystique,Dogmes.Chaos,2));
        		
        		//Revenant
        tmp.add(new Croyant(numCarte++,"Revenant",Origine.Neant,Dogmes.Nature,Dogmes.Mystique,Dogmes.Humain,1));
        		
        		//R�volutionnaires
        tmp.add(new Croyant(numCarte++,"Ali�n�s",Origine.Neant,Dogmes.Humain,Dogmes.Chaos,Dogmes.Symnoles,2));
        		
        		//Nihillistes
        tmp.add(new Croyant(numCarte++,"Nihillistes",Origine.Neant,Dogmes.Chaos,Dogmes.Mystique,Dogmes.Symnoles,4));
    	
        return tmp;
    }
    
    public int getNbCroyant() {
		return nbCroyant;
	}
    
    public void setLie(boolean lie){
    	this.lie = lie;
    }
    
    public boolean getLie(){
    	return this.lie;
    }
    
    @Override
	public void jouerCarteAction() {
		Divinae.table.add(this);
	}

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteMoine(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteTravailleurs1(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteTravailleurs2(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteTravailleurs3(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteErmite(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteIntegristes(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteGuerriersSaints(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteDiplomates(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteDemons(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteAlchimiste1(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteAlchimiste2(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteAlchimiste3(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteVampire(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteLycanthropes(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capacitePillards(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteIllusionnistes(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteEsprits(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteAlienes1(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteAlienes2(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteAlienes3(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteRevenant(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteRevolutionnaires(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteNihillistes(Joueur joueur) {
        // TODO implement here
    }
    
    public static void main(String[] args) {
//    	LinkedList<Croyant> tmp = new LinkedList<>();
//    	tmp = creationCroyant();
////    	tmp.addAll(creationCroyant());
//    	System.out.println(tmp);
//    	
	}

	
    
}
