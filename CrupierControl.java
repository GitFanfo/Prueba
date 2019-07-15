/**
  Archivo: CrupierControl.java
  
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

import java.util.Scanner;

/**
 * Clase de control
 *
 */

// -que las cartas no se repitan en el mismo turno
public class CrupierControl {
	private Baraja baraja;
	private Dinero dinero;
	private Scanner scanner, lector;
	
	
	private String manoJugador, manoCrupier, letra;
	private int manoJugadorValor, manoCrupierValor, perderOGanar,
				acesJugador, acesCrupier;


// Constructor
	
	public CrupierControl() {
		baraja = new Baraja();
		scanner = new Scanner(System.in);
		dinero = new Dinero();
		lector = new Scanner (System.in);
		
	}

	/**
	 * Se le pasa la posición de la carta en la baraja y 
	 * devuelve su tipo de carta (picas, corazones, etc...)
	 * @param carta
	 * @return int
	 */
	private int calcularNaipe(int carta){
		int naipe;
		if(carta <= 12) {
			naipe = 1;
			}
		else if(carta <= 25) {
			naipe = 2;
		}
		else if(carta <= 38) {
			naipe = 3;

		}
		else naipe = 4;
		return naipe;
	}

	/**
	 * Se le pasa la el tipo de carta en la baraja y 
	 * devuelve su valor numérico.
	 * @param carta
	 * @param naipe
	 * @return int
	 */
	
	private int valorCarta(int carta, int naipe){
		switch(naipe) {
			case 1: carta++; // Picas
			break;

			case 2: carta+= -12; // Corazones
			break;

			case 3: carta+= -25; // Tréboles
			break;

			case 4: carta+= -38; // Diamantes
			break;
		}
		
		// Trasforma Jack, Queen o King en 10
		if (carta > 10) {
			carta = 10;
		}
		// Transforma Az en 11
		if (carta == 1) {
			carta = 11;
		}
		
		
		return carta;
	}
	
	/**
	 * Decide si el valor del Az debe ser 11 o 1 dependiendo
	 * de la suma de cartas del jugador.
	 * @param Az 
	 * @param quien
	 */
	public void asDeAces(int Az, int quien) {
		
		if(Az == 11) {
			if (quien == 1)
				acesJugador++;
			else
				acesCrupier++;
		}
	}
		
	
	
	/**
	 * Agrega una carta a la mano del jugador/crupier
	 * @param num
	 */
	public void nuevaCarta(int num) // 0 = crupier, 1 = jugador
	{
		int naipe;
		int valCarta;
		int posCarta = baraja.getCarta();
		naipe = calcularNaipe(posCarta);
		valCarta = valorCarta(posCarta, naipe);
		asDeAces(valCarta, num);
		if (num == 0) {
			manoCrupier += baraja.dibujarCarta(posCarta) + "\n";
			manoCrupierValor += valCarta;
		}
		else if (num == 1) {
			manoJugador += baraja.dibujarCarta(posCarta) + "\n";
			manoJugadorValor += valCarta;
		}
		
	}
	
	/**
	 * Imprime ambas manos, las cartas que tiene el
	 * Crupier y las que tiene el Jugador
	 */
	
	public void mostrarCartas() {
		
		System.out.println("Mano Crupier:");
		System.out.println(manoCrupier);
		System.out.println("Tus cartas:");
		System.out.println(manoJugador);
		System.out.println("Crupier: " +manoCrupierValor);
		System.out.println("Tú:      " + manoJugadorValor);
		System.out.println("Dinero: " + dinero.cuantoTienes());
		System.out.println("Apuesta: " + perderOGanar);
	}
	
	
	/**
	 * Retorna true si el jugador gana o false si pierde
	 * @return boolean
	 */
	public boolean compararCartas() {
		if(manoJugadorValor > 21) {
			//System.out.println("acesJugador: "+ acesJugador); //debug purpose
			if (acesJugador > 0) {
				acesJugador--;
				manoJugadorValor -= 10;
				//System.out.println("aces del jugador: "+ acesJugador + "\nmanoJugadorValor: " + manoJugadorValor); //debug purpose
				return compararCartas();
			}
			else {
				System.out.println("Perdiste");
				return false;
			}
		}
		if(manoJugadorValor == manoCrupierValor) {
			System.out.println("Perdiste");
			return false;
		}
		if(manoJugadorValor > manoCrupierValor) {
			return true;
		}
		if (manoCrupierValor > 21)
			return true;
		else {
			return false;
		}
		
		//int max(int arg1, int arg2)
		
	}
	
	/**
	 * Decide si el valor del Az debe ser 11 o 1 dependiendo
	 * de la suma de cartas del jugador.
	 * @return Boolean
	 */
	
	public boolean mayorVentiuno(){
		
		if(manoJugadorValor > 21) {
			if (acesJugador > 0) {
				acesJugador--;
				manoJugadorValor -= 10;
				//System.out.println("aces del jugador: "+ acesJugador + "\nmanoJugadorValor: " + manoJugadorValor); //debug purpose
				return mayorVentiuno();
			}
			else
				return true;
		}
		else return false;
	}
	
	/**
	 * Le pregunta al jugador cuantas fichas quiere
	 * y en consecuencia se las da
	 */
	
	public void dineroInicial() {
		int cuantoDinero = 0;
		while (!(cuantoDinero > 0)) {
			try
			{
				cuantoDinero = scanner.nextInt();
				while (!(cuantoDinero > 0))  // Para inputs enteros negativos
				{
					System.out.println("Error valor no admitido.\n"
							+ "¿Cuánto dinero desea en fichas?");
					cuantoDinero = scanner.nextInt();
				}
			}
			catch (Exception e){ // Para inputs no-enteros
				System.out.println("Error valor no admitido.\n"
						+ "¿Cuánto dinero desea en fichas?");
				scanner = new Scanner(System.in);
				continue;
			}
			dinero.dineroMas(cuantoDinero);
		}
		
	}
	
	/**
	 * Crea una apuesta que se suma a la apuesta anterior y le quita
	 * el dinero que esta apostando al jugador
	 */
	public void apuestasLocas() {
		int apuesta = 0;
		while (!(apuesta > 0) || apuesta > dinero.cuantoTienes()) {
			try
			{
				apuesta = scanner.nextInt();
				while (!(apuesta > 0)  || apuesta > dinero.cuantoTienes())  // Para inputs enteros negativos
				{
					System.out.println("Error valor no admitido.\n"
							+ "¿Cuánto dinero vas a apostar?");
					apuesta = scanner.nextInt();
				}
			}
			catch (Exception e){ // Para inputs no-enteros
				System.out.println("Error valor no admitido.\n"
						+ "¿Cuánto dinero vas a apostar?");
				scanner = new Scanner(System.in);
				continue;
			}
			
			
		}
		dinero.dineroMas(-apuesta);
		perderOGanar += apuesta;
		
	}
	
	/**
	 * Le da el doble de dinero que aposto al Jugador
	 */
	
	public void muchoDinero() {
		
		System.out.println("Ahora tienes:");
		dinero.dineroMas(2*perderOGanar);
		System.out.println(dinero.cuantoTienes());
			
		}
	
	/** 
	 * Regresa los valores a 0, reinicia el juego
	 */
	
	public void reset(){
		manoJugador = "";
		manoJugadorValor = 0;
		manoCrupier = "";
		manoCrupierValor = 0;
		acesCrupier = 0;
		acesJugador = 0;
		perderOGanar = 0;
	}
	
	/**
	 * Le pregunta al jugador si quiere seguir jugando
	 * @return boolean
	 */
	public boolean seguirJugando() {
		if (dinero.cuantoTienes() <= 0) {
			System.out.println("Te has quedado sin dinero.");
			return false;
		}
		System.out.println("¿Volver a jugar? s (Sí) / n (No)");
		letra=lector.nextLine();
		
		
		if(letra.equals("s")) {
			return true;
		}
		else
			return false;
	}
	
	/**
	 * Verifica si el jugador puede apostar la cantidad de dinero,
	 * no se puede pasar del dinero que tiene
	 * @return boolean
	 */
	public boolean puedeApostar() {
		if (dinero.cuantoTienes() <= 0)
			return false;
		else return true;
	}
	
	/**
	 * Le da cartas al Crupier hasta que su valor sea mayor o igual a 16
	 */
	
	public void cartasCrupier() {
		while (manoCrupierValor <= 16) {
			nuevaCarta(0);
			if (manoCrupierValor > 21 && acesCrupier > 0) {
				acesCrupier--;
				manoCrupierValor -= 10;
			}
		}
	}

}
