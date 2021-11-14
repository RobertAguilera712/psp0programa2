package psp0programa2;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import java.util.LinkedList;
import java.util.List;

public class Clase extends Entidad {

	private final ClassOrInterfaceDeclaration declaracionClase;
	private final List<FieldDeclaration> atributos;
	private final List<ConstructorDeclaration> constructores;
	private final List<Metodo> metodos;

	public Clase(ClassOrInterfaceDeclaration declaraciionClase) {
		super(declaraciionClase.getNameAsString());
		this.declaracionClase = declaraciionClase;
		this.atributos = new LinkedList<>();
		this.constructores = new LinkedList<>();
		this.metodos = new LinkedList<>();
	}

	public ClassOrInterfaceDeclaration getDeclaracionClase() {
		return declaracionClase;
	}

	public List<FieldDeclaration> getAtributos() {
		return atributos;
	}

	public List<ConstructorDeclaration> getConstructores() {
		return constructores;
	}

	public List<Metodo> getMetodos() {
		return metodos;
	}

	@Override
	protected void setTamanio() {
		this.tamanio = this.declaracionClase.toString().replaceAll("\n+", "\n").split("\n").length;
	}

	@Override
	public String toString() {
		return String.format("Nombre de la clase: %s\n"
				+ "Lineas de código: %d\n"
				+ "Número de atributos: %d\n"
				+ "Número de constructores: %d\n"
				+ "Número de metodos: %d\n"
				+ "Metodos: \n%s\n",
				this.nombre, this.getTamanio(), this.atributos.size(),
				this.constructores.size(), this.metodos.size(),
				this.metodos);
	}

	void imprimirDatos() {
		System.out.println(String.format("\t\tNombre de la clase: %s\n"
				+ "\t\tLineas de código: %d\n"
				+ "\t\tNúmero de atributos: %d\n"
				+ "\t\tNúmero de constructores: %d\n"
				+ "\t\tNúmero de metodos: %d\n"
				+ "\t\tMetodos: \n",
				this.nombre, this.getTamanio(), this.atributos.size(),
				this.constructores.size(), this.metodos.size()));
		this.metodos.forEach(metodo -> {
			metodo.imprimirDatos();
		});
	}

}
