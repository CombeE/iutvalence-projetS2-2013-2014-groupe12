package rpg;

import java.util.List;

/**
 * @author Camille Blaser - Ervan Combe
 *
 */
public class Equipe
{
	/**
	 * Le nombre de joueurs présent dans une équipe.
	 */
	private int nbPerso;
	
	
	/**
	 * Tous les personnages jouant dans une équipe.
	 */
	private List<Perso> equipe;
	
	
	
	/**
	 * Créer une nouvelle équipe.
	 * @param nbPerso le nombre de personnages
	 */
	public Equipe(int nbPerso)
	{
		this.nbPerso = nbPerso;
	}
	
	
	
	/**
	 * Obtenir le nombre de personnages d'une équipe.
	 * @return le nombre de personnages
	 */
	public int getNbPerso()
	{
		return this.nbPerso;
	}
	
	
	
	/**
	 * Obtenir la liste des personages d'une équipe.
	 * @return la liste des personnages
	 */
	public List<Perso> getListePerso()
	{
		return this.equipe;
	}
	
	
	
	/**
	 * Mettre un personnage dans une équipe.
	 * @param perso à ajouter dans l'équipe
	 */
	public void affectePerso(Perso perso)
	{
		this.equipe.add(perso);
	}
}
