package rpg;

public class Perso
{
	private Type type;
	private int ptVie;
	private int ptAttaque;
	private int ptDefense;
	private int ptPuissance;
	private int ptMana;
	private Positions pos;
	/** Cet attribut n'est pas une constante car une technique pourrait en faire bouger sa valeur
	 */
	private int pointDeplacement;
	
	/**
	 * Passer le plateau en paramètre permet d'appeller la méthode ajouter... afin de passer l'état
	 * de la case sur laquelle le perso arrive à occupée.
	 */
	public Perso(Plateau plateau, int ptVie,int ptAttaque,int ptDefense,int ptPuissance,int ptMana, Positions pos)
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
	
	public Type getType()
	{
		return this.type;
	}
	
	public int getPtVie()
	{
		return this.ptVie;
	}
	
	public int getPtAttaque()
	{
		return this.ptAttaque;
	}
	
	public int getPtDefense()
	{
		return this.ptDefense;
	}
	
	public int getPtPuissance()
	{
		return this.ptPuissance;
	}
	
	public int getPtMana()
	{
		return this.ptMana;
	}
	
	public Positions getPos()
	{
		return this.pos;
	}
	
	public int getPointDeplacement()
	{
		return pointDeplacement;
	}

	/**
	 * Le boolean passé en paramètre permet de dire si l'on veut ajouter ou enlever des points de
	 * déplacements au personnage ou lui en ajouter
	 */
	public void modifierPointDeplacement(boolean ajout, int pointDeplacement)
	{
		if (ajout == true)
			this.pointDeplacement += pointDeplacement;
		else
			this.pointDeplacement -= pointDeplacement;
	}

	public boolean deplacer(Positions newPos)
	{
		if (!Deplacement.deplacementValide(this.pos, newPos, this.pointDeplacement))
			return false;
		return true;
	}
}
