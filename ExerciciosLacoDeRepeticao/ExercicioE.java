import java.util.Scanner;
public class ExercicioE {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		
		int n, r, s, ps;
		
		System.out.println("Digite o número:");
		n = ler.nextInt();
		
		int i = 2;
		
		while (i<n-2) {
			
			r = n/i;
			
			ps = r*i;
			
			s = n-ps;
			System.out.println(s);
			
			i = i+1;
			
			if (s==0) {
				
				System.out.println("Não é primo");
				
			}else {
				
				System.out.println("É primo");
				
			}
			
		}
		
		ler.close();
		
	}
}
