package fr.utt.a16.lo02.projet;

import java.util.*;

public class Personnage extends Action {
	/**
     * Default constructor
     */
    public Personnage(int numCarte, String nomCarte,TypesCartes typeCarte, Origine origine,Dogmes dogme1,Dogmes dogme2) {
		super(numCarte, nomCarte, origine, typeCarte);
		// TODO Auto-generated constructor stub
		this.dogmes = new ArrayList<>();
    	this.dogmes.add(dogme1);
    	this.dogmes.add(dogme2);
	}

	public String toString() {
    	return super.toString() +" "+ this.dogmes ;
    }
    /**
     * 
     */
    public List<Dogmes> dogmes;
}
