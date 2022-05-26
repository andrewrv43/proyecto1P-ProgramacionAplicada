package auto;

import java.awt.Image;
import java.io.File;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class carro {
	private String marca, modelo, color, placa, tapiceria,cjCambios, codigo;
	private long kilometraje;
	private int year,descuento;
	private double precio;
	private gestionImagen img;
	private int contador = 1,width,height;
	private int contadorArchivo = 1;

	public carro(String codigo, String marca, String modelo, String color, String placa, String tapiceria,
			String cjCambios, long kilometraje,int year, int descuento,double precio, int width, int height) {
		this.codigo=codigo;
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
		this.width=width;
		this.height=height;
		//datos para las imagenes
		img = new gestionImagen(width, height);
	}
	public String getPrecio() {
		return String.valueOf(precio);
	}

	public String getDatos() {
		return codigo+";"+marca+";"+modelo+";"+color+";"+placa+";"+tapiceria+";"+
	cjCambios+";"+kilometraje+";"+year+";"+descuento+";"+precio+";"+width+";"+height;

	}
	public Icon iniciar() {
		contador = 1;
		return img.iniciar(contador, codigo);
	}
	public Icon siguiente() {
		File directorio = new File("src/catalogo/"+ codigo + "/img");
		File[] nimg = directorio.listFiles();
		if(contador >= nimg.length){
			contador = 1;
		}else {
			contador ++;
		}
		return img.siguiente(contador, codigo);
	}
	public Icon anterior() {
		File directorio = new File("src/catalogo/"+ codigo + "/img");
		File[] nimg = directorio.listFiles();
		if(contador <= 1){
			contador = nimg.length;
		}else {
			contador --;
		}
		return img.anterior(contador, codigo);
	}
	public gestionImagen getIMG() {
		return img;
	}
	public int getContadorArchivos() {
		return contadorArchivo;
	}
	public void setContadorArchivos(int newContador) {
		contadorArchivo = newContador;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo(){
		return modelo;
	}
}
