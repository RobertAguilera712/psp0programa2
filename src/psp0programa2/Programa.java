package psp0programa2;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class Programa extends Entidad{

	private final List<ArchivoJava> archivos;
	private final File carpeta;

	public Programa(File carpeta) {
		super(carpeta.getName());
		this.carpeta = carpeta;
		this.archivos = new LinkedList<>();
		setArchivos();
	}

	private void setArchivos(){
		FileUtils.listFiles(this.carpeta, new String[]{"java"}, true).forEach(archivo -> {
			this.archivos.add(new ArchivoJava(archivo));
		});
	}

	public List<ArchivoJava> getArchivos(){
		return this.archivos;
	}

	public File getCarpeta(){
		return this.carpeta;
	}

	@Override
	public void setTamanio() {
		this.archivos.forEach(archivo -> {
			this.tamanio += archivo.getTamanio();
		});
	}

	public void imprimirDatos(){
		System.out.println(String.format("Nombre del programa: %s\n"
				+ "Lineas de código: %d\n"
				+ "Número de archivos: %d\n"
				+ "Archivos:\n", this.nombre, this.getTamanio(),
				this.archivos.size()));
		this.archivos.forEach(archivo -> {
			archivo.imprimirDatos();
		});
	}

	@Override
	public String toString() {
		return String.format("Nombre del programa: %s\n"
				+ "Lineas de código: %d\n"
				+ "Número de archivos %d\n"
				+ "Archivos: \n%s\n",
				this.nombre, this.getTamanio(), this.archivos.size(),
				this.archivos);
	}


	
}
