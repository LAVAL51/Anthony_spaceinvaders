package spaceinvaders;

import moteurDuJeu.DessinJeu;
import moteurDuJeu.MoteurGraphique;

public class Main {

    public static void main(String[] args) throws InterruptedException {

	    SpacesInvaders jeu = new SpacesInvaders(Constante.ESPACEJEU_LONGUEUR, Constante.ESPACEJEU_HAUTEUR);
	    jeu.initialiserJeu();
	    DessinSpaceInvaders afficheur = new DessinSpaceInvaders(jeu);

	    MoteurGraphique moteur = new MoteurGraphique(jeu, afficheur);
	    moteur.lancerJeu(Constante.ESPACEJEU_LONGUEUR, Constante.ESPACEJEU_HAUTEUR);
    }

}