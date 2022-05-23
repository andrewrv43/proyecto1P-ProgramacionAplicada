package auto;

public class carro {
	private String marca, modelo, color, placa, tapiceria,cjCambios;
	private long kilometraje;
	private int year,descuento;
	private double precio;
	
	public carro(String marca, String modelo, String color, String placa, String tapiceria,
			String cjCambios, long kilometraje,int year, int descuento,double precio) {
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
	}
	
	public String getDatos() {
		return "probando 1 2 3";
	}
	

}
