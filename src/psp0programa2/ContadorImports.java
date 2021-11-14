package psp0programa2;

import com.github.javaparser.ast.ImportDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

public class ContadorImports extends VoidVisitorAdapter<ArchivoJava>{

	@Override
	public void visit(ImportDeclaration id, ArchivoJava arj){
		super.visit(id, arj);
		arj.getImports().add(id);
	}
	
}
