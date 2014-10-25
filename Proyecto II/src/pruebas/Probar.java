package pruebas;

import logica.AND;
import logica.Componente;

public class Probar {

	public static void main(String[] args) {
		Componente CompAND1 = new AND();
		Componente CompAND2 = new AND();
		CompAND1.ConectEntrada(1, 1);
		CompAND1.ConectEntrada(2, 1);
		CompAND1.ConectComp(CompAND2, 1);
		CompAND2.ConectEntrada(2, 1);
		System.out.println(CompAND2.getSalida());
	}

}
