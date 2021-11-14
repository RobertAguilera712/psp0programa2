package psp0programa2;

import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class ContadorConstructores extends VoidVisitorAdapter<Clase> {

	@Override
	public void visit(ConstructorDeclaration cons, Clase clase){
		super.visit(cons, clase);
		clase.getConstructores().add(cons);
	}

}
