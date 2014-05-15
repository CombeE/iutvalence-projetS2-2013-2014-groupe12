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
	 * Premier joueur de la partie.
	 */
	private Joueur joueur1;
	
	/**
	 * Deuxième joueur de la partie.
	 */
	private Joueur joueur2;
	
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
		this.joueur1 = new Joueur("Joueur 1");
		this.joueur2 = new Joueur("Joueur 2");
	}

	
	/**
	 * Un autre personnage prend la main et joue.
	 * @return personnage qui va jouer
	 */
	public Perso persoSuivant()
	{
		int temp = this.joueur1.getEquipe().getListePerso().indexOf(this.persoEnCours);
		if (temp != this.joueur1.getEquipe().getNbPerso())
			return this.joueur1.getEquipe().getListePerso().get(temp+1);
		return this.joueur1.getEquipe().getListePerso().get(0);
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
	 * @param dep le deplacement à effectuer
	 */
	public void seDeplacer2(Deplacement dep)
	{
		this.persoEnCours.deplacer(dep);
	}
	
	/**
	 * Déplacer un personnage.
	 * @param dir direction vers laquelle le personnage va se déplacer
	 */
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
