package Ventanas;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import auto.carro;
import validaciones.validar;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class registro_vehiculo extends JPanel {
	private JTextField in_codigo;
	private JTextField in_marca;
	private JTextField in_modelo;
	private JTextField in_anio;
	private JTextField in_kilome;
	private JTextField in_precio;
	private JTextField in_color;
	private JTextField in_placa;


	private carro c;
	private ArrayList<File> listIMG = new ArrayList<File>();
	public JFileChooser ventana = new JFileChooser("");
	public FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG", "jpg");
	public JSpinner in_desc = new JSpinner();
	private Ventana_opciones a = new Ventana_opciones();
	/**
	 * Create the panel.
	 */
	public registro_vehiculo() {
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(4, 3, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(10, 10, 573, 661);
		add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Registro Vehiculo");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 19));
		lblNewLabel.setBounds(215, 22, 189, 27);
		panel.add(lblNewLabel);

		JLabel lblTipo = new JLabel("TIPO:");
		lblTipo.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblTipo.setBounds(10, 75, 62, 27);
		panel.add(lblTipo);

		JRadioButton btn_TNuevo = new JRadioButton("   NUEVO");
		btn_TNuevo.setHorizontalAlignment(SwingConstants.LEFT);
		btn_TNuevo.setFont(new Font("Century Gothic", Font.BOLD, 14));
		btn_TNuevo.setBounds(156, 79, 103, 21);
		panel.add(btn_TNuevo);

		JRadioButton rdbtnUsado = new JRadioButton("  USADO");
		rdbtnUsado.setHorizontalAlignment(SwingConstants.RIGHT);
		rdbtnUsado.setFont(new Font("Century Gothic", Font.BOLD, 14));
		rdbtnUsado.setBounds(301, 79, 103, 21);
		panel.add(rdbtnUsado);

		JLabel lblCodigo = new JLabel("CODIGO:");
		lblCodigo.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblCodigo.setBounds(10, 128, 94, 27);
		panel.add(lblCodigo);

		in_codigo = new JTextField();
		in_codigo.setBounds(156, 131, 248, 27);
		panel.add(in_codigo);
		in_codigo.setColumns(10);

		JLabel lblMarca = new JLabel("MARCA:");
		lblMarca.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblMarca.setBounds(10, 175, 94, 27);
		panel.add(lblMarca);

		in_marca = new JTextField();
		in_marca.setColumns(10);
		in_marca.setBounds(156, 178, 248, 27);
		panel.add(in_marca);

		JLabel lblModelo = new JLabel("MODELO:");
		lblModelo.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblModelo.setBounds(10, 221, 94, 27);
		panel.add(lblModelo);

		in_modelo = new JTextField();
		in_modelo.setColumns(10);
		in_modelo.setBounds(156, 224, 248, 27);
		panel.add(in_modelo);

		JLabel lblAo = new JLabel("A\u00D1O:");
		lblAo.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblAo.setBounds(10, 269, 94, 27);
		panel.add(lblAo);

		in_anio = new JTextField();
		in_anio.setColumns(10);
		in_anio.setBounds(156, 272, 248, 27);
		panel.add(in_anio);

		JLabel lblKilometraje = new JLabel("KILOMETRAJE:");
		lblKilometraje.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblKilometraje.setBounds(10, 317, 115, 27);
		panel.add(lblKilometraje);

		in_kilome = new JTextField();
		in_kilome.setColumns(10);
		in_kilome.setBounds(156, 320, 248, 27);
		panel.add(in_kilome);

		JLabel lblPrecio = new JLabel("PRECIO:");
		lblPrecio.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblPrecio.setBounds(10, 364, 115, 27);
		panel.add(lblPrecio);

		in_precio = new JTextField();
		in_precio.setColumns(10);
		in_precio.setBounds(157, 367, 123, 27);
		panel.add(in_precio);

		JLabel lblDescuento = new JLabel("DESCUENTO:");
		lblDescuento.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblDescuento.setBounds(309, 364, 115, 27);
		panel.add(lblDescuento);

		JLabel lblColor = new JLabel("COLOR:");
		lblColor.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblColor.setBounds(10, 410, 115, 27);
		panel.add(lblColor);

		in_color = new JTextField();
		in_color.setColumns(10);
		in_color.setBounds(156, 413, 248, 27);
		panel.add(in_color);

		JLabel lblPlaca = new JLabel("PLACA:");
		lblPlaca.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblPlaca.setBounds(10, 458, 115, 27);
		panel.add(lblPlaca);

		in_placa = new JTextField();
		in_placa.setColumns(10);
		in_placa.setBounds(156, 461, 248, 27);
		panel.add(in_placa);

		JLabel lblTapiceria = new JLabel("TAPICERIA:");
		lblTapiceria.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblTapiceria.setBounds(10, 516, 115, 27);
		panel.add(lblTapiceria);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(273, 522, 210, 21);
		comboBox.addItem("Prueba");
		panel.add(comboBox);

		JLabel lblCajaDeCambios = new JLabel("CAJA DE CAMBIOS:");
		lblCajaDeCambios.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblCajaDeCambios.setBounds(10, 553, 154, 27);
		panel.add(lblCajaDeCambios);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(273, 559, 210, 21);
		comboBox_1.addItem("Prueba");
		panel.add(comboBox_1);

		JLabel lblImagenes = new JLabel("IM\u00C1GENES:");
		lblImagenes.setHorizontalAlignment(SwingConstants.CENTER);
		lblImagenes.setFont(new Font("Century Gothic", Font.BOLD, 16));
		lblImagenes.setBounds(109, 614, 154, 27);
		panel.add(lblImagenes);

		JButton btn_agregar = new JButton("A\u00D1ADIR");
		btn_agregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listIMG = guardar(listIMG);
			}
		});
		btn_agregar.setFont(new Font("Century Gothic", Font.ITALIC, 12));
		btn_agregar.setBounds(273, 612, 131, 34);
		panel.add(btn_agregar);


		in_desc.setBounds(450, 371, 57, 23);
		panel.add(in_desc);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(5, 3, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(10, 713, 573, 50);
		add(panel_1);
		panel_1.setLayout(null);

		JButton btn_guardar = new JButton("GUARDAR");
		btn_guardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validar v=new validar();
				if(in_codigo.getText().isEmpty() || in_marca.getText().isEmpty() || in_modelo.getText().isEmpty() || in_anio.getText().isEmpty() ||
						in_kilome.getText().isEmpty() || in_precio.getText().isEmpty() || in_color.getText().isEmpty() || in_placa.getText().isEmpty()) {
					System.out.println("DATOS EN BLANCO");
				}else {
					if(v.validate(in_codigo.getText(),in_marca.getText(),in_anio.getText(),in_kilome.getText(),in_precio.getText(),in_color.getText(),in_placa.getText())){
						c = new carro(in_codigo.getText(),
								in_marca.getText(),
								in_modelo.getText(),
								in_color.getText(),
								in_placa.getText(),
								"Tapiceria",
								"Caja de cambios",
								Long.parseLong(in_kilome.getText()),
								Integer.parseInt(in_anio.getText()),
								(Integer)(in_desc.getValue()),
								Double.parseDouble(in_precio.getText()),
								496,
								194);
						a.add(c);
						String ruta ="src/catalogo";
						File direct=new File(ruta);
						if(direct.exists()) {
							crearCarpetas();
						}
						else {
							direct.mkdir();
							crearCarpetas();
						}
						listIMG.clear();
					}
					else
						System.out.println("DATOS MAL INGRESADOS");
				}
			}
		});
		btn_guardar.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		btn_guardar.setBounds(10, 10, 115, 30);
		panel_1.add(btn_guardar);

		JButton btn_subir = new JButton("SUBIR");
		btn_subir.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		btn_subir.setBounds(230, 10, 115, 30);
		panel_1.add(btn_subir);

		JButton btn_eliminar = new JButton("ELIMINAR");
		btn_eliminar.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		btn_eliminar.setBounds(448, 10, 115, 30);
		panel_1.add(btn_eliminar);

		JLabel lblOpciones = new JLabel("OPCIONES:");
		lblOpciones.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 15));
		lblOpciones.setBounds(10, 688, 189, 27);
		add(lblOpciones);

	}
	public ArrayList<File> guardar(ArrayList<File> list) {
		ventana.setFileFilter(filtro);
		ventana.showOpenDialog(this);
		File ar = ventana.getSelectedFile();
		list.add(ar);
		JOptionPane.showMessageDialog(this, "Archivo guardado con exito");
		return list;
	}

	public void crearCarpetas() {
		String ruta = "src/catalogo/" + in_codigo.getText() + "/";
		File directorio = new File(ruta);
		if(!directorio.exists()) {
			if(directorio.mkdir()) {
				String rutatxt = ruta + in_codigo.getText() + ".txt";
				directorio = new File(rutatxt);
				try {
					FileWriter archivo = new FileWriter(directorio);
					BufferedWriter escribir = new BufferedWriter(archivo);
					escribir.write("AUTO - - " + in_codigo.getText() + "\n"
							+ "Estado: " + " poner estado" + "\n"
							+ "Marca: " + in_marca.getText() + "\n" +
							"Modelo: " + in_modelo.getText() + "\n" +
							"Año: " + in_anio.getText() + "\n" +
							"Kilometraje: " + in_kilome.getText() + "\n" +
							"Precio: " + in_precio.getText() + "\n" + 
							"Descuento: "+(Integer)in_desc.getValue()+"\n"+
							"Color: " + in_color.getText() + "\n" +
							"Placa: " + in_placa.getText());
					escribir.close();
					archivo.close();
				} catch (IOException v) {
					// TODO Auto-generated catch block
					v.printStackTrace();
				}				
				ruta += "img/";
				directorio = new File(ruta);
				if(directorio.mkdir()) {
					for (File car : listIMG) {
						c.getIMG().guardarImagen(car, c.getContadorArchivos(), in_codigo.getText());
						c.setContadorArchivos(c.getContadorArchivos() + 1);
					}
				}
				System.out.println("asda");
			}
			System.out.println("aca estoy");
			System.out.println(directorio.getAbsolutePath());
		}else {

		}
	}
}
