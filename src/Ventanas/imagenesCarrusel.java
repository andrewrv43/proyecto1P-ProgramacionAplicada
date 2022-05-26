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
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.MatteBorder;

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
		setBounds(100, 100, 498, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("AUTO: ");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.ITALIC, 18));
		lblNewLabel_1.setBounds(35, 11, 69, 24);
		contentPanel.add(lblNewLabel_1);
		
		JLabel outImagen = new JLabel("");
		outImagen.setBounds(74, 57, 336, 182);
		contentPanel.add(outImagen);
		
		outImagen.setIcon(list.iniciar());
		
		JLabel outCodigo = new JLabel("New label");
		outCodigo.setFont(new Font("Century Gothic", Font.BOLD, 17));
		outCodigo.setBounds(102, 11, 119, 24);
		contentPanel.add(outCodigo);
		
		JButton btnAtras = new JButton("<<");
		btnAtras.setForeground(Color.BLACK);
		btnAtras.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 18));
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outImagen.setIcon(list.anterior());

			}
		});
		btnAtras.setBounds(10, 126, 54, 54);
		contentPanel.add(btnAtras);
		
		JButton btnSiguient = new JButton(">>");
		btnSiguient.setForeground(Color.BLACK);
		btnSiguient.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnSiguient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outImagen.setIcon(list.siguiente());
			}
		});
		btnSiguient.setBounds(420, 126, 54, 54);
		contentPanel.add(btnSiguient);
		outCodigo.setText("  ");
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(6, 3, 2, 2, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(68, 45, 346, 204);
		contentPanel.add(panel);
	}
}
