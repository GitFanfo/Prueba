/**
  Archivo: MesaConsola.java
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
 * Clase de Vista (consola)
 */
public class MesaConsola {

	private CrupierControl crupier;
	private String letra;
	private Scanner lector;
	private int variableAux;


	//Constructor
	public MesaConsola() {
		crupier = new CrupierControl();
		lector = new Scanner (System.in);
	}

	//El Jugador se sienta en la mesa para empezar a jugar
	public void empezarJuego() {
		System.out.println(".------..------..------..------..------..------..------..------..------.\n" +
		"|B.--. ||L.--. ||A.--. ||C.--. ||K.--. ||J.--. ||A.--. ||C.--. ||K.--. |\n" +
		"| :(): || :/\\: || (\\/) || :/\\: || :/\\: || :(): || (\\/) || :/\\: || :/\\: |\n" +
		"| ()() || (__) || :\\/: || :\\/: || :\\/: || ()() || :\\/: || :\\/: || :\\/: |\n" +
		"| '--'B|| '--'L|| '--'A|| '--'C|| '--'K|| '--'J|| '--'A|| '--'C|| '--'K|\n" +
		"`------'`------'`------'`------'`------'`------'`------'`------'`------'");
		System.out.println("Instrucciones:\n");
		System.out.println("El blackjack​ o veintiuna, es un juego de cartas \r\n" + "que se juega con una o más barajas inglesas de 52 cartas sin los comodines.\r\n" +
				"\r\n" +
				"El objetivo del jugador es sumar un valor lo más próximo \r\n" +" a 21 pero sin pasarse. El jugador juega contra el crupier \r\n" +" (computador), intentando conseguir una mejor jugada que este.\r\n" + " El crupier está sujeto a reglas fijas que le impiden tomar decisiones \r\n" + "sobre el juego. Esto es, está obligado a pedir carta siempre que su puntuación sume 16 o menos, \r\n" + " y obligado a plantarse si suma 17 o más.\r\n" +
				"\r\n" +
				"Las cartas numéricas suman su valor, las figuras suman 10 y el \r\n"+" As vale 11 o 1, a elección del jugador. En el caso del crupier,\r\n"+" los Ases valen 11 mientras no se pase de 21, y 1 en caso contrario.\r\n"+" La mejor jugada es conseguir 21 con solo dos cartas, esto\r\n"+" es con un As más carta de valor 10. Esta jugada se conoce como Blackjack,\r\n"+" Relancina o 21 natural. "
						+ "Un Blackjack gana sobre un"
						+ " 21 conseguido con más de dos cartas.");
		System.out.println("\nPulsa ENTER para continuar: \n");
		letra=lector.nextLine();


		System.out.println("-------------------------------------\n"
				+ "Bienvenido a Blackjack.\n"
				+ "¿Cuánto dinero desea en fichas?");
		crupier.dineroInicial();

		sentarseMesa();

	}

	/*
	 * El jugador se sienta en la mesa para empezar a jugar
	 */
	public void sentarseMesa(){
		while (true) {
			crupier.reset();
			nuevaRonda();
			if(!crupier.seguirJugando())
				break;
		}
	}
	// Rondas de juego, hasta que gane o pierda.
		private void nuevaRonda() {
		variableAux = 0;
		crupier.nuevaCarta(0);
		crupier.nuevaCarta(1);
		crupier.nuevaCarta(1);

		while (variableAux == 0)
		{
			if (crupier.puedeApostar())
			{
				System.out.println("¿Cuánto dinero vas a apostar?");
				crupier.apuestasLocas();
			}
			if(crupier.mayorVentiuno()) {
				crupier.mostrarCartas();
				System.out.println("Perdiste");
				variableAux = 1;
				break;
				}
			else
				crupier.mostrarCartas();

			System.out.println("¿Te quieres plantar? s (Sí) / n (No)");
			letra=lector.nextLine();

			if(letra.equals("s")){
				crupier.cartasCrupier();
				crupier.mostrarCartas();
				if(crupier.compararCartas()) {
					System.out.println("\n __   __   ___    _   _    __      __  ___   _  _ \r\n" + 
							" \\ \\ / /  / _ \\  | | | |   \\ \\    / / |_ _| | \\| |\r\n" + 
							"  \\ V /  | (_) | | |_| |    \\ \\/\\/ /   | |  | .` |\r\n" + 
							"   |_|    \\___/   \\___/      \\_/\\_/   |___| |_|\\_|\r\n" + 
							"                                                  \n");
					crupier.muchoDinero();
					variableAux = 1;
					}
				else {
					System.out.println("Perdiste \n");
					//crupier.menosDinero();
				 	variableAux = 1;
				 	}
			}

			else{

				crupier.nuevaCarta(1);
			}
		}
	}


}
