package rpg;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BoutonGuerrier extends BoutonPerso
{

	public BoutonGuerrier(ActionListener auditeurDEvenement)
	{
		super(auditeurDEvenement);
		this.type = DescriptionType.GUERRIER;	
		this.setText("Guerrier");
		this.setIcon(null);
	}
}