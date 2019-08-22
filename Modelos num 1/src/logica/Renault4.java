/*
 * Descripci�n: Clase hija Renault 4
 * Autores: David Armando Rodr�guez Var�n, Juan Sebastian Sanchez Tabares
 * Fecha: 17/08/2019
 */
package logica;

public class Renault4 extends Automovil {

	public Renault4() {
		super("Renault 4", "Compacto", 1992, 70, 4, 4, 5900000, false);
	}

	@Override
	public String arrancar() {
		return "El Renault 4 ha arrancado.";
	}

	@Override
	public String apagar() {
		return "El Renault 4 se ha apagado.";
	}

	@Override
	public String acelerar() {
		return "El Renault 4 acelera.";
	}

	@Override
	public String girarIzq() {
		return "El Renault 4 gira a la izquierda.";
	}

	@Override
	public String girarDer() {
		return "El Renault 4 gira a la derecha.";
	}

	@Override
	public String frenar() {
		return "El Renault 4 frena.";
	}
}
