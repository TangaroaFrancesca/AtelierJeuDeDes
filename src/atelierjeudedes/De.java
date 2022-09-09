package atelierjeudedes;

public class De {
    // PROPRIETERS
    private int num;      // n° du dé
    private int nbFaces;     // nombre de faces
    private int valeur;
    private boolean piper;

    // ACCESSEURS
    public int getNum() {
        return num;
    }

    public int getNbFaces() {
        return nbFaces;
    }

    public int getValeur() {
        return valeur;
    }

    // CONSTRUCTEUR SANS PARAMETRE
    public De() {
        nbFaces = 6;
        num = 0;
        valeur = 0;
    }

    //CONSTRUCTEUR AVEC PARAMETRE
    public De(int num, int nbFaces) {
        this.nbFaces = nbFaces;
        this.num = num;
    }

    // METHODES LANCER
    public void lancer() {
        valeur = (int) (Math.random() * nbFaces) + 1;
    }

    // METHODES TOSTRING
    @Override
    public String toString() {
        if (piper == true) {
            return "Dé n° " + num + " : " + valeur + " -> Ce dé est pipé.";
        } else {
            return "Dé n° " + num + " : " + valeur;
        }
    }

    // METHODES PIPER()
    public void piper() {

        valeur = (int) (Math.random() * 3) + 1;     // Math.random () : nb allant de 0 à 1

        if (valeur == 3) {
            this.valeur = 4;
        }

        piper = true;
    }
}
