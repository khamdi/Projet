package fr.utt.a16.lo02.projet;

import java.util.LinkedList;
import java.util.List;


public class Apocalypse extends Action {
	/**
     * Default constructor
     */
    public Apocalypse(int numCarte, String nomCarte, Origine origine) {
        super(numCarte, nomCarte, origine, TypesCartes.Apocalypse);
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
    	tmp.add(new Apocalypse (nbCarte++,"Apocalypse",Origine.Vide));
    	tmp.add(new Apocalypse (nbCarte++,"Apocalypse",Origine.Vide));	
    	return tmp;
    }

    public String toString() {
        return super.toString();
    };
    public static void main(String[] args) {
    	creationApocalypse();
    }

	@Override
	public void jouerCarteAction() {
		// TODO Auto-generated method stub
		
	}
}
