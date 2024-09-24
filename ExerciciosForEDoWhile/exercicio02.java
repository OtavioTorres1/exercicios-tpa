package atividadeDoWhile;
import java.util.Scanner;
public class exercicio02 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	int r;
	double a, pi;
	String s;
	
	do {
		
		System.out.println("Digite a altura:");
		a=ler.nextDouble();
		
		System.out.println("Qual é o sexo? Digite M para masculino e F para feminino");
		s=ler.next();
		
		switch(s) {
		
		case "M":
			pi=52+(0.75*(a-152.4));
			System.out.println("o peso ideal é:" + pi );
			break;
			
		case "F":
			pi=52+(0.67*(a-152.4));
			System.out.println("o peso ideal é:" + pi );
			break;
			
		default:
			System.out.println("Letra inválida");
			
		}
		
		System.out.println("Deseja continuar? Digite 1 para sim e 2 para não");
		r=ler.nextInt();
		
	}while (r==1);
	ler.close();
}
}
