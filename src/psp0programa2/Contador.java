package psp0programa2;

import com.github.javaparser.StaticJavaParser;
import com.github.javaparser.ast.CompilationUnit;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Contador {

	private final Programa programa;
	private CompilationUnit cu;
	private final ContadorImports contadorImports;
	private final ContadorClases contadorClases;

	public Contador(Programa programa) {
		this.programa = programa;
		this.contadorImports = new ContadorImports();
		this.contadorClases = new ContadorClases();
	}

	public void Contar() {
		this.programa.getArchivos().forEach(archivo -> {
			try {
				cu = StaticJavaParser.parse(archivo.getArchivo());
				quitarComentarios(cu);
				contadorImports.visit(cu, archivo);
				contadorClases.visit(cu, archivo);
			} catch (FileNotFoundException ex) {
				Logger.getLogger(Contador.class.getName()).log(Level.SEVERE, null, ex);
			}
		});
	}

	private void quitarComentarios(CompilationUnit cu) {
		cu.getAllComments().forEach(comment -> {
			comment.remove();
		});
	}

}
