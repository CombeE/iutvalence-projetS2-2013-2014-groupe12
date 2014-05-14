package rpg;

public class Partie
{
	
	private Plateau plateau;
	private Joueur joueur;
	private Perso persoEnCours;
	
	public Partie()
	{
		this.plateau = new Plateau();
		
		this.joueur = new Joueur("Joueur 1");
		
		this.persoEnCours = null;

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
		}
	}
	
	public Plateau getPlateau()
	{
		return this.plateau;
	}
	
	
}