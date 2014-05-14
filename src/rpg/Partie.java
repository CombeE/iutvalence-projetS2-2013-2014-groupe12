package rpg;

/**
 * @author Camille Blaser - Ervan Combe
 *
 */
public class Partie
{
	
	/**
	 * Le plateau de jeu d'une partie.
	 */
	private Plateau plateau;
	
	
	/**
	 * Le joueur de la partie.
	 */
	private Joueur joueur;
	
	/**
	 * Le personnage entrain de jouer.
	 */
	private Perso persoEnCours;
	
	
	/**
	 * Créer une nouvelle partie.
	 */
	public Partie()
	{
		this.plateau = new Plateau();
		this.joueur = new Joueur("Joueur 1");
		this.persoEnCours = null;
	}

	
	/**
	 * Un autre personnage prend la main et joue.
	 * @return personnage qui va jouer
	 */
	public Perso persoSuivant()
	{
		int temp = this.joueur.getEquipe().getListePerso().indexOf(this.persoEnCours);
		if (temp != this.joueur.getEquipe().getNbPerso())
			return this.joueur.getEquipe().getListePerso().get(temp+1);
		return this.joueur.getEquipe().getListePerso().get(0);
	}


	/**
	 * Passer le tour d'un personnage dans une partie.
	 */
	public void passerTour()
	{
		this.persoEnCours = persoSuivant();
	}
	
	
	/**
	 * Déplacer un personnage.
	 * @param dir direction vers laquelle le personnage va se déplacer
	 */
	//public void seDeplacer2(Deplacement dep)
	//	{
	//		this.persoEnCours.deplacer(dep);
	//	}
	public void seDeplacer(Direction dir)
	{
	
		Positions posActu = this.persoEnCours.getPos();
		
		Positions newPos;
		
		switch(dir)
		{
		case DROITE:
		{
			newPos = new Positions(posActu.getLigne()+1, posActu.getColonne());
		}
		case GAUCHE:
		{
			newPos = new Positions(posActu.getLigne()-1, posActu.getColonne());
		}
		case AVANT:
		{
			newPos = new Positions(posActu.getLigne(), posActu.getColonne()+1);
		}
		case ARRIERE:
		{
			newPos = new Positions(posActu.getLigne(), posActu.getColonne()-1);
		}
		}
	}
	
	
	/**
	 * Obtenir le plateau de jeu.
	 * @return le plateau
	 */
	public Plateau getPlateau()
	{
		return this.plateau;
	}
	
	
}
