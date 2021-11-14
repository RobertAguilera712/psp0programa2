package psp0programa2;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.stmt.DoStmt;
import com.github.javaparser.ast.stmt.ForStmt;
import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.stmt.SwitchStmt;
import com.github.javaparser.ast.stmt.TryStmt;
import com.github.javaparser.ast.stmt.WhileStmt;
import java.util.LinkedList;
import java.util.List;

public class Metodo extends Entidad{

	private final MethodDeclaration methodDeclaration;
	private final List<DoStmt> dos;
	private final List<ForStmt> fors;
	private final List<IfStmt> ifs;
	private final List<SwitchStmt> switchs;
	private final List<TryStmt> trys;
	private final List<WhileStmt> whiles;

	public Metodo(MethodDeclaration methodDeclaration) {
		super(methodDeclaration.getNameAsString());
		this.methodDeclaration = methodDeclaration;
		this.dos = new LinkedList<>();
		this.fors = new LinkedList<>();
		this.ifs = new LinkedList<>();
		this.switchs = new LinkedList<>();
		this.trys = new LinkedList<>();
		this.whiles = new LinkedList<>();
	}

	public MethodDeclaration getMethodDeclaration() {
		return methodDeclaration;
	}

	public List<DoStmt> getDos() {
		return dos;
	}

	public List<ForStmt> getFors() {
		return fors;
	}

	public List<IfStmt> getIfs() {
		return ifs;
	}

	public List<SwitchStmt> getSwitchs() {
		return switchs;
	}

	public List<TryStmt> getTrys() {
		return trys;
	}

	public List<WhileStmt> getWhiles() {
		return whiles;
	}

	@Override
	protected void setTamanio() {
		this.tamanio = this.methodDeclaration.toString().replaceAll("\n+", "\n").split("\n").length;
	}

	@Override
	public String toString() {
		return String.format("Nombre del metodo: %s\n"
				+ "Lineas de código: %d\n"
				+ "Número de sentencias if: %d\n"
				+ "Número de sentencias switch: %d\n"
				+ "Número de sentencias try: %d\n"
				+ "Número de ciclos do: %d\n"
				+ "Número de ciclos for: %d\n"
				+ "Número de ciclos while: %d\n", 
				this.nombre, this.getTamanio(), this.ifs.size(),
				this.switchs.size(), this.trys.size(), this.dos.size(),
				this.fors.size(), this.whiles.size());
	}

	public void imprimirDatos() {
		System.out.println(String.format("\t\t\tNombre del metodo: %s\n"
				+ "\t\t\tLineas de código: %d\n"
				+ "\t\t\tNúmero de sentencias if: %d\n"
				+ "\t\t\tNúmero de sentencias switch: %d\n"
				+ "\t\t\tNúmero de sentencias try: %d\n"
				+ "\t\t\tNúmero de ciclos do: %d\n"
				+ "\t\t\tNúmero de ciclos for: %d\n"
				+ "\t\t\tNúmero de ciclos while: %d\n", 
				this.nombre, this.getTamanio(), this.ifs.size(),
				this.switchs.size(), this.trys.size(), this.dos.size(),
				this.fors.size(), this.whiles.size()));
	}



}
