package rpg;

import java.util.Random;

/**
 * @author Camille Blaser - Ervan Combe
 *
 */
public enum DescriptionType
{
	/**
	 * Le type Archer.
	 */
	ARCHER("Archer",10,6,3,6,10,8,3),
	
	/**
	 * Le type Mage.
	 */
	MAGE("Mage",9,4,2,12,15,6,3),
	
	/**
	 * Le type Guerrier.
	 */
	GUERRIER("Guerrier",12,9,5,0,6,1,6);


	/**
	 * Nom du type.
	 */
	private String label;
	
	/**
	 * Points de vie associés au type.
	 */
	private int ptVie;
	
	/**
	 * Points d'attaque associés au type.
	 */
	private int ptAttaque;
	
	/**
	 * Points de défense asociés au type.
	 */
	private int ptDefense;
	
	/**
	 * Point de puissance associés au type.
	 */
	private int ptPuissance;
	
	/**
	 * Point de mana associés au type.
	 */
	private int ptMana;
	
	/**
	 * Portée associée au type.
	 */
	private int portee;
	
	/**
	 * Point de déplacement associés au type.
	 */
	private int ptDeplacement;
	
	/**
	 * Créer un nouveau type.
	 * @param label son nom
	 * @param ptVie ses points de vie de base
	 * @param ptAttaque ses points d'attaque de base
	 * @param ptDefense ses points de défense de base
	 * @param ptPuissance sa puissance de base
	 * @param ptMana ses points de mana de base
	 * @param portee sa portée
	 * @param ptDeplacement ses points de déplacement de base
	 */
	private DescriptionType(String label, int ptVie, int ptAttaque,
			int ptDefense, int ptPuissance, int ptMana, int portee, int ptDeplacement)
	{
		this.label = label;
		this.ptVie = ptVie;
		this.ptAttaque = ptAttaque;
		this.ptDefense = ptDefense;
		this.ptPuissance = ptPuissance;
		this.ptMana = ptMana;
		this.portee = portee;
		this.ptDeplacement = ptDeplacement;
	}
	
	/**
	 * Obtenir le nom.
	 * @return le nom
	 */
	public String obtenirLabel()
	{
		return this.label;
	}
	
	/**
	 * Obtenir les points de vie
	 * @return nombre de points de vie
	 */
	public int obtenirPtVie()
	{
		return this.ptVie;
	}
	
	/**
	 * Obtenir les points d'attque
	 * @return nombre de points d'attque
	 */
	public int obtenirPtAttaque()
	{
		return this.ptAttaque;
	}
	
	/**
	 * Obtenir les points de défense.
	 * @return nombre de points de défense
	 */
	public int obtenirPtDefense()
	{
		return this.ptDefense;
	}
	
	/**
	 * Obtenir la puissance du type.
	 * @return nombre de points de puissance
	 */
	public int obtenirPtPuissance()
	{
		return this.ptPuissance;
	}
	
	/**
	 * Obtenir les points de mana
	 * @return nombre de points de mana
	 */
	public int obtenirPtMana()
	{
		return this.ptMana;
	}
	
	/**
	 * Obtenir la portée du type.
	 * @return nombre de points de portée
	 */
	public int obtenirPortee()
	{
		return this.portee;
	}
	
	/**
	 * Obtenir les points de déplacement du type.
	 * @return nombre de points de déplacement
	 */
	public int obtenirPtDeplacement()
	{
		return this.ptDeplacement;
	}
	
	/**
	 * Obtenir un entier au hasard.
	 * @param min nombre minimum de l'entier
	 * @param max nombre maximum de l'entier
	 * @return un entier
	 */
	public static int entierAleatoire(int min, int max)
	{
		Random rand = new Random();
		return min+rand.nextInt(max+1);
	}
}