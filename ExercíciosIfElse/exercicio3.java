import java.util.Scanner;
public class exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double s, d, rs;
		System.out.println("Digite o valor do sal�rio:");
		s= ler.nextDouble();
		
		System.out.println("Digite o valor das d�vidas:");
		d= ler.nextDouble();
		
		rs=s-d;
		System.out.println("O valor da sobra �" + rs);
		if(rs<0) {
			System.out.println("Faltar� dinheiro e faltar�:" + rs);
		}else {
				System.out.println("Haver� dinheiro suficiente, e sobrar�:" + rs);
				ler.close();
		}
		
	}
}
