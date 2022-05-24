package Ventanas;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;

public class ventana_registrar extends JPanel {
	private JTextField in_usuario;
	private JPasswordField in_password;

	/**
	 * Create the panel.
	 */
	public ventana_registrar() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 3, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(22, 22, 471, 265);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRO ");
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 18));
		lblNewLabel.setBounds(27, 25, 119, 34);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("En los siguientes campos ingrese la informacion requerida:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 69, 451, 19);
		panel.add(lblNewLabel_1);
		
		JLabel lblUser = new JLabel("USUARIO:");
		lblUser.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblUser.setBounds(50, 104, 119, 34);
		panel.add(lblUser);
		
		JLabel lblSajacar = new JLabel("SAJACAR");
		lblSajacar.setFont(new Font("Copperplate Gothic Bold", Font.BOLD | Font.ITALIC, 18));
		lblSajacar.setBounds(323, 25, 119, 34);
		panel.add(lblSajacar);
		
		in_usuario = new JTextField();
		in_usuario.setBounds(208, 110, 219, 25);
		panel.add(in_usuario);
		in_usuario.setColumns(10);
		
		JLabel lblPassword = new JLabel("CONTRASE\u00D1A:");
		lblPassword.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblPassword.setBounds(50, 155, 137, 34);
		panel.add(lblPassword);
		
		JButton btn_cancelar = new JButton("CANCELAR");
		btn_cancelar.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		btn_cancelar.setBounds(86, 220, 119, 35);
		panel.add(btn_cancelar);
		
		JButton btn_ingresar = new JButton("INGRESAR");
		btn_ingresar.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		btn_ingresar.setBounds(241, 220, 119, 35);
		panel.add(btn_ingresar);
		
		in_password = new JPasswordField();
		in_password.setBounds(208, 160, 219, 28);
		panel.add(in_password);

	}
}
