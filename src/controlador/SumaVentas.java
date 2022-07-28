package controlador;

import java.text.DecimalFormat;

import Ventanas.ventas;

public class SumaVentas extends Thread{
	private ventas ven;
	public SumaVentas(ventas v) {
		ven=v;	
	}
	public void run() {
		while(true) {
			if(ven.valorV.getText().isBlank()||ven.valorV.getText().isEmpty()) {
				ven.inValorVenta.setText("0,00");
			}else {
				double n=Double.valueOf(ven.valorV.getText());
				if(ven.rdbtnAcSi.isSelected()) {
					n+=3000;
				}
				if(ven.rdbtnGPSSi.isSelected()) {
					n+=300;
				}
				if(ven.rdbtnSeguroSi.isSelected()) {
					n+=1000;
				}
				if(!ven.inVEntrada.getText().isBlank()||!ven.inVEntrada.getText().isBlank()) {
					n-=Double.valueOf(ven.inVEntrada.getText());
				}
				if(!ven.inAdicional.getText().isBlank()||!ven.inAdicional.getText().isBlank()) {
					n-=Double.valueOf(ven.inAdicional.getText());
				}
				DecimalFormat df=new DecimalFormat("#.00");
				ven.inValorVenta.setText((df.format(n)));
			}
		}
	}
}
