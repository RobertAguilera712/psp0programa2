package psp0programa2;

import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class ContadorAtributos extends VoidVisitorAdapter<Clase>{

	@Override
	public void visit(FieldDeclaration fd, Clase clase){
		super.visit(fd, clase);
		clase.getAtributos().add(fd);
	}
	
}
