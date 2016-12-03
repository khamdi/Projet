package fr.utt.a16.lo02.projet;

public class Croyant extends Personnage {
	/**
     * Default constructor
     */
    public Croyant(int numCarte, String nomCarte, TypesCartes typeCarte,Origine origine, Dogmes dogme1, Dogmes dogme2, Dogmes dogme3,boolean capaciteUtilise,boolean lie,int nbCroyant) {
        super(numCarte, nomCarte, typeCarte, origine, dogme1, dogme2,capaciteUtilise);
        this.nbCroyant = nbCroyant;
        this.dogmes.add(dogme3);
        this.typeCarte = TypesCartes.Croyant ;
    }

    /**
     * 
     */
    private static int nbCroyant;

    /**
     * 
     */
    private boolean lie;

    /**
     * 
     */
    private boolean malInvocation = true;

    /**
     * @param return
     */
    public void jouerCroyant() {
        // TODO implement here
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

}
