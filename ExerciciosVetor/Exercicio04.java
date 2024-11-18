import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 10;
		
		int i, a[], s, m, n1;
		
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
				if (i==10) {
					System.out.println(a[i]);
				}else {
					System.out.print(a[i]+" ");
				}
			
				
			}
			
			System.out.print("]\n");
			
		//apresentando a media
			
			
			
			System.out.print("Media = ");
		
			for (i=0; i<TAM; i++) {
				
				if(i==10) {
					s = a[i=1]+a[i=2]+a[i=3]+a[i=4]+a[i=5]+a[i=6]+a[i=7]+a[i=8]+a[i=9]+a[i=10];
					System.out.println("a soma da"+s);
				}else {
					System.out.print("");
				}
				
			}
			
			System.out.print("");

		}


	}


