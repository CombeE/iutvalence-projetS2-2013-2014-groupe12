package rpg;

import java.util.List;

/**
 * @author Camille Blaser - Ervan Combe
 *
 */
public class Partie
{
	
	/**
	 * Le plateau de jeu d'une partie.
	 */
	private Plateau plateau;
	/**
	 * le joueur actuellement en train de jouer
	 */
	private Perso persoEnCours;
	
	/**
	 * Premier joueur de la partie.
	 */
	private Joueur joueur1;
	
	/**
	 * Deuxième joueur de la partie.
	 */
	private Joueur joueur2;
	
	/**
	 * Créer une nouvelle partie.
	 */
	public Partie()
	{
		this.plateau = new Plateau();
		
		this.joueur1 = new Joueur("Joueur 1");
		
		this.joueur2 = new Joueur("Joueur 2");
		
		this.persoEnCours = null;
	}

	/**
	 * Obtenir un joueur.
	 * @param numJoueur le numéro du joueur
	 * @return le joueur 2 ou 1
	 */
	public Joueur getJoueur(int numJoueur)
	{
		if (numJoueur == 1)
			return this.joueur1;
		return this.joueur2;
	}
	
	/**
	 * Un joueur choisit son équipe.
	 * @param joueur le joueur qui choisit
	 * @param listeP les personnages de l'équipe
	 */
	public void choisirEquipe(Joueur joueur, Perso listeP[])
	{
		for (int indicePerso = 0; indicePerso<joueur.getEquipe().getNbPerso(); indicePerso++)
		{
			joueur.getEquipe().affectePerso(listeP[indicePerso]);
		}
	}
	
	/**
	 * Un autre personnage prend la main et joue.
	 * @return personnage qui va jouer
	 */
	public Perso persoSuivant()
	{
		int temp = this.joueur1.getEquipe().getListePerso().indexOf(this.persoEnCours);
		if (temp != this.joueur1.getEquipe().getNbPerso())
			return this.joueur1.getEquipe().getListePerso().get(temp+1);
		return this.joueur1.getEquipe().getListePerso().get(0);
	}


	/**
	 * Passer le tour d'un personnage dans une partie.
	 */
	public void passerTour()
	{
		this.persoEnCours = persoSuivant();
	}
	
	
	/**
	 * Déplacer un personnage.
	 * @param dep le deplacement à effectuer
	 */
	public void seDeplacer(Deplacement dep)
	{
		this.persoEnCours.deplacer(dep);
	}
	
	/**
	 * Attaquer un personnage de l'équipe adverse.
	 * @param pos la position où se trouve le personnage à attaquer.
	 */
	public void attaquer(Positions pos)
	{
		if (this.plateau.getPlateau()[pos.getLigne()][pos.getColonne()] == EtatDesCases.LIBRE)
			return;
		//Perso persoAttaque = persoSurPlateau.get(pos);
		
					
	}
	
	
	/**
	 * Obtenir le plateau de jeu.
	 * @return le plateau
	 */
	public Plateau getPlateau()
	{
		return this.plateau;
	}
	
	
}
