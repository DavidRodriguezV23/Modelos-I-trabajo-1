/*
 * Descripción: Clase hija NissanZ370
 * Autores: David Armando Rodríguez Varón, Juan Sebastian Sanchez Tabares
 * Fecha: 17/08/2019
 */
package logica;

public class NissanZ370 extends Automovil{
	
	public NissanZ370() {
		super("Nissan Z370", "Compacto", 2018, 331, 5, 7, 130000000, true);
	}

	@Override
	public String arrancar() {
		return "El Nissan Z370 ha arrancado.";
	}

	@Override
	public String apagar() {
		return "El Nissan Z370 se ha apagado.";
	}

	@Override
	public String acelerar() {
		return "El Nissan Z370 acelera.";
	}

	@Override
	public String girarIzq() {
		return "El Nissan Z370 gira a la izquierda.";
	}

	@Override
	public String girarDer() {
		return "El Nissan Z370 gira a la derecha.";
	}

	@Override
	public String frenar() {
		return "El Nissan Z370 frena.";
	}
}
