package pruebas;

import logica.AND;
import logica.Componente;
import logica.Lista;

public class Probar {

	public static void main(String[] args) {
		Componente CompAND1 = new AND(2);
		Componente CompXOR = new AND(2);
		System.out.println(CompAND1.getClass().toString());
		Lista<Componente> chachete = new Lista<Componente>();

	}
}
