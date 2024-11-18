import java.util.Scanner;
public class Exercicio04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a[], b[], i, j ;
		a = new  int [10];
		
		for (i=0; i<10; i++) {
			
			System.out.println("Digite o" + " " + (i+1) + "º" + " " + "número:");
			a[i] = ler.nextInt();
			
			for (j=0; j<=a[i]; j = j+2) {
				b = a;
			}
			
		}
		
		
		//apresentando a
		
		System.out.print("A" + " " + "=" + "[" + " ");
		for (i=0; i<10; i++) {
			
			if (i==10) {
				
				System.out.print(a[i]);
				
			}else {
				
				System.out.print(a[i]+" ");
				
			}
		}
		System.out.print(" " + "]");
		
		// apresentando b
		
		System.out.print("B" + " " + "=" + "[" + " ");
		for (i=0; i<10; i++) {
			b = a;
			
			if (i==0) {
				
				for (j=0; j<=a[i]; j = j+2) {
					b = a;
				}
				
				System.out.println(b[j]);
				
			}else if (i==1) {
				
				for (j=0; j<=a[i]; j = j+2) {
					b = a;
				}
				
				System.out.println(b[j]);
				
			}else if (i==2){
				
				for (j=0; j<=a[i]; j = j+2) {
					b = a;
				}
				
				System.out.println(b[j]);
				
			}else if (i==3){
				
				for (j=0; j<=a[i]; j = j+2) {
					b = a;
				}
				
				System.out.println(b[j]);
				
			}else if (i==4) {
				
				for (j=0; j<=a[i]; j = j+2) {
					b = a;
				}
				
				System.out.println(b[j]);
				
			}else if (i==5) {
				
				for (j=0; j<=a[i]; j = j+2) {
					b = a;
				}
				
				System.out.println(b[j]);
				
			}else if (i==6) {
				
				for (j=0; j<=a[i]; j = j+2) {
					b = a;
				}
				
				System.out.println(b[j]);
				
			}else if (i==7) {
				
				for (j=0; j<=a[i]; j = j+2) {
					b = a;
				}
				
				System.out.println(b[j]);
				
			}else if (i==8) {
				
				for (j=0; j<=a[i]; j = j+2) {
					b = a;
				}
				
				System.out.println(b[j]);
				
			}else if (i==9) {
				
				for (j=0; j<=a[i]; j = j+2) {
					b = a;
				}
				
				System.out.println(b[j]);
				
			}else {
				System.out.println(" ");
			}
			
		}
		System.out.print(" " + "]");

		
		
		
		
}
}
