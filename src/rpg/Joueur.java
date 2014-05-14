package rpg;

/**
 * @author Camille Blaser - Ervan Combe
 *
 */
public class Joueur
{
	/**
	 * Nombre de point de vie d'un joueur : 
	 * somme des points de vie des personnages de son équipe.
	 */
	private int nbPointVie;
	
	
	/**
	 * Le nom du joueur.
	 */
	private String nom;
	
	
	/**
	 * L'équipe avec laquelle le joueur joue.
	 */
	private Equipe equipe;
	
	
	/**
	 * Créer un nouveau joueur
	 * @param nom du joueur
	 */
	public Joueur(String nom)
	{
		this.nom = nom;
	}
	
	
	/**
	 * Obtenir le nombre de points de vie du joueur.
	 * @return nombre de points de vie
	 */
	public int getNbPointVie()
	{
		return this.nbPointVie;
	}
	
	
	/**
	 * Obtenir le nom du joueur.
	 * @return le nom du joueur
	 */
	public String getNom()
	{
		return this.nom;
	}
	
	
	/**
	 * Obtenir l'équipe du joueur.
	 * @return une équipe
	 */
	public Equipe getEquipe()
	{
		return this.equipe;
	}
	
	
	/**
	 * Savoir si le joueur a gagné.
	 * @return vrai ou faux
	 */
	public boolean aGagne()
	{
		if (this.nbPointVie == 0)
			return true;
		return false;
	}
}
