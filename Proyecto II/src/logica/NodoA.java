package logica;


public class NodoA<Ele> {

	int data;
	NodoA<Ele> HDer;
	NodoA<Ele> HIzq;

	public NodoA(int x) {
		data = x;
		HDer = null;
		HIzq = null;
	}

	public NodoA(int x, NodoA<Ele> der, NodoA<Ele> izq) {
		data = x;
		HDer = der;
		HIzq = izq;
	}

	public int getData() {
		return data;
	}

	public NodoA<Ele> getHDer() {
		return HDer;
	}

	public void setHDer(NodoA<Ele> hDer) {
		HDer = hDer;
	}

	public NodoA<Ele> getHIzq() {
		return HIzq;
	}

	public void setHIzq(NodoA<Ele> hIzq) {
		HIzq = hIzq;
	}

}