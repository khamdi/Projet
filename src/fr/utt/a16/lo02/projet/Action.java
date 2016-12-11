package fr.utt.a16.lo02.projet;

public abstract class Action extends Carte {
	/**
     * Default constructor
     */
    public Action(int numCarte, String nomCarte, Origine origine,TypesCartes typeCarte) {
        super(numCarte, nomCarte, typeCarte, origine);
        this.enMain = false;
    }


    /**
     * 
     */
    protected boolean enMain;
    
    
    public void setEnMain() {
		this.enMain = true;
	}
	
	@Override
	public void activeCapacite() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public abstract void jouerCarteAction();

    public String toString() {
        return super.toString();
    }


	

}
