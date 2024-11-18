import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 11;
		int i, a[];
		
		a = new int[TAM];
		int b[] = new int[TAM];
		
		//lendo o vetor A
		
		System.out.println("Digite um número:");
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+" valor de A:");
			a[i] = ler.nextInt();
			
			//achando o valor de B
			b[i] = a[i]*a[i];
		}
		
		//apresentando o vetor A
		
		System.out.print("A = [");
		for (i=0; i<TAM; i++) {
			if (i==10) {
				System.out.println(a[i]);
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
		

	}

}
