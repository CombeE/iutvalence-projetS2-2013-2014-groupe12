package rpg;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author Camille Blaser - Ervan Combe
 *
 */
public class Joueur
{
	//Supression de l'attribut "points de vie" du joueur. Il est plus simple d'enlever les personnages
	//morts de l'équipe du joueur au fur et à mesure qu'ils meurent et une fois que l'équipe est vide
	//on considère qu'il a perdu.
	
	/**
	 * Le nom du joueur.
	 */
	private String nom;
	
	
	/**
	 * L'équipe avec laquelle le joueur joue.
	 */
	private Equipe equipe;
	
	/**
	 * Carte  des positions occupées par les personnages.
	 */
	private Map<Positions,Perso> posPersonnage;
	
	
	/**
	 * Créer un nouveau joueur
	 * @param nom du joueur
	 */
	public Joueur(String nom)
	{
		this.nom = nom;
		this.equipe = new Equipe(3);
		this.posPersonnage = new Hashtable<Positions, Perso>();
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
	 * Obtenir la position des personnages d'un joueur.
	 * @return les positions des personnages
	 */
	public Map<Positions,Perso> getPosMap()
	{
		return this.posPersonnage;
	}
	
	
	/**
	 * Savoir si le joueur a gagné.
	 * @return vrai ou faux
	 */
	public boolean aGagne()
	{
		if (this.getEquipe().getListePerso().size() == 0)
			return true;
		return false;
	}
	
	/**
	 * Ajouter un personnage et sa position sur la carte des position du joueur.
	 * @param perso le personnage à ajouter
	 */
	public void ajoutPerso(Perso perso)
	{
		this.posPersonnage.put(perso.getPos(), perso);
	}
}
