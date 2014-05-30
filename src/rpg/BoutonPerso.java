package rpg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class BoutonPerso extends JButton
{
	protected DescriptionType type;
	
	protected ActionListener auditeurDEvenement;
	
	public BoutonPerso(ActionListener auditeurDEvenement)
	{
		this.type = null;
		
		this.auditeurDEvenement = auditeurDEvenement;
		this.addActionListener(auditeurDEvenement);
	}
	
	public DescriptionType getType()
	{
		return this.type;
	}
}
