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
	 * Créer une nouvelle partie.
	 */
	public Partie()
	{
		this.plateau = new Plateau();
		this.joueur = new Joueur("Joueur 1");
	}
	
	/**
	 * Passer le tour d'un personnage dans une partie.
	 * @param persoEnCours le personnage qui passe son tour
	 */
	public void passerTour(Perso persoEnCours)
	{
		this.joueur.getEquipe().getListePerso().indexOf(persoEnCours);
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