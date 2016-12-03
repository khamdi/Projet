package fr.utt.a16.lo02.projet;

import java.util.*;

public abstract class Joueur {
	/**
     * Default constructor
     */
    public Joueur() {
    }

    /**
     * 
     */
    private boolean gainPtAction = true;

    /**
     * 
     */
    private boolean dejaJoue = false;

    /**
     * 
     */
    protected int nbPriere = 0;

    /**
     * 
     */
    protected int action;

    /**
     * 
     */
    protected static Divinite divinité;

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
    public boolean sacrificeCroyant = false;

    /**
     * 
     */
    public boolean sacrifieGuide = false;



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
    public int recupererPriere() {
        // TODO implement here
        return 0;
    }

    /**
     * 
     */
    public enum Types {
    }
}
