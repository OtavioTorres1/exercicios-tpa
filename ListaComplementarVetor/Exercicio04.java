import java.util.Scanner;
public class Exercicio04 {
	public static void main(String[] args) {
		
		/*Criar um vetor A com 10 elementos inteiros. Escreva um programa que 
		imprima cada elemento do vetor A e a relação de todos os pares de 0 até o 
		respectivo elemento.*/

		
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 10;
		
		int i, a[], j, n;
		
		a = new int[TAM];
		
		System.out.println("Digite um número:");
		
		//lendo o vetor A
	
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+" valor de A:");
			a[i] = ler.nextInt();
			
			
		}
		
		
		
		//apresentando o vetor A
			
		System.out.print("A = [");
		for (i=0; i<TAM; i++) {
			if (i<TAM) {
				
				System.out.print("/" + " " + a[i] + " " + "=" + " ");
				for (j=0; j<=a[i]; j = j+2) {
					n = j;
					
					System.out.print(n + " ");
				}
				
			}
		}
		
		System.out.println("]\n");

		
		//apresentando os pares
		
				

		
		ler.close();
	}

}
