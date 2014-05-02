package rpg;

public class Technique
{

	/**
	 *nom permettant d'itentifier le technique
	 */
	private String nomTechnique;

	
	/**
	 * Le cout en mana pour lancer la technique
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
}
