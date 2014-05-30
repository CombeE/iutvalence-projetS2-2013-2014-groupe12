package rpg;

import java.util.Random;

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
	 * Poertée d'attaque du personnage
	 */
	private int portee;
	
	/**
	 * Création d'un nouveau personnage.
	 * @param ptVie ses points de vie disponibles
	 * @param ptAttaque ses points d'attque disponibles
	 * @param ptDefense ses points de defense disponibles
	 * @param ptPuissance sa puissance disponible
	 * @param ptMana ses points de mana disponibles
	 * @param pos sa position actuelle
	 * @param plateau le plataeau sur lequel est placé le joueur
	 * @param portee dont dispose le personnage
	 * @param type du personnage que l'on crée
	 */
	public Perso(Type type,Plateau plateau, int ptVie,int ptAttaque,int ptDefense,int ptPuissance,int ptMana,
			Positions pos, int portee)
	{
		this.type = type;
		this.ptVie = ptVie;
		this.ptAttaque = ptAttaque;
		this.ptDefense = ptDefense;
		this.ptPuissance = ptPuissance;
		this.ptMana = ptMana;
		this.pos = pos;
		this.pointDeplacement = 4;
		this.portee = portee;
		plateau.majPlateau(pos,null);
	}
	/**
	 * Génère un personnage aléatoire
	 * @param plateau sur lequel on ajoute le personnage
	 */
	public Perso(Plateau plateau)
	{
		this.type = new Type(DescriptionType.values()[new Random().nextInt(DescriptionType.values().length)],null);
		this.ptVie = this.type.getNomType().obtenirPtVie();
		this.ptAttaque = this.type.getNomType().obtenirPtAttaque();
		this.ptDefense = this.type.getNomType().obtenirPtDefense();
		this.ptPuissance = this.type.getNomType().obtenirPtPuissance();
		this.ptMana = this.type.getNomType().obtenirPtMana();
		this.pos = new Positions(new Random().nextInt(Plateau.LARGEUR_DE_LA_MAP),new Random().nextInt(Plateau.LONGUEUR_DE_LA_MAP));
		this.pointDeplacement = this.type.getNomType().obtenirPtDeplacement();
		this.portee = this.type.getNomType().obtenirPortee();
		plateau.majPlateau(this.pos,null);
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
	 * Accesseur en lecture de la portée d'attaque du personnage.
	 * @return la portée du personnage
	 */
	public int getPortee()
	{
		return this.portee;
	}
	
	/**
	 * Modifier les points de vie d'un personnage
	 * @param modif les points à ajouter ou soustraire
	 * @param ajout vrai si ajout, faux si soustraction
	 */
	public void modifierPtVie(int modif, boolean ajout)
	{
		if (ajout)
			this.ptVie += modif;
		else
			this.ptVie -= modif;
	}

	/**
	 * Modifier les points de mana d'un personnage
	 * @param modif les points a ajouter ou soustraire
	 * @param ajout vrai si ajout, faux si soustraction
	 */
	public void modifierPtMana(int modif, boolean ajout)
	{
		if (ajout)
			this.ptMana += modif;
		else
			this.ptMana -= modif;
	}
	
	/**
	 * Modifier la position d'un personnage.
	 * @param pos la nouvelle position du personnage
	 */
	public void modifierPos(Positions pos)
	{
		this.pos = pos;
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
		if (!deplacement.deplacementValide(this.pointDeplacement))
			return false;
		this.modifierPos(deplacement.getNewPos());
		return true;
	}
}
