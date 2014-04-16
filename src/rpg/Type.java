package rpg;

public class Type
{
	private NomType nomType;
	/* Toutes les techniques à la disposition de ce personnage
	 */
	private Technique listeTechnique[];

	public Type(NomType nom, Technique listeTechnique[])
	{
		this.nomType = nom;
		this.listeTechnique = listeTechnique;
	}
}

