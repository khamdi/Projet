package fr.utt.a16.lo02.projet;

public class Action extends Carte {
	/**
     * Default constructor
     */
    public Action(int numCarte, String nomCarte, Origine origine,TypesCartes typeCarte) {
        super(numCarte, nomCarte, typeCarte, origine);
        // TODO Auto-generated constructor stub
    }


    /**
     * 
     */
    protected boolean enMain;

    /**
     * @return
     */
    public Action piocheCarte() {
        // TODO implement here
        return null;
    }


    /**
     * @param return
     */
    public void defausseCarte() {
        // TODO implement here
    }
	
	@Override
	public void activeCapacite(Carte carte) {
		// TODO Auto-generated method stub
		
	}

    public String toString() {
        return super.toString();
    };

}
