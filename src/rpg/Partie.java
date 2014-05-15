package rpg;

import java.util.List;

public class Partie
{
	
	private Plateau plateau;
	private Joueur joueur;
	/**
	 * pour appeler sur le joueur en cours les methodes sans avoir à le chercher à chaque fois dans
	 * la liste des persos
	 */
	private Perso persoEnCours;
	/**
	 * La liste des personnages ennemies pour simplifier la méthode attaquer
	 */
	private List<Perso> listePersoEnnemie;
	
	public Partie()
	{
		this.plateau = new Plateau();
		
		this.joueur = new Joueur("Joueur 1");
		
		this.persoEnCours = null;
		
		for (int indiceDeParcoursDeLaListeEnnemie = 0; indiceDeParcoursDeLaListeEnnemie<joueur.getEquipe().getNbPerso(); indiceDeParcoursDeLaListeEnnemie++)
		{
			//Importation du module random pour placer les personnages ennemis partout sur la map
		}

	}
	
	public Perso persoSuivant()
	{
		int temp = this.joueur.getEquipe().getListePerso().indexOf(this.persoEnCours);
		if (temp != this.joueur.getEquipe().getNbPerso())
			return this.joueur.getEquipe().getListePerso().get(temp+1);
		return this.joueur.getEquipe().getListePerso().get(0);
	}
	
	public void passerTour()
	{
		this.persoEnCours = persoSuivant();
	}
	
	public void seDeplacer(Direction dir)
	{
		Positions posActu = this.persoEnCours.getPos();
		
		Positions newPos;
		
		switch(dir)
		{
		case DROITE:
		{
			newPos = new Positions(posActu.getLigne()+1, posActu.getColonne());
		}
			
		case GAUCHE:
		{
			newPos = new Positions(posActu.getLigne()-1, posActu.getColonne());	
		}
		
		case HAUT:
		{
			newPos = new Positions(posActu.getLigne(), posActu.getColonne()-1);
		}
		
		case BAS:
		{
			newPos = new Positions(posActu.getLigne(), posActu.getColonne()+1);
		}
		
		default:
		{
			newPos = new Positions(posActu.getLigne(), posActu.getColonne()); 
		}
		}
		this.persoEnCours.deplacer(newPos);
	}
	
	public void attaquer(Positions pos)
	{
		if (plateau.getPlateau()[pos.getLigne()][pos.getColonne()] == EtatDesCases.LIBRE)
			return;
		Perso persoAttaque;
		for (int persoSurLaPosSelectionnee = 0; persoSurLaPosSelectionnee<joueur.getEquipe().getNbPerso(); persoSurLaPosSelectionnee++)
		{
			//Recherche la correspondance entre la pos passé en parametre et le perso ennemi qui s'y trouve
		}
		
			
	}
	
	public Plateau getPlateau()
	{
		return this.plateau;
	}
	
	
}