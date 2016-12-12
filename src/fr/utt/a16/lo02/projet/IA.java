package fr.utt.a16.lo02.projet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class IA extends Joueur {
	
	public IA(String nom) {
		super (nom, Joueur.Types.IA);
		this.typeIA = randTypeIA();
		this.cartesCroyants = new ArrayList<>();
		this.cartesGuides = new ArrayList<>();
		this.cartesDeusEx = new ArrayList<>();
		this.cartesApocalypses = new ArrayList<>();
	}
	
	private TypeIA typeIA;
	
	private ArrayList<Croyant> cartesCroyants;
	private ArrayList<Guide> cartesGuides;
	private ArrayList<DeusEx> cartesDeusEx;
	private ArrayList<Apocalypse> cartesApocalypses;
	
	
	private TypeIA randTypeIA(){
		switch(new Random().nextInt(3)){
			case 0:
				return TypeIA.Defensive;
			case 1:
				return TypeIA.Attaquante;
			default:
				return TypeIA.Mix;
		}
	}
	
	private void trieCartesMain(){
		Iterator it;
		Action carte;
		ArrayList<Action> defausse = new ArrayList<>();
		for(it = this.main.iterator(); it.hasNext();){
			carte = (Action) it.next();
			if (checkOrigine(carte.origine)){
				if (carte instanceof Croyant)
					this.cartesCroyants.add((Croyant) carte);
				else if (carte instanceof Guide)
					this.cartesGuides.add((Guide) carte);
				else if (carte instanceof DeusEx)
					this.cartesDeusEx.add((DeusEx) carte);
				else
					this.cartesApocalypses.add((Apocalypse) carte);
			}
			else 
				defausse.add(carte);
		}
		Divinae.cimetiere.addAll(defausse);
		this.main.removeAll(defausse);
	}
	
	private void trieCroyant(){
		this.cartesCroyants.sort((c1, c2) -> c1.getNbCroyant() - c2.getNbCroyant());
	}
	
	private void trieGuide(){
		this.cartesGuides.sort((g1, g2) -> g1.getMaxCroyant() - g2.getMaxCroyant());
	}
	
	private boolean checkJoueable(Origine o){
		if(o == Origine.Vide || action[o.ordinal()] > 0){
			if (o != Origine.Vide)
				action[o.ordinal()] --;
			return true;
		}
		return false;
	}
	
	private void joueGuide(){
		Iterator it;
		Guide g;
		Croyant c;
		ArrayList<Guide> defausse = new ArrayList<>();
		
		if(this.encorePtAction()){
			for(it = this.cartesGuides.iterator(); it.hasNext();){
				g = (Guide) it.next();
				if(this.checkJoueable(g.origine)){
					
					Divinae.trieTable();
					ArrayList<Croyant> croyants = new ArrayList<>();
					for (it = Divinae.table.iterator(); it.hasNext() && croyants.size() < g.getMaxCroyant();){
						c = (Croyant) it.next();
						for (Dogmes d : g.dogmes)
							if(c.dogmes.contains(d)){
								croyants.add(c);
								c.setLie(true);
							}
					}
					g.ajoutCroyant(croyants);
					Divinae.table.removeAll(croyants);
					defausse.add(g);
					this.plateau.add(g);
					System.out.println(this.getNom() + " joue le Guide " + g );
					Divinae.checkJeuImediat();
					Divinae.setJoueurCourant(this);
				}
			}
			this.cartesGuides.removeAll(defausse);
			this.main.removeAll(defausse);
		}
	}
	
	private void joueCroyant(){
		Iterator it;
		Croyant c;
		ArrayList<Croyant> defausse = new ArrayList<>();
		if (this.encorePtAction()){
			for (it = this.cartesCroyants.iterator(); it.hasNext();){
				c = (Croyant) it.next();
				if (this.checkJoueable(c.origine)){
					defausse.add(c);
					System.out.println(this.getNom() + " joue le Croyant " + c);
					Divinae.checkJeuImediat();
					Divinae.setJoueurCourant(this);
					c.jouerCarteAction();
				}
			}
			this.cartesCroyants.removeAll(defausse);
			this.main.removeAll(defausse);
		}
	}
	
	private void joueDeusEx(){
		Iterator it;
		DeusEx d;
		ArrayList<DeusEx> deusExs = new ArrayList<>();
		
		if (this.encorePtAction()){
			for(it = this.cartesDeusEx.iterator(); it.hasNext();){
				d = (DeusEx) it.next();
				if (checkJoueable(d.origine)){
					deusExs.add(d);
					System.out.println(this.getNom() + " joue le Deus Ex " + d);
					Divinae.checkJeuImediat();
					Divinae.setJoueurCourant(this);
					d.jouerCarteAction();
				}
			}
			this.cartesDeusEx.removeAll(deusExs);
			this.main.removeAll(deusExs);
		}
	}
	
	private boolean checkOrigine(Origine o){
		switch(o){
			case Jour:
				if (this.divinite.origine == Origine.Jour || this.divinite.origine == Origine.Aube)
					return true;
				return false;
			case Nuit:
				if (this.divinite.origine == Origine.Nuit ||this.divinite.origine == Origine.Crepuscule)
					return true;
				return false;
			case Neant:
				if (this.divinite.origine == Origine.Aube || this.divinite.origine == Origine.Crepuscule)
					return true;
				return false;
			default:
				return true;
		}
			
	}
	
	private void checkApocalypse(){
		Iterator it;
		Apocalypse a;
		if (this.checkGagnant() && this.cartesApocalypses.size() > 0 && Divinae.getNbTours() > 1 && !Divinae.getApocalypseLance()){
			for(it = this.cartesApocalypses.iterator(); it.hasNext();){
				a = (Apocalypse) it.next();
				if (this.checkJoueable(a.origine)){
					it.remove();
					System.out.println(this.getNom() + " joue l'Apocalypse " + a);
					Divinae.checkJeuImediat();
					Divinae.setJoueurCourant(this);
					a.jouerCarteAction();
				}
			}
		}
	}
	
	private void defausseDefensive(){
		Iterator it;
		DeusEx d;
		ArrayList<DeusEx> deusExs = new ArrayList<>();
		
		Divinae.setJoueurCourant(this);
		for(it = this.cartesDeusEx.iterator(); it.hasNext();){
			d = (DeusEx) it.next();
			deusExs.add(d);
		}
		System.out.println(this.getNom() + " se defausse de ses DeusExs");
		this.cartesDeusEx.removeAll(deusExs);
		this.main.removeAll(deusExs);
		Divinae.cimetiere.addAll(deusExs);
	}
	
	private void defausseAttaquante(){
		Croyant c;
		Guide g;
		
		Divinae.setJoueurCourant(this);
		if (this.cartesCroyants.size() > 1){
			this.trieCroyant();
			c = this.cartesCroyants.remove(this.cartesCroyants.size() - 1);
			System.out.println(this.getNom() + " se defausse de son Croyant " + c);
			Divinae.cimetiere.add(this.main.remove(this.main.indexOf(c)));
		}
		
		if (this.cartesGuides.size() > 1){
			this.trieGuide();
			g = this.cartesGuides.remove(this.cartesGuides.size() - 1);
			System.out.println(this.getNom() + " se defausse de son Guide " + g);
			Divinae.cimetiere.add(this.main.remove(this.main.indexOf(g)));
		}
		
	}
	
	private void joueDefensive(){
		this.trieCroyant();
		this.trieGuide();
		
		this.checkApocalypse();

		this.joueGuide();
		
		this.joueCroyant();
		
		this.checkApocalypse();
	}
	
	private void joueAttaquante(){
		Iterator it;
		Guide g;
		Croyant c;
		ArrayList<Guide> defausse = new ArrayList<>();
		boolean joue = false;
		
		this.trieCroyant();
		this.trieGuide();
		
		this.checkApocalypse();
		
		this.joueDeusEx();
		
		for(it = this.cartesGuides.iterator(); it.hasNext() && joue == false;){
			g = (Guide) it.next();
			if (this.checkJoueable(g.origine)){
				joue = true;
				Divinae.trieTable();
				ArrayList<Croyant> croyants = new ArrayList<>();
				for (it = Divinae.table.iterator(); it.hasNext() && croyants.size() < g.getMaxCroyant();){
					c = (Croyant) it.next();
					for (Dogmes d : g.dogmes)
						if(c.dogmes.contains(d))
							croyants.add(c);
				}
				g.ajoutCroyant(croyants);
				Divinae.table.removeAll(croyants);
				this.plateau.add(g);
				System.out.println(this.getNom() + " joue le Guide " + g );
				Divinae.setJoueurCourant(this);
				Divinae.checkJeuImediat();
			}
			defausse.add(g);
		}
		if (joue){
			this.cartesGuides.removeAll(defausse);
			this.main.removeAll(defausse);
		}
		this.checkApocalypse();
	}
	
	private void activeAttaquante(){
		Iterator it;
		Guide g;
		Croyant c;
		boolean sacrifie = false;
		
		ArrayList<Guide> defausseGuides = new ArrayList<>();
		ArrayList<Croyant> defausseCroyant = new ArrayList<>();
		
		Divinae.setJoueurCourant(this);
		if (this.encorePtAction()){
			this.trieGuide();
			for(it = this.cartesGuides.iterator(); it.hasNext() && !sacrifie;){
				g = (Guide) it.next();
				if (this.checkJoueable(g.origine)){
					sacrifie = true;
					defausseGuides.add(g);
					System.out.println(this.getNom() + " sacrifie et active le Guide " + g);
					Divinae.checkJeuImediat();
					Divinae.setJoueurCourant(this);
					g.activeCapacite();
					
				}
			}
			this.cartesGuides.removeAll(defausseGuides);
			this.main.removeAll(defausseGuides);
		}
		if (this.encorePtAction() && !sacrifie){
			this.trieCroyant();
			for (it = this.cartesCroyants.iterator(); it.hasNext() && !sacrifie;){
				c = (Croyant) it.next();
				if (this.checkJoueable(c.origine)){
					sacrifie = true;
					defausseCroyant.add(c);
					System.out.println(this.getNom() + " sacrifie et active le Croyant " + c);
					Divinae.checkJeuImediat();
					Divinae.setJoueurCourant(this);
					c.activeCapacite();
				}
			}
			this.cartesCroyants.removeAll(defausseCroyant);
			this.main.removeAll(defausseCroyant);
		}
	}
	
	@Override
	public void defausse() {
		Divinae.setJoueurCourant(this);
		switch (this.typeIA){
			case Defensive:
				this.defausseDefensive();
				break;
			case Attaquante:
				this.defausseAttaquante();
				break;
			default:
				if((new Random().nextBoolean()))
					this.defausseDefensive();
				else
					this.defausseAttaquante();
				break;
		}
		
	}

	@Override
	public void jouerCarte() {
		Divinae.setJoueurCourant(this);
		switch (this.typeIA){
		case Defensive:
			this.joueDefensive();
			break;
		case Attaquante:
			this.joueAttaquante();
			break;
		default:
			if((new Random().nextBoolean()))
				this.joueDefensive();
			else
				this.joueAttaquante();
			break;
	}
		
	}

	@Override
	public void activeCarte() {
		Divinae.setJoueurCourant(this);
		switch (this.typeIA){
		case Defensive:
			break;
		case Attaquante:
			this.activeAttaquante();
			break;
		default:
			if(!(new Random().nextBoolean()))
				this.activeAttaquante();
			break;
	}
		
	}

	@Override
	public void piocheMain(Joueur joueur, int nbCarte) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void remplirMain() {
		super.remplirMain();
		this.trieCartesMain();
	}

	@Override
	public void tourJoueur() {
		Divinae.setJoueurCourant(this);
		
		this.trieCartesMain();
		System.out.println("Tours de " + this.getNom());
		
		System.out.println("Defausse");
		this.defausse();
		
		System.out.println("Remplis la main");
		this.remplirMain();
		
		System.out.println("Joue");
		this.jouerCarte();
		
		System.out.println("sacrifie");
		this.activeCarte();
	}
	
	@Override
	public void joueCarteImediat() {
		Iterator it;
		Apocalypse a;
		ArrayList<Apocalypse> defausse = new ArrayList<>();
		boolean continu = false;
		
		if (Divinae.getApocalypseLance()){
			for (it = this.cartesApocalypses.iterator(); it.hasNext() && !continu;){
				a = (Apocalypse) it.next();
				if (this.checkJoueable(a.origine) && !continu){
					a.jouerCarteAction();
					defausse.add(a);
					continu = true;
				}
			}
			this.cartesApocalypses.removeAll(defausse);
			this.main.removeAll(defausse);
//			Divinae.cimetiere.addAll(defausse);
		}
	};
	
	public void gestionCapacite(){
		// TODO Implemente here
	}
	
	private boolean gestionCapaciteDivinite(){
		// TODO
		return false;
	}
	
	private boolean gestionCapaciteAction(){
		// TODO
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("IA - ");
		sb.append(super.toString());
		return sb.toString();
	}
	
	enum TypeIA {
		Defensive,
		Attaquante,
		Mix
	}

	

}
