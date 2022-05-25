package validaciones;

public class validar {
	
	public boolean validate(String cd,String mrc,String y,String k,String p,String col,String pla) {

		if(!vCodigo(cd)) {
			System.out.println("CODIGO MAL");
			return false;
		}
		else if(!vMARCA(mrc)) {
			System.out.println("marca mal");
			return false;
		}
		else if(!vYear(y)) {
			System.out.println("ANIO MAL");
			return false;
		}
		else if(!vKilo(k)) {
			System.out.println("KILOMETRAJE MAL");
		return false;
		}
		else if(!vPrecio(p)) {
			System.out.println("PRECIO MAL");
			return false;
		}
		else if(!vColor(col)) {
			System.out.println("COLOR MAL");
			return false;
		}
		else if(!vPlaca(pla)) {
			System.out.println("PLACA MAL");
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
