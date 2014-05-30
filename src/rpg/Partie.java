package rpg;

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
	 * Joueur en train de joueur
	 */
	private Joueur joueurEnCours;
	
	/**
	 * Créer une nouvelle partie.
	 */
	public Partie()
	{
		this.plateau = new Plateau();
		
		this.joueur1 = new Joueur("Joueur 1");
		
		this.joueur2 = new Joueur("Joueur 2");
		
		this.joueurEnCours = joueur1;

		this.persoEnCours = null;
	}

	public Joueur getJoueur(int numJoueur)
	{
		if (numJoueur == 1)
			return this.joueur1;
		return this.joueur2;
	}
	
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
		if (this.persoEnCours == null)
		{
			this.persoEnCours = this.joueurEnCours.getEquipe().getListePerso().get(0);
		}
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
	
	public void attaquer(Positions pos)
	{
		if (plateau.getPlateau()[pos.getLigne()][pos.getColonne()] == EtatDesCases.LIBRE)
			return;
		Joueur joueurAttaque;
		if (this.joueurEnCours == joueur1)
			joueurAttaque = joueur2;
		else
			joueurAttaque = joueur1;
		Perso persoSurPlateau = joueurAttaque.getPosMap().get(pos);
		
		int distance = 0;
		if (persoSurPlateau.getPos().getLigne() < this.persoEnCours.getPos().getLigne())
			distance += this.persoEnCours.getPos().getLigne()-persoSurPlateau.getPos().getLigne();
		else
			distance += persoSurPlateau.getPos().getLigne() - this.getPersoEnCours().getPos().getLigne();
		if (persoSurPlateau.getPos().getColonne() < this.getPersoEnCours().getPos().getColonne())
			distance += this.getPersoEnCours().getPos().getColonne() - persoSurPlateau.getPos().getColonne();
		else
			distance += persoSurPlateau.getPos().getColonne() - this.getPersoEnCours().getPos().getColonne();
		
		if (this.persoEnCours.getPortee() < distance)
		{
			System.out.println("Cible hors d'atteinte.");
			return;
		}
		
		if (this.persoEnCours.getPtAttaque() < joueurAttaque.getPosMap().get(pos).getPtDefense())
			return;
				
		persoSurPlateau.modifierPtVie(this.persoEnCours.getPtAttaque()-joueurAttaque.getPosMap().get(pos).getPtDefense(), false);
		
					
	}
	
	
	/**
	 * Obtenir le plateau de jeu.
	 * @return le plateau
	 */
	public Plateau getPlateau()
	{
		return this.plateau;
	}
	
	public Joueur getJoueurEnCours()
	{
		return this.joueurEnCours;
	}
	
	public Perso getPersoEnCours()
	{
		return this.persoEnCours;
	}
	
	
	
}
