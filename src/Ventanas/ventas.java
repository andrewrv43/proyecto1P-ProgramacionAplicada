package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import validaciones.logica;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventas extends JFrame {

	private JPanel contentPane;
	private JTextField inNombre;
	private JTextField inCedula;
	public JTextField inVEntrada;
	private JTextField inAdicional;
	private JTextField inCodigo;
	private JTextField valorV;
	private JTextField inSeguro;
	private JTextField inGPS;
	private JTextField inAccesorios;
	private JTextField inValorVenta;
	private logica lg = new logica();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventas frame = new ventas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSajacar = new JLabel("SAJACAR");
		lblSajacar.setHorizontalAlignment(SwingConstants.CENTER);
		lblSajacar.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 31));
		lblSajacar.setBounds(358, 34, 178, 28);
		contentPane.add(lblSajacar);

		JLabel lblVender = new JLabel("VENDER");
		lblVender.setHorizontalAlignment(SwingConstants.CENTER);
		lblVender.setFont(new Font("Century Gothic", Font.ITALIC, 36));
		lblVender.setBounds(10, 25, 194, 37);
		contentPane.add(lblVender);

		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombres.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 21));
		lblNombres.setBounds(10, 101, 143, 37);
		contentPane.add(lblNombres);

		JLabel lblCedula = new JLabel("C\u00E9dula:");
		lblCedula.setHorizontalAlignment(SwingConstants.LEFT);
		lblCedula.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 21));
		lblCedula.setBounds(10, 148, 143, 37);
		contentPane.add(lblCedula);

		JLabel lblValorDeEntrada = new JLabel("Valor de entrada:");
		lblValorDeEntrada.setHorizontalAlignment(SwingConstants.LEFT);
		lblValorDeEntrada.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 21));
		lblValorDeEntrada.setBounds(10, 195, 215, 28);
		contentPane.add(lblValorDeEntrada);

		JLabel lblValorAd = new JLabel("Valor AD:");
		lblValorAd.setHorizontalAlignment(SwingConstants.LEFT);
		lblValorAd.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 21));
		lblValorAd.setBounds(10, 233, 183, 37);
		contentPane.add(lblValorAd);

		JLabel lblCodigoVehiculoA = new JLabel("C\u00F3digo Vehiculo a Comprar:\r\n");
		lblCodigoVehiculoA.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodigoVehiculoA.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 21));
		lblCodigoVehiculoA.setBounds(10, 291, 320, 37);
		contentPane.add(lblCodigoVehiculoA);

		JLabel lblValorDeVenta = new JLabel("Valor de venta:");
		lblValorDeVenta.setHorizontalAlignment(SwingConstants.LEFT);
		lblValorDeVenta.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 21));
		lblValorDeVenta.setBounds(17, 352, 171, 37);
		contentPane.add(lblValorDeVenta);

		JLabel lblSeguro = new JLabel("Seguro:");
		lblSeguro.setHorizontalAlignment(SwingConstants.LEFT);
		lblSeguro.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 21));
		lblSeguro.setBounds(17, 417, 171, 37);
		contentPane.add(lblSeguro);

		JLabel lblGps = new JLabel("GPS:");
		lblGps.setHorizontalAlignment(SwingConstants.LEFT);
		lblGps.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 21));
		lblGps.setBounds(17, 449, 171, 37);
		contentPane.add(lblGps);

		JLabel lblAccesorios = new JLabel("Accesorios:");
		lblAccesorios.setHorizontalAlignment(SwingConstants.LEFT);
		lblAccesorios.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 21));
		lblAccesorios.setBounds(22, 479, 171, 37);
		contentPane.add(lblAccesorios);

		JLabel lblValorDeVenta_1 = new JLabel("Valor de venta:");
		lblValorDeVenta_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblValorDeVenta_1.setFont(new Font("Century Gothic", Font.BOLD | Font.ITALIC, 21));
		lblValorDeVenta_1.setBounds(10, 543, 171, 37);
		contentPane.add(lblValorDeVenta_1);

		JButton btnComprar = new JButton("COMPRAR");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lg.cn.setQuery("INSERT INTO cliente (cedula, nombre, codigoVehiculo) VALUES (" + inCedula.getText() + ", '" + inNombre.getText() + "', '" + inCodigo.getText() + "')") && lg.cn.setQuery("DELETE FROM vehiculo where codigo = '" + inCodigo.getText() + "'")) {
					System.out.println("Cliente registro ---> auto vendido");
					inAccesorios.setText("");
					inAdicional.setText("");
					inCedula.setText("");
					inCodigo.setText("");
					inGPS.setText("");
					inNombre.setText("");
					inSeguro.setText("");
					inValorVenta.setText("");
					inVEntrada.setText("");
				}else {
					System.out.println("No se pudo completar la venta");
				}
			}
		});
		btnComprar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnComprar.setBounds(195, 607, 149, 46);
		contentPane.add(btnComprar);

		inNombre = new JTextField();
		inNombre.setBounds(322, 114, 194, 20);
		contentPane.add(inNombre);
		inNombre.setColumns(10);

		inCedula = new JTextField();
		inCedula.setColumns(10);
		inCedula.setBounds(322, 161, 194, 20);
		contentPane.add(inCedula);

		inVEntrada = new JTextField();
		inVEntrada.setColumns(10);
		inVEntrada.setBounds(322, 195, 194, 20);
		contentPane.add(inVEntrada);

		inAdicional = new JTextField();
		inAdicional.setColumns(10);
		inAdicional.setBounds(322, 234, 194, 20);
		contentPane.add(inAdicional);

		inCodigo = new JTextField();
		inCodigo.setColumns(10);
		inCodigo.setBounds(322, 304, 194, 20);
		contentPane.add(inCodigo);

		valorV = new JTextField();
		valorV.setColumns(10);
		valorV.setBounds(322, 365, 194, 20);
		contentPane.add(valorV);

		inSeguro = new JTextField();
		inSeguro.setText("0");
		inSeguro.setColumns(10);
		inSeguro.setBounds(322, 430, 194, 20);
		contentPane.add(inSeguro);

		inGPS = new JTextField();
		inGPS.setText("0");
		inGPS.setColumns(10);
		inGPS.setBounds(322, 462, 194, 20);
		contentPane.add(inGPS);

		inAccesorios = new JTextField();
		inAccesorios.setText("0");
		inAccesorios.setColumns(10);
		inAccesorios.setBounds(322, 492, 194, 20);
		contentPane.add(inAccesorios);

		inValorVenta = new JTextField();
		inValorVenta.setColumns(10);
		inValorVenta.setBounds(322, 556, 194, 20);
		contentPane.add(inValorVenta);

		//inValorVenta.setText(""+ valorV.getText() + inSeguro.getText() + inGPS.getText() + inAccesorios.getText());

	}
}
