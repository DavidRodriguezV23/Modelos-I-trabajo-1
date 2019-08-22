/*
 * Descripción: Se encarga de la sustitucion Liskov
 * Autores: David Armando Rodríguez Varón, Juan Sebastian Sanchez Tabares
 * Fecha: 17/08/2019
 */
package logica;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class Liskov {
	
	//Metodo Liskov
	public static Automovil crearAutomovil(int caso) {
		switch (caso){
			case 1://Spark
				return new SparkGT();
			case 2://Renault 4
				return new Renault4();
			case 3://Nissan Z370
				return new NissanZ370();
			default:
				JOptionPane.showMessageDialog(null, "Fallo al crear el automovil.");
				return null;
		}
	}
		
}
