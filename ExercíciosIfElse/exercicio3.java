import java.util.Scanner;
public class exercicio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double s, d, rs;
		System.out.println("Digite o valor do salário:");
		s= ler.nextDouble();
		
		System.out.println("Digite o valor das dívidas:");
		d= ler.nextDouble();
		
		rs=s-d;
		System.out.println("O valor da sobra é" + rs);
		if(rs<0) {
			System.out.println("Faltará dinheiro e faltará:" + rs);
		}else {
				System.out.println("Haverá dinheiro suficiente, e sobrará:" + rs);
				ler.close();
		}
		
	}
}
