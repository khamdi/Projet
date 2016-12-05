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
    
    private static int DEBUTNUMCARTE = 0;

    /**
     * 
     */
    private static String description;

    /**
     * 
     */
    public List<Dogmes> dogmes;
    
  //pb   
    public static ArrayList<Divinite> creationDivinite(){
    	ArrayList<Divinite> tmp = new ArrayList<>();
    	int numCarte = DEBUTNUMCARTE;
    	
    	
    	
    	tmp.add(new Divinite(numCarte++,"Pui-Tara",Origine.Nuit,Dogmes.Nature,Dogmes.Mystique,Dogmes.Symnoles,"Pui-Tara est la divinité sur laquelle l'influence de la nuit s'est faite la plus forte"));
		System.out.println(tmp);
    	tmp.add(new Divinite(numCarte++,"Llewella",Origine.Nuit,Dogmes.Nature,Dogmes.Mystique,Dogmes.Chaos,"Divinité machiavélique et manipulatrice,Llewella cherche à influencer et contrôler ses ennemis."));
    	System.out.println(tmp);
    	tmp.add(new Divinite(numCarte++,"Killinstred",Origine.Nuit,Dogmes.Nature,Dogmes.Mystique,Dogmes.Chaos,"Divinité machiavélique et manipulatrice, Killinstred cherche à influencer et contrôler ses ennemis. "));
    	System.out.println(tmp);
    	tmp.add(new Divinite(numCarte++,"Brewalen",Origine.Jour,Dogmes.Nature,Dogmes.Mystique,Dogmes.Humain,"Premier enfant du Jour, Brewalen cherche à représenter une certaine image de l'harmonie, et tente de mettre en place un statu quo entre les Divinités."));
    	System.out.println(tmp);
    	tmp.add(new Divinite(numCarte++,"Drinded",Origine.Jour,Dogmes.Nature,Dogmes.Humain,Dogmes.Symnoles,"Defenseur des hommes, quelles que soient leurs croyances, Drinded protège les chefs religieux"));
    	System.out.println(tmp);
    	tmp.add(new Divinite(numCarte++,"Yarstur",Origine.Jour,Dogmes.Chaos,Dogmes.Mystique,Dogmes.Symnoles,"Dernier pur du jour, Yarstur combat le Néant sous toutes ses formes."));
		tmp.add(new Divinite(numCarte++,"Gwenghelen",Origine.Aube,Dogmes.Chaos,Dogmes.Mystique,Dogmes.Symnoles,"Première Divinité à recevoir l'influence du Néant, Gwenghelen est celle qui en a reçu le plus de puissance"));
		tmp.add(new Divinite(numCarte++,"Sbingva",Origine.Aube,Dogmes.Humain,Dogmes.Mystique,Dogmes.Chaos,"Perverse et retorse, Shingva est une Divinité que toutes les autres détestent"));
		tmp.add(new Divinite(numCarte++,"Gorpa",Origine.Crepuscule,Dogmes.Humain,Dogmes.Chaos,Dogmes.Symnoles,"Divinité joueuse et espiègle, Gorpa aime gêner ses consœurs dans leur recherche de puissance."));
		tmp.add(new Divinite(numCarte++,"Romtec",Origine.Crepuscule,Dogmes.Nature,Dogmes.Humain,Dogmes.Chaos,"Romtec est une Divinité individualiste, pour qui chaque être vivant doit garder son libre arbitre."));
		
		
		return tmp;
    }

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
    	
    	creationDivinite();
    	
	}
}
