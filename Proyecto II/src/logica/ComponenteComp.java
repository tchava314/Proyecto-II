package logica;

public class ComponenteComp {
	Lista<Componente> estructura;
	Lista<Componente> patillas = new Lista<Componente>();
	Componente salida;

	/**
	 * constructor que recorre la estructura de componentes y crea la lista de
	 * patillas asi como el componente salida
	 * 
	 * @param lista
	 */
	ComponenteComp(Lista<Componente> lista) {
		estructura = lista;
		for (int i = 0; i < estructura.getSize(); i++) {
			if (estructura.getObject(i).getData().getHijos().getClass()
					.toString() == "class logica.CABLE") {
				patillas.addDataEnd(estructura.getObject(i).getData());
			}
			if (estructura.getObject(i).getData().getPadre() == null) {
				salida = estructura.getObject(i).getData();
			}
			for (int j = 0; j < estructura.getObject(i).getData().getHijos()
					.getSize(); j++) {
				Componente hijo = estructura.getObject(i).getData().getHijos()
						.getObject(j).getData();
				hijo.ConectComp(estructura.getObject(i).getData(), j);
			}
		}

	}

	public void setEntrada(int patilla, boolean valor) {
		int cont = patilla;
		int i = 0;
		while (cont > 0) {
			for (int i = 0; i < patillas.getObject(i).getSize(); i++) {

			}
		}

	}

}
