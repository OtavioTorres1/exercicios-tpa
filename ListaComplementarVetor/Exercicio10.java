import java.util.Scanner;
public class Exercicio10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
					/* Criar dois vetores A e B cada um com 10 elementos inteiros. Desenvolver 
			um programa que crie um vetor C que é a diferença dos conjuntos formados 
			pelos elementos dos vetores A e B. Diferença de conjuntos = todos os 
			elementos do conjunto A que não existem no conjunto B. */
		
		final int TAM = 10;
		int i, a[], b[], c[] ;
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		System.out.println("Digite um número:");
		
		//lendo o vetor A
	
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+" valor de A:");
			a[i] = ler.nextInt();
			
		}
		
		//lendo o vetor B
		
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+" valor de B:");
			b[i] = ler.nextInt();
		}
		
		
		//apresentando o vetor A
		
				System.out.print("A = [");
				for (i=0; i<TAM; i++) {
					if (i==10) {
						System.out.print(a[i]);
					}else {
						System.out.print(a[i]+" ");
					}
				}
				
				System.out.print("]\n");
				
				//apresentando o vetor B
				
				System.out.print("B = [");
				for (i=0; i<TAM; i++) {
					if (i==10) {
						System.out.println(b[i]);
					}else {
						System.out.print(b[i]+" ");
					}
				}
				
				System.out.print("]\n");
				
				//lendo e apresentando o vetor C
				
				System.out.print("C = [");
				for (i=0; i<TAM; i++) {
					
					for (a[i]=0; a[i]<=10; a[i]++) {
						if (a[i]!=b[i]) {
							c[i] = a[i];
						}else if (a[i]==b[i]) {
						 System.out.print(" ");
						}
					}
					System.out.print(c[i] + " ");
				}
				System.out.print("]\n");
				
				
				
				
				ler.close();
		
}
}
