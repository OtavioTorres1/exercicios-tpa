package atividadeDoWhile;
import java.util.Scanner;
public class exercicio04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int an, aa, id, i;
		
		System.out.println("Digite o ano atual:");
		aa = ler.nextInt();
		
		for (i=0; i<=10; i++) {
			
			System.out.println("Digite o ano de nascimento:");
			an = ler.nextInt();
			
			id = aa-an;
			System.out.println("A idade é:" + id);
			
		}
	ler.close();
	}
}
