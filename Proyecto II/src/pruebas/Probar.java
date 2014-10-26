package pruebas;

import logica.AND;
import logica.Componente;
import logica.XOR;

public class Probar {

	public static void main(String[] args) {
		Componente CompAND1 = new AND(3);
		Componente CompXOR = new XOR(2);
		CompAND1.ConectEntrada(3, 1);
		CompAND1.ConectEntrada(2, 1);
		CompAND1.ConectEntrada(1, 1);
		CompAND1.ConectComp(CompXOR, 2);

		System.out.println(CompXOR.getSalida());

	}

}
