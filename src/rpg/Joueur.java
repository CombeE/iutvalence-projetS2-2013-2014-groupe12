package rpg;

public class Joueur
{
	private int nbPointVie;
	private String nom;
	private Equipe equipe;
	
	public Joueur(String nom)
	{
		this.nom = nom;
	}
	
	public int getNbPointVie()
	{
		return this.nbPointVie;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public Equipe getEquipe()
	{
		return this.equipe;
	}
	
	public boolean aGagne()
	{
		if (this.nbPointVie == 0)
			return true;
		return false;
	}
}
