package fr.utt.a16.lo02.projet;

import java.util.*;
public abstract class Joueur {
	/**
     * Default constructor
     */
    public Joueur(String nom, Types type) {
    	this.nom = nom;
    	this.gainPtAction = true;
    	this.setDejaJoue(false);
    	this.nbPriere = 0;
    	this.sacrificeCroyant = false;
    	this.sacrifieGuide = false;
    	this.plateau = new ArrayList<Guide>();
    	this.main = new ArrayList<Action>();
    	this.action = new int[3];
    	this.typeJoueur = type;
    }
    
    private String nom;

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
    protected int[] action;

    /**
     * 
     */
    protected Divinite divinite;

    /**
     * 
     */
    public Types typeJoueur;

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
    public abstract void defausse();

    /**
     * @param carte 
     * @return
     */
    public abstract void jouerCarte();

    /**
     * @param carte 
     * @return
     */
    public abstract void activeCarte();

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
    
    public abstract void joueCarteImediat();
    
    public abstract void activeCarteCroyantForce();
    
    public abstract void activeCarteGuideForce();

    /**
     * @return
     */
    public void remplirMain() {
    	while (this.main.size() < 7){
    		this.main.add(Divinae.piocherCarte());
    	}
    }
    
    public boolean encorePtAction(){
		if (this.action[Origine.Jour.ordinal()] > 0 || this.action[Origine.Nuit.ordinal()] > 0 || this.action[Origine.Neant.ordinal()] > 0 )
			return true;
		return false;
	}
    
    public boolean checkGagnant(){
    	Iterator<?> it;
    	boolean gagnant = true;
    	Joueur j;
    	for (it = Divinae.joueurs.iterator(); it.hasNext();){
    		j = (Joueur) it.next();
    		j.calculerPriere();
    	}
    	for (it = Divinae.joueurs.iterator(); it.hasNext();){
    		j = (Joueur) it.next();
    		if (this.nbPriere < j.nbPriere)
    			gagnant = false;
    	}
    	return gagnant;
    }
    
    /**
     * @param origineAction 
     * @param nbAction 
     * @return
     */
    public void ajoutAction(Origine origineAction, int nbAction) {
        this.action[origineAction.ordinal()] += nbAction;
    }

    /**
     * @param origineAction 
     * @param nbAction 
     * @return
     */
    public void retireAction(Origine origineAction, int nbAction) {
    	 if (this.action[origineAction.ordinal()] > nbAction)
    		 this.action[origineAction.ordinal()] -= nbAction;
    	 this.action[origineAction.ordinal()] = 0;
    	 
    }

    /**
     * @return
     */
    public void calculerPriere() {
        int priere = 0;
		for (Iterator<Guide> it = plateau.iterator(); it.hasNext();){
			Guide g = (Guide) it.next();
        	for (Iterator<?> itCroyant = g.croyants.iterator(); itCroyant.hasNext();){
        		Croyant c = (Croyant) itCroyant.next();
        		priere += c.getNbCroyant();
        	}
		}
    	this.nbPriere = priere;
    }
    
    public String getNom (){
    	return this.nom;
    }

    public boolean isDejaJoue() {
		return dejaJoue;
	}

	public void setDejaJoue(boolean dejaJoue) {
		this.dejaJoue = dejaJoue;
	}

	/**
     * 
     */
    public enum Types {
    	Reel,
    	IA
    }
    @Override
    public String toString() {
    	return this.nom + " : " + this.divinite.origine + " " + this.divinite.nomCarte;
    }
    public static void main(String[] args) {
	}

	public void setGainPtAction(boolean b) {
		this.gainPtAction = b;
	}
}
