package fr.unilim.iut.spaceinvaders.model;

import moteurDuJeu.Commande;

public abstract class Sprite {

	protected Position origine;
	protected Dimension dimension;
	protected int vitesse;

	public Sprite(Dimension dimension, Position origine, int vitesse) {
		super();
		this.dimension = dimension;
		this.origine = origine;
		this.vitesse = vitesse;
	}

	public Sprite() {
		super();
	}

	public boolean occupeLaPosition(int x, int y) {
		    return estAbscisseCouverte(x) && estOrdonneeCouverte(y);
	   }

	private boolean estOrdonneeCouverte(int y) {
		   return (ordonneeLaPlusBasse() <= y) && (y <= ordonneeLaPlusHaute());
	   }

	private boolean estAbscisseCouverte(int x) {
		   return (abscisseLaPlusAGauche() <= x) && (x <= abscisseLaPlusADroite());
	   }

	public int ordonneeLaPlusBasse() {
		    return this.origine.ordonnee() - this.dimension.hauteur() + 1;
	   }

	public int ordonneeLaPlusHaute() {
		   return this.origine.ordonnee();
	  }

	public int abscisseLaPlusADroite() {
		   return this.origine.abscisse() + this.dimension.longueur() - 1;
	  }

	public int abscisseLaPlusAGauche() {
		   return this.origine.abscisse();
	  }

	public void positionner(int x, int y) {
		   this.origine.changerAbscisse(x);
		   this.origine.changerOrdonnee(y);
	  }

	public int longueur() {
		return dimension.longueur;
	}

	public void deplacer(Commande c) {
		
		if (c.gauche)
		{
			this.deplacerHorizontalementVers(Direction.GAUCHE);
		}
	
		if (c.droite)
		{
			this.deplacerHorizontalementVers(Direction.DROITE);
		}
	}

	public int hauteur() {
		return dimension.hauteur;
	}
	
    public void deplacerHorizontalementVers(Direction direction) {
		this.origine.changerAbscisse(this.origine.abscisse() + direction.valeur()*vitesse);
	}
	
	public void deplacerVerticalementVers(Direction direction) {
		this.origine.changerOrdonnee(this.origine.ordonnee() + direction.valeur()*vitesse);
	}
	
    public enum Direction {
  	  
	     HAUT (-1),
	     BAS (1),
	     GAUCHE (-1),
	     DROITE (1),
	  
	     HAUT_ECRAN(-1),
	     BAS_ECRAN(1);
	   
	     private int valeur;
	  
	    private Direction(int valeur) {
		   this.valeur = valeur;
	   }
	
	   public int valeur() {
		  return this.valeur;
	  }

  }
}