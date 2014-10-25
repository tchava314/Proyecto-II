package logica;


public class Arbol {
	private NodoA Root;

	public Arbol() {
		Root = null;
	}

	public Arbol(int root) {
		if (Root == null)
			Root = new NodoA(root);

	}

	public NodoA getRoot() {
		return Root;
	}

	public void setRoot(NodoA root) {
		Root = root;
	}

	/**
	 * busca un nodo con un valor especifico en el arbol
	 * 
	 * @param data
	 *            recibe un entero que representa el dato que debe de tener el
	 *            nodo a buscar
	 * @return retorna el nodo con el valor solicitado
	 */
	public NodoA Buscar(int data) {
		NodoA temp = Root;
		boolean der;
		while (temp.getData() != data) {
			if (temp == null) {
				return null;
			}
			if (data < temp.getData()) {
				temp = temp.getHIzq();
				der = false;
			} else {
				temp = temp.getHDer();
				der = true;
			}
		}
		return temp;
	}

	/**
	 * metodo que inserta un nuevo nodo al arbol
	 * 
	 * @param data
	 *            recibe un dato que sera el que lleve el nuevo nodo por
	 *            insertar
	 */
	public void Insertar(int data) {
		NodoA nNodo = new NodoA(data);
		if (Root == null) {
			Root = nNodo;
		}
		NodoA temp = Root;
		NodoA padre;
		while (true) {
			padre = temp;
			if (data < temp.getData()) {
				temp = temp.getHIzq();
				if (temp == null) {
					padre.setHIzq(nNodo);
				}

			} else {
				temp = temp.getHDer();
				if (temp == null) {
					padre.setHDer(nNodo);
				}

			}

		}
	}

	/**
	 * elimina un nodo, si es que dicho nodo no tiene hijos
	 * 
	 * @param nodo
	 *            recibe un nodo que sera el que posteriormente se elimine
	 * @param der
	 *            recibe un boolenano que indica si el nodo a elmininar es un
	 *            hijo derecho o no
	 * @param padre
	 *            recibe un nodo que seria el padre del nodo por eliminar
	 */
	public void ElimA(NodoA nodo, boolean der, NodoA padre) {
		if (nodo == Root) {
			Root = null;
		}
		if (der) {
			padre.setHDer(null);
		} else {
			padre.setHIzq(null);
		}
	}

	/**
	 * elimina un elemento del arbol siempre y cuando este solo tenga un hijo
	 * 
	 * @param nodo
	 *            recibe el nodo por eliminar
	 * @param der
	 *            recibe un booleano que indica si el nodo es hijo derecho o no
	 * @param padre
	 *            recibe el nodo padre del nodo por eliminar
	 */
	public void ElimB(NodoA nodo, boolean der, NodoA padre) {
		if (nodo.getHDer() == null) {
			if (nodo == Root) {
				Root = nodo.getHIzq();
			} else if (!der) {
				padre.setHIzq(nodo.getHIzq());
			} else {
				padre.setHDer(nodo.getHDer());
			}
		} else {
			if (nodo == Root) {
				Root = nodo.getHDer();
			} else if (!der) {
				padre.setHDer(nodo.getHDer());
			} else {
				padre.setHDer(nodo.getHIzq());
			}
		}
	}

}