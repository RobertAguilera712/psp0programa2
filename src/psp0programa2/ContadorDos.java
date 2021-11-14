package psp0programa2;

import com.github.javaparser.ast.stmt.DoStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class ContadorDos extends VoidVisitorAdapter<Metodo>{

	@Override
	public void visit(DoStmt doStmt, Metodo metodo){
		super.visit(doStmt, metodo);
		metodo.getDos().add(doStmt);
	}
	
}
