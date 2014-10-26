package logica;

public class OR extends Componente {
	/**
	 * constructor que le manda un dato a la super clase
	 * 
	 * @param ent
	 *            numero entero que indica la cantidad de entradas del
	 *            componente
	 */
	public OR(int ent) {

		super(ent);
		if (ent < 2) {
			this.minEntradas = false;
			System.out.println("error");

		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operacion() {
		if (isConected) {
			for (int i = 0; i < this.entradas.size; i++) {
				if (entradas.getObject(i).getData() == 1) {
					this.setSalida(1);
					break;
				} else {
					this.setSalida(0);

				}
			}
		}
	}
}
