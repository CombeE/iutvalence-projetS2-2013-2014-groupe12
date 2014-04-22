package rpg;

public class Perso
{
	/** Le type du personnage.
	 */
	private Type type;
	
	/** Points de vie du personnage
	 */
	private int ptVie;
	
	/**Points d'attaque disponibles
	 */
	private int ptAttaque;
	
	/**
	 * Points de défense disponibles
	 */
	private int ptDefense;
	
	/**
	 * Puissance des attaques lancées par le personnage
	 */
	private int ptPuissance;
	
	/**
	 * Points gérant "l'énergie" demandée au personnage lors d'une attaque.
	 */
	private int ptMana;
	
	/**
	 * Position actuelle du personnage sur la map.
	 */
	private Positions pos;
	
	/** Cet attribut n'est pas une constante car une technique pourrait en faire bouger sa valeur
	 */
	private int pointDeplacement;
	
	/**
	 * Création d'un nouveau personnage.
	 * @param ptVie ses points de vie disponibles
	 * @param ptAttaque ses points d'attque disponibles
	 * @param ptDefense ses points de defense disponibles
	 * @param ptPuissance sa puissance disponible
	 * @param ptMana ses points de mana disponibles
	 * @param pos sa position actuelle
	 */
	public Perso(int ptVie,int ptAttaque,int ptDefense,int ptPuissance,int ptMana, Positions pos)
	{
		this.ptVie = ptVie;
		this.ptAttaque = ptAttaque;
		this.ptDefense = ptDefense;
		this.ptPuissance = ptPuissance;
		this.ptMana = ptMana;
		this.pos = pos;
		this.pointDeplacement = 4;
	}
	
	/**
	 * accesseur en lecture du type
	 * @return
	 */
	public Type getType()
	{
		return this.type;
	}
	
	/**
	 * accesseur en lecture des points de vie
	 * @return
	 */
	public int getPtVie()
	{
		return this.ptVie;
	}
	
	/**
	 * accesseur en lecture des points d'attaque
	 * @return
	 */
	public int getPtAttaque()
	{
		return this.ptAttaque;
	}
	
	/**
	 * accesseur en lecture des points de défense
	 * @return
	 */
	public int getPtDefense()
	{
		return this.ptDefense;
	}
	
	/**
	 * accesseur en lecture de la puissance
	 * @return
	 */
	public int getPtPuissance()
	{
		return this.ptPuissance;
	}
	
	/**
	 * accesseur en lecture des points de mana
	 * @return
	 */
	public int getPtMana()
	{
		return this.ptMana;
	}
	
	/**
	 * accesseur en lecture de la position
	 * @return
	 */
	public Positions getPos()
	{
		return this.pos;
	}
	
	/**
	 * accesseur en lecture des points de déplacement disponibles
	 * @return
	 */
	public int getPointDeplacement()
	{
		return pointDeplacement;
	}

	/**Le boolean passé en paramètre permet de dire si l'on veut ajouter ou enlever des points de
	 * déplacements au personnage ou lui en ajouter
	 */
	public void modifierPointDeplacement(boolean ajout, int pointDeplacement) 
	{
		this.pointDeplacement = pointDeplacement;
	}
	
	/**
	 * déplacer un personnage su la map.
	 * @param newPos sa nouvelle position
	 * @return
	 */
	public boolean deplacer(Positions newPos)
	{
		if (Deplacement.deplacementValide(this.pos, newPos, this.pointDeplacement))
			return true;
		return false;
	}
}
