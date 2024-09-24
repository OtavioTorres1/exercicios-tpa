import java.util.Scanner;
public class media {
	public static void main (String arg[]) {
		Scanner ler = new Scanner(System.in);
		double notaA, notaB, notaC, media, soma;
		System.out.println("Digite a nota A: ");
		notaA= ler.nextInt();
		System.out.println("Digite a nota B: ");
		notaB= ler.nextInt();
		System.out.println("Digite a nota C: ");
		notaC= ler.nextInt();
		soma=(notaA+notaB+notaC);
		media=(soma/3);
		
		System.out.println("O resultado é: " + media);
		ler.close();
		
		
	
		
	}
}
