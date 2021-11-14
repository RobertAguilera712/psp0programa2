package psp0programa2;

import com.github.javaparser.ast.stmt.SwitchStmt;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class ContadorSwitchs extends VoidVisitorAdapter<Metodo>{

	@Override
	public void visit(SwitchStmt switchStmt, Metodo metodo){
		super.visit(switchStmt, metodo);
		metodo.getSwitchs().add(switchStmt);
	}
	
}
