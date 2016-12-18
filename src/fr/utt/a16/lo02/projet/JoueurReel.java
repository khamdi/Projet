package fr.utt.a16.lo02.projet;

import java.util.Scanner;

public class JoueurReel extends Joueur {
	
	public JoueurReel(String nom) {
		super (nom, Joueur.Types.Reel);
	}
	
	private int choixCarte( String s){
		Scanner sc = new Scanner(System.in);

		System.out.println("Voici Votre main :");
		System.out.println(this.main);
		System.out.println("Voulez-vous vous " + s + " des cartes ? o/n");
		
		switch(sc.nextLine().toLowerCase()){
			case "o":
				System.out.println("Quel carte ? Donner le numero de la carte");
				for (int i = 0; i < this.main.size(); i++)
					System.out.print(this.main.get(i) + " [" + i + "] ,");
				System.out.println("");
				int reponse = sc.nextInt();
				if(reponse >= 0 && reponse < this.main.size())
					return reponse;
				else
					System.out.println("Désoler mais il n'existe pas de carte numéro " + reponse);
				
				return -2;
			case "n":
				System.out.println("Vous ne voulez pas " + s + " de carte");
				return -1;
			default :
				System.out.println("Nous n'avons pas compris votre réponse.");
				return -2;
		}
		
	}
	
	@Override
	public void defausse() {
		boolean defausser = true;
		int reponse;
		while (defausser){
			Divinae.setJoueurCourant(this);
			reponse = this.choixCarte("defaussé");
			switch (reponse){
				case -2:
					System.out.println("Veuillez recommencer");
					break;
				case -1:
					defausser = false;
					break;
				default:
					Divinae.cimetiere.add(this.main.remove(reponse));
					break;
			}
		}
		
	}
	
	@Override
	public void jouerCarte() {
		boolean continu = true;
		int reponse;
		Origine o;
		
		
		
		while(this.encorePtAction() && continu){
			Divinae.setJoueurCourant(this);
			this.printAction();
			reponse = this.choixCarte("jouer");
			switch (reponse){
			case -2:
				System.out.println("Veuillez recommencer");
				break;
			case -1:
				continu = false;
				break;
			default:
				o = this.main.get(reponse).origine;
				switch (o){
					case Jour: 
					case Nuit:
						if (this.action[o.ordinal()] > 0){
							this.action[o.ordinal()] --;
							System.out.println("Vous jouer la carte : " + this.main.get(reponse));
							this.main.remove(reponse).jouerCarteAction();
						}
						else 
							System.out.println("Impossible de jouer cette carte pas assez de point d'action : " + o);
						break;
					
					case Neant:
						if (this.action[o.ordinal()] > 0){
							this.action[o.ordinal()] --;
							this.main.remove(reponse).jouerCarteAction();
							System.out.println("Vous jouer la carte : " + this.main.get(reponse));
						}
						else if(this.action[Origine.Jour.ordinal()] >= 2){
							this.action[Origine.Jour.ordinal()] -= 2;
							System.out.println("Vous jouer la carte : " + this.main.get(reponse));
							this.main.remove(reponse).jouerCarteAction();
						}
						else if(this.action[Origine.Nuit.ordinal()] >= 2){
							this.action[Origine.Nuit.ordinal()] -= 2;
							System.out.println("Vous jouer la carte : " + this.main.get(reponse));
							this.main.remove(reponse).jouerCarteAction();
						}
						else 
							System.out.println("Impossible de jouer cette carte pas assez de point d'action : " + o);
						break;
					default :
						System.out.println("Vous jouer la carte : " + this.main.get(reponse));
						this.main.remove(reponse).jouerCarteAction();
						break;
				}
				break;
			}
			Divinae.checkJeuImediat();
		}
	}
	
	private void printAction(){
		System.out.println("Vous avez comme points d'actions : \n Jours : " + this.action[Origine.Jour.ordinal()] + ", Nuit : "  + this.action[Origine.Nuit.ordinal()] + ", Néant : " + this.action[Origine.Neant.ordinal()]);
	}

	@Override
	public void activeCarte() {
		int reponse;
		boolean continu = true;
		Origine o;
		Action carte;
		
		while(continu){
			Divinae.setJoueurCourant(this);
			this.printAction();
			reponse = choixCarte("activer");
			switch(reponse){
				case -2:
					System.out.println("Veuillez recommencer");
					break;
				case -1:
					continu = false;
					break;
				default:
					o = this.main.get(reponse).origine;
					switch (o){
						case Jour:
						case Nuit:
							if (this.action[o.ordinal()] > 0){
								this.action[o.ordinal()] --;
								carte = this.main.remove(reponse);
								carte.activeCapacite();
								System.out.println("Vous activez la carte : " + carte);
								Divinae.cimetiere.add(carte);
							}
							else 
								System.out.println("Impossible de jouer cette carte pas assez de point d'action : " + o);
							break;
						
						case Neant:
							if (this.action[o.ordinal()] > 0){
								this.action[o.ordinal()] --;
								carte = this.main.remove(reponse);
								System.out.println("Vous activez la carte : " + carte);
								carte.activeCapacite();
								Divinae.cimetiere.add(carte);
							}
							else if(this.action[Origine.Jour.ordinal()] >= 2){
								this.action[Origine.Jour.ordinal()] -= 2;
								carte = this.main.remove(reponse);
								System.out.println("Vous activez la carte : " + carte);
								carte.activeCapacite();
								Divinae.cimetiere.add(carte);
							}
							else if(this.action[Origine.Nuit.ordinal()] >= 2){
								this.action[Origine.Nuit.ordinal()] -= 2;
								carte = this.main.remove(reponse);
								System.out.println("Vous activez la carte : " + carte);
								carte.activeCapacite();
								Divinae.cimetiere.add(carte);
							}
							else 
								System.out.println("Impossible de sacrifier cette carte pas assez de point d'action : " + o);
							break;
						default :
							carte = this.main.remove(reponse);
							System.out.println("Vous activez la carte : " + carte);
							carte.activeCapacite();
							Divinae.cimetiere.add(carte);
							break;
					}
					break;
			}
			Divinae.checkJeuImediat();
		}
	}

	@Override
	public void piocheMain(Joueur joueur, int nbCarte) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void joueCarteImediat() {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("Que voulez-vous faire ?");
			System.out.println("Si vous voulez Jouer une Carte entrer [1], si vous souhaitez Sacrifier un carte entrer [2], Si vous voulez Utiliser la capacite de votre Divinite entrer [3]. \n si vous ne voulez rien faire entrer [0]");
			Divinae.setJoueurCourant(this);
			switch(sc.nextInt()){
				case 0:
					System.out.println("très bien vous ne voulez plus rien faire");
					return;
				case 1 : 
					this.jouerCarte();
					break;
				case 2 :
					this.activeCarte();
					break;
				case 3 :
					if (!this.divinite.capaciteUtilise)
						this.divinite.activeCapacite();
					else
						System.out.println("Vous avez déjà utilisé la capacite de votre Divinité. Vous ne pouvez l'utiliser qu'une fois pendant la partie.");
					break;
				default :
					System.out.println("Nous n'avons pas compris votre reponse veuillez bien lire les choix possibles.");
					break;
			}
		}
	}

	@Override
	public void tourJoueur() {
		Scanner sc = new Scanner(System.in);
		boolean continu = true;
		
		System.out.println("Tours de : " + this);
		
		this.defausse();
		
		Divinae.setJoueurCourant(this);
		while (continu){
			System.out.println("Voulez-vous remplir votre main ? o/n");
			switch(sc.nextLine().toLowerCase()){
				case "o":
					System.out.println("Votre main se remplit");
					this.remplirMain();
					continu = false;
					break;
				case "n":
					System.out.println("Votre main ne sera pas remplit");
					continu = false;
					break;
				default:
					System.out.println("Nous n'avons pas comprit votre choix.");
					break;
			}
		}
		
		this.jouerCarte();
		this.activeCarte();
		this.calculerPriere();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Joueur Reel - ");
		sb.append(super.toString());
		return sb.toString();
	}

	@Override
	public void activeCarteCroyantForce() {
		boolean fait = false;
		int reponse;
		while (!fait){
			System.out.println("Choisissez une carte Croyant a active de force");
			reponse = this.choixCarte("Croyant forcer ");
			switch (reponse){
				case -2 :
				case -1 :
					System.out.println("Veuillez recommencer");
					break;
				default :
					if (this.main.get(reponse) instanceof Croyant){
						this.main.get(reponse).activeCapacite();
						Divinae.cimetiere.add(this.main.remove(reponse));
						fait = true;
					}
					break;						
			}	
		}
	}

	@Override
	public void activeCarteGuideForce() {
		boolean fait = false;
		int reponse;
		while (!fait){
			System.out.println("Choisissez une carte Guide a active de force");
			reponse = this.choixCarte("Guide forcer ");
			switch (reponse){
				case -2 :
				case -1 :
					System.out.println("Veuillez recommencer");
					break;
				default :
					if (this.main.get(reponse) instanceof Guide){
						this.main.get(reponse).activeCapacite();
						Divinae.cimetiere.add(this.main.remove(reponse));
						fait = true;
					}
					break;						
			}	
		}
		
	}



}
