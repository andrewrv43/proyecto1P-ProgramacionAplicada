package auto;

public class carro {
	private String marca, modelo, color, placa, tapiceria,cjCambios;
	private long kilometraje;
	private int year,descuento;
	private double precio;
	private gestionImagen img;
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
	

}
