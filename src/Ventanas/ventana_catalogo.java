package Ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.border.MatteBorder;

import auto.carro;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ventana_catalogo extends JPanel {
	private JTextField in_abuscar;

	private registro_vehiculo r = new registro_vehiculo();
	private ArrayList<carro> lista;
	/**
	 * Create the panel.
	 */
	public ventana_catalogo(ArrayList<carro> lista) {
		this.lista = lista;
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 22, 748, 558);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CAT\u00C1LOGO");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 31));
		lblNewLabel.setBounds(23, 10, 178, 28);
		panel.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 272, 235, -203);
		panel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 3, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(125, 48, 512, 419);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBuscar = new JLabel("Buscar:");
		lblBuscar.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblBuscar.setBounds(95, 9, 72, 28);
		panel_1.add(lblBuscar);
		
		in_abuscar = new JTextField();
		in_abuscar.setBounds(177, 13, 189, 28);
		panel_1.add(in_abuscar);
		in_abuscar.setColumns(10);
		
		JButton btn_otrosBuscador = new JButton("...");
		btn_otrosBuscador.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_otrosBuscador.setBounds(365, 13, 47, 28);
		panel_1.add(btn_otrosBuscador);
		
		JLabel lblCdigo = new JLabel("C\u00D3DIGO:");
		lblCdigo.setHorizontalAlignment(SwingConstants.LEFT);
		lblCdigo.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblCdigo.setBounds(79, 268, 72, 28);
		panel_1.add(lblCdigo);
		
		JLabel lblModelo = new JLabel("MODELO:");
		lblModelo.setHorizontalAlignment(SwingConstants.LEFT);
		lblModelo.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblModelo.setBounds(79, 306, 72, 28);
		panel_1.add(lblModelo);
		
		JLabel lblMarca = new JLabel("MARCA:");
		lblMarca.setHorizontalAlignment(SwingConstants.LEFT);
		lblMarca.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblMarca.setBounds(79, 344, 72, 28);
		panel_1.add(lblMarca);
		
		JLabel lblPrecioDeVenta = new JLabel("PRECIO DE VENTA: ");
		lblPrecioDeVenta.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecioDeVenta.setFont(new Font("Century Gothic", Font.BOLD, 14));
		lblPrecioDeVenta.setBounds(126, 382, 156, 28);
		panel_1.add(lblPrecioDeVenta);
		
		JLabel out_codigo = new JLabel("AA-000");
		out_codigo.setHorizontalAlignment(SwingConstants.CENTER);
		out_codigo.setFont(new Font("Century Gothic", Font.BOLD, 14));
		out_codigo.setBounds(326, 268, 106, 28);
		panel_1.add(out_codigo);
		
		JLabel out_modelo = new JLabel("---------");
		out_modelo.setHorizontalAlignment(SwingConstants.CENTER);
		out_modelo.setFont(new Font("Century Gothic", Font.BOLD, 14));
		out_modelo.setBounds(326, 306, 106, 28);
		panel_1.add(out_modelo);
		
		JLabel out_marca = new JLabel("---------");
		out_marca.setHorizontalAlignment(SwingConstants.CENTER);
		out_marca.setFont(new Font("Century Gothic", Font.BOLD, 14));
		out_marca.setBounds(326, 344, 106, 28);
		panel_1.add(out_marca);
		
		JLabel out_precio_venta = new JLabel("$ 0.00");
		out_precio_venta.setHorizontalAlignment(SwingConstants.CENTER);
		out_precio_venta.setFont(new Font("Century Gothic", Font.BOLD, 22));
		out_precio_venta.setBounds(249, 382, 115, 28);
		panel_1.add(out_precio_venta);
		
		JLabel out_image = new JLabel("");
		out_image.setBounds(61, 48, 379, 209);
		panel_1.add(out_image);
		
		JButton btn_añadirimg = new JButton("More images");
		btn_añadirimg.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btn_añadirimg.setBounds(283, 485, 201, 51);
		panel.add(btn_añadirimg);
		
		JButton btn_atras = new JButton("<<");
		btn_atras.setBounds(23, 221, 85, 86);
		panel.add(btn_atras);
		btn_atras.setFont(new Font("Century Gothic", Font.BOLD, 30));
		
		JButton btn_siguiente = new JButton(">>");
		btn_siguiente.setBounds(653, 221, 85, 86);
		panel.add(btn_siguiente);
		btn_siguiente.setFont(new Font("Century Gothic", Font.BOLD, 30));
		
		System.out.println("aaa");
		for (carro carro : lista) {
			System.out.print(carro.getCodigo());
		}

			//out_image.setIcon(lista.get(0).iniciar());

	}
}
