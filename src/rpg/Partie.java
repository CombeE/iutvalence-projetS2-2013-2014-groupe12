package rpg;

public class Partie
{
	
	private Plateau plateau;
	private Joueur joueur;
	
	public Partie()
	{
		this.plateau = new Plateau();
		this.joueur = null;
	}
	
	public static void lancerPartie() 
	{
	}
	
	public Plateau getPlateau()
	{
		return this.plateau;
	}
	
}