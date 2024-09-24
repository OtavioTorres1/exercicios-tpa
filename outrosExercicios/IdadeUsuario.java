import java.util.Scanner;
public class IdadeUsuario {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int anoN, anoA, idade;
		//leia(anoN)
		System.out.println("Digite o ano de nascimento:");
		anoN = ler.nextInt();
		//leia(anoA)
		System.out.println("Digite o ano atual:");
		anoA = ler.nextInt();
		idade=(anoA-anoN);
		//escreva idade
		System.out.println("Sua idade é:" + idade);
		ler.close();
	}
}
