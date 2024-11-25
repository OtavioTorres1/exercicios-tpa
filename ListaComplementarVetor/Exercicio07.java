import java.util.Scanner;
public class Exercicio07 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
					/* Criar um vetor A com 15 elementos inteiros. Construir um vetor B de 
			mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial do 
			elemento correspondente em A. */
					
		final int TAM = 15;
		int i, a[], b[], n1;
		int j=1;
		
		a = new int[TAM];
		b = new int[TAM];
		
		System.out.println("Digite um número:");
		
		//lendo o vetor A

		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+" valor de A:");
			a[i] = ler.nextInt();
			
		}
		
		//lendo o vetor B
		
		for (i=0; i<TAM; i++) {
			
			n1 = 1;
			for (j=1; j<=a[i]; j++) {
				b[i] = j*n1;
				n1 = b[i];
			}
			
		}
		
		//apresentando o vetor A
			
			System.out.print("A = [");
			for (i=0; i<TAM; i++) {
				if (i==15) {
					System.out.println(a[i]);
				}else {
					System.out.print(a[i]+" ");
				}
			}
			
			System.out.print("]\n");
			
			//apresentando o vetor B
			
			System.out.print("B = [");
			for (i=0; i<TAM; i++) {
				
				if (i==15) {
					System.out.println(b[i]);
				}else {
					System.out.print(b[i]+" ");
				}
				
			}
			
			System.out.print("]\n");

			ler.close();
			
		}
	
	}

