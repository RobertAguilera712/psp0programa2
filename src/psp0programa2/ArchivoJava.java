package psp0programa2;

import com.github.javaparser.ast.ImportDeclaration;
import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class ArchivoJava extends Entidad {

	private final File archivo;
	private final List<ImportDeclaration> imports;
	private final List<Clase> clases;

	public ArchivoJava(File archivo) {
		super(archivo.getName());
		this.archivo = archivo;
		this.imports = new LinkedList<>();
		this.clases = new LinkedList<>();
	}

	public File getArchivo() {
		return archivo;
	}

	public List<ImportDeclaration> getImports() {
		return imports;
	}

	public List<Clase> getClases() {
		return clases;
	}

	@Override
	protected void setTamanio() {
		this.imports.forEach(i -> {
			this.tamanio++;
		});
		this.clases.forEach(clase -> {
			this.tamanio += clase.getTamanio();
		});
	}

	@Override
	public String toString() {
		return String.format("Nombre del archivo %s\n"
				+ "Lineas de código: %d\n"
				+ "Número de imports: %d\n"
				+ "Número de clases: %d\n"
				+ "Clases: \n%s\n",
				this.nombre, this.getTamanio(), this.imports.size(),
				this.clases.size(), this.clases);
	}

	public void imprimirDatos() {
		System.out.println(String.format("\tNombre del archivo %s\n"
				+ "\tLineas de código: %d\n"
				+ "\tNúmero de imports: %d\n"
				+ "\tNúmero de clases: %d\n"
				+ "\tClases:\n",
				this.nombre, this.getTamanio(), this.imports.size(),
				this.clases.size()));

		this.clases.forEach(clase -> {
			clase.imprimirDatos();
		});
	}

}
