package rpg;

import java.awt.event.ActionListener;

public class BoutonArcher extends BoutonPerso
{

	public BoutonArcher(ActionListener auditeurDEvenement)
	{
		super(auditeurDEvenement);
		this.type = DescriptionType.ARCHER;	
		this.setText("Archer");
		this.setIcon(null);
	}
}
