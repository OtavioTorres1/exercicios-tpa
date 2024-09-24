import java.util.Scanner;
public class ExerceicioC {
public static void main(String[]args) {
	Scanner ler = new Scanner(System.in);
	
	int n, n1, r;
	
	System.out.println("Digite o número:");
	n = ler.nextInt();
	
	n1 = n-1;
	
	int i = 1;
	
	while (i<n) {
		
		r = n*n1;
		
		n1 = n1-1;
		
		n = r;
		
		i = i+1;
		
		System.out.println(r);
	}
	
	
	
	ler.close();
	
}
}
