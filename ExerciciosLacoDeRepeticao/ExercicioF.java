import java.util.Scanner;
public class ExercicioF {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int n, n2, r;
		
		System.out.println("Digite o número você quer:");
		n = ler.nextInt();
		
		n2 = n + n;
		System.out.println(n2);
		
		int i = 1;
		
		while (i<=9) {
			
			r = n+n2;
		
			
			n = n2;
			n2  = r;
			
			System.out.println(n2);
			
			i = i+1;
			
		}
		
		ler.close();
		
	}
}
