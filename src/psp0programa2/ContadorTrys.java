package psp0programa2;

import com.github.javaparser.ast.stmt.TryStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class ContadorTrys extends VoidVisitorAdapter<Metodo>{

	@Override
	public void visit(TryStmt tryStmt, Metodo metodo){
		super.visit(tryStmt, metodo);
		metodo.getTrys().add(tryStmt);
	}
	
}
