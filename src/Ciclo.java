
public class Ciclo {
	//a = fila, b = lo que hay en la matriz
	int matrizExtr [][];
	
	public void test(int a,int b,int c){
		
		for (int i=0;i<c;i++) {
			for(int j=0;j<c;j++) {
				//System.out.println(matriz[i][j]);
			matrizExtr [i][j] = b;
				
			System.out.println(matrizExtr[i][j]);	
			}

		}
		
	}
		
	
	public void test2() {
		test(1,2,3);
	}
	
	
	
}

