package rpg;

/**
 * @author Camille Blaser - Ervan Combe
 *
 */
public class Positions 
{
	/**
	 * Positions horizontale.
	 */
	private int ligne;
	
	/**
	 * Position verticale.
	 */
	private int colonne;
	
	/**
	 * Créer une nouvelle position.
	 * @param longueur en ligne
	 * @param largeur en colonne
	 */
	public Positions(int largeur, int longueur)
	{
		this.ligne = largeur;
		this.colonne = longueur;
	}
	
	/**
	 * Obtenir la ligne.
	 * @return le numéro d'une ligne
	 */
	public int getLigne()
	{
		return this.ligne;
	}
	
	/**
	 * Obtenir la colonne.
	 * @return le numéro d'une colonne
	 */
	public int getColonne()
	{
		return this.colonne;
	}
}
