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
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.border.MatteBorder;

import auto.carro;
import validaciones.logica;
import validaciones.validar;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class ventana_catalogo extends JPanel {
	private JTextField in_abuscar;
	private int cont = 0;

	/**
	 * Create the panel.
	 */
	public JLabel out_codigo = new JLabel("AA-000");
	public JLabel out_modelo = new JLabel("---------");
	public JLabel out_marca = new JLabel("---------");
	public JLabel out_precio_venta = new JLabel("$ 0.00");
	public JLabel out_image = new JLabel("");
	private logica lg = new logica();
	private ArrayList<carro> list = new ArrayList<carro>();
	public ventana_catalogo(Ventana_opciones vt) {
		setBackground(Color.WHITE);

		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(6, 3, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
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
		panel_1.setBackground(Color.WHITE);
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

		JButton btn_otrosBuscador = new JButton("");
		btn_otrosBuscador.setIcon(new ImageIcon(ventana_catalogo.class.getResource("/Resources/redimensionado32.png")));
		btn_otrosBuscador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validar v=new validar();
				boolean enc=false;
				lg.res = lg.cn.getQuery("SELECT * FROM vehiculo WHERE codigo = '" + in_abuscar.getText()+"'");
				
				if(v.vCodigo(in_abuscar.getText())) {
					try {
						while(lg.res.next()) {
							if(in_abuscar.getText().equals(lg.res.getString("codigo"))){
								out_codigo.setText(lg.res.getString("codigo"));
								out_marca.setText(lg.res.getString("marca"));
								out_modelo.setText(lg.res.getString("modelo"));
								out_precio_venta.setText(String.valueOf(lg.res.getDouble("precio")));
								//out_image.setIcon(a.iniciar());
								enc=true;
							}
						}
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else {
					ventans("FORMATO DE CODIGO NO CORRECTO");
				}
				
				/*
				if(v.vCodigo(in_abuscar.getText())) {
					for(carro a:vt.listC) {
						if(in_abuscar.getText().equals(a.getCodigo())){
							out_codigo.setText(a.getCodigo());
							out_marca.setText(a.getMarca());
							out_modelo.setText(a.getModelo());
							out_precio_venta.setText(a.getPrecio());
							out_image.setIcon(a.iniciar());
							enc=true;
						}
					}
				}
				else {
					ventans("FORMATO DE CODIGO NO CORRECTO");
				}*/
				if(!enc) {
					ventans("NO SE ENCONTRO LA BUSQUEDA");
				}
				
			}
		});
		btn_otrosBuscador.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_otrosBuscador.setBounds(373, 10, 32, 33);
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


		out_codigo.setHorizontalAlignment(SwingConstants.CENTER);
		out_codigo.setFont(new Font("Century Gothic", Font.BOLD, 14));
		out_codigo.setBounds(326, 268, 106, 28);
		panel_1.add(out_codigo);


		out_modelo.setHorizontalAlignment(SwingConstants.CENTER);
		out_modelo.setFont(new Font("Century Gothic", Font.BOLD, 14));
		out_modelo.setBounds(326, 306, 106, 28);
		panel_1.add(out_modelo);


		out_marca.setHorizontalAlignment(SwingConstants.CENTER);
		out_marca.setFont(new Font("Century Gothic", Font.BOLD, 14));
		out_marca.setBounds(326, 344, 106, 28);
		panel_1.add(out_marca);

		out_precio_venta.setHorizontalAlignment(SwingConstants.CENTER);
		out_precio_venta.setFont(new Font("Century Gothic", Font.BOLD, 22));
		out_precio_venta.setBounds(249, 382, 115, 28);
		panel_1.add(out_precio_venta);


		out_image.setBounds(61, 48, 379, 209);
		panel_1.add(out_image);

		JButton btn_añadirimg = new JButton("+More images");
		btn_añadirimg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imagenesCarrusel ca = new imagenesCarrusel(vt.listC.get(cont));
				ca.show();
			}
		});
		btn_añadirimg.setFont(new Font("Century Gothic", Font.BOLD, 20));
		btn_añadirimg.setBounds(283, 485, 201, 51);
		panel.add(btn_añadirimg);

		JButton btn_atras = new JButton("<<");
		btn_atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cont <= 0){
					cont = list.size()-1;
				}else {
					cont --;
				}
				System.out.println("Baja: " + cont);

				out_codigo.setText(list.get(cont).getCodigo());
				out_marca.setText(list.get(cont).getMarca());
				out_modelo.setText(list.get(cont).getModelo());
				out_precio_venta.setText(list.get(cont).getPrecio());
				//out_image.setIcon(list.get(cont).iniciar());

			}
		});
		btn_atras.setBounds(46, 229, 69, 71);
		panel.add(btn_atras);
		btn_atras.setFont(new Font("Century Gothic", Font.BOLD, 30));

		JButton btn_siguiente = new JButton(">>");
		btn_siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(cont >= list.size()-1){
					cont = 0;
				}else {
					cont ++;
				}
				System.out.println("Sube: " + cont);
				out_codigo.setText(list.get(cont).getCodigo());
				out_marca.setText(list.get(cont).getMarca());
				out_modelo.setText(list.get(cont).getModelo());
				out_precio_venta.setText(list.get(cont).getPrecio());
				//out_image.setIcon(list.get(cont).iniciar());
			}
		});
		btn_siguiente.setBounds(647, 229, 69, 71);
		panel.add(btn_siguiente);
		btn_siguiente.setFont(new Font("Century Gothic", Font.BOLD, 30));

		//MUESTRA EL PRIMER VEHICULO
		cargar();
		out_codigo.setText(list.get(cont).getCodigo());
		out_marca.setText(list.get(cont).getMarca());
		out_modelo.setText(list.get(cont).getModelo());
		out_precio_venta.setText(list.get(cont).getPrecio());
		//out_image.setIcon(list.get(cont).iniciar()); //CARGAR IMAGEN PRINCIPAL

	}
	public void cargar() {
		lg.res = lg.cn.getQuery("SELECT * FROM vehiculo");
		try {
			while(lg.res.next()) {
				list.add(new carro(lg.res.getString("codigo"),
									lg.res.getString("marca"),
									lg.res.getString("modelo"),
									lg.res.getString("color"),
									lg.res.getString("placa"),
									lg.res.getString("tapiceria"),
									lg.res.getString("caja_cambios"),
									Long.parseLong(String.valueOf(lg.res.getInt("kilometraje"))),
									lg.res.getInt("anio"),
									lg.res.getInt("descuento"),
									lg.res.getDouble("precio"),
									50,
									50));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void ventans(String text) {
		JOptionPane.showMessageDialog(this, text);
	}
}
