package rpg;

/**
 * Classe de démarrage de l'application.
 */
public class Launcher
{
	
	public static void main(String[] args)
	{
		Partie nouvellePartie = new Partie();
		
		System.out.println("Vous venez de lancer une nouvelle partie.");
		
		System.out.println();
		
		System.out.println(nouvellePartie.getPlateau().toString());
		
	}

}
