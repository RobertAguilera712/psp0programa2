package psp0programa2;

import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class ContadorClases extends VoidVisitorAdapter<ArchivoJava>{

	private static final ContadorAtributos CONTADOR_ATRIBUTOS = new ContadorAtributos();
	private static final ContadorConstructores CONTADOR_CONSTRUCTORES = new ContadorConstructores();
	private static final ContadorMetodos CONTADOR_METODOS = new ContadorMetodos();

	@Override
	public void visit(ClassOrInterfaceDeclaration cd, ArchivoJava arj){
		super.visit(cd, arj);
		Clase nuevaClase = new Clase(cd);
		arj.getClases().add(nuevaClase);
		CONTADOR_ATRIBUTOS.visit(cd, nuevaClase);
		CONTADOR_CONSTRUCTORES.visit(cd, nuevaClase);
		CONTADOR_METODOS.visit(cd, nuevaClase);
	}
	
}
