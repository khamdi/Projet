package fr.utt.a16.lo02.projet;

import java.util.*;

public class Divinae {
	private boolean partieEnCours;
	private Joueur premierJoueur;
	private Origine origineTours;
	private int tour;
	public List<Joueur> joueurs;
	public List<Croyant> table;
	public List<Action> cimetiere;
	public Queue<Carte> paquet;
	public Map<String, Divinite> divinites;

	private Joueur jeu(){
		// TODO implement here
		return null;
	}
	
	private Origine lanceDee(){
        // TODO implement here
		return null;
	}
	
	private void donPtAction(){
        // TODO implement here

	}
	
	public void tour (Origine typeTour){
        // TODO implement here
	 
	}
	
	public void ajoutCarteTable(Croyant carte){
        // TODO implement here
	}
	
	public void retireCarteTable (Croyant carte){
        // TODO implement here

	}
	
    /**
     * @param carte 
     * @return
     */
    public void supprimeCarteTable(Croyant carte) {
        // TODO implement here
    }

    /**
     * @return
     */
    public void distributDivinite() {
        // TODO implement here
    }

    /**
     * @param joueur 
     * @return
     */
    public void distributCarteAction(Joueur joueur) {
        // TODO implement here
    }

}
