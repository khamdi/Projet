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
    	if (Divinae.getApocalypseLance()){
    		Divinae.cimetiere.add(this);
    		Divinae.setPremierJoueur(Divinae.getJoueurCourant());
    	}
    int points[] = null;
    // calcul du nombre de joueurs
    int nbJoueur = Divinae.joueurs.size();
    //On stocke les points de pri�re dans un tableau
    Iterator<Joueur> it = Divinae.joueurs.iterator();
	for (int i = 0; i < nbJoueur; i++){
		for (Joueur j = it.next(); it.hasNext(); j = it.next()){
			points[i] = j.nbPriere ;
		}
	}
	
    if (nbJoueur < 4) {//4 joueurs ou plus : on �limine le joueur avec le moins de pri�re
    // calcul la valeur la plus grande du tableau
    	int min = points[0]; // va r�cup�rer la valeur la plus petite du tableau
    	int j = 0; // va r�cup�rer l'endoit o� se situe cette valeur
    	for (int i = 0; i < nbJoueur; i++) {
    	if (points[i] < min) {
    		min = points[i];
    		j = i ; 
    		}
    	}
    	System.out.println("Le joueur " + Divinae.joueurs.get(j) + " a remport� la partie !" );
    	Divinae.setJoueurGangnant(Divinae.joueurs.get(j));
    	Divinae.setPartieEnCours(false);
    }	
    	else{//3 joueurs ou moins : le joueur ayant le plus de pts de pri�re gagne la partie
    		// calcul la valeur la plus petite du tableau  
    		int max = points[0]; //va recup�rer la valeur max du tableau
    		int j = 0 ; //va r�cup�rer l'endoit o� se situe cette valeur
    		for (int i = 0; i < nbJoueur; i++) {
    		if (points[i] > max) {
    			max = points[i];
    			 j = i ;    			
    		}
    		}
    	System.out.println("Le joueur " + Divinae.joueurs.get(j) + " est éliminé0 de la partie !" );
    	Divinae.joueurs.remove(j) ; //supprime le joueur
    	}
    	Divinae.setApocalypseLance(true);
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

}
