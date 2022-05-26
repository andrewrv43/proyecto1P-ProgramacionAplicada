package Ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;

public class confirmacion_subir extends JPanel {
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public confirmacion_subir() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(6, 3, 2, 2, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 10, 366, 188);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblSajacar = new JLabel("SAJA CAR  ");
		lblSajacar.setIcon(null);
		lblSajacar.setHorizontalAlignment(SwingConstants.CENTER);
		lblSajacar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 31));
		lblSajacar.setBounds(77, 8, 243, 63);
		panel.add(lblSajacar);
		
		JLabel lblCodigo = new JLabel("Codigo:\r\n");
		lblCodigo.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigo.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 21));
		lblCodigo.setBounds(10, 69, 94, 41);
		panel.add(lblCodigo);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(114, 81, 158, 28);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnNewButton.setBounds(137, 142, 94, 36);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(confirmacion_subir.class.getResource("/Resources/redimensionar.png")));
		lblNewLabel.setBounds(280, 61, 40, 63);
		panel.add(lblNewLabel);

	}
}
