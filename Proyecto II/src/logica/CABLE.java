package logica;

public class CABLE extends Componente {
	/**
	 * constructor que le manda un dato a la super clase
	 * 
	 * @param ent
	 *            numero entero que indica la cantidad de entradas del
	 *            componente
	 */
	public CABLE(int ent) {

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
				this.setSalida(1);

			} else {
				this.setSalida(0);

			}
		}
	}

}
