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

import java.util.Random;
/**
 * 
 */
public class Baraja {
	private Random aleatorio;
	private String[] baraja = {
	        
	        //Picas
	        "          _____\r\n" + 
	        "         |A .  |\r\n" + 
	        "         | /.\\ | \r\n" + 
	        "         |(_._)|\r\n" + 
	        "         |  |  |\r\n" + 
	        "         |____V| As de Picas",
	        "          _____\r\n" + 
	        "         |2    |\r\n" + 
	        "         |  ^  |\r\n" + 
	        "         |     |\r\n" + 
	        "         |  ^  |\r\n" + 
	        "         |____Z| Dos de Picas",
	        "          _____\r\n" + 
	        "         |3    |\r\n" + 
	        "         |  ^  |\r\n" + 
	        "         |  ^  |\r\n" + 
	        "         |  ^  |\r\n" + 
	        "         |____E| Tres de Picas",
	        "          _____\r\n" + 
	        "         |4    |\r\n" + 
	        "         | ^ ^ |\r\n" + 
	        "         |     |\r\n" + 
	        "         | ^ ^ |\r\n" + 
	        "         |____h| Cuatro de Picas",
	        "          _____\r\n" + 
	        "         |5    |\r\n" + 
	        "         | ^ ^ |\r\n" + 
	        "         |  ^  |\r\n" + 
	        "         | ^ ^ |\r\n" + 
	        "         |____S| Cinco de Picas",
	        "          _____\r\n" + 
	        "         |6    |\r\n" + 
	        "         | ^ ^ |\r\n" + 
	        "         | ^ ^ |\r\n" + 
	        "         | ^ ^ |\r\n" + 
	        "         |____9| Seis de Picas",
	        "          _____ \r\n" + 
	        "         |7    |\r\n" + 
	        "         | ^ ^ |\r\n" + 
	        "         |^ ^ ^|\r\n" + 
	        "         | ^ ^ |\r\n" + 
	        "         |____L| Siete de Picas",
	        "          _____\r\n" + 
	        "         |8    |\r\n" + 
	        "         |^ ^ ^|\r\n" + 
	        "         | ^ ^ |\r\n" + 
	        "         |^ ^ ^|\r\n" + 
	        "         |____8| Ocho de Picas",
	        "          _____\r\n" + 
	        "         |9    |\r\n" + 
	        "         |^ ^ ^|\r\n" + 
	        "         |^ ^ ^|\r\n" + 
	        "         |^ ^ ^|\r\n" + 
	        "         |____6| Nueve de Picas",
	        "          _____\r\n" + 
	        "         |10 ^ |\r\n" + 
	        "         |^ ^ ^|\r\n" + 
	        "         |^ ^ ^|\r\n" + 
	        "         |^ ^ ^|\r\n" + 
	        "         |___0I| Diez de Picas",
	        "          _____\r\n" + 
	        "         |J  ww|\r\n" + 
	        "         | ^ {)|\r\n" + 
	        "         |(.) %|\r\n" + 
	        "         | |  %|\r\n" + 
	        "         |__%%[|Jack de Picas",
	        "          _____\r\n" + 
	        "         |Q  ww|\r\n" + 
	        "         | ^ {(|\r\n" + 
	        "         |(.)%%|\r\n" + 
	        "         | |%%%|\r\n" + 
	        "         |_%%%O| Reina de Picas",
	        "          _____\r\n" + 
	        "         |K  WW|\r\n" + 
	        "         | ^ {)|\r\n" + 
	        "         |(.)%%|\r\n" + 
	        "         | |%%%|\r\n" + 
	        "         |_%%%>| Rey de Picas",

	        //Corazones
	        "          _____\r\n" + 
	        "         |A_ _ |\r\n" + 
	        "         |( v )|\r\n" + 
	        "         | \\ / |\r\n" + 
	        "         |  .  |\r\n" + 
	        "         |____V| As de Corazones",
	        "          _____\r\n" + 
	        "         |2    |\r\n" + 
	        "         |  v  |\r\n" + 
	        "         |     |\r\n" + 
	        "         |  v  |\r\n" + 
	        "         |____Z| Dos de Corazones",
	        "          _____\r\n" + 
	        "         |3    |\r\n" + 
	        "         |  v  |\r\n" + 
	        "         |  v  |\r\n" + 
	        "         |  v  |\r\n" + 
	        "         |____E| Tres de Corazones",
	        "          _____\r\n" + 
	        "         |4    |\r\n" + 
	        "         | v v |\r\n" + 
	        "         |     |\r\n" + 
	        "         | v v |\r\n" + 
	        "         |____h| Cuatro de Corazones",
	        "          _____\r\n" + 
	        "         |5    |\r\n" + 
	        "         | v v |\r\n" + 
	        "         |  v  |\r\n" + 
	        "         | v v |\r\n" + 
	        "         |____S| Cinco de Corazones",
	        "          _____\r\n" + 
	        "         |6    |\r\n" + 
	        "         | v v |\r\n" + 
	        "         | v v |\r\n" + 
	        "         | v v |\r\n" + 
	        "         |____9| Seis de Corazones",
	        "          _____ \r\n" + 
	        "         |7    |\r\n" + 
	        "         | v v |\r\n" + 
	        "         |v v v|\r\n" + 
	        "         | v v |\r\n" + 
	        "         |____L| Siete de Corazones",
	        "          _____\r\n" + 
	        "         |8    |\r\n" + 
	        "         |v v v|\r\n" + 
	        "         | v v |\r\n" + 
	        "         |v v v|\r\n" + 
	        "         |____8| Ocho de Corazones",
	        "          _____\r\n" + 
	        "         |9    |\r\n" + 
	        "         |v v v|\r\n" + 
	        "         |v v v|\r\n" + 
	        "         |v v v|\r\n" + 
	        "         |____6| Nueve de Corazones",
	        "          _____\r\n" + 
	        "         |10 v |\r\n" + 
	        "         |v v v|\r\n" + 
	        "         |v v v|\r\n" + 
	        "         |v v v|\r\n" + 
	        "         |___0I| Diez de Corazones",
	        "          _____\r\n" + 
	        "         |J  ww|\r\n" + 
	        "         |   {)|\r\n" + 
	        "         |(v) %|\r\n" + 
	        "         | v  %|\r\n" + 
	        "         |__%%[|Jack de Corazones",
	        "          _____\r\n" + 
	        "         |Q  ww|\r\n" + 
	        "         |   {(|\r\n" + 
	        "         |(v)%%|\r\n" + 
	        "         | v%%%|\r\n" + 
	        "         |_%%%O| Reina de Corazones",
	        "          _____\r\n" + 
	        "         |K  WW|\r\n" + 
	        "         |   {)|\r\n" + 
	        "         |(v)%%|\r\n" + 
	        "         | v%%%|\r\n" + 
	        "         |_%%%>| Rey de Corazones",
	        
	        //Diamantes
	        "          _____\r\n" + 
	        "         |A ^  |\r\n" + 
	        "         | / \\ |\r\n" + 
	        "         | \\ / |\r\n" + 
	        "         |  .  |\r\n" + 
	        "         |____V| As de Diamantes",
	        "          _____\r\n" + 
	        "         |2    |\r\n" + 
	        "         |  o  |\r\n" + 
	        "         |     |\r\n" + 
	        "         |  o  |\r\n" + 
	        "         |____Z| Dos de Diamantes",
	        "          _____\r\n" + 
	        "         |3    |\r\n" + 
	        "         |  o  |\r\n" + 
	        "         |  o  |\r\n" + 
	        "         |  o  |\r\n" + 
	        "         |____E| Tres de Diamantes",
	        "          _____\r\n" + 
	        "         |4    |\r\n" + 
	        "         | o o |\r\n" + 
	        "         |     |\r\n" + 
	        "         | o o |\r\n" + 
	        "         |____h| Cuatro de Diamantes",
	        "          _____\r\n" + 
	        "         |5    |\r\n" + 
	        "         | o o |\r\n" + 
	        "         |  o  |\r\n" + 
	        "         | o o |\r\n" + 
	        "         |____S| Cinco de Diamantes",
	        "          _____\r\n" + 
	        "         |6    |\r\n" + 
	        "         | o o |\r\n" + 
	        "         | o o |\r\n" + 
	        "         | o o |\r\n" + 
	        "         |____9| Seis de Diamantes",
	        "          _____ \r\n" + 
	        "         |7    |\r\n" + 
	        "         | o o |\r\n" + 
	        "         |o o o|\r\n" + 
	        "         | o o |\r\n" + 
	        "         |____L| Siete de Diamantes",
	        "          _____\r\n" + 
	        "         |8    |\r\n" + 
	        "         |o o o|\r\n" + 
	        "         | o o |\r\n" + 
	        "         |o o o|\r\n" + 
	        "         |____8| Ocho de Diamantes",
	        "          _____\r\n" + 
	        "         |9    |\r\n" + 
	        "         |o o o|\r\n" + 
	        "         |o o o|\r\n" + 
	        "         |o o o|\r\n" + 
	        "         |____6| Nueve de Diamantes",
	        "          _____\r\n" + 
	        "         |10 o |\r\n" + 
	        "         |o o o|\r\n" + 
	        "         |o o o|\r\n" + 
	        "         |o o o|\r\n" + 
	        "         |___0I| Diez de Diamantes",
	        "          _____\r\n" + 
	        "         |J  ww|\r\n" + 
	        "         | /\\{)|\r\n" + 
	        "         | \\/ %|\r\n" + 
	        "         |    %|\r\n" + 
	        "         |__%%[|Jack de Diamantes",
	        "          _____\r\n" + 
	        "         |Q  ww|\r\n" + 
	        "         | /\\{(|\r\n" + 
	        "         | \\/%%|\r\n" + 
	        "         | o%%%|\r\n" + 
	        "         |_%%%O| Reina de Diamantes",
	        "          _____\r\n" + 
	        "         |K  WW|\r\n" + 
	        "         | /\\{)|\r\n" + 
	        "         | \\/%%|\r\n" + 
	        "         | %%%|\r\n" + 
	        "         |_%%%>| Rey de Diamantes",
	        
	        //Treboles
	        "          _____\r\n" + 
	        "         |A _  |\r\n" + 
	        "         | ( ) |\r\n" + 
	        "         |(_._)|\r\n" + 
	        "         |  |  |\r\n" + 
	        "         |____V| As de Treboles",
	        "          _____\r\n" + 
	        "         |2    |\r\n" + 
	        "         |  &  |\r\n" + 
	        "         |     |\r\n" + 
	        "         |  &  |\r\n" + 
	        "         |____Z| Dos de Treboles",
	        "          _____\r\n" + 
	        "         |3    |\r\n" + 
	        "         |  &  |\r\n" + 
	        "         |  &  |\r\n" + 
	        "         |  &  |\r\n" + 
	        "         |____E| Tres de Treboles",
	        "          _____\r\n" + 
	        "         |4    |\r\n" + 
	        "         | & & |\r\n" + 
	        "         |     |\r\n" + 
	        "         | & & |\r\n" + 
	        "         |____h| Cuatro de Treboles",
	        "          _____\r\n" + 
	        "         |5    |\r\n" + 
	        "         | & & |\r\n" + 
	        "         |  &  |\r\n" + 
	        "         | & & |\r\n" + 
	        "         |____S| Cinco de Treboles",
	        "          _____\r\n" + 
	        "         |6    |\r\n" + 
	        "         | & & |\r\n" + 
	        "         | & & |\r\n" + 
	        "         | & & |\r\n" + 
	        "         |____9| Seis de Treboles",
	        "          _____ \r\n" + 
	        "         |7    |\r\n" + 
	        "         | & & |\r\n" + 
	        "         |& & &|\r\n" + 
	        "         | & & |\r\n" + 
	        "         |____L| Siete de Treboles",
	        "          _____\r\n" + 
	        "         |8    |\r\n" + 
	        "         |& & &|\r\n" + 
	        "         | & & |\r\n" + 
	        "         |& & &|\r\n" + 
	        "         |____8| ocho de Treboles",
	        "          _____\r\n" + 
	        "         |9    |\r\n" + 
	        "         |& & &|\r\n" + 
	        "         |& & &|\r\n" + 
	        "         |& & &|\r\n" + 
	        "         |____6| Nueve de Treboles",
	        "          _____\r\n" + 
	        "         |10 & |\r\n" + 
	        "         |& & &|\r\n" + 
	        "         |& & &|\r\n" + 
	        "         |& & &|\r\n" + 
	        "         |___0I| Diez de Treboles",
	        "          _____\r\n" + 
	        "         |J  ww|\r\n" + 
	        "         | o {)|\r\n" + 
	        "         |o o %|\r\n" + 
	        "         | |  %|\r\n" + 
	        "         |__%%[|Jack de Treboles",
	        "          _____\r\n" + 
	        "         |Q  ww|\r\n" + 
	        "         | o {(|\r\n" + 
	        "         |o o%%|\r\n" + 
	        "         | |%%%|\r\n" + 
	        "         |_%%%&| Reina de Treboles",
	        "          _____\r\n" + 
	        "         |K  WW|\r\n" + 
	        "         | o {)|\r\n" + 
	        "         |o o%%|\r\n" + 
	        "         | |%%%|\r\n" + 
	        "         |_%%%>| Rey de Treboles",
	        };
	
	public Baraja() {
		aleatorio = new Random();
		}
	public String dibujarCarta(int carta){
		return baraja[carta];
		
	}
    
	/*
	 * Retorna un número del 0 al 51 que representa la carta que sale de la baraja
	 * 0-12 : Picas (0 As ... 12 Rey) Posición + 1
	 * 13-25 : Corazones Posición - 12
	 * 26-38 : Tréboles Posición - 25
	 * 39-51 : Diamantes Posición - 38
	 */
    public int getCarta(){
        return aleatorio.nextInt(baraja.length);
    }

}
