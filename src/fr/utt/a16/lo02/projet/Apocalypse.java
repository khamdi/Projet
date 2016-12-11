package test;

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
    public void apocalypse() {
    int points[] = null;
    // calcul du nombre de joueurs
    int nbJoueur = Divinae.joueurs.size();
    //On stocke les points de prière dans un tableau
    Iterator<Joueur> it = Divinae.joueurs.iterator();
	for (int i = 0; i < nbJoueur; i++){
		for (Joueur j = it.next(); it.hasNext(); j = it.next()){
			points[i] = j.nbPriere ;
		}
	}
	
    if (nbJoueur < 4) {//4 joueurs ou plus : on élimine le joueur avec le moins de prière
    // calcul la valeur la plus grande du tableau
    	int min = points[0]; // va récupérer la valeur la plus petite du tableau
    	int j = 0; // va récupérer l'endoit où se situe cette valeur
    	for (int i = 0; i < nbJoueur; i++) {
    	if (points[i] < min) {
    		min = points[i];
    		j = i ; 
    		}
    	}
    	System.out.println("Le joueur " + Divinae.joueurs.get(j) + " a remporté la partie !" );
    	Divinae.partieEnCours = false ;
    }	
    	else{//3 joueurs ou moins : le joueur ayant le plus de pts de prière gagne la partie
    		// calcul la valeur la plus petite du tableau  
    		int max = points[0]; //va recupérer la valeur max du tableau
    		int j = 0 ; //va récupérer l'endoit où se situe cette valeur
    		for (int i = 0; i < nbJoueur; i++) {
    		if (points[i] > max) {
    			max = points[i];
    			 j = i ;    			
    		}
    		}
    	System.out.println("Le joueur " + Divinae.joueurs.get(j) + " est éliminé de la partie !" );
    	Divinae.joueurs.remove(j) ; //supprime le joueur
    	}
    
    }
        // TODO implement here
    
    
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
