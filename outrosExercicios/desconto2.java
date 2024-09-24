import java.util.Scanner;
public class desconto2 {
	public static void main (String arg[]) {
		Scanner ler = new Scanner(System.in);
		double valorproduto, pd, d, vf;
		System.out.println("Digite o valor do produto: ");
		valorproduto= ler.nextInt();
		System.out.println("Digite a porcentagem de desconto: ");
		pd= ler.nextInt();
		d=(valorproduto/100*pd);
		vf=(valorproduto-d);
		
		System.out.println("O resultado é: " + vf);
		ler.close();
		
		
	}
}
 