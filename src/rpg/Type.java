package rpg;

import java.util.List;

/**
 * @author Camille Blaser - Ervan Combe
 */
public class Type
{
	/**
	 * Le nom du type du personnage.
	 */
	private DescriptionType nomType;
	
	
	/** 
	 * Toutes les techniques à la disposition du personnage.
	 */
	private List<Technique> listeTechnique;

	
	/**
	 * Créer un nouveau type.
	 * @param nom du type
	 * @param listeTechnique techniques utilisées pas le type
	 */
	public Type(DescriptionType nom, List<Technique> listeTechnique)
	{
		this.nomType = nom;
		this.listeTechnique = listeTechnique;
	}
	
	
	/**
	 * Obtenir le nom du type.
	 * @return nom du type
	 */
	public DescriptionType getNomType()
	{
		return this.nomType;
	}
	
	
	/**
	 * Obtenir la liste des personnages.
	 * @return listeTechnique la liste des techniques du personnage
	 */
	public List<Technique> getListeTechnique()
	{
		return this.listeTechnique;
	}
}

