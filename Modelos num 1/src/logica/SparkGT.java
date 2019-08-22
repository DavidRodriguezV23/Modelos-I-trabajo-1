/*
 * Descripción: Clase hija SparkGT
 * Autores: David Armando Rodríguez Varón, Juan Sebastian Sanchez Tabares
 * Fecha: 17/08/2019
 */
package logica;

public class SparkGT extends Automovil{

	public SparkGT() {
		super("Chevrolet SparkGT", "Compacto", 2019, 80, 4, 5, 33990000, true);
	}

	@Override
	public String arrancar() {
		return "El chevrolet SparkGT ha arrancado.";
	}

	@Override
	public String apagar() {
		return "El chevrolet SparkGT se ha apagado.";
	}

	@Override
	public String acelerar() {
		return "El chevrolet SparkGT acelera.";
	}

	@Override
	public String girarIzq() {
		return "El chevrolet SparkGT gira a la izquierda.";
	}

	@Override
	public String girarDer() {
		return "El chevrolet SparkGT gira a la derecha.";
	}

	@Override
	public String frenar() {
		return "El chevrolet SparkGT frena.";
	}

}
