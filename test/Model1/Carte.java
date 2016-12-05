
import java.util.*;

/**
 * 
 */
public abstract class Carte {

    /**
     * Default constructor
     */
    public Carte() {
    }

    /**
     * 
     */
    protected static Origine origine;

    /**
     * 
     */
    protected static TypesCartes typeCarte;

    /**
     * 
     */
    protected static String nomCarte;

    /**
     * 
     */
    protected boolean capaciteUtilise;

    /**
     * 
     */
    protected static int numCarte;



    /**
     * @param carte 
     * @return
     */
    public abstract void activeCapacite(Carte carte);

    /**
     * 
     */
    public enum TypesCartes {
    }

    /**
     * 
     */
    public class Action extends Carte {

        /**
         * Default constructor
         */
        public Action() {
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
         * @param carte 
         * @return
         */
        public void activeCapacite(Carte carte) {
            // TODO implement here
            return null;
        }

        /**
         * @param return
         */
        public void defausseCarte(void return) {
            // TODO implement here
        }

        /**
         * @param carte 
         * @return
         */
        public abstract void activeCapacite(Carte carte);

        /**
         * 
         */
        public class Personnage extends Action {

            /**
             * Default constructor
             */
            public Personnage() {
            }

            /**
             * 
             */
            public Set<Dogmes> dogmes;

            /**
             * 
             */
            public class Guide extends Personnage {

                /**
                 * Default constructor
                 */
                public Guide() {
                }

                /**
                 * 
                 */
                public Set<Croyant> croyants;

                /**
                 * @param return
                 */
                public void jouerGuide(void return) {
                    // TODO implement here
                }

                /**
                 * @param croyants 
                 * @return
                 */
                public void ajoutCroyant(Set<Croyant> croyants) {
                    // TODO implement here
                    return null;
                }

                /**
                 * @return
                 */
                public Croyant retirerCroyant() {
                    // TODO implement here
                    return null;
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteMartyr(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteClerc(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteShaman(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteAnarchiste(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capacitePaladin(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteAscete(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteDevin(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteExorciste(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteSorcier(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteTyran(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteMessie(Joueur joueur, void return) {
                    // TODO implement here
                }

            }

            /**
             * 
             */
            public class Croyant extends Personnage {

                /**
                 * Default constructor
                 */
                public Croyant() {
                }

                /**
                 * 
                 */
                private static int nbCroyant;

                /**
                 * 
                 */
                private boolean lie;

                /**
                 * 
                 */
                private boolean malInvocation = true;

                /**
                 * @param return
                 */
                public void jouerCroyant(void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteMoine(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteTravailleurs1(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteTravailleurs2(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteTravailleurs3(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteErmite(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteIntegristes(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteGuerriersSaints(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteDiplomates(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteDemons(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteAlchimiste1(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteAlchimiste2(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteAlchimiste3(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteVampire(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteLycanthropes(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capacitePillards(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteIllusionnistes(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteEsprits(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteAlienes1(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteAlienes2(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteAlienes3(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteRevenant(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteRevolutionnaires(Joueur joueur, void return) {
                    // TODO implement here
                }

                /**
                 * @param joueur 
                 * @param return
                 */
                public void capaciteNihillistes(Joueur joueur, void return) {
                    // TODO implement here
                }

            }

        }

        /**
         * 
         */
        public class DeusEx extends Action {

            /**
             * Default constructor
             */
            public DeusEx() {
            }

            /**
             * @param joueur 
             * @param guide 
             * @param return
             */
            public void capaciteColereDivine1(Joueur joueur, Guide guide, void return) {
                // TODO implement here
            }

            /**
             * @param joueur 
             * @param guide 
             * @param return
             */
            public void capaciteColereDivine2(Joueur joueur, Guide guide, void return) {
                // TODO implement here
            }

            /**
             * @param joueur 
             * @param guide 
             * @param return
             */
            public void capaciteStase(Joueur joueur, Guide guide, void return) {
                // TODO implement here
            }

            /**
             * @param joueur 
             * @param guide 
             * @param return
             */
            public void capaciteOrdreCeleste(Joueur joueur, Guide guide, void return) {
                // TODO implement here
            }

            /**
             * @param joueur 
             * @param return
             */
            public void capaciteFourberie(Joueur joueur, void return) {
                // TODO implement here
            }

            /**
             * @param joueur 
             * @param return
             */
            public void capaciteDiversion(Joueur joueur, void return) {
                // TODO implement here
            }

            /**
             * @param joueur 
             * @param guide 
             * @param return
             */
            public void capaciteConcentration(Joueur joueur, Guide guide, void return) {
                // TODO implement here
            }

            /**
             * @param joueur 
             * @param return
             */
            public void capaciteTrouNoir(Joueur joueur, void return) {
                // TODO implement here
            }

            /**
             * @param joueur 
             * @param personnage 
             * @param return
             */
            public void capacitePhoenix(Joueur joueur, Personnage personnage, void return) {
                // TODO implement here
            }

            /**
             * @param joueur 
             * @param carteAction 
             * @param return
             */
            public void capaciteInfluenceJour(Joueur joueur, Action carteAction, void return) {
                // TODO implement here
            }

            /**
             * @param joueur 
             * @param carteAction 
             * @param return
             */
            public void capaciteInfluenceNuit(Joueur joueur, Action carteAction, void return) {
                // TODO implement here
            }

            /**
             * @param joueur 
             * @param carteAction 
             * @param return
             */
            public void capaciteInfluenceNeant(Joueur joueur, Action carteAction, void return) {
                // TODO implement here
            }

            /**
             * @param joueur 
             * @param carteAction 
             * @param return
             */
            public void capaciteInfluenceNulle(Joueur joueur, Action carteAction, void return) {
                // TODO implement here
            }

            /**
             * @param joueur 
             * @param carteAction 
             * @param return
             */
            public void capaciteTrans(Joueur joueur, Action carteAction, void return) {
                // TODO implement here
            }

            /**
             * @param joueur 
             * @param carteAction 
             * @param return
             */
            public void capaciteMiroir(Joueur joueur, Action carteAction, void return) {
                // TODO implement here
            }

            /**
             * @param joueur 
             * @param return
             */
            public void capaciteBouleversement(Joueur joueur, void return) {
                // TODO implement here
            }

            /**
             * @param joueur 
             * @param guide 
             * @param return
             */
            public void capaciteInquisition(Joueur joueur, Guide guide, void return) {
                // TODO implement here
            }

        }

        /**
         * 
         */
        public class Apocalypse extends Action {

            /**
             * Default constructor
             */
            public Apocalypse() {
            }

            /**
             * @param return
             */
            public void apocalypse(void return) {
                // TODO implement here
            }

        }

    }

    /**
     * 
     */
    public class Divinite extends Carte {

        /**
         * Default constructor
         */
        public Divinite() {
        }

        /**
         * 
         */
        private static String description;

        /**
         * 
         */
        public Set<Dogmes> dogmes;

        /**
         * @param carte 
         * @return
         */
        public void activeCapacite(Carte carte) {
            // TODO implement here
            return null;
        }

        /**
         * @param joueur 
         * @param carteApocalypste 
         * @return
         */
        public void capaciteBrawalen(Joueur joueur, Apocalypse carteApocalypste) {
            // TODO implement here
            return null;
        }

        /**
         * @param joueur 
         * @param carteGuide 
         * @return
         */
        public void capaciteShingva(Joueur joueur, Guide carteGuide) {
            // TODO implement here
            return null;
        }

        /**
         * @param joueur 
         * @return
         */
        public void capaciteLlewella(Joueur joueur) {
            // TODO implement here
            return null;
        }

        /**
         * @param joueur 
         * @param carteGuide 
         * @return
         */
        public void capaciteDrinded(Joueur joueur, Guide carteGuide) {
            // TODO implement here
            return null;
        }

        /**
         * @param joueur 
         * @return
         */
        public void capaciteGorpa(Joueur joueur) {
            // TODO implement here
            return null;
        }

        /**
         * @return
         */
        public void capacitePuiTara() {
            // TODO implement here
            return null;
        }

        /**
         * @return
         */
        public void capaciteYarstur() {
            // TODO implement here
            return null;
        }

        /**
         * @param joueur 
         * @return
         */
        public void capaciteRomtec(Joueur joueur) {
            // TODO implement here
            return null;
        }

        /**
         * @param joueur 
         * @return
         */
        public void capaciteGwenghelen(Joueur joueur) {
            // TODO implement here
            return null;
        }

        /**
         * @param joueur 
         * @return
         */
        public void capaciteKillinstred(Joueur joueur) {
            // TODO implement here
            return null;
        }

        /**
         * @param carte 
         * @return
         */
        public abstract void activeCapacite(Carte carte);

    }

}