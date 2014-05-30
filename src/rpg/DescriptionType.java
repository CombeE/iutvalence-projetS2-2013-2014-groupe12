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


	private String label;
	
	private int ptVie;
	
	private int ptAttaque;
	
	private int ptDefense;
	
	private int ptPuissance;
	
	private int ptMana;
	
	private int portee;
	
	private int ptDeplacement;
	
	
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
	
	public String obtenirLabel()
	{
		return this.label;
	}
	
	public int obtenirPtVie()
	{
		return this.ptVie;
	}
	
	public int obtenirPtAttaque()
	{
		return this.ptAttaque;
	}
	
	public int obtenirPtDefense()
	{
		return this.ptDefense;
	}
	
	public int obtenirPtPuissance()
	{
		return this.ptPuissance;
	}
	
	public int obtenirPtMana()
	{
		return this.ptMana;
	}
	
	public int obtenirPortee()
	{
		return this.portee;
	}
	
	public int obtenirPtDeplacement()
	{
		return this.ptDeplacement;
	}
	
	public static int entierAleatoire(int min, int max)
	{
		Random rand = new Random();
		return min+rand.nextInt(max+1);
	}
}