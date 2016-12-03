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
    protected static Origine origine;

    /**
     * 
     */
    protected static TypesCartes typeCarte;

    /**
     * 
     */
    protected static String nomCarte;

    /**
     * 
     */
    protected boolean capaciteUtilise;

    /**
     * 
     */
    protected static int numCarte;



    /**
     * @param carte 
     * @return
     */
    public abstract void activeCapacite(Carte carte);
    
    @Override
    public String toString() {
    	return "[ " + this.origine + " " + nomCarte ;
    }

}
