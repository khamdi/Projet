package fr.utt.a16.lo02.projet;


public abstract class Carte {
	/**
     * Default constructor
     */
    public Carte(int numCarte, String nomCarte, TypesCartes typeCarte, Origine origine) {
    	this.typeCarte = typeCarte;
    	this.origine = origine;
    	this.nomCarte = nomCarte;
    	this.numCarte = numCarte;
    	this.capaciteUtilise = false;
    }

    /**
     * 
     */
    protected Origine origine;

    /**
     * 
     */
    protected TypesCartes typeCarte;

    /**
     * 
     */
    protected String nomCarte;

    /**
     * 
     */
    protected boolean capaciteUtilise;

    /**
     * 
     */
    protected int numCarte;



    /**
     * @param carte 
     * @return
     */
    public abstract void activeCapacite();
    
    @Override
    public String toString() {
    	return this.typeCarte + " " + this.origine + " " + nomCarte ;
    }

}
