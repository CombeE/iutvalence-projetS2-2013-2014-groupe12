package rpg;

public class Partie
{
	
	private Plateau plateau;
	private Joueur joueur;
	
	public Partie()
	{
		this.plateau = new Plateau();
		
		this.joueur = new Joueur("Joueur 1");

	}
	
	public void passerTour(Perso persoEnCours)
	{
		this.joueur.getEquipe().getListePerso().indexOf(persoEnCours);
	}
	
	public Plateau getPlateau()
	{
		return this.plateau;
	}
	
	
}