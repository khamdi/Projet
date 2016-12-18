package fr.utt.a16.lo02.projet;

import java.util.Iterator;
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
    @Override
    public void jouerCarteAction() {
    	Iterator it;
    	Joueur j, dernier, premier;
    	
    	
    	if (Divinae.getApocalypseLance()){
    		Divinae.cimetiere.add(this);
    		Divinae.setPremierJoueur(Divinae.getJoueurCourant());
    	}
    	
    	Divinae.setApocalypseLance(true);
    	for (it = Divinae.joueurs.iterator(); it.hasNext();){
    		j = (Joueur) it.next();
    		j.calculerPriere();
    	}
    	
    	premier = Divinae.joueurs.get(Divinae.joueurs.size() - 1);
    	dernier = Divinae.joueurs.get(0);
    	
    	for(it = Divinae.joueurs.iterator(); it.hasNext();){
    		j = (Joueur) it.next();
    		System.out.println(j.getNom() + " " + j.nbPriere);
    		if (j.nbPriere < dernier.nbPriere)
    			dernier = j;
    		if (j.nbPriere > premier.nbPriere)
    			premier = j;
    	}
    	
    	if (Divinae.joueurs.size() < 4){
    		Divinae.setJoueurGangnant(premier);
    	}
    	else {
    		Divinae.cimetiere.addAll(dernier.main);
    		Divinae.cimetiere.addAll(dernier.plateau);
    		Divinae.joueurs.remove(dernier);
    		System.out.println("Le joueur " + dernier.getNom() + " est éliminé de la partie.");
    	}
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
}
