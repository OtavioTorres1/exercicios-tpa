import java.util.Scanner;
public class Inteirossubs {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int intA, intB, intC;
		//leia(intA)
		System.out.println("Digite o 1o n�mero inteiro:");
		intA = ler.nextInt();
		//leia(intB)
		System.out.println("Digite o 2o n�mero inteiro:");
		intB = ler.nextInt();
		intC=(intA);
		intA=(intB);
		intB=(intC);
		//escreva intA
		System.out.println("A v�riavel A guarda:" + intA);
		//escreva intB
		System.out.println("A v�riavel B guarda:" + intB);
		ler.close();
	}
}

