package logica;

public class Componente implements Operacion {
	protected int salida;
	protected Lista<Integer> entradas = new Lista();
	protected boolean isConected;
	protected boolean minEntradas = true;
	protected Componente padre;
	protected int numSalida;
	protected Lista<Componente> hijos = new Lista<Componente>();

	/**
	 * constructor del componente
	 * 
	 * @param ent
	 *            recibe un entero que indica el numero de entradas del
	 *            componete
	 */
	public Componente(int ent) {
		salida = 0;
		for (int i = 0; i < ent; i++) {
			entradas.addDataEnd(0);
		}
		isConected = false;
		numSalida = 0;
	}

	public Lista<Integer> getEntradas() {
		return entradas;
	}

	public void setEntradas(Lista<Integer> entradas) {
		this.entradas = entradas;
	}

	public boolean isMinEntradas() {
		return minEntradas;
	}

	public void setMinEntradas(boolean minEntradas) {
		this.minEntradas = minEntradas;
	}

	public Componente getPadre() {
		return padre;
	}

	public void setPadre(Componente padre) {
		this.padre = padre;
	}

	public int getNumSalida() {
		return numSalida;
	}

	public void setNumSalida(int numSalida) {
		this.numSalida = numSalida;
	}

	public Lista<Componente> getHijos() {
		return hijos;
	}

	public void setHijo(Componente hijo) {
		hijos.addDataEnd(hijo);
	}

	/**
	 * metodo que conecta dos componentes entre si
	 * 
	 *
	 * @param comp2
	 *            segundo componete por conectar
	 * @param num
	 *            numero de entrada del componente 2 a la cual se desea conectar
	 *            este componente
	 */
	public void ConectComp(Componente comp2, int num) {
		comp2.ConectEntrada(num, this.getSalida());
		padre = comp2;
		numSalida = num;
	}

	/**
	 * metodo que le asigna un valor a la entrada que se solicita cunado esta se
	 * conecta a otro componente, ademas le "avisa" al componente "padre" que
	 * ocurrio un cambio en la entrada
	 * 
	 * @param num
	 *            recibe el numero de entrada a la cual se le quiere asiganar un
	 *            valor
	 * @param data
	 *            recibe el nuevo valor que va a tener la entrada, puede ser 1 o
	 *            0
	 */
	public void ConectEntrada(int num, int data) {

		entradas.getObject(num - 1).setData(data);
		isConected = true;
		this.operacion();
		if (padre != null) {
			padre.ConectEntrada(this.numSalida, this.getSalida());

		}
	}

	public boolean isConected() {
		return isConected;
	}

	public void setConected(boolean isConected) {
		this.isConected = isConected;
	}

	public int getSalida() {
		return salida;
	}

	public void setSalida(int salida) {
		this.salida = salida;
	}

	@Override
	public void operacion() {
		// TODO Auto-generated method stub

	}

}
