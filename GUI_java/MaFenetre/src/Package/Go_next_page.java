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
