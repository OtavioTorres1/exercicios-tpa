import java.util.Scanner;
public class Exercicio14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
					/* Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um 
			vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de 
			formação: a) Ci deverá receber 1quando Ai for maior que Bi; b) Ci deverá 
			receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1 quando Ai for 
			menor que Bi. */
					
		final int TAM = 10;
		int i, a[], b[], c[];
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int [TAM];
		
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
					if (i==20) {
						System.out.println(a[i]);
					}else {
						System.out.print(a[i]+" ");
					}
				}
				System.out.print("]\n");

				//apresentando o vetor B
				
				System.out.print("B = [");
				for (i=0; i<TAM; i++) {
					if (i==20) {
						System.out.println(b[i]);
					}else {
						System.out.print(b[i]+" ");
					}
				}
				System.out.print("]\n");

				//apresentando o vetor C
				
				System.out.print("C = [");
				for (i=0; i<TAM; i++) {
					
					if (a[i]>b[i]) {
						c[i] = 1;
						System.out.print(c[i] + " ");
						
					}else if (a[i]==b[i]) {
						c[i] = 0;
						System.out.print(c[i] + " ");
						
					}else if (a[i]<b[i]) {
						c[i] = -1;
						System.out.print(c[i] + " ");
					}
				}
				System.out.print("]\n");

				ler.close();
				
	}

}
