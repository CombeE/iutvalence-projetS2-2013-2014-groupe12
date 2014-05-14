package rpg;

/**
 * @author Camille Blaser - Ervan Combe
 *
 */
public class Perso
{
	/** Le type du personnage.
	 */
	private Type type;
	
	/** Points de vie du personnage.
	 */
	private int ptVie;
	
	/**Points d'attaque disponibles.
	 */
	private int ptAttaque;
	
	/**
	 * Points de défense disponibles.
	 */
	private int ptDefense;
	
	/**
	 * Puissance des attaques lancées par le personnage.
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
	 * @param plateau le plataeau sur lequel est placé le joueur
	 */
	public Perso(Plateau plateau, int ptVie,int ptAttaque,int ptDefense,int ptPuissance,int ptMana,
			Positions pos)
	{
		this.ptVie = ptVie;
		this.ptAttaque = ptAttaque;
		this.ptDefense = ptDefense;
		this.ptPuissance = ptPuissance;
		this.ptMana = ptMana;
		this.pos = pos;
		this.pointDeplacement = 4;
		plateau.majPlateau(pos);
	}
	
	
	/**
	 * Accesseur en lecture du type du personnage.
	 * @return le type du personnage
	 */
	public Type getType()
	{
		return this.type;
	}
	
	/**
	 * Accesseur en lecture des points de vie.
	 * @return le nombre de points de vie du personnage
	 */
	public int getPtVie()
	{
		return this.ptVie;
	}
	
	/**
	 * Accesseur en lecture des points d'attaque.
	 * @return le nombre de points d'attaque du personnage
	 */
	public int getPtAttaque()
	{
		return this.ptAttaque;
	}
	
	/**
	 * Accesseur en lecture des points de défense.
	 * @return le nombre de points de vie du personnage
	 */
	public int getPtDefense()
	{
		return this.ptDefense;
	}
	
	/**
	 * Accesseur en lecture de la puissance.
	 * @return le nombre de points de puissance
	 */
	public int getPtPuissance()
	{
		return this.ptPuissance;
	}
	
	/**
	 * Accesseur en lecture des points de mana.
	 * @return le nombre de points de mana
	 */
	public int getPtMana()
	{
		return this.ptMana;
	}
	
	/**
	 * Accesseur en lecture de la position.
	 * @return la position du personnage
	 */
	public Positions getPos()
	{
		return this.pos;
	}
	
	/**
	 * Accesseur en lecture des points de déplacement disponibles.
	 * @return le nombre de points de déplacement du personnage
	 */
	public int getPointDeplacement()
	{
		return this.pointDeplacement;
	}


	/**
	 * Ajouter ou enlever des points de déplacement au personnage.
	 * @param ajout vrai ou faux selon si on ajoute ou enlève des points
	 * @param pointDeplacement le nombre de point de déplacement à modifier
	 */
	public void modifierPointDeplacement(boolean ajout, int pointDeplacement)
	{
		if (ajout == true)
			this.pointDeplacement += pointDeplacement;
		else
			this.pointDeplacement -= pointDeplacement;
	}
	
	
	/**
	 * déplacer un personnage su la map.
	 * @param deplacement voulu
	 * @return vrai ou faux selon si le deplacement a pu être fait
	 */
	public boolean deplacer(Deplacement deplacement)
	{
		if (!deplacement.deplacementValide())
			return false;
		this.pos = deplacement.newPos;
		return true;
	}
}
