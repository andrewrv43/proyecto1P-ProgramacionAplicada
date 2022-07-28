package validaciones;

import java.sql.ResultSet;
import java.sql.SQLException;

import libreriaAV.conectionBD;

public class logica {
	public conectionBD cn = new conectionBD("src/");
	public ResultSet res;
	
	public boolean validarContra(String user, String pass) {
		res = cn.getQuery("SELECT * FROM usuario");
		while(res!=null) {
			try {
				res.next();
				if(res.getString("name").equals(user) && res.getString("pass").equals(pass)) {
					return true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				return false;
			}
		}
		return false;
	}
	
	//CRUD - BASE DE DATOS
	
	public boolean createRegister(String cod, String marca, String mod, String col, String plc, String tapiceria, String caja, Long km, int anio, double price, String tipo, int descuento) {
		String sentencia = "INSERT INTO vehiculo(codigo, marca, modelo, anio, kilometraje, precio, color, placa, tapiceria, caja_cambios, tipo, descuento) VALUES('" + cod + "', '" + marca + "', '" + mod + "', " + anio + ", " + km + ", " + price + ", '" + col + "', '" + plc + "', '" + tapiceria + "', '" + caja + "', '" + tipo + "', " + descuento + ")";
		return cn.setQuery(sentencia);
	}
}
