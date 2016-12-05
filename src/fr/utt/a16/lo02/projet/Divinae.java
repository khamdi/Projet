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
	public Queue<Action> paquet;
	
	
	public Divinae(int nbJoueursR, int nbJoueursIA) {
		this.partieEnCours = true;
		this.origineTours = lanceDee();
		this.tour = 0;
		this.joueurs = new ArrayList<>();
		this.joueurs.addAll(creationJoueurs(nbJoueursR, nbJoueursIA));
		this.table = new ArrayList<>();
		this.cimetiere = new ArrayList<>();
		this.paquet = new LinkedList<>();
		this.paquet.addAll(creationPaquet());
	}

	private ArrayList<Joueur> creationJoueurs(int nbJoueursR, int nbJoueursIA) {
		ArrayList<Joueur> tmp = new ArrayList<>();
		
		for(int i = 0; i < nbJoueursR; i++){
			
		}
		
		for (int i = 0; i < nbJoueursIA; i++){
			
		}
		
		
		return tmp;
	}

	private static LinkedList<Action> creationPaquet (){
		LinkedList<Action> tmp = new LinkedList<>();
		
		tmp.addAll(Croyant.creationCroyant());
		tmp.addAll(Guide.creationGuide());
		tmp.addAll(Apocalypse.creationApocalypse());
		tmp.addAll(DeusEx.creationDeusEx());
		
		Collections.shuffle(tmp);
		
		return tmp;
	}
	
	private Joueur jeu(){
		// TODO implement here
		return null;
	}
	//change
	private static Origine lanceDee(){
		Origine[] origines = Origine.values(); 
		return origines[(new Random()).nextInt(origines.length)];
	}
	
	//pas finis 
	private void donPtAction(){
		Iterator<Joueur> it = this.joueurs.iterator();
		
		for (Joueur j = it.next(); it.hasNext(); j = it.next()){
			switch (this.origineTours){
				case Jour : 
					switch (j.divinite.origine){
						case Jour : 
							j.action = 2;
							break;
						case Neant :
							j.action = 1;
					}
			}
		}
	}
	
	public void tour (Origine typeTour){
		this.tour ++;
		this.origineTours = lanceDee();
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
    	ArrayList <Divinite> div = new ArrayList<>();
    	div.addAll(Divinite.creationDivinite());
    	Iterator<Joueur> it;
    	for (it = this.joueurs.iterator(); it.hasNext(); ){
    		Joueur j = it.next();
    		j.divinite = div.remove(new Random().nextInt(div.size()));
    	}
    }

    /**
     * @param joueur 
     * @return
     */
    public void distributCarteAction(Joueur joueur) {
    	Iterator<Joueur> it = this.joueurs.iterator();
    	for (Joueur j = it.next(); it.hasNext(); j = it.next()){
    		for (int i = 0; i < 7; i++){
    			j.main.add(this.paquet.poll());
    		}
    	}
    }
    
    public static void main(String[] args) {
    	Divinae d = new Divinae(2, 0);
    	System.out.println(lanceDee());
    	System.out.println(d.paquet);
	}

}
