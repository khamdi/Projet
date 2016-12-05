
import java.util.*;

/**
 * 
 */
public abstract class Joueur {

    /**
     * Default constructor
     */
    public Joueur() {
    }

    /**
     * 
     */
    private boolean gainPtAction = true;

    /**
     * 
     */
    private boolean dejaJoue = false;

    /**
     * 
     */
    protected int nbPriere = 0;

    /**
     * 
     */
    protected int action;

    /**
     * 
     */
    protected static Divinite divinité;

    /**
     * 
     */
    public static Types typeJoueur;

    /**
     * 
     */
    public Set<Action> main;

    /**
     * 
     */
    public Set<Guide> plateau;

    /**
     * 
     */
    public boolean sacrificeCroyant = false;

    /**
     * 
     */
    public boolean sacrifieGuide = false;



    /**
     * @param cartesDefausse 
     * @return
     */
    public abstract void defausse(Set<Action> cartesDefausse);

    /**
     * @param carte 
     * @return
     */
    public abstract void jouerCarte(Action carte);

    /**
     * @param carte 
     * @return
     */
    public abstract void activeCarte(Carte carte);

    /**
     * @param joueur 
     * @param nbCarte 
     * @return
     */
    public abstract void piocheMain(Joueur joueur, int nbCarte);

    /**
     * @return
     */
    public abstract void tourJoueur();

    /**
     * @return
     */
    public void remplirMain() {
        // TODO implement here
        return null;
    }

    /**
     * @param origineAction 
     * @param nbAction 
     * @return
     */
    public void ajoutAction(Origine origineAction, int nbAction) {
        // TODO implement here
        return null;
    }

    /**
     * @param origineAction 
     * @param nbAction 
     * @return
     */
    public void retireAction(Origine origineAction, int nbAction) {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public int recupererPriere() {
        // TODO implement here
        return 0;
    }

    /**
     * 
     */
    public enum Types {
    }

    /**
     * 
     */
    public class JoueurReel extends Joueur {

        /**
         * Default constructor
         */
        public JoueurReel() {
        }

        /**
         * @param cartesDefausse 
         * @return
         */
        public void defausse(Set<Action> cartesDefausse) {
            // TODO implement here
            return null;
        }

        /**
         * @param carte 
         * @return
         */
        public void jouerCarte(Action carte) {
            // TODO implement here
            return null;
        }

        /**
         * @param joueur 
         * @param nbCarte 
         * @return
         */
        public void piocheMain(Joueur joueur, int nbCarte) {
            // TODO implement here
            return null;
        }

        /**
         * @param carte 
         * @return
         */
        public void activeCarte(Carte carte) {
            // TODO implement here
            return null;
        }

        /**
         * @return
         */
        public void tourJoueur() {
            // TODO implement here
            return null;
        }

        /**
         * @param cartesDefausse 
         * @return
         */
        public abstract void defausse(Set<Action> cartesDefausse);

        /**
         * @param carte 
         * @return
         */
        public abstract void jouerCarte(Action carte);

        /**
         * @param carte 
         * @return
         */
        public abstract void activeCarte(Carte carte);

        /**
         * @param joueur 
         * @param nbCarte 
         * @return
         */
        public abstract void piocheMain(Joueur joueur, int nbCarte);

        /**
         * @return
         */
        public abstract void tourJoueur();

    }

    /**
     * 
     */
    public class IA extends Joueur {

        /**
         * Default constructor
         */
        public IA() {
        }

        /**
         * @param cartesDefausse 
         * @return
         */
        public void defausse(Set<Action> cartesDefausse) {
            // TODO implement here
            return null;
        }

        /**
         * @param carte 
         * @return
         */
        public void jouerCarte(Action carte) {
            // TODO implement here
            return null;
        }

        /**
         * @param joueur 
         * @param nbCarte 
         * @return
         */
        public void piocheMain(Joueur joueur, int nbCarte) {
            // TODO implement here
            return null;
        }

        /**
         * @param carte 
         * @return
         */
        public void activeCarte(Carte carte) {
            // TODO implement here
            return null;
        }

        /**
         * @return
         */
        public void tourJoueur() {
            // TODO implement here
            return null;
        }

        /**
         * @return
         */
        public void gestionCapacite() {
            // TODO implement here
            return null;
        }

        /**
         * @return
         */
        private boolean gestionCapaciteDivinite() {
            // TODO implement here
            return false;
        }

        /**
         * @return
         */
        private boolean gestionCapaciteAction() {
            // TODO implement here
            return false;
        }

        /**
         * @param cartesDefausse 
         * @return
         */
        public abstract void defausse(Set<Action> cartesDefausse);

        /**
         * @param carte 
         * @return
         */
        public abstract void jouerCarte(Action carte);

        /**
         * @param carte 
         * @return
         */
        public abstract void activeCarte(Carte carte);

        /**
         * @param joueur 
         * @param nbCarte 
         * @return
         */
        public abstract void piocheMain(Joueur joueur, int nbCarte);

        /**
         * @return
         */
        public abstract void tourJoueur();

    }

}