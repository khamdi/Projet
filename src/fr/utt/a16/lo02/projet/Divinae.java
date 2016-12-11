package fr.utt.a16.lo02.projet;

import java.util.*;


public class Divinae {
	private boolean partieEnCours;
	private Joueur premierJoueur;
	private Origine origineTours;
	private static int tour;
	public static List<Joueur> joueurs;
	public static List<Croyant> table;
	public static List<Action> cimetiere;
	public static Queue<Action> paquet;
	
	
	public Divinae(int nbJoueursR, int nbJoueursIA) {
		this.partieEnCours = true;
		this.origineTours = lanceDee();
		this.tour = 0;
		Divinae.joueurs = new ArrayList<>();
		Divinae.joueurs.addAll(creationJoueurs(nbJoueursR, nbJoueursIA));
		this.premierJoueur = Divinae.joueurs.get(0);
		Divinae.table = new ArrayList<>();
		Divinae.cimetiere = new ArrayList<>();
		Divinae.paquet = new LinkedList<>();
		Divinae.paquet.addAll(creationPaquet());
		//fait dans jeu
		this.distributDivinite();
		this.distributCarteAction();
	}
	
	public static int getNbTours(){
		return Divinae.tour;
	}
	
	public static void addCimetiere(Action carte){
		cimetiere.add(carte);
	}
	
	public static void trieTable(){
		table.sort((c1, c2) -> c1.getNbCroyant() - c2.getNbCroyant());
	}

	private ArrayList<Joueur> creationJoueurs(int nbJoueursR, int nbJoueursIA) {
		ArrayList<Joueur> tmp = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= nbJoueursR; i++){
			System.out.println("Quel nom pour le joueur " + i + " ?" );
			tmp.add(new JoueurReel(sc.nextLine()));
		}
		
		for (int i = 1; i <= nbJoueursIA; i++){
			tmp.add(new IA("Cyborg" + i));
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
//		System.out.println(tmp.size());
		return tmp;
	}
	
	private Joueur jeu(){
		this.distributDivinite();
		this.distributCarteAction();
		
		while (this.partieEnCours){
			this.origineTours = lanceDee();
			this.trieJoueur();
			this.donPtAction();
			this.tour ++;
			this.tour();
		}
		return null;
	}

	private static Origine lanceDee(){
		switch(new Random().nextInt(3)){
			case 0 :
				return Origine.Jour;
			case 1 :
				return Origine.Nuit;
			default :
				return Origine.Neant;
		}
	}
	
	private void trieJoueur(){
		int i;
		int j = Divinae.joueurs.indexOf(this.premierJoueur);
		ArrayList<Joueur> tmp = new ArrayList<>();
		for(i = 0; i < Divinae.joueurs.size();i++){
			if (j + i < Divinae.joueurs.size())
				tmp.add(i, Divinae.joueurs.get(j + i) );
			else{
				j = -i;
				tmp.add(i, Divinae.joueurs.get(j + i) );
			}
		}
		Divinae.joueurs = tmp;
	}
	
	//pas finis 
	private void donPtAction(){
		Iterator<Joueur> it = Divinae.joueurs.iterator();
		Joueur j;
		for (; it.hasNext();){
			j = it.next();
			switch (this.origineTours){
				case Jour :
					if (j.divinite.origine == Origine.Jour)
						j.action[Origine.Jour.ordinal()] = 2;
					else if (j.divinite.origine == Origine.Aube)
						j.action[Origine.Jour.ordinal()] = 1;
					
					break;
				case Nuit :
					if (j.divinite.origine == Origine.Nuit)
						j.action[Origine.Nuit.ordinal()] = 2;
					else if (j.divinite.origine == Origine.Crepuscule)
						j.action[Origine.Nuit.ordinal()] = 1;
					
					break;
				default :
					if (j.divinite.origine == Origine.Aube || j.divinite.origine == Origine.Crepuscule)
						j.action[Origine.Neant.ordinal()] = 1;
					break;
			}
		}
	}
	
	public void tour (){
		Iterator itJoueur = Divinae.joueurs.iterator();
		System.out.println("Nous somme en tour d'origine : " + this.origineTours);
		this.donPtAction();
		for (;itJoueur.hasNext();){
			Joueur j = (Joueur) itJoueur.next();
			j.tourJoueur();
		}
	}
	
	public void ajoutCarteTable(Croyant carte){
		if (!Divinae.table.add(carte));
			System.out.println("Erreur d'ajout de " + carte + " dans la table");
	}
	
	public void retireCarteTable (Croyant carte){
		if (!Divinae.table.remove(carte))
			System.out.println("Erreur de suppression de " + carte + " dans la table");
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
    	for (it = Divinae.joueurs.iterator(); it.hasNext(); ){
    		Joueur j = it.next();
    		j.divinite = div.remove(new Random().nextInt(div.size()));
    	}
    }

    /**
     * @param joueur 
     * @return
     */
    public void distributCarteAction() {
    	
    	for (int i = 0; i < 7; i++){
    		for (Iterator<Joueur> it = Divinae.joueurs.iterator(); it.hasNext();){
    			Joueur j = it.next();
    			j.main.add(piocherCarte());
    		}
    	}
    }
    
    public static Action piocherCarte() {
		if(!paquet.isEmpty()){
			Action carte = paquet.poll();
			carte.setEnMain();
			return carte;
		}
			
		return null;
	}
    
    public static void main(String[] args) {
    	Divinae d = new Divinae(0,3);
//    	System.out.println(d.paquet);
    	System.out.println(Divinae.joueurs);
//    	for (Joueur j : d.joueurs){
//    		System.out.println(j.main);
//    	}
//    	System.out.println(d.paquet.size());
    	d.tour();
    
    }

	

}
