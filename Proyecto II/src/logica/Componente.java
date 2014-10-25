package logica;

public class Componente implements Operacion {
	protected int salida;
	protected int entrada1;
	protected int entrada2;
	protected boolean isConected;

	public Componente() {
		salida = 0;
		entrada1 = 0;
		entrada2 = 0;
		isConected = false;
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
		if (num == 1) {
			this.setEntrada1(data);
			isConected = true;

		} else {
			this.setEntrada2(data);
			isConected = true;

		}
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

	public int getEntrada1() {
		return entrada1;
	}

	public void setEntrada1(int entrada1) {
		this.entrada1 = entrada1;
	}

	public int getEntrada2() {
		return entrada2;
	}

	public void setEntrada2(int entrada2) {
		this.entrada2 = entrada2;
	}

	@Override
	public void operacion() {
		// TODO Auto-generated method stub

	}

}
