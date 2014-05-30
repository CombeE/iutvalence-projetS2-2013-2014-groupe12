package rpg;

/**
 * @author Camille Blaser - Ervan Combe
 *
 */
public class Plateau 
{
	
	/**
	 * Longueur du plateau de jeu.
	 */
	public final static int LONGUEUR_DE_LA_MAP = 25;
	
	/**
	 * Largeur du plateau de jeu.
	 */
	public final static int LARGEUR_DE_LA_MAP = 25;
	
	/**
	 * Le tableau représentant le plateau de jeu. Les cases sont libres ou occupées.
	 */
	private EtatDesCases[][] plateau;
	
	
	/**
	 * Créer un nouveau plateau, par défaut, les cases sont libres.
	 */
	public Plateau()
	{
		this.plateau = new EtatDesCases[LONGUEUR_DE_LA_MAP][LARGEUR_DE_LA_MAP]; 
		for (int indiceParcoursLongueurMap=0; indiceParcoursLongueurMap<LONGUEUR_DE_LA_MAP; indiceParcoursLongueurMap++)
			for (int indiceParcoursLargeurMap=0; indiceParcoursLargeurMap<LARGEUR_DE_LA_MAP; indiceParcoursLargeurMap++)
				this.plateau[indiceParcoursLongueurMap][indiceParcoursLargeurMap] = EtatDesCases.LIBRE;
	}
	
	
	/**
	 * Obtenir la représentation du plateau de jeu.
	 * @return le tableau
	 */
	public EtatDesCases[][] getPlateau()
	{
		return this.plateau;
	}
	
	
	/**
	 * Mettre à jour l'état des cases du plateau de jeu.
	 * @param pos la position de départ devant changer d'état
	 * @param newPos la position d'arrivée devant changer d'état
	 */
	public void majPlateau(Positions pos, Positions newPos)
	{
		if (!(newPos == null))
		{
			this.plateau[pos.getLigne()][pos.getColonne()] = EtatDesCases.LIBRE;
			this.plateau[newPos.getLigne()][newPos.getColonne()] = EtatDesCases.OCCUPEE;
			return;
		}
		if (this.plateau[pos.getLigne()][pos.getColonne()] == EtatDesCases.OCCUPEE)
			return;
		this.plateau[pos.getLigne()][pos.getColonne()] = EtatDesCases.OCCUPEE;
	}
	
	public String toString()
	{
		String res = "";
		for (int indiceParcoursLongueurMap=0; indiceParcoursLongueurMap<Plateau.LONGUEUR_DE_LA_MAP; indiceParcoursLongueurMap++)
		{	
			for (int indiceParcoursLargeurMap=0; indiceParcoursLargeurMap<Plateau.LARGEUR_DE_LA_MAP; indiceParcoursLargeurMap++)
				{
				if (this.plateau[indiceParcoursLongueurMap][indiceParcoursLargeurMap] == EtatDesCases.LIBRE)
					res+="L";
				else
					res+="O";
				}
		res+="\n";
		}
		return res;
	}
}
