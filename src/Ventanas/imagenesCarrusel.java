package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import auto.carro;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class imagenesCarrusel extends JDialog {

	private final JPanel contentPanel = new JPanel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			imagenesCarrusel dialog = new imagenesCarrusel(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public imagenesCarrusel(carro list) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel outImagen = new JLabel("");
		outImagen.setBounds(45, 46, 336, 204);
		contentPanel.add(outImagen);
		
		JLabel lblNewLabel_1 = new JLabel("AUTO: ");
		lblNewLabel_1.setBounds(35, 11, 69, 24);
		contentPanel.add(lblNewLabel_1);
		
		JLabel outCodigo = new JLabel("New label");
		outCodigo.setBounds(85, 16, 87, 14);
		contentPanel.add(outCodigo);
		
		JButton btnAtras = new JButton("<");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outImagen.setIcon(list.anterior());

			}
		});
		btnAtras.setBounds(0, 124, 41, 23);
		contentPanel.add(btnAtras);
		
		JButton btnSiguient = new JButton(">");
		btnSiguient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				outImagen.setIcon(list.siguiente());
			}
		});
		btnSiguient.setBounds(383, 124, 41, 23);
		contentPanel.add(btnSiguient);
		
		outImagen.setIcon(list.iniciar());
		outCodigo.setText(list.getCodigo());
	}
}
