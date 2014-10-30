package logica;

public class AND extends Componente {
	/**
	 * constructor que le manda un dato a la super clase
	 * 
	 * @param ent
	 *            numero entero que indica la cantidad de entradas del
	 *            componente
	 */
	public AND(int ent) {

		super(ent);
		if (ent < 2) {
			this.minEntradas = false;
			System.out.println("error");
			for (int i = 0; i < ent; i++) {
				new CABLE(1).ConectComp(this, i);
			}
		}
		// TODO Auto-generated constructor stub
	}

	@Override
	public void operacion() {
		if (isConected) {
			for (int i = 0; i < this.entradas.size; i++) {
				if (entradas.getObject(i).getData() == 1) {
					this.setSalida(1);
				} else {
					this.setSalida(0);
					break;
				}
			}
		}
	}
}
