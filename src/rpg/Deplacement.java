package rpg;

/**
 * @author Camille Blaser - Ervan Combe
 *
 */
public class Deplacement {

	/**
	 * La position de départ.
	 */
	private Positions posDep;
	
	/**
	 * La position d'arrivée souhaitée.
	 */
	private Positions newPos;
	
	public Deplacement(Positions posDep, Positions posArriv)
	{
		this.posDep = posDep;
		this.newPos = posArriv;
	}
	
	public Positions getPosDep()
	{
		return this.posDep;
	}
	
	public Positions getNewPos()
	{
		return this.newPos;
	}
	/**
	 * Savoir si le déplacement demandé est valide.
	 * @param pointDeplacement 
	 * @param pos 
	 * @param deplacement 
	 * @return vrai ou faux
	 */
	public boolean deplacementValide(int pointDeplacement, Deplacement deplacement)
	{
		int distance = 0;
		if (deplacement.posDep.getLigne() < deplacement.newPos.getLigne())
			distance += newPos.getLigne()-posDep.getLigne();
		else
			distance += posDep.getLigne() - newPos.getLigne();
		if (deplacement.posDep.getColonne() < deplacement.newPos.getColonne())
			distance += newPos.getColonne() - posDep.getColonne();
		else
			distance += posDep.getColonne() - newPos.getColonne();
		if (pointDeplacement - distance < 0)
			return false;
		
		return true;
		
		
	}

}
