 import java.util.Scanner;
public class Exercicio1 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int an, aa, iu;
		//leia(an)
		System.out.println("Digite o ano de nascimento:");
		an = ler.nextInt();
		//leia(aa)
		System.out.println("Digite o ano atual:");
		aa = ler.nextInt();
		iu=(aa-an);
		//escreva idade
		System.out.println("Sua idade é:" + iu);
		if(iu<10)
			System.out.println("Criança");
		else if (iu<18)
			System.out.println("Adolescente");
		else if (iu<60)
			System.out.println("Adulto");
		else {
			System.out.println("Idoso");
	} ler.close();
}}
