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

public class gestionImagen {
	//private JFileChooser ventana = new JFileChooser("");
	private FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG", "jpg");
	private ImageIcon image = new ImageIcon();
	private Icon im;
	private int width, height;
	public gestionImagen(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public boolean guardarImagen(File ar, int contadorArchivo, String codigo) {
		/*ventana.setFileFilter(filtro);
		ventana.showOpenDialog(this);*/
		File archivo = ar;
		
		//verificamos seleccion de archivo
		if(archivo != null) {

			try {
				//destino
				String des = "src/catalogo/" + codigo + "/img/" + contadorArchivo +".jpg";
				Path destino = Paths.get(des);

				//origen
				String ori = archivo.getAbsolutePath();
				Path origen = Paths.get(ori);

				//copia

				Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING);
				//JOptionPane.showMessageDialog(this, "ARCHIVO GUARDADO");
				contadorArchivo++;
				return true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//JOptionPane.showMessageDialog(this, "NO SE PUEDO GUARDAR EL ARCHIVO");
				e.printStackTrace();
				return false;
			}		
		}else {
			return false;
		}
	}
	
	public Icon iniciar(int contador, String codigo) {
		image = new ImageIcon("src/catalogo" + codigo + "/img/" + contador +".jpg");
		return im = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
	}
	public Icon siguiente(int contador, String placa) {
		File directorio = new File("Auto 1/img");
		File[] nimg = directorio.listFiles();
		if(contador >= nimg.length){
			contador = 1;
		}else {
			contador ++;
		}
		image = new ImageIcon(placa + "/img/" + contador +".jpg");
		return im = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
	}
	public Icon anterior(int contador, String codigo) {
		File directorio = new File(codigo + "/img");
		File[] nimg = directorio.listFiles();
		if(contador <= 1){
			contador = nimg.length;
		}else {
			contador --;
		}
		image = new ImageIcon(codigo + "/img/" + contador +".jpg");
		return im = new ImageIcon(image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
	}
}
