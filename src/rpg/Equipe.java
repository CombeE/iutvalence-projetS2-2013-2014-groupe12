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
	
	public List<Perso> getListePerso()
	{
		return this.equipe;
	}
	
	public void affectePerso(Perso perso)
	{
		this.equipe.add(perso);
	}
}
