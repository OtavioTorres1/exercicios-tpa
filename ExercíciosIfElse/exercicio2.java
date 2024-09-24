import java.util.Scanner;
public class exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double resto;
		int a;
		System.out.println("digite o número: ");
		a= (int) ler.nextDouble();
		resto=a%2;
		System.out.println("O resto é:" + resto);
		if(resto==0) {
			System.out.println("O número é Par");
			
		} else {
			System.out.println("O número é Impar");
		}
		ler.close();
	}
}
