package fr.utt.a16.lo02.projet;

import java.util.*;

public class Guide extends Personnage {
	/**
     * Default constructor
     */
    public Guide(int numCarte, String nomCarte, Origine origine, Dogmes dogme1, Dogmes dogme2,int maxCroyant) {
        super(numCarte, nomCarte, TypesCartes.Guide, origine, dogme1, dogme2);
        // TODO Auto-generated constructor stub
        this.maxCroyant = maxCroyant;
        this.croyants = new ArrayList<Croyant>();
    }
    
    private int maxCroyant;
    
    private static int DEBUTNBCARTE = 300;
    
    
    /**
     * 
     */
    public List<Croyant> croyants;
    
    public int getMaxCroyant(){
    	return this.maxCroyant;
    }

    /**
     * @param return
     */
    public void jouerGuide() {
        // TODO implement here
    }
    
    public static LinkedList<Guide> creationGuide(){
    	LinkedList<Guide> tmp = new LinkedList<>();
    	int numCarte = DEBUTNBCARTE;
    	
    	//Martyr
    	tmp.add(new Guide(numCarte++,"Martyr",Origine.Jour,Dogmes.Nature,Dogmes.Humain,2));
    	tmp.add(new Guide(numCarte++,"Martyr",Origine.Nuit,Dogmes.Symnoles,Dogmes.Humain,2));
    	tmp.add(new Guide(numCarte++,"Martyr",Origine.Neant,Dogmes.Nature,Dogmes.Chaos,2));
    	
    	//Clerc
    	tmp.add(new Guide(numCarte++,"Clerc",Origine.Jour,Dogmes.Chaos,Dogmes.Humain,2));
    	tmp.add(new Guide(numCarte++,"Clerc",Origine.Nuit,Dogmes.Nature,Dogmes.Symnoles,2));
    	tmp.add(new Guide(numCarte++,"Clerc",Origine.Neant,Dogmes.Nature,Dogmes.Mystique,2));
    	tmp.add(new Guide(numCarte++,"Clerc",Origine.Jour,Dogmes.Nature,Dogmes.Chaos,2));
    	tmp.add(new Guide(numCarte++,"Clerc",Origine.Nuit,Dogmes.Symnoles,Dogmes.Mystique,2));
    	tmp.add(new Guide(numCarte++,"Clerc",Origine.Neant,Dogmes.Chaos,Dogmes.Symnoles,2));
    	tmp.add(new Guide(numCarte++,"Clerc",Origine.Jour,Dogmes.Mystique,Dogmes.Chaos,2));
    	tmp.add(new Guide(numCarte++,"Clerc",Origine.Nuit,Dogmes.Nature,Dogmes.Humain,2));
    	
    	//Shaman
    	tmp.add(new Guide(numCarte++,"Shaman ",Origine.Nuit,Dogmes.Nature,Dogmes.Symnoles,3));
    	
    	//Anarchiste
    	tmp.add(new Guide(numCarte++,"Anarchiste",Origine.Neant,Dogmes.Chaos,Dogmes.Humain,3));
    	
    	//Paladin
    	tmp.add(new Guide(numCarte++,"Paladin",Origine.Jour,Dogmes.Mystique,Dogmes.Humain,3));
    	
    	//Asc�te
    	tmp.add(new Guide(numCarte++,"Asc�te",Origine.Nuit,Dogmes.Symnoles,Dogmes.Humain,1));
    	
    	//Devin
    	tmp.add(new Guide(numCarte++,"Devin",Origine.Neant,Dogmes.Nature,Dogmes.Mystique,1));
    	
    	//Exorciste
    	tmp.add(new Guide(numCarte++,"Exorciste",Origine.Jour,Dogmes.Chaos,Dogmes.Mystique,2));
    	
    	//Sorcier
    	tmp.add(new Guide(numCarte++,"Sorcier",Origine.Nuit,Dogmes.Symnoles,Dogmes.Mystique,3));
    	
    	//Tyran
    	tmp.add(new Guide(numCarte++,"Tyran",Origine.Neant,Dogmes.Chaos,Dogmes.Symnoles,3));
    	
    	//Messie
    	tmp.add(new Guide(numCarte++,"Messie",Origine.Jour,Dogmes.Mystique,Dogmes.Humain,3));
    	
    	return tmp;
    }

    @Override
	public void jouerCarteAction() {
    	
	}
    
    
    /**
     * @param croyants 
     * @return
     */
    public void ajoutCroyant(List<Croyant> croyants) {
        this.croyants.addAll(croyants);
    }

    /**
     * @return
     */
    public Croyant retirerCroyant(Croyant croyant) {
        return this.croyants.remove(this.croyants.indexOf(croyant));
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
