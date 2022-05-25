package Ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import auto.carro;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

import java.awt.SystemColor;
import java.awt.Window;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Ventana_opciones extends JPanel {

	/**
	 * Create the panel.
	 */
	private ventana_registrar vr;
	private ventana_catalogo vc;
	private Ventana_opciones vo;
	public ArrayList<carro> listC = new ArrayList<carro>();

	public JButton btnNewButton = new JButton("REGISTRAR");
	public Ventana_opciones() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 3, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(21, 21, 425, 441);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblSajacar = new JLabel("SAJACAR");
		lblSajacar.setHorizontalAlignment(SwingConstants.CENTER);
		lblSajacar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 31));
		lblSajacar.setBounds(116, 10, 178, 28);
		panel.add(lblSajacar);
		
		JEditorPane dtrpnBienvenidoEstaEs = new JEditorPane();
		dtrpnBienvenidoEstaEs.setEditable(false);
		dtrpnBienvenidoEstaEs.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		dtrpnBienvenidoEstaEs.setBackground(SystemColor.control);
		dtrpnBienvenidoEstaEs.setText("BIENVENIDO.  \r\nEsta es la aplicacion oficial de SAJACAR, espero que disfrutes \r\ncon nosotros esta experiencia y recuerda... \r\nQuieres un sue\u00F1o en SAJACAR lo cumpliras.");
		dtrpnBienvenidoEstaEs.setBounds(10, 60, 407, 82);
		panel.add(dtrpnBienvenidoEstaEs);
		
		JLabel lblElijeUnaOpcin = new JLabel("Elije una opci\u00F3n:");
		lblElijeUnaOpcin.setHorizontalAlignment(SwingConstants.LEFT);
		lblElijeUnaOpcin.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		lblElijeUnaOpcin.setBounds(10, 147, 178, 28);
		panel.add(lblElijeUnaOpcin);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vr = new ventana_registrar(vo);
				JFrame a = new JFrame();
				
				a.setBounds(50, 50, 650, 400);
				a.getContentPane().add(vr);
				a.setVisible(true);
				btnNewButton.setEnabled(false);

			}	
		});
		btnNewButton.setEnabled(true);
		btnNewButton.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(20, 185, 178, 39);
		panel.add(btnNewButton);
		
		JButton btnCatalogo = new JButton("CATALOGO");
		btnCatalogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vc = new ventana_catalogo(vo);
				JFrame a = new JFrame();
				a.setBounds(50, 50, 800, 800);
				a.getContentPane().add(vc);
				a.setVisible(true);
			}
		});
		btnCatalogo.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		btnCatalogo.setBounds(20, 251, 178, 39);
		panel.add(btnCatalogo);
		
		JButton btnComprar = new JButton("COMPRAR");
		btnComprar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		btnComprar.setBounds(20, 313, 178, 39);
		panel.add(btnComprar);
		
		JButton btnVender = new JButton("VENDER");
		btnVender.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 20));
		btnVender.setBounds(20, 375, 178, 39);
		panel.add(btnVender);
		
		vo=this;
	}
	public void add(carro d) {
		listC.add(d);
	}
}
