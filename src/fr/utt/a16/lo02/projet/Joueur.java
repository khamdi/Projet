package fr.utt.a16.lo02.projet;

import java.util.*;

public abstract class Joueur {
	/**
     * Default constructor
     */
    public Joueur() {
    	
    	this.gainPtAction = true;
    	this.dejaJoue = false;
    	this.nbPriere = 0;
    	this.sacrificeCroyant = false;
    	this.sacrifieGuide = false;
    }

    /**
     * 
     */
    private boolean gainPtAction;

    /**
     * 
     */
    private boolean dejaJoue;

    /**
     * 
     */
    protected int nbPriere ;

    /**
     * 
     */
    protected int action;

    /**
     * 
     */
    protected static Divinite divinite;

    /**
     * 
     */
    public static Types typeJoueur;

    /**
     * 
     */
    public List<Action> main;

    /**
     * 
     */
    public List<Guide> plateau;

    /**
     * 
     */
    public boolean sacrificeCroyant;

    /**
     * 
     */
    public boolean sacrifieGuide;



    /**
     * @param cartesDefausse 
     * @return
     */
    public abstract void defausse(List<Action> cartesDefausse);

    /**
     * @param carte 
     * @return
     */
    public abstract void jouerCarte(Action carte);

    /**
     * @param carte 
     * @return
     */
    public abstract void activeCarte(Carte carte);

    /**
     * @param joueur 
     * @param nbCarte 
     * @return
     */
    public abstract void piocheMain(Joueur joueur, int nbCarte);

    /**
     * @return
     */
    public abstract void tourJoueur();

    /**
     * @return
     */
    public void remplirMain() {
        // TODO implement here
    }

    /**
     * @param origineAction 
     * @param nbAction 
     * @return
     */
    public void ajoutAction(Origine origineAction, int nbAction) {
        // TODO implement here
    }

    /**
     * @param origineAction 
     * @param nbAction 
     * @return
     */
    public void retireAction(Origine origineAction, int nbAction) {
        // TODO implement here
    }

    /**
     * @return
     */
    public int calculerPriere() {
        Guide g;
        int priere = 0;
		for (Iterator it = plateau.iterator(); it.hasNext();)
			g = (Guide) it.next();
        	for (Iterator itCroyant = g.croyants.iterator(); itCroyant.hasNext();){
        		Croyant c = (Croyant) itCroyant.next();
        		priere += c.getNbCroyant();
        	}
    	this.nbPriere = priere;
        return priere;
    }

    /**
     * 
     */
    public enum Types {
    }
    
    public static void main(String[] args) {
		System.out.println(Divinae.getPaquet());
	}
}
