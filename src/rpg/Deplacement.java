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
	
	/**
	 * Créer un nouveau déplacement.
	 * @param posDep la position de départ
	 * @param posArriv la position d'arrivée
	 */
	public Deplacement(Positions posDep, Positions posArriv)
	{
		this.posDep = posDep;
		this.newPos = posArriv;
	}
	
	/**
	 * Obtenir la position de départ.
	 * @return la position de départ
	 */
	public Positions getPosDep()
	{
		return this.posDep;
	}
	
	/**
	 * Obtenir la position d'arrivée.
	 * @return la position d'arrivée
	 */
	public Positions getNewPos()
	{
		return this.newPos;
	}
	
	/**
	 * Savoir si le déplacement demandé est valide.
	 * @param pointDeplacement les points de déplacement disponibles du personnage
	 * @return vrai ou faux
	 */
	public boolean deplacementValide(int pointDeplacement)
	{
		int distance = 0;
		if (this.posDep.getLigne() < this.newPos.getLigne())
			distance += this.newPos.getLigne()-this.posDep.getLigne();
		else
			distance += this.posDep.getLigne() - this.newPos.getLigne();
		if (this.posDep.getColonne() < this.newPos.getColonne())
			distance += this.newPos.getColonne() - this.posDep.getColonne();
		else
			distance += this.posDep.getColonne() - this.newPos.getColonne();
		if (pointDeplacement - distance < 0)
			return false;
		
		return true;
		
		
	}

}
