package psp0programa2;

import com.github.javaparser.ast.stmt.ForStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class ContadorFors extends VoidVisitorAdapter<Metodo>{

	@Override
	public void visit(ForStmt forStmt, Metodo metodo){
		super.visit(forStmt, metodo);
		metodo.getFors().add(forStmt);
	}
	
}
