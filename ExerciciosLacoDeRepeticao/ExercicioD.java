import java.util.Scanner;
public class ExercicioD {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		
		int b, e, b2, r;
		
		System.out.println("Digite a base:");
		b = ler.nextInt();
		
		System.out.println("Digite o expoente:");
		e = ler.nextInt();
		
		b2 = b*b;
		System.out.println(b2);
		
		int i = 1;
			
		while (i<e-1) {
			r = b2*b;
			
			b2 = r;
			
			i = i+1;
			
			System.out.println(r);
		}
		
		
		ler.close();
	}
}
