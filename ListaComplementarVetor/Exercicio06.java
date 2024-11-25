
public class Exercicio06 {
public static void main(String[] args) {
	
				/* Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que cada 
			elemento do vetor A é formado pela potência de base 2 elevado ao expoente 
			igual a posição do respectivo elemento, ou seja:
			A[i] = 2i. */
	
	final int TAM = 11;
	int i, a[], n;
	
	a = new int[TAM];
	
	//lendo o vetor A

			System.out.print("A = [");
			n = 2;
			
			a[0] = 0;
			System.out.println(a[0]);
			a[1] = 2;
			System.out.println(a[1]);
			
			for (i=2; i<TAM; i++) {
			
					a[i] = n*2;
					
					n = a[i];
					
					
						System.out.println( a[i] + " ");
					
					
				}
				System.out.println("]\n");
					
				
				
				
			}
			
			
			
			
}

