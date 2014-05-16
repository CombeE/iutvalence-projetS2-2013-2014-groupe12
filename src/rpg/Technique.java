package rpg;

/**
 * @author Camille Blaser - Ervan Combe
 *
 */
public class Technique
{

	/**
	 * Nom permettant d'itentifier la technique
	 */
	private String nomTechnique;

	
	/**
	 * Le cout en mana pour lancer la technique.
	 */
	private int coutMana;

	
	/**
	 * Les dégats qu'infligera la technique.
	 */
	private int degats;

	
	/** Les effets qu'appliquera la technique en plus de ses dégats. Le type Object est là car le type
	 * de cet attribut n'est pas encore défini.
	 */
	private Object effet;
	
	
	/** Créer une nouvelle Technique
	 * @param nom son nom
	 * @param cout son cout en point de mana
	 * @param degats les dégats infligés
	 * @param effet les effets qu'elle inflige
	 */
	public Technique(String nom, int cout, int degats, Object effet)
	{
		this.nomTechnique = nom;
		this.coutMana = cout;
		this.degats = degats;
		this.effet = effet;
	}
	
	/**
	 * Obtenir le cout en mana d'une technique
	 * @return cout en points de mana
	 */
	public int getCoutMana()
	{
		return this.coutMana;
	}
	
	/**
	 * Obtenir le nom de la technique.
	 * @return nom de la technique
	 */
	public String getNomTechnique()
	{
		return this.nomTechnique;
	}
	
	/**
	 * Obtenir les dégats sur l'adversaire.
	 * @return les dégats de la technique
	 */
	public int getDegats()
	{
		return this.degats;
	}
	
	/**
	 * Obtenir l'effet sur l'adversaire.
	 * @return l'effet de la technique
	 */
	public Object getEffet()
	{
		return this.effet;
	}
}
