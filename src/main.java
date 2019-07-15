import java.util.Scanner;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ventana v1 = new Ventana();
		Ciclo c = new Ciclo();
		Scanner entrada = new Scanner(System.in);
		int matriz [][],vertices,pos,auxColumna,auxFila,auxArray,array[];
		
		vertices = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de vertices"));
		
		auxColumna = 0;
		auxFila = 0;
		auxArray = -1;
		
		matriz = new int [vertices][vertices];
		array = new int [20];
		
		//5System.out.println("Digite la matriz");
		

		
		
		
		
		for (int i=0;i<vertices;i++){
			for(int j=0;j<vertices;j++) {
				pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion: (" +i+ "," +j+")"));
				matriz[i][j] = pos;
				}
		}
		
		
		
		//   Nice
		
		
		//Imprimir matriz de trayectorias
		
		//v1.setVisible(true);
		
		System.out.println("Matriz de trayectorias");
		for (int i=0;i<vertices;i++){
			for(int j=0;j<vertices;j++) {
				System.out.print(matriz[i][j]);
				
	

				}
			System.out.println("");
	}
		
		
		//Logica (?
		
		
		
		for (int i=0;i<vertices;i++) {
			//System.out.println("Caminos vector "+(i+1)+":");
			auxFila++;
			System.out.println("\nFila: "+(auxFila-1));		
			for(int j=0;j<vertices;j++) {
				//System.out.println(matriz[i][j]);
				
				if((auxColumna+1) > vertices) {
					auxColumna = 0;
					}

				array[auxArray+1] = (auxFila);
				auxColumna++;
				
				
				System.out.println("\ncolumnas "+(auxColumna-1));		
				
				if(matriz[i][j] == 0) {
					System.out.println("El vector "+(i+1)+" no esta conectado con "+(j+1));
					j = auxColumna-1;
					}
				else{
					//codigo 0
					System.out.print(array[auxArray+1]+", ");//(j+1) debe ser la posicion del contador
					if(matriz[i][j] == (j+1)) {					
						System.out.print((j+1)+" esta vivo! aaaaa");
						for(int p=0;p==20;p++)
						{array[p] = 0;}
					}
					else {
					//	System.out.println("aa"+matriz[i][j]);
						i=array[auxArray+1];
						j=auxColumna-1;
						
					}
				
				//contador xd
				
						
				
				}


			
			
			}
		}
			
		//Imprimir matriz de trayectorias
		
		//		System.out.println("Matriz de adyacencia");
				
	/*			
		for (int i=0;i<vertices;i++){
			for(int j=0;j<vertices;j++) {
				System.out.print(matriz[i][j]);

				}
			System.out.println("");
	}
*/
	}
}
	

