# GUI_Java
Aide pour faire des intefaces en Java


#Prerequisit
Dans Eclipse créer un nouveau projet, dans ce projet un nouveau package.
Clique droit sur package ==> New ==> Others ==> Dossier WindowBuilder (si le dossier n'apparaît pas télécharger le module d'éclipse : https://www.eclipse.org/windowbuilder/download.php)


#Premiere Fenetre

package Package;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ma_fenetre {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ma_fenetre window = new ma_fenetre();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ma_fenetre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Go next Page");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				 try
			        {
					 Go_next_page nextpage = new Go_next_page();
					 nextpage.main(null); // On lance la fonction main qui lance l'interface
			        }
			        catch (Exception ex)
			        {
			            ex.printStackTrace();
			        }
			}
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
	}

}


#Deuxieme fenetre

package Package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;

public class Go_next_page {

	JFrame frame;
	private JTextField txtEtVoila;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Go_next_page window = new Go_next_page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Go_next_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtEtVoila = new JTextField();
		txtEtVoila.setText("Et voila =) ");
		frame.getContentPane().add(txtEtVoila, BorderLayout.CENTER);
		txtEtVoila.setColumns(10);
	}

}
