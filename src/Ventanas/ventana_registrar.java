package Ventanas;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.Window;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;

import validaciones.logica;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ventana_registrar extends JPanel {
	private JTextField in_usuario;
	private JPasswordField in_password;
	public boolean abierto=true;
	private logica lg = new logica();
	/**
	 * Create the panel.
	 */
	public boolean getAbierto() {
		return abierto;
	}


	public JButton btn_cancelar = new JButton("CANCELAR");
	public ventana_registrar(Ventana_opciones vt) {
		setBackground(Color.WHITE);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new MatteBorder(5, 3, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(22, 22, 471, 265);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("REGISTRO ");
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 28));
		lblNewLabel.setBounds(27, 25, 170, 34);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("En los siguientes campos ingrese la informacion requerida:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 69, 451, 19);
		panel.add(lblNewLabel_1);

		JLabel lblUser = new JLabel("USUARIO:");
		lblUser.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 18));
		lblUser.setBounds(60, 104, 119, 34);
		panel.add(lblUser);

		JLabel lblSajacar = new JLabel("");
		lblSajacar.setIcon(new ImageIcon(ventana_registrar.class.getResource("/Resources/logo130.png")));
		lblSajacar.setFont(new Font("Copperplate Gothic Bold", Font.BOLD | Font.ITALIC, 18));
		lblSajacar.setBounds(323, 25, 119, 34);
		panel.add(lblSajacar);

		in_usuario = new JTextField();
		in_usuario.setBounds(208, 110, 219, 25);
		panel.add(in_usuario);
		in_usuario.setColumns(10);

		JLabel lblPassword = new JLabel("CONTRASE\u00D1A:");
		lblPassword.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblPassword.setBounds(60, 155, 137, 34);
		panel.add(lblPassword);


		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Window w = SwingUtilities.getWindowAncestor(panel);

				w.setVisible(false);
				panel.setVisible(false);
				vt.btnNewButton.setEnabled(true);
			}
		});
		btn_cancelar.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		btn_cancelar.setBounds(86, 220, 119, 35);
		panel.add(btn_cancelar);

		JButton btn_ingresar = new JButton("INGRESAR");
		btn_ingresar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				registro_vehiculo v = new registro_vehiculo(vt);

				if(lg.validarContra(in_usuario.getText(), in_password.getText())) {
					JFrame a = new JFrame();
					a.setBounds(50, 50, 800, 900);
					a.getContentPane().add(v);
					a.show();
					Window w = SwingUtilities.getWindowAncestor(panel);

					w.setVisible(false);
					panel.setVisible(false);
					vt.btnNewButton.setEnabled(true);
				}else {
					ventans("Usuario o contrase?a incorrectas");
				}
			}
		});
		btn_ingresar.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		btn_ingresar.setBounds(241, 220, 119, 35);
		panel.add(btn_ingresar);

		in_password = new JPasswordField();
		in_password.setBounds(208, 160, 219, 28);
		panel.add(in_password);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(ventana_registrar.class.getResource("/Resources/candado40.png")));
		lblNewLabel_2.setBounds(5, 149, 45, 40);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(ventana_registrar.class.getResource("/Resources/usua40.png")));
		lblNewLabel_2_1.setBounds(10, 98, 45, 40);
		panel.add(lblNewLabel_2_1);

	}

	public void ventans(String text) {
		JOptionPane.showMessageDialog(this, text);
	}
}

