package psp0programa2;

import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class ContadorMetodos extends VoidVisitorAdapter<Clase>{

	private static final ContadorDos CONTADOR_DOS = new ContadorDos();
	private static final ContadorFors CONTADOR_FORS = new ContadorFors();
	private static final ContadorIfs CONTADOR_IFS = new ContadorIfs();
	private static final ContadorSwitchs CONTADOR_SWITCHS = new ContadorSwitchs();
	private static final ContadorTrys CONTADOR_TRYS = new ContadorTrys();
	private static final ContadorWhiles CONTADOR_WHILES = new ContadorWhiles();

	@Override
	public void visit(MethodDeclaration md, Clase clase){
		super.visit(md, clase);
		Metodo nuevoMetodo = new Metodo(md);
		clase.getMetodos().add(nuevoMetodo);
		CONTADOR_DOS.visit(md, nuevoMetodo);
		CONTADOR_FORS.visit(md, nuevoMetodo);
		CONTADOR_IFS.visit(md, nuevoMetodo);
		CONTADOR_SWITCHS.visit(md, nuevoMetodo);
		CONTADOR_TRYS.visit(md, nuevoMetodo);
		CONTADOR_WHILES.visit(md, nuevoMetodo);
	}
	
}
