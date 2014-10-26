package logica;

public class Componente implements Operacion {
	protected int salida;
	protected Lista<Integer> entradas = new Lista();
	protected boolean isConected;
	protected boolean minEntradas = true;

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
	}

	/**
	 * metodo que le asigna un valor a la entrada que se solicita cunado esta se
	 * conecta a otro componente
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
