package pruebas;

import logica.AND;

public class Probar {

	public static void main(String[] args) {
		AND CompAND = new AND();
		CompAND.ConectEntrada(1, 1);
		CompAND.ConectEntrada(2, 1);
		System.out.println(CompAND.getSalida());
	}

}
