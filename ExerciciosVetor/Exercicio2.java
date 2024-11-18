import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		final int TAM=10;
		int a[], b[], c[], i;
		a= new int [TAM];
		b= new int [TAM];
		c= new int [TAM];
		
		for(i=0; i<TAM; i++) {
				System.out.println("Entre com o "+(i+1)+" valor de A:");
				a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+" valor de B:");
			b[i] = ler.nextInt();
			c[i]= a[i]+b[i];
	}
		System.out.println("\nC = ");
		for(i=0; i<TAM; i++) {
			System.out.println(c[i]+" ");
		}

	}
}
