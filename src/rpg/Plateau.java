package rpg;

public class Plateau 
{
	public final static int LONGUEUR_DE_LA_MAP = 50;
	public final static int LARGEUR_DE_LA_MAP = 50;
	private EtatDesCases[][] plateau;
	
	
	public Plateau()
	{
		this.plateau = new EtatDesCases[LONGUEUR_DE_LA_MAP][LARGEUR_DE_LA_MAP]; 
		for (int indiceParcoursLongueurMap=0; indiceParcoursLongueurMap<LONGUEUR_DE_LA_MAP; indiceParcoursLongueurMap++)
			for (int indiceParcoursLargeurMap=0; indiceParcoursLargeurMap<LARGEUR_DE_LA_MAP; indiceParcoursLargeurMap++)
				this.plateau[indiceParcoursLongueurMap][indiceParcoursLargeurMap] = EtatDesCases.LIBRE;
		
	}
}
