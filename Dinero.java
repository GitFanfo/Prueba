/**
  Archivo: Baraja.java
  Fecha creación:		Jun 10, 2019
  Última modificación:	Jun 12, 2019
  Versión: 1.0
  Licencia: GPL

  Autores:	Nicolas Jaramillo Mayor        1840558
  			Juan josé Dorado Muñoz		   1827439

  Email:	nicolas.jaramillo@correounivalle.edu.co
  			juan.jose.dorado@correounivalle.edu.co

*/
package blackjack;

/**
 * Lleva la cantidad de dinero que el jugador tiene para apostar.
 *
 */
public class Dinero {
	private int dinero;
	
	public Dinero() {
		dinero = 0;
	}
	
	/*
	 * Retorna la cantidad de dinero.
	 */
	public int cuantoTienes(){
		return dinero;
	}
	
	/*
	 * Cambia la cantidad de dinero.
	 */
	public void dineroMas(int monto){
		dinero += monto;
	}
}
