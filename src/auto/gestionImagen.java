package auto;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import Ventanas.Ventana_opciones;

public class gestionImagen {

	private ImageIcon image = new ImageIcon();
	@SuppressWarnings("unused")
	private Icon im;
	private int width, height;
	public gestionImagen(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public boolean guardarImagen(File ar, int contadorArchivo, String codigo) {

		File archivo = ar;
		//verificamos seleccion de archivo
		if(archivo != null) {
			try {
				//destino
				String des = Ventana_opciones.pathHome + "SAJACAR/catalogo/" + codigo + "/img/" + contadorArchivo +".jpg";
				Path destino = Paths.get(des);

				//origen
				String ori = archivo.getAbsolutePath();
				Path origen = Paths.get(ori);

				//copia
				Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
				contadorArchivo++;
				return true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}		
		}else {
			return false;
		}
	}

	public Icon iniciar(int contador, String codigo) {
		image = new ImageIcon(Ventana_opciones.pathHome + "SAJACAR/catalogo/" + codigo + "/img/" + contador +".jpg");
		return im = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
	}
	public Icon siguiente(int contador, String codigo) {
		image = new ImageIcon(Ventana_opciones.pathHome + "SAJACAR/catalogo/" + codigo + "/img/" + contador +".jpg");
		return im = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
	}
	public Icon anterior(int contador, String codigo) {

		image = new ImageIcon(Ventana_opciones.pathHome + "SAJACAR/catalogo/" + codigo + "/img/" + contador +".jpg");
		return im = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
	}
}
