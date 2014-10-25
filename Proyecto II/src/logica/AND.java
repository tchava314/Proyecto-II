package logica;

public class AND extends Componente implements Operacion {

	@Override
	public void operacion() {
		if (isConected) {
			if (entrada1 == 1 && entrada2 == 1) {
				this.setSalida(1);
			} else {
				this.setSalida(0);
			}
		}
	}
}
