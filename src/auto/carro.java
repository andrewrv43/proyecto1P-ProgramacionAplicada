package auto;

import java.awt.Image;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class carro {
	private String marca, modelo, color, placa, tapiceria,cjCambios;
	private long kilometraje;
	private int year,descuento;
	private double precio;
	private gestionImagen img;
	private int contador = 1;
	private int contadorArchivo = 1;
	
	public carro(String marca, String modelo, String color, String placa, String tapiceria,
			String cjCambios, long kilometraje,int year, int descuento,double precio, int width, int height) {
		this.marca=marca;
		this.modelo=modelo;
		this.color=color;
		this.placa=placa;
		this.tapiceria=tapiceria;
		this.cjCambios=cjCambios;
		this.kilometraje=kilometraje;
		this.year=year;
		this.descuento=descuento;
		this.precio=precio;
		
		//datos para las imagenes
		img = new gestionImagen(width, height);
	}
	
	public String getDatos() {
		return "probando 1 2 3";
		
	}
	public Icon iniciar() {
		return img.iniciar(contador, placa);
	}
	public Icon siguiente() {
		return img.siguiente(contador, placa);
	}
	public Icon anterior() {
		return img.anterior(contador, placa);
	}
	

}
