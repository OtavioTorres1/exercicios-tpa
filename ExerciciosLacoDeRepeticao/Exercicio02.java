import java.util.Scanner;
public class Exercicio02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		System.out.println("Digite o número inteiro:");
		n = ler.nextInt();
		int i = 1;
		while (i<=10) {
			System.out.println(i);
			int nf;
			nf = n*i;
			i = i+1;
		}
	}
}
