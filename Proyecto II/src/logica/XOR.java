package logica;

public class XOR extends Componente {
	/**
	 * constructor que le manda un dato a la super clase
	 * 
	 * @param ent
	 *            numero entero que indica la cantidad de entradas del
	 *            componente
	 */
	public XOR(int ent) {

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
			int unos = 0;
			for (int i = 0; i < this.entradas.size; i++) {
				if (entradas.getObject(i).getData() == 1) {
					unos++;
				}
			}
			if (unos % 2 == 0) {
				this.setSalida(0);
			} else {
				this.setSalida(1);
			}
		}
	}
}
