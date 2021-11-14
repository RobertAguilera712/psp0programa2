package psp0programa2;

import java.io.File;

public class Psp0Programa2 {

	private static final String PATH = "/home/kasparov/NetBeansProjects/Psp0Programa2";

	public static void main(String[] args) {

		Programa programa = new Programa(new File(PATH));
		Contador contador = new Contador(programa);

		contador.Contar();

		programa.imprimirDatos();

	}

}
