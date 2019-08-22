/*
 * Descripci�n: Clase padre de los vehiculos
 * Autores: David Armando Rodr�guez Var�n, Juan Sebastian Sanchez Tabares
 * Fecha: 17/08/2019
 */
package logica;

import java.text.DecimalFormat;

public abstract class Automovil {
	
	public String nombre;
	public String tipoAutomovil;
	public int anio;
	public int motorHp;
	public int puertas;	
	public int velocidades;	
	public String precio;
	public boolean airBag;
	public DecimalFormat formatea = new DecimalFormat("###,###.##");
	
	public Automovil(String nombre, String tipoAutomovil, int anio, int motorHp, int puertas, int velocidades,
			double precio, boolean airBag) {
		super();
		this.nombre = nombre;
		this.tipoAutomovil = tipoAutomovil;
		this.anio = anio;
		this.motorHp = motorHp;
		this.puertas = puertas;
		this.velocidades = velocidades;
		this.precio = formatea.format(precio);
		this.airBag = airBag;
	}
	
	public abstract String arrancar();
	public abstract String apagar();
	public abstract String acelerar();
	public abstract String girarIzq();
	public abstract String girarDer();
	public abstract String frenar();
}
