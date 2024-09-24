import java.util.Scanner;
public class SomaDosNumeros {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int valorA, valorB, valorC, resultado;
		//leia(valorA)
		System.out.println("Digite o primeiro número:");
		valorA = ler.nextInt();
		//leia(valorB)
		System.out.println("Digite o segundo número:");
		valorB = ler.nextInt();
		//leia(valorC)
		System.out.println("Digite o terceiro número:");
		valorC = ler.nextInt();
		resultado=(valorA*valorA+valorB*valorB+valorC*valorC);
		//escreva resultado
		System.out.println("A soma do quadrado dos três valores é:" + resultado);
		ler.close();
	}
}
