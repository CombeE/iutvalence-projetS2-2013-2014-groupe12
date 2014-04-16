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
	
	public Perso(int ptVie,int ptAttaque,int ptDefense,int ptPuissance,int ptMana, Positions pos)
	{
		this.ptVie = ptVie;
		this.ptAttaque = ptAttaque;
		this.ptDefense = ptDefense;
		this.ptPuissance = ptPuissance;
		this.ptMana = ptMana;
		this.pos = pos;
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
	
	public boolean deplacer(Positions newPos)
	{
		if (Deplacement.deplacementValide())
			return true;
		return false;
	}
}
