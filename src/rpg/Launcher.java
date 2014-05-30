package rpg;

/**
 * Classe de démarrage de l'application.
 */
public class Launcher
{

	/**
	 * Méthode principale pour lancer le jeu.
	 * @param args arguments de la méthode
	 */
	public static void main(String[] args)
	{
		Partie nouvellePartie = new Partie();
		System.out.println("Vous venez de lancer une nouvelle partie.");
		Perso[] equipe1 = null;
		equipe1 = new Perso[3];
		for (int indicePerso = 0; indicePerso<nouvellePartie.getJoueur(1).getEquipe().getNbPerso(); indicePerso++)
		{
			equipe1[indicePerso] = new Perso(nouvellePartie.getPlateau(), 1, 1, 1, 1, 1, new Positions(indicePerso, 0));
		}
		nouvellePartie.choisirEquipe(nouvellePartie.getJoueur(1), equipe1);
		System.out.println(nouvellePartie.getPlateau().toString());
		
		
		
	}

}
