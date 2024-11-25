import java.util.Scanner;
public class Exercicio13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
					/* Criar um vetor A com 10 elementos inteiros. Construir um vetor B de 
			mesmo tipo e tamanho, obedecendo as seguintes regras de formação: a) 
			Bi deverá receber 1 quando Ai for par; b) Bi deverá receber 0 quando Ai for 
			ímpar.
			 */
		
		final int TAM = 10;
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
			
			//apresentando o B
			
			System.out.print("B = [");
			for (i=0; i<TAM; i++) {
				
				if (a[i] % 2 == 0) {
					b[i] = 1;
					System.out.print(b[i] + " ");
				}else {
					b[i] = 0;
					System.out.print(b[i] + " ");
				}
					
				}
			
			System.out.print("]\n");
			
			
	
					
					ler.close();

	}

}
