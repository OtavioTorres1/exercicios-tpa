import java.util.Scanner;
public class Exercicio03 {

	// n�meros primos ou n�o primos
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		final int TAM = 10;
		
		int i, a[], cd, j;
		
		a = new int[TAM];
		
		System.out.println("Digite um n�mero:");
		
		//lendo o vetor A

		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+" valor de A:");
			a[i] = ler.nextInt();
			
			
		}
		
		
		
		//apresentando o vetor A
		
		System.out.println("A = [");
		for (i=0; i<TAM; i++) {
			
			if (i<TAM) {
				
				cd = 0;
				for(j=1; j<=a[i]; j++) {
					
					if (a[i] % j==0){
						
						cd++;
						
					}
				}
				
				if (cd == 2){
					
					System.out.println( a[i] + " " + "� primo");
					
				}else {
					
					System.out.println(  a[i] + " " + "N�o � primo");
					
				}
				
			}
		
			
		}
		
		System.out.println("]\n");
		
		
		
		
		
		
		
		
		
		
		
			
			/*System.out.println("A = [");
			for (i=0; i<TAM; i++) {
				
				if (i<TAM) {
					
					cs = 0;
					for(j=1; j<=a[i]; j++) {
						
						r = a[i]/j;
						s = a[i]-r;
						
						if (s == 0){
							
							cs++;
							
						}
						
					}
					
					System.out.println(cs);
					
					if (cs == 2){
						
						System.out.println( a[i] + " " + "� primo");
						
					}else {
						
						System.out.println(  a[i] + " " + "N�o � primo");
						
					}
					
				}
			
				
			}
			
			System.out.println("]\n");*/
	
	
	
	ler.close();
		

}}
