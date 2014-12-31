package presentation.client;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FrameRechercheClient extends JFrame {
	/** procedure de lancement du programme 
	 * @throws Exception **/	
	
	JPanel panel;
	
	public FrameRechercheClient(String title) {
		super(title);
		
		panel = new PanelRechercheClient(this);
		
		// configuration de la fenêtre
		setLocationRelativeTo(null);
		setSize(300, 500);

		getContentPane().setSize(300,500);
		//setDefaultCloseOperation();
		
		getContentPane().add(panel);

		getContentPane().setSize(300,400);
		setLayout(new BorderLayout());
		//setDefaultCloseOperation();
		
		getContentPane().add(panel, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
	}//fin main
}