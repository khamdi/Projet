package fr.utt.a16.lo02.projet;

import java.util.*;

public class Guide extends Personnage {
	/**
     * Default constructor
     */
    public Guide(int numCarte, String nomCarte, Origine origine, Dogmes dogme1, Dogmes dogme2,int maxCroyant, int carteRecupere,boolean capaciteUtilise) {
        super(numCarte, nomCarte, TypesCartes.Guide, origine, dogme1, dogme2,capaciteUtilise);
        // TODO Auto-generated constructor stub
        this.maxCroyant = maxCroyant;
        this.croyants = new ArrayList<Croyant>();
    }
    
    private int maxCroyant;

    /**
     * 
     */
    public List<Croyant> croyants;

    /**
     * @param return
     */
    public void jouerGuide() {
        // TODO implement here
    }

    /**
     * @param croyants 
     * @return
     */
    public void ajoutCroyant(List<Croyant> croyants) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Croyant retirerCroyant() {
        // TODO implement here
    	return null;
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteMartyr(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteClerc(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteShaman(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteAnarchiste(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capacitePaladin(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteAscete(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteDevin(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteExorciste(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteSorcier(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteTyran(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteMessie(Joueur joueur) {
        // TODO implement here
    }
}
