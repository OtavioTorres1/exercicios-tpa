import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	final int TAM = 10;
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
	
			for (j=10; j>=TAM2; j = j-1) {
				
				b = a;
				
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
		for (j=9; j>TAM2; j = j-1) {
			if (j==0) {
				System.out.println(b[j]);
			}else {
				System.out.print(b[j]+" ");
			}
		}
		
		System.out.print("]\n");

		ler.close();
		
	}

}
