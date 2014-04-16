package rpg;

public class Technique
{
	
	/* nom permettant d'itentifier le technique
	*/
	private String nomTechnique;
	/* Le cout en mana pour lancer la technique
	 */
	private int coutMana;
	/* Les dégats qu'infligera la technqiue
	 */
	private int degats;
	/* Les effet qu'appliquera la technique en plus de ses dégats. Le type Object est là car le type
	 * de cette atribut n'est pas encore définit
	 */
	private Object effet;
	
	public Technique(String nom, int cout, int degats, Object effet)
	{
		this.nomTechnique = nom;
		this.coutMana = cout;
		this.degats = degats;
		this.effet = effet;
	}
}
