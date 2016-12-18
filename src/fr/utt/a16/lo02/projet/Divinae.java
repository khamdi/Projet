package fr.utt.a16.lo02.projet;

import java.util.*;


public class Divinae {
	private static boolean partieEnCours;
	private static Joueur premierJoueur;
	private static Origine origineTours;
	private static int tour;
	private static boolean apocalypseLance;
	private static int tourApocalypseLance;
	private static Joueur joueurGagnant;
	private static Joueur joueurCourant;
	public static List<Joueur> joueurs;
	public static List<Croyant> table;
	public static List<Action> cimetiere;
	public static Queue<Action> paquet;
	
	
	public Divinae(int nbJoueursR, int nbJoueursIA) {
		setPartieEnCours(true);
		origineTours = lanceDee();
		tour = 0;
		Divinae.joueurs = new ArrayList<>();
		Divinae.joueurs.addAll(creationJoueurs(nbJoueursR, nbJoueursIA));
		premierJoueur = Divinae.joueurs.get(0);
		Divinae.tourApocalypseLance = -1;
		Divinae.apocalypseLance = false;
		Divinae.table = new ArrayList<>();
		Divinae.cimetiere = new ArrayList<>();
		Divinae.paquet = new LinkedList<>();
		Divinae.paquet.addAll(creationPaquet());
		//fait dans jeu
//		this.distributDivinite();
//		this.distributCarteAction();
	}
	
	public static boolean getApocalypseLance(){
		return apocalypseLance;
	}
	
	public static void setApocalypseLance(boolean apocalypse){
		apocalypseLance = apocalypse;
		tourApocalypseLance = tour;
	}
	
	public static Joueur getJoueurCourant(){
		return joueurCourant;
	}
	
	public static void setOrigineTour(Origine o){
		origineTours = o;
	}
	
	public static void setJoueurCourant(Joueur courant){
		joueurCourant = courant;
	}
	
	public static void setPremierJoueur(Joueur premier){
		premierJoueur = premier;
	}
	
	public static void setJoueurGangnant (Joueur gagnant){
		partieEnCours = false;
		joueurGagnant = gagnant;
	}
	
	public boolean isPartieEnCours() {
		return partieEnCours;
	}

	public static void setPartieEnCours(boolean partie) {
		partieEnCours = partie;
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
		return tmp;
	}
	
	private void resetAttributs(){
		origineTours = lanceDee();
		this.trieJoueur();
		this.donPtAction();
		if (getApocalypseLance() && tourApocalypseLance > (tour + 1))
			setApocalypseLance(false);
		if (paquet.size() == 0){
			paquet = creationPaquet();
			cimetiere.clear();
		}
		tour ++;
	}
	
	private Joueur jeu(){
		this.distributDivinite();
		this.distributCarteAction();
		
		while (this.isPartieEnCours()){
			this.resetAttributs();
			this.tour();
		}
		return joueurGagnant;
	}

	public static Origine lanceDee(){
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
		int j = Divinae.joueurs.indexOf(premierJoueur);
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
		premierJoueur = Divinae.joueurs.get(0);
	}

	private void donPtAction(){
		Iterator<Joueur> it = Divinae.joueurs.iterator();
		Joueur j;
		for (; it.hasNext();){
			j = it.next();
			switch (origineTours){
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
	
	public static void checkJeuImediat(){
		Iterator it;
		Joueur j, jCourant;
		jCourant = getJoueurCourant();
		for (it = joueurs.iterator(); it.hasNext(); ){
			j = (Joueur) it.next();
			if (!jCourant.equals(j))
				j.joueCarteImediat();
		}
			
	}
	
	public void tour (){
		Iterator itJoueur = Divinae.joueurs.iterator();
		System.out.println("Nous somme en tour d'origine : " + origineTours);
		for (;itJoueur.hasNext();){
			if (apocalypseLance)
				break;
			if (!partieEnCours)
				return;
			Joueur j = (Joueur) itJoueur.next();
			joueurCourant = j;
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
		if(paquet.isEmpty())
			paquet = creationPaquet();
		Action carte = paquet.poll();
		carte.setEnMain();
		return carte;
	}
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int reel, ia;
    	System.out.println("Combien de joueur Reel voulez vous pour la partie ?");
    	reel = sc.nextInt();
    	System.out.println("Combien de joueur Virtuel (IA) voulez vous pour la partie ?");
    	ia = sc.nextInt();
    	Divinae d = new Divinae(reel,ia);
    	d.jeu();
    	System.out.println("Le gagnant est : ");
    	System.out.println(joueurGagnant + " felicitation!");
    }

	

}
