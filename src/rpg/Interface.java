package rpg;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class Interface implements Runnable,ActionListener
{
	private JSplitPane splitPanInferieur;

	@Override
	public void run()
	{
		JFrame fenetre = new JFrame();

		fenetre.setTitle("Selection des Persos");
		fenetre.setSize(800, 600);
		fenetre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		this.splitPanInferieur = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		this.splitPanInferieur.setLayout(new GridLayout(1,3));
		
		BoutonGuerrier boutonGuerrier = new BoutonGuerrier((ActionListener)this);
		BoutonMage boutonMage = new BoutonMage((ActionListener)this);
		BoutonArcher boutonArcher = new BoutonArcher((ActionListener)this);
		this.splitPanInferieur.add(boutonGuerrier);
		this.splitPanInferieur.add(boutonMage);
		this.splitPanInferieur.add(boutonArcher);
		
		fenetre.getContentPane().add(this.splitPanInferieur);
		fenetre.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent event)
	{
		BoutonPerso itemSelectionne = (BoutonPerso) event.getSource();
		if (itemSelectionne.getClass() == new BoutonArcher(null).getClass())
		{
			System.out.println("archer selectionne");
		}
		if (itemSelectionne.getClass() == new BoutonMage(null).getClass())
		{
			System.out.println("mage selectione");
		}
		
		if (itemSelectionne.getClass() == new BoutonGuerrier(null).getClass())
		{
			System.out.println("guerrier selectione");
		}
		
		
	}
	
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Interface());
	}
	
}
