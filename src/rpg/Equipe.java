package rpg;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Camille Blaser - Ervan Combe
 *
 */
/**
 * @author Pierre Paul
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
		this.equipe = new LinkedList<Perso>();
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
	 * @param equipe1 à ajouter dans l'équipe
	 */
	public void affectePerso(Perso equipe1)
	{
		this.equipe.add(equipe1);
	}
	
	public void affectePerso(Perso[] perso)
	{
		for (int indicePerso = 0; indicePerso < this.nbPerso; indicePerso++)
		{
			this.equipe.add(perso[indicePerso]);
		}
	}
	
	public void enleverPerso(Perso perso)
	{
		this.equipe.remove(this.equipe.indexOf(perso));
	}



	@Override
	public String toString()
	{
		String chaine = "L'equipe est composée de : ";
		for (int indice = 0; indice<this.nbPerso; indice++)
		{
			chaine += this.equipe.get(indice).getType().getNomType().obtenirLabel();
			if (indice != this.nbPerso-1)
				chaine+=", ";
			else
				chaine+=".";
		}
		return chaine;
	}
	
	
}
