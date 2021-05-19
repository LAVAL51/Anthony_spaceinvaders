package spaceinvaders;



import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;


import moteurDuJeu.DessinJeu;

public class DessinSpaceInvaders implements DessinJeu{

	private static int TAILLE_CASE = 25;
	
	private SpacesInvaders jeu;
	
	public DessinSpaceInvaders(SpacesInvaders spaceinvader) {
		this.jeu = spaceinvader;
	}
	
	public void dessiner(BufferedImage im) {
		if (this.jeu.aUnVaisseau()) {
			   Vaisseau vaisseau = this.jeu.recupererVaisseau();
			   this.dessinerUnVaisseau(vaisseau, im);
		   }
	}
	
	 private void dessinerUnVaisseau(Vaisseau vaisseau, BufferedImage im) {
		   Graphics2D crayon = (Graphics2D) im.getGraphics();

		   crayon.setColor(Color.gray);
		   	crayon.fillRect(vaisseau.abscisseLaPlusAGauche(), vaisseau.ordonneeLaPlusBasse(), vaisseau.longueur(), vaisseau.hauteur());

	   }
}
