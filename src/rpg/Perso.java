package rpg;

public class Perso
{
	private int ptVie;
	private int ptAttaque;
	private int ptDefense;
	private int ptPuissance;
	private int ptMana;
	
	public Perso(int ptVie,int ptAttaque,int ptDefense,int ptPuissance,int ptMana)
	{
		this.ptVie = ptVie;
		this.ptAttaque = ptAttaque;
		this.ptDefense = ptDefense;
		this.ptPuissance = ptPuissance;
		this.ptMana = ptMana;
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
}
