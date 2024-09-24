import java.util.Scanner;
public class NumeroAntecessorSucessor {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int valorA, antecessor, sucessor;
		//leia (valorA)
		System.out.println("Digite um número:");
		valorA = ler.nextInt();
		antecessor=(valorA-1);
		//apresente antecessor
		System.out.println("O antecessor desse número é:" + antecessor);
		sucessor=(valorA+1);
		//apresente sucessor
		System.out.println("O sucessor desse número é:" + sucessor);
		ler.close();
	}
}
