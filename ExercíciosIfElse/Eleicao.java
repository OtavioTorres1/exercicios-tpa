import java.util.Scanner;
public class Eleicao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double ae, dn, i;
		System.out.println("digite o ano da próxima eleição:");
		ae= ler.nextDouble();
		System.out.println("digite o ano de nascimento:");
		dn= ler.nextDouble();
		i=ae-dn;
		System.out.println("Sua idade no ano da eleição será:" + i);
		if(i>=16) {
			System.out.println("Você pode votar");
			
		} else {
			System.out.println("Você não pode votar");
		}
		ler.close();
	}
}
