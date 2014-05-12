package rpg;

import java.util.List;

public class Equipe
{
	private int nbPerso;
	/**
	 * Liste pour permettre le passage au tour du joueur suivant plus simple
	 */
	private List<Perso> equipe;
	
	public Equipe(int nbPerso)
	{
		this.nbPerso = nbPerso;
	}
	
	public int getNbPerso()
	{
		return this.nbPerso;
	}
	
	public void affectePerso(Perso perso)
	{
		for (int i=1; i<this.nbPerso;i++)
			this.equipe.add(perso);
	}
}
