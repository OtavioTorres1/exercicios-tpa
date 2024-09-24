package exercicioSwitchCase;
import java.util.Scanner;
public class exercicio4 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);	
	int c;
	
	System.out.println("Digite o código:");
	c = ler.nextInt();
	
	switch(c) {
	case 1:
		System.out.println("Cachorro quente, RS 8,00");
		break;
		
	case 2:
		System.out.println("Cheeseburguer, RS 12,00");
		break;
		
	case 3:
		System.out.println("X-Salada, RS 15,00");
		break;
		
	case 4:
		System.out.println("Misto Quente, RS 11,00");
		
		break;
		
	case 5:
		System.out.println("Pão na chapa, RS 6,00");
		break;
		
	default:
		System.out.println("Código inválido");
		
	}
	ler.close();
}
}
