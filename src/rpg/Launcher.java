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
			equipe1[indicePerso] = new Perso(nouvellePartie.getPlateau());
		}
		nouvellePartie.choisirEquipe(nouvellePartie.getJoueur(1), equipe1);
		Equipe eq = new Equipe(3);
		for (int indicePerso = 0; indicePerso<eq.getNbPerso(); indicePerso++)
		{
			eq.affectePerso(equipe1);
			nouvellePartie.getJoueur(1).ajoutPerso(equipe1[indicePerso]);
		}

		System.out.println(eq.toString());
		
		Perso[] equipe2 = null;
		equipe2 = new Perso[3];
		for (int indicePersoAdverse = 0; indicePersoAdverse<nouvellePartie.getJoueur(2).getEquipe().getNbPerso(); indicePersoAdverse++)
		{
			equipe2[indicePersoAdverse] = new Perso(nouvellePartie.getPlateau());
			nouvellePartie.getJoueur(2).ajoutPerso(equipe2[indicePersoAdverse]);
		}
		nouvellePartie.choisirEquipe(nouvellePartie.getJoueur(2), equipe2);
		Equipe eq2 = new Equipe(3);
		for (int i = 0; i<eq2.getNbPerso(); i++)
		{
			eq2.affectePerso(equipe2);
		}
		System.out.println("Equipe adverse : "+eq2.toString());
		
		System.out.println(nouvellePartie.getPlateau().toString());
		
		//Tour de jeu
		nouvellePartie.persoSuivant();
		//Déplacement
		System.out.println("Position du personnage avant deplacement : "+nouvellePartie.getPersoEnCours().getPos().getLigne()+", "+nouvellePartie.getPersoEnCours().getPos().getColonne());
		
		Positions posDepart = nouvellePartie.getPersoEnCours().getPos();
		if (nouvellePartie.getPersoEnCours().deplacer(new Deplacement(nouvellePartie.getPersoEnCours().getPos(), new Positions(nouvellePartie.getPersoEnCours().getPos().getLigne(), nouvellePartie.getPersoEnCours().getPos().getColonne()+3))))
		{
			nouvellePartie.getPlateau().majPlateau(posDepart, nouvellePartie.getPersoEnCours().getPos());
			System.out.println("deplacement prit en compte");
		}
		else
			System.out.println("deplacement invalide");

		System.out.println("Position du personnage après deplacement : "+nouvellePartie.getPersoEnCours().getPos().getLigne()+", "+nouvellePartie.getPersoEnCours().getPos().getColonne());
		
		
		//Attaque
		System.out.println("point de vie du personnage attaqué avant l'attaque : "+nouvellePartie.getJoueur(2).getEquipe().getListePerso().get(0).getPtVie());
		
		nouvellePartie.attaquer(nouvellePartie.getJoueur(2).getEquipe().getListePerso().get(0).getPos());
		
		System.out.println("point de vie du personnage attaqué après l'attaque : "+nouvellePartie.getJoueur(2).getEquipe().getListePerso().get(0).getPtVie());
		
		
		//Rafraichissement du plateau
		Joueur autreJoueur;
		if (nouvellePartie.getJoueurEnCours() == nouvellePartie.getJoueur(1))
			autreJoueur = nouvellePartie.getJoueur(2);
		else
			autreJoueur = nouvellePartie.getJoueur(1);
			
		for (Perso perso : nouvellePartie.getJoueurEnCours().getEquipe().getListePerso())
			if (perso.getPtVie() == 0)
				nouvellePartie.getJoueurEnCours().getEquipe().getListePerso().remove(nouvellePartie.getJoueurEnCours().getEquipe().getListePerso().indexOf(perso));
		
		
		for (Perso perso2 : autreJoueur.getEquipe().getListePerso())
			if (perso2.getPtVie() == 0)
				autreJoueur.getEquipe().getListePerso().remove(autreJoueur.getEquipe().getListePerso().indexOf(perso2));
		System.out.println(nouvellePartie.getPlateau().toString());
		//Vérification de la victoire
		
	
	}
	
	
	

}
