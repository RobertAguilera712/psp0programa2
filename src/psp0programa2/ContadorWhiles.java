package psp0programa2;

import com.github.javaparser.ast.stmt.WhileStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class ContadorWhiles extends VoidVisitorAdapter<Metodo>{

	@Override
	public void visit(WhileStmt whileStmt, Metodo metodo){
		super.visit(whileStmt, metodo);
		metodo.getWhiles().add(whileStmt);
	}
	
}
