package controlador;

import java.text.DecimalFormat;

import Ventanas.ventanaComprar;

public class Hilo_ValorCompra extends Thread{
	private ventanaComprar ven;
	public Hilo_ValorCompra(ventanaComprar v) {
		ven=v;
	}
	
	public void run() {
		

			while(true) {
				int a=2022-(int)ven.inAnio.getValue();
				if(a<10&&(int)ven.inValor.getValue()>0) {
					//ven.outTotal.setText((String)ven.inValor.getValue());
					
					double n=(int) ven.inValor.getValue();
					double v;
					//chequeo anios
					while(a!=0) {
					v=n*0.015;
					n-=v;
						a--;
					}
					//chequeo kilometraje
					if((int)ven.inKilometraje.getValue()>80000) {
						v=n*0.025;
						n-=v;
					}
					//chequeo duenos
					if((int)ven.inNumDue.getValue()>1) {
						for(int i=0;i<(int)ven.inNumDue.getValue();i++) {
							v=n*0.02;
							n-=v;
						}
					}
					//chequeo choques
					if(ven.rdbtnChoqueSi.isSelected()) {
						v=n*0.15;
						n-=v;
					}
					//chequeo aire
					if(ven.rdbtnAireNo.isSelected()) {
						v=n*0.0005;
						n-=v;
					}
					//tapiceria
					if(ven.rdbtnTapiceriaBueno.isSelected()) {
						v=(n*1)/100;
						n+=v;
					}
					else if(ven.rdbtnTapiceriaRegular.isSelected()) {
						v=(n*1.5)/100;
						n-=v;
					}
					else if(ven.rdbtnTapiceriaMalo.isSelected()) {
						v=(n*3)/100;
						n-=v;
					}
					//pintura
					if(ven.rdbtnPinturaBueno.isSelected()) {
						v=(n*2)/100;
						n+=v;
					}
					else if(ven.rdbtnPinturaRegular.isSelected()) {
						v=(n*2)/100;
						n-=v;
					}
					else if(ven.rdbtnPinturaMalo.isSelected()) {
						v=(n*10)/100;
						n-=v;
					}
					//carroceria
					if(ven.rdbtnCarroBueno.isSelected()) {
						v=(n*2)/100;
						n+=v;
					}
					else if(ven.rdbtnCarroRegular.isSelected()) {
						v=(n*2)/100;
						n-=v;
					}
					else if(ven.rdbtnCarroMalo.isSelected()) {
						v=(n*10)/100;
						n-=v;
					}
					DecimalFormat df=new DecimalFormat("#.00");
					
					ven.outTotal.setText(df.format(n));
				}else {
					ven.outTotal.setText("No se realiza el calculo");
					
				}
				
				
				
				
				
			}
			

	}
}
