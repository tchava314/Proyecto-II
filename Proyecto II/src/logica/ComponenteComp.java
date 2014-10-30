package logica;

public class ComponenteComp {
	Lista<Componente> estructura = new Lista<Componente>();
	Lista<Componente> patillas = new Lista<Componente>();
	Componente salida;

	ComponenteComp() {
		for (int i = 0; i < estructura.getSize(); i++) {
			if (estructura.getObject(i).getData().getHijos().getSize() == 0) {
				patillas.addDataEnd(estructura.getObject(i).getData());
			}
		}
		for (int i = 0; i < estructura.getSize(); i++) {
			if (estructura.getObject(i).getData().getPadre() == null) {
				salida = estructura.getObject(i).getData();
			}
		}

	}
}
