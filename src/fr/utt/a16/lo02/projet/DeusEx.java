package fr.utt.a16.lo02.projet;

import java.util.LinkedList;

public class DeusEx extends Action {
	/**
     * Default constructor
     */
    public DeusEx(int numDeusEx, String nomDeusEx, Origine origine) {
        super(numDeusEx, nomDeusEx, origine, TypesCartes.DeusEx);
        // TODO Auto-generated constructor stub
    }
    
    private static int DEBUTNBCARTE = 200;

    
    public static LinkedList<DeusEx> creationDeusEx(){
    	LinkedList<DeusEx> tmp = new LinkedList<>();
    	int nbCarte = DEBUTNBCARTE;
    	
    	tmp.add(new DeusEx (nbCarte++,"col�re divine",Origine.Jour));
    	tmp.add(new DeusEx (nbCarte++,"col�re divine",Origine.Nuit));
    	tmp.add(new DeusEx (nbCarte++,"stase",Origine.Jour));
    	tmp.add(new DeusEx (nbCarte++,"ordre c�leste",Origine.Jour));
    	tmp.add(new DeusEx (nbCarte++,"fourberie",Origine.Nuit));
    	tmp.add(new DeusEx (nbCarte++,"diversion",Origine.Nuit));
    	tmp.add(new DeusEx (nbCarte++,"concentration",Origine.Neant));
    	tmp.add(new DeusEx (nbCarte++,"trou noir",Origine.Neant));
    	tmp.add(new DeusEx (nbCarte++,"phoenix",Origine.Neant));
    	tmp.add(new DeusEx (nbCarte++,"influence jour",Origine.Vide));
    	tmp.add(new DeusEx (nbCarte++,"influence nuit",Origine.Vide));
    	tmp.add(new DeusEx (nbCarte++,"influence n�ant",Origine.Vide));
    	tmp.add(new DeusEx (nbCarte++,"influence nulle",Origine.Vide));
    	tmp.add(new DeusEx (nbCarte++,"influence nulle",Origine.Vide));
    	tmp.add(new DeusEx (nbCarte++,"transe",Origine.Vide));
    	tmp.add(new DeusEx (nbCarte++,"miroir",Origine.Vide));
    	tmp.add(new DeusEx (nbCarte++,"bouleversement",Origine.Vide));
    	tmp.add(new DeusEx (nbCarte++,"inquisition",Origine.Vide));	
    	
    	return tmp;
    }

    /**
     * @param joueur 
     * @param guide 
     * @param return
     */
    public void capaciteColereDivine1(Joueur joueur, Guide guide) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param guide 
     * @param return
     */
    public void capaciteColereDivine2(Joueur joueur, Guide guide) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param guide 
     * @param return
     */
    public void capaciteStase(Joueur joueur, Guide guide) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param guide 
     * @param return
     */
    public void capaciteOrdreCeleste(Joueur joueur, Guide guide) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteFourberie(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteDiversion(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param guide 
     * @param return
     */
    public void capaciteConcentration(Joueur joueur, Guide guide) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteTrouNoir(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param personnage 
     * @param return
     */
    public void capacitePhoenix(Joueur joueur, Personnage personnage) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param carteAction 
     * @param return
     */
    public void capaciteInfluenceJour(Joueur joueur, Action carteAction) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param carteAction 
     * @param return
     */
    public void capaciteInfluenceNuit(Joueur joueur, Action carteAction) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param carteAction 
     * @param return
     */
    public void capaciteInfluenceNeant(Joueur joueur, Action carteAction) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param carteAction 
     * @param return
     */
    public void capaciteInfluenceNulle(Joueur joueur, Action carteAction) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param carteAction 
     * @param return
     */
    public void capaciteTrans(Joueur joueur, Action carteAction) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param carteAction 
     * @param return
     */
    public void capaciteMiroir(Joueur joueur, Action carteAction) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param return
     */
    public void capaciteBouleversement(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param guide 
     * @param return
     */
    public void capaciteInquisition(Joueur joueur, Guide guide) {
        // TODO implement here
    }

	@Override
	public void jouerCarteAction() {
		// TODO Auto-generated method stub
		
	}
}
