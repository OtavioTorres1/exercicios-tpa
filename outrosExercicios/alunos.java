import java.util.Scanner;
public class alunos {
	public static void main (String arg[]) {
		Scanner ler = new Scanner(System.in);
		int ah, am, st;
		double vm, vh;
		System.out.println("Digite o n�mero de alunos homens: ");
		ah= ler.nextInt();
		System.out.println("Digite o n�mero de alunas mulheres: ");
		am= ler.nextInt();
		System.out.println("Digite o n�mero total de alunos: ");
		st= ler.nextInt();
		vh=(ah*100/st);
		System.out.println("O resultado da porcentagem masculina �: " + vh);
		vm=(am*100/st);
		System.out.println("O resultado da porcentagem feminina �: " + vm);
		ler.close();
		
		
	}
}
 