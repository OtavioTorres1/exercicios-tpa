import java.util.Scanner;
public class Salario {
	public static void main (String arg[]) {
		Scanner ler = new Scanner(System.in);
		double s, sf;
		int d;
		System.out.println("Digite o seu sal�rio: ");
		s= ler.nextInt();
		System.out.println("Digite o n�mero de seus dependentes: ");
		d= ler.nextInt();
		sf=(s+d*55);
		
		
		System.out.println("O resultado �: " + sf);
		ler.close();
		
		
	}
}
