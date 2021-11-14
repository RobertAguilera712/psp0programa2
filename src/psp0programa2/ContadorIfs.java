package psp0programa2;

import com.github.javaparser.ast.stmt.IfStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class ContadorIfs extends VoidVisitorAdapter<Metodo>{

	@Override
	public void visit(IfStmt ifStmt, Metodo metodo){
		super.visit(ifStmt, metodo);
		metodo.getIfs().add(ifStmt);
	}
	
}
