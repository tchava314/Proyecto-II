package logica;

public class NOT extends Componente {
	/**
	 * constructor que le manda un dato a la super clase
	 * 
	 * @param ent
	 *            numero entero que indica la cantidad de entradas del
	 *            componente
	 */
	public NOT(int ent) {

		super(ent);
		if (ent != 1) {
			this.minEntradas = false;
			System.out.println("error");

		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operacion() {
		if (isConected) {
			if (entradas.getObject(0).getData() == 1) {
				this.setSalida(0);

			} else {
				this.setSalida(1);

			}
		}
	}
}
