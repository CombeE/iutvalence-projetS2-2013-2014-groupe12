package rpg;

public class Positions 
{
	private int ligne;
	private int colonne;
	
	public Positions(int longueur, int largeur)
	{
		this.ligne = largeur;
		this.colonne = longueur;
	}
	
	public int getLigne()
	{
		return this.ligne;
	}
	
	public int getColonne()
	{
		return this.colonne;
	}
}
