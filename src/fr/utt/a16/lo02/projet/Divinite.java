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
    private String description;

    /**
     * 
     */
    public List<Dogmes> dogmes;
    
  //pb   
    public static ArrayList<Divinite> creationDivinite(){
    	ArrayList<Divinite> tmp = new ArrayList<>();
    	int numCarte = DEBUTNUMCARTE;
    	
    	
    	
    	tmp.add(new Divinite(numCarte++,"Pui-Tara",Origine.Nuit,Dogmes.Nature,Dogmes.Mystique,Dogmes.Symnoles,"Pui-Tara est la divinit�sur laquelle l'influence de la nuit s'est faite la plus forte"));
    	tmp.add(new Divinite(numCarte++,"Llewella",Origine.Nuit,Dogmes.Nature,Dogmes.Mystique,Dogmes.Chaos,"Divinit� machiav�lique et manipulatrice,Llewella cherche � influencer et contr�ler ses ennemis."));
    	tmp.add(new Divinite(numCarte++,"Killinstred",Origine.Nuit,Dogmes.Nature,Dogmes.Mystique,Dogmes.Chaos,"Divinit� machiav�lique et manipulatrice, Killinstred cherche � influencer et contr�ler ses ennemis. "));
    	tmp.add(new Divinite(numCarte++,"Brewalen",Origine.Jour,Dogmes.Nature,Dogmes.Mystique,Dogmes.Humain,"Premier enfant du Jour, Brewalen cherche � repr�senter une certaine image de l'harmonie, et tente de mettre en place un statu quo entre les Divinit�s."));
    	tmp.add(new Divinite(numCarte++,"Drinded",Origine.Jour,Dogmes.Nature,Dogmes.Humain,Dogmes.Symnoles,"Defenseur des hommes, quelles que soient leurs croyances, Drinded prot�ge les chefs religieux"));
    	tmp.add(new Divinite(numCarte++,"Yarstur",Origine.Jour,Dogmes.Chaos,Dogmes.Mystique,Dogmes.Symnoles,"Dernier pur du jour, Yarstur combat le N�ant sous toutes ses formes."));
		tmp.add(new Divinite(numCarte++,"Gwenghelen",Origine.Aube,Dogmes.Chaos,Dogmes.Mystique,Dogmes.Symnoles,"Premi�re Divinit� � recevoir l'influence du N�ant, Gwenghelen est celle qui en a re�u le plus de puissance"));
		tmp.add(new Divinite(numCarte++,"Sbingva",Origine.Aube,Dogmes.Humain,Dogmes.Mystique,Dogmes.Chaos,"Perverse et retorse, Shingva est une Divinit� que toutes les autres d�testent"));
		tmp.add(new Divinite(numCarte++,"Gorpa",Origine.Crepuscule,Dogmes.Humain,Dogmes.Chaos,Dogmes.Symnoles,"Divinit� joueuse et espi�gle, Gorpa aime g�ner ses cons�urs dans leur recherche de puissance."));
		tmp.add(new Divinite(numCarte++,"Romtec",Origine.Crepuscule,Dogmes.Nature,Dogmes.Humain,Dogmes.Chaos,"Romtec est une Divinit� individualiste, pour qui chaque �tre vivant doit garder son libre arbitre."));
		
		
		return tmp;
    }

    /**
     * @param joueur 
     * @param carteApocalypste 
     * @return
     */
    public void capaciteBrawalen(Joueur joueur, Apocalypse carteApocalypste) {
//peut emp�cher l'utilisation d'une carte Apocalypse.La carte est d�fauss�e
    }

    /**
     * @param joueur 
     * @param carteGuide 
     * @return
     */
    public void capaciteShingva(Joueur joueur, Guide carteGuide) {
//Peut imposer le sacrifice d'un Guide Spirituel ayant le Dogme Symboles ou Nature
    }

    /**
     * @param joueur 
     * @return
     */
    public void capaciteLlewella(Joueur joueur) {
//Peut obliger un joueur � poser une carte Apocalypse s'il en poss�de une
    	if (joueur.main.contains(typeCarte.Apocalypse) == true) {
    		//Apocalypse.creation() ; chercher la carte et l'activer;
    	  }
    }

    /**
     * @param joueur 
     * @param carteGuide 
     * @return
     */
    public void capaciteDrinded(Joueur joueur, Guide carteGuide) {
//peut emp�cher le sacrifice d'un des Guides Spirituels de n'importe quel joueur
    }

    /**
     * @param joueur 
     * @return
     */
    public void capaciteGorpa(Joueur joueur) {
//Peut r�cup�rer les points d'Action d'une autre Divinit� en plus des siens. L'autre Divinit� ne
//re�oit aucun point d'Action ce tour-ci.
 
    }

    /**
     * @return
     */
    public void capacitePuiTara() {
//Peut d�truire toutes les cartes de Croyants au centre de la table d'Origine Jour
    }

    /**
     * @return
     */
    public void capaciteYarstur() {
//Peut d�truire toutes les cartes de Croyants au centre de la table d'Origine N�ant.
 Divinae.cimetiere.addAll(null);
    }

    /**
     * @param joueur 
     * @return
     */
    public void capaciteRomtec(Joueur joueur) {
//Peut emp�cher un jour de cr�er un Guide Spirituel. La carte est d�fauss�e
    }

    /**
     * @param joueur 
     * @return
     */
    public void capaciteGwenghelen(Joueur joueur) {
//R�cup�re autant de points d'Action suppl�mentaires d'Origine N�ant que le nombre de
//Guides Spirituels que la Divinit� poss�de.
joueur.action[2] += joueur.plateau.size();
    }

    /**
     * @param joueur 
     * @return
     */
    public void capaciteKillinstred(Joueur joueur) {
//peut obliger un joueur � poser une carte Apocalypse s'il en poss�de une.
if (joueur.main.contains(typeCarte.Apocalypse) == true) {
//	Apocalypse.apocalypse() ; Pareil 
  }
    }
    
    @Override
	public void activeCapacite() {
		// TODO Auto-generated method stub
		
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
