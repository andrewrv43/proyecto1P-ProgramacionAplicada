package validaciones;

import javax.swing.JOptionPane;

public class validar {
	
	public boolean validate(String cd,String mrc,String y,String k,String p,String col,String pla) {

		if(!vCodigo(cd)) {
			
			JOptionPane.showMessageDialog(null, "ERROR(FORMATO): DATOS MAL INGRESADOS\n=>CODIGO");
			return false;
		}
		else if(!vMARCA(mrc)) {
			JOptionPane.showMessageDialog(null, "ERROR(FORMATO): DATOS MAL INGRESADOS\n=>MARCA");
			return false;
		}
		else if(!vYear(y)) {
			JOptionPane.showMessageDialog(null, "ERROR(FORMATO): DATOS MAL INGRESADOS\n=>AÑO ");
			return false;
		}
		else if(!vKilo(k)) {
			JOptionPane.showMessageDialog(null, "ERROR(FORMATO): DATOS MAL INGRESADOS\n=>KILOMETRAJE");
		return false;
		}
		else if(!vPrecio(p)) {
			JOptionPane.showMessageDialog(null, "ERROR(FORMATO): DATOS MAL INGRESADOS\n=>PRECIO");
			return false;
		}
		else if(!vColor(col)) {
			JOptionPane.showMessageDialog(null, "ERROR(FORMATO): DATOS MAL INGRESADOS\n=>COLOR");
			return false;
		}
		else if(!vPlaca(pla)) {
			JOptionPane.showMessageDialog(null, "ERROR(FORMATO): DATOS MAL INGRESADOS\n=>PLACA");
			return false;
		}
		else 
			return true;
	}
	public boolean vCodigo(String cd) {
	
		//V N/U-123
		return cd.matches("[V][N,U][\\-]([0-9]{3})");
	}
	public boolean vMARCA(String mrc) {
		return mrc.matches("[A-Z]*");
	}
	public boolean vYear(String y) {
		return y.matches("[0-9]{4}");
	}
	public boolean vKilo(String k) {
		
		return k.matches("[0-9]*");
	}
	public boolean vPrecio(String p) {
		return p.matches("[0-9]*");
	}
	public boolean vColor(String col) {
		return col.matches("[A-Z]*");
	}
	public boolean vPlaca(String pla) {
		return pla.matches("([A-Z]{3})[\\-]([0-9]{3,4})");
	}
	
}
