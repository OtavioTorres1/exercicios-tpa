import java.util.Scanner;
public class Exercicio01 {

				/* Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares de 
			A utilizando apenas um vetor extra B. Sugestão: no início do vetor B 
			armazene os elementos pares de A e nas posições restantes do vetor B 
			armazene os elementos de A que são ímpares. */
	
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	final int TAM = 20;
	final int TAM2 = -1;
	int i, j, a[], b[];
	
	a = new int[TAM];
	b = new int[TAM];
	
	System.out.println("Digite um número:");
	
	//lendo o vetor A

	for (i=0; i<TAM; i++) {
		System.out.println("Entre com o "+(i+1)+" valor de A:");
		a[i] = ler.nextInt();
		
	}
	
	//lendo o vetor B
	
			for (j=0; j<TAM; j = j+2) {
				
				b = a;
				
			}
	
	//apresentando o vetor A
		
		System.out.print("A = [");
		for (i=0; i<TAM; i++) {
			if (i==20) {
				System.out.println(a[i]);
			}else {
				System.out.print(a[i]+" ");
			}
		}
		
		System.out.print("]\n");
		
		//apresentando os Impares
		
		System.out.print("Impares = [");
		for (j=0; j<TAM; j = j+2) {
			if (j==20) {
				System.out.println(b[j]);
			}else {
				System.out.print(b[j]+" ");
			}
		}
		
		System.out.print("]\n");
		
		
		//apresentando os Pares
		
				System.out.print("Pares = [");
				for (j=1; j<TAM; j = j+2) {
					if (j==20) {
						System.out.println(b[j]);
					}else {
						System.out.print(b[j]+" ");
					}
				}
				
				System.out.print("]\n");
				
				ler.close();

	}

}
