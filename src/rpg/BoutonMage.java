package rpg;

import java.awt.event.ActionListener;

public class BoutonMage extends BoutonPerso
{

	public BoutonMage(ActionListener auditeurDEvenement)
	{
		super(auditeurDEvenement);
		this.type = DescriptionType.MAGE;	
		this.setText("Mage");
		this.setIcon(null);
	}
}
