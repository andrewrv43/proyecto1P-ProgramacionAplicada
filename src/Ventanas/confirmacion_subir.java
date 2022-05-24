package Ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class confirmacion_subir extends JPanel {
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public confirmacion_subir() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 366, 188);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblSajacar = new JLabel("SAJACAR");
		lblSajacar.setHorizontalAlignment(SwingConstants.CENTER);
		lblSajacar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 31));
		lblSajacar.setBounds(82, 10, 178, 28);
		panel.add(lblSajacar);
		
		JLabel lblCodigo = new JLabel("Codigo:\r\n");
		lblCodigo.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 21));
		lblCodigo.setBounds(51, 69, 94, 41);
		panel.add(lblCodigo);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(150, 81, 158, 28);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnNewButton.setBounds(117, 142, 94, 36);
		panel.add(btnNewButton);

	}
}
