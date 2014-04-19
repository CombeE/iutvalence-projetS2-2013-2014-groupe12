package rpg;

public class Launcher
{

	public static void main(String[] args)
	{
		Partie nouvellePartie = new Partie();
		
		Partie.lancerPartie();
		System.out.println("Vous venez de lancer une nouvelle partie.");
		
		System.out.println(nouvellePartie.getPlateau().toString());
		
	}

}
