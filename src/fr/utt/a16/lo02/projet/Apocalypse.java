package fr.utt.a16.lo02.projet;

import java.util.LinkedList;

public class Apocalypse extends Action {
	/**
     * Default constructor
     */
    public Apocalypse(int numCarte, String nomCarte, Origine origine) {
        super(numCarte, nomCarte, origine, TypesCartes.Apocalypse);
        // TODO Auto-generated constructor stub
    }
    
    private static int DEBUTNBCARTE = 100;

    /**
     * @param return
     */
    public void apocalypse() {
        // TODO implement here
    }
    
    public static LinkedList<Apocalypse> creationApocalypse(){
    	LinkedList<Apocalypse> tmp = new LinkedList<>();
    	int nbCarte = DEBUTNBCARTE;
    	
    	tmp.add(new Apocalypse (nbCarte++,"Apocalypse",Origine.Jour));
    	tmp.add(new Apocalypse (nbCarte++,"Apocalypse",Origine.Nuit));
    	tmp.add(new Apocalypse (nbCarte++,"Apocalypse",Origine.Neant));
    	tmp.add(new Apocalypse (nbCarte++,"Apocalypse",null));
    	tmp.add(new Apocalypse (nbCarte++,"Apocalypse",null));	
    	
    	return tmp;
    }

    public String toString() {
        return super.toString();
    };
    public static void main(String[] args) {
//        Apocalypse a1 = new Apocalypse (85,"Apocalypse",Origine.Jour,typeCarte,false);
//        Apocalypse a2 = new Apocalypse (86,"Apocalypse",Origine.Nuit,typeCarte,false);
//        Apocalypse a3 = new Apocalypse (87,"Apocalypse",Origine.Neant,typeCarte,false);
//        Apocalypse a4 = new Apocalypse (88,"Apocalypse",null,typeCarte,false);
//        Apocalypse a5 = new Apocalypse (89,"Apocalypse",null,typeCarte,false);  
        
//        System.out.println(a5);
    }
}
