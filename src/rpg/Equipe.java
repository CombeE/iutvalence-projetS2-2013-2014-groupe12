package rpg;

import java.util.List;

public class Equipe
{
	private int nbPerso;
	private List<Perso> equipe;
	
	public Equipe(int nbPerso)
	{
		this.nbPerso = nbPerso;
	}
	
	public int getNbPerso()
	{
		return this.nbPerso;
	}
	
	//public void affectePerso()
	//{
	//	for (int i=1; i<this.nbPerso;i++)
	//		this.equipe.get(i)
	//}
}
