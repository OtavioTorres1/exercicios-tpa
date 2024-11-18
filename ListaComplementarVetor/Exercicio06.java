import java.util.Scanner;
public class Exercicio06 {

	// Números de 0 a 10, cada elemento do vetor A é formado pela potência de base 2 elevado ao expoente igual a posição do respectivo elemento
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 11;
		
		int a[];
		
		a = new int[TAM];
		
		System.out.print("A =" + " " + "[");
		
		a[0] = 1;
		System.out.print(" " + a[0] + " ");
		a[1] = 2 ;
		System.out.print(" " + a[1] + " ");
		a[2] = 2*2;
		System.out.print(" " + a[2] + " ");
		a[3] = 2*2*2;
		System.out.print(" " + a[3] + " ");
		a[4] = 2*2*2*2;
		System.out.print(" " + a[4] + " ");
		a[5] = 2*2*2*2*2;
		System.out.print(" " + a[5] + " ");
		a[6] = 2*2*2*2*2*2;
		System.out.print(" " + a[6] + " ");
		a[7] = 2*2*2*2*2*2*2;
		System.out.print(" " + a[7] + " ");
		a[8] = 2*2*2*2*2*2*2*2;
		System.out.print(" " + a[8] + " ");
		a[9] = 2*2*2*2*2*2*2*2*2;
		System.out.print(" " + a[9] + " ");
		a[10] = 2*2*2*2*2*2*2*2*2*2;
		System.out.print(" " + a[10] + " ");

		System.out.print(""+"]");
		
		ler.close();
		
	}

}
