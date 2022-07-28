package Ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.border.TitledBorder;

import controlador.Hilo_ValorCompra;

import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventanaComprar extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public JTextField inMarca;
	public JTextField inModelo;
	public JLabel outTotal = new JLabel("00,00");
	public JRadioButton rdbtnCarroMalo = new JRadioButton("MALO");
	public JRadioButton rdbtnCarroRegular = new JRadioButton("REGULAR");
	public JRadioButton rdbtnCarroBueno = new JRadioButton("BUENO");
	public JRadioButton rdbtnPinturaRegular = new JRadioButton("REGULAR");
	public JRadioButton rdbtnPinturaMalo = new JRadioButton("MALO");
	public JRadioButton rdbtnPinturaBueno = new JRadioButton("BUENO");
	public JRadioButton rdbtnTapiceriaMalo = new JRadioButton("MALO");
	public JRadioButton rdbtnTapiceriaRegular = new JRadioButton("REGULAR");
	public JRadioButton rdbtnTapiceriaBueno = new JRadioButton("BUENO");
	public JRadioButton rdbtnAireNo = new JRadioButton("NO");
	public JRadioButton rdbtnAireSi = new JRadioButton("SI");
	public JRadioButton rdbtnChoqueNo = new JRadioButton("NO");
	public JRadioButton rdbtnChoqueSi = new JRadioButton("SI");
	//
	public JSpinner inValor = new JSpinner();
	public JSpinner inAnio = new JSpinner();
	public JSpinner inNumDue = new JSpinner();
	public JSpinner inKilometraje = new JSpinner();

	private static ventas cv;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ventanaComprar dialog = new ventanaComprar(cv);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ventanaComprar(ventas v) {
		Hilo_ValorCompra comp;
		cv = v;
		setBounds(100, 100, 497, 584);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Datos Generales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 10, 458, 131);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Marca:");
		lblNewLabel.setBounds(10, 33, 62, 22);
		panel.add(lblNewLabel);
		
		inMarca = new JTextField();
		inMarca.setColumns(10);
		inMarca.setBounds(54, 35, 160, 22);
		panel.add(inMarca);
		
		JLabel lblNewLabel_1_1 = new JLabel("Kilometraje");
		lblNewLabel_1_1.setBounds(239, 33, 106, 22);
		panel.add(lblNewLabel_1_1);
		
		
		inKilometraje.setBounds(334, 35, 106, 20);
		panel.add(inKilometraje);
		
		JLabel lblNewLabel_1 = new JLabel("Modelo:");
		lblNewLabel_1.setBounds(10, 65, 62, 22);
		panel.add(lblNewLabel_1);
		
		inModelo = new JTextField();
		inModelo.setColumns(10);
		inModelo.setBounds(54, 65, 160, 22);
		panel.add(inModelo);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Valor de venta:");
		lblNewLabel_1_1_1.setBounds(239, 65, 129, 22);
		panel.add(lblNewLabel_1_1_1);
		
		
		inValor.setBounds(378, 66, 62, 22);
		panel.add(inValor);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("A\u00F1o:");
		lblNewLabel_1_1_2.setBounds(10, 97, 62, 22);
		panel.add(lblNewLabel_1_1_2);
		
		inAnio.setBounds(69, 99, 55, 20);
		panel.add(inAnio);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Num. Due\u00F1os:");
		lblNewLabel_1_1_3.setBounds(239, 97, 148, 22);
		panel.add(lblNewLabel_1_1_3);

		inNumDue.setBounds(405, 98, 35, 20);
		panel.add(inNumDue);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Estado del Vehiculo", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 151, 458, 243);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("\u00BFEl vehiculo ha tenido choques?");
		lblNewLabel_2.setBounds(150, 20, 204, 13);
		panel_1.add(lblNewLabel_2);
		rdbtnChoqueSi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnChoqueNo.setSelected(false);
			}
		});
		rdbtnChoqueNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnChoqueSi.setSelected(false);
			}
		});
		
		rdbtnAireSi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnAireNo.setSelected(false);
			}
		});
		rdbtnAireNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnAireSi.setSelected(false);
			}
		});
		
		
		//checks carroceria
		
		rdbtnCarroBueno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnCarroMalo.setSelected(false);
				rdbtnCarroRegular.setSelected(false);
			}
		});
		rdbtnCarroRegular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnCarroMalo.setSelected(false);
				rdbtnCarroBueno.setSelected(false);
			}
		});
		rdbtnCarroMalo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnCarroRegular.setSelected(false);
				rdbtnCarroBueno.setSelected(false);
			}
		});
		//checks pintura
		rdbtnPinturaBueno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnPinturaMalo.setSelected(false);
				rdbtnPinturaRegular.setSelected(false);
			}
		});
		rdbtnPinturaRegular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnPinturaMalo.setSelected(false);
				rdbtnPinturaBueno.setSelected(false);
			}
		});
		rdbtnPinturaMalo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnPinturaRegular.setSelected(false);
				rdbtnPinturaBueno.setSelected(false);
			}
		});
		//checks tapiceria
		rdbtnTapiceriaBueno.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnTapiceriaMalo.setSelected(false);
				rdbtnTapiceriaRegular.setSelected(false);
			}
		});
		rdbtnTapiceriaRegular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnTapiceriaMalo.setSelected(false);
				rdbtnTapiceriaBueno.setSelected(false);
			}
		});
		rdbtnTapiceriaMalo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rdbtnTapiceriaRegular.setSelected(false);
				rdbtnTapiceriaBueno.setSelected(false);
			}
		});
		
		
		rdbtnChoqueSi.setBounds(151, 39, 45, 21);
		panel_1.add(rdbtnChoqueSi);
		

		rdbtnChoqueNo.setBounds(231, 38, 45, 21);
		panel_1.add(rdbtnChoqueNo);
		
		JLabel lblNewLabel_2_1 = new JLabel("\u00BFEl vehiculo tiene aire acondicionado?");
		lblNewLabel_2_1.setBounds(130, 62, 256, 13);
		panel_1.add(lblNewLabel_2_1);
		

		rdbtnAireSi.setBounds(151, 81, 45, 21);
		panel_1.add(rdbtnAireSi);
		

		rdbtnAireNo.setBounds(231, 80, 45, 21);
		panel_1.add(rdbtnAireNo);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("\u00BFCual es el estado de la tapicer\u00EDa?");
		lblNewLabel_2_1_1.setBounds(139, 108, 204, 13);
		panel_1.add(lblNewLabel_2_1_1);
		

		rdbtnTapiceriaBueno.setBounds(109, 123, 79, 21);
		panel_1.add(rdbtnTapiceriaBueno);
		

		rdbtnTapiceriaRegular.setBounds(187, 123, 86, 21);
		panel_1.add(rdbtnTapiceriaRegular);
		

		rdbtnTapiceriaMalo.setBounds(288, 123, 79, 21);
		panel_1.add(rdbtnTapiceriaMalo);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("\u00BFCual es el estado de la pintura?");
		lblNewLabel_2_1_1_1.setBounds(142, 150, 204, 13);
		panel_1.add(lblNewLabel_2_1_1_1);
		

		rdbtnPinturaBueno.setBounds(97, 161, 79, 21);
		panel_1.add(rdbtnPinturaBueno);
		

		rdbtnPinturaMalo.setBounds(276, 161, 79, 21);
		panel_1.add(rdbtnPinturaMalo);
		

		rdbtnPinturaRegular.setBounds(175, 161, 86, 21);
		panel_1.add(rdbtnPinturaRegular);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("\u00BFCual es el estado de la carrocer\u00EDa?");
		lblNewLabel_2_1_1_1_1.setBounds(138, 192, 204, 13);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		

		rdbtnCarroBueno.setBounds(96, 203, 79, 21);
		panel_1.add(rdbtnCarroBueno);

		rdbtnCarroRegular.setBounds(174, 203, 86, 21);
		panel_1.add(rdbtnCarroRegular);
		
		
		rdbtnCarroMalo.setBounds(275, 203, 79, 21);
		panel_1.add(rdbtnCarroMalo);
		
		JLabel lblNewLabel_3 = new JLabel("VALOR FINAL DE COMPRA");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(113, 390, 278, 48);
		contentPanel.add(lblNewLabel_3);
	
		outTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		outTotal.setBounds(187, 419, 267, 87);
		contentPanel.add(outTotal);
		
		JButton btnComprar = new JButton("COMPRAR");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cv.inVEntrada.setText(outTotal.getText());
				cv.show();
			}
		});
		btnComprar.setBounds(167, 482, 89, 23);
		contentPanel.add(btnComprar);
		comp=new Hilo_ValorCompra(this);
		comp.start();
		
		cv.inVEntrada.setEditable(false);
	}
}
