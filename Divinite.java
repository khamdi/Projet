package fr.utt.a16.lo02.projet;

import java.util.*;

import sun.applet.Main;

public class Divinite extends Carte {
	/**
     * Default constructor
     */
    public Divinite(int numCarte, String nomCarte, Origine origine,Dogmes dogme1,Dogmes dogme2,Dogmes dogme3, String description) {
        super (numCarte, nomCarte, TypesCartes.Divinite, origine);
        this.nomCarte = nomCarte;
        this.dogmes = new ArrayList<>();
        this.dogmes.add(dogme1);
        this.dogmes.add(dogme2);
        this.dogmes.add(dogme3);
        this.description = description;
    }

    /**
     * 
     */
    private static String description;

    /**
     * 
     */
    public List<Dogmes> dogmes;

    /**
     * @param carte 
     * @return
     */
    public void activeCapacite(Carte carte) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param carteApocalypste 
     * @return
     */
    public void capaciteBrawalen(Joueur joueur, Apocalypse carteApocalypste) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param carteGuide 
     * @return
     */
    public void capaciteShingva(Joueur joueur, Guide carteGuide) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @return
     */
    public void capaciteLlewella(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @param carteGuide 
     * @return
     */
    public void capaciteDrinded(Joueur joueur, Guide carteGuide) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @return
     */
    public void capaciteGorpa(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void capacitePuiTara() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void capaciteYarstur() {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @return
     */
    public void capaciteRomtec(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @return
     */
    public void capaciteGwenghelen(Joueur joueur) {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @return
     */
    public void capaciteKillinstred(Joueur joueur) {
        // TODO implement here
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString() + " " + this.description + " ]";
    }
    
    public static void main(String[] args) {
//		Divinite d = new Divinite(Origine.Aube, "Beau gosse", 0, "ae", null);
//		System.out.println(d);
	}
}
