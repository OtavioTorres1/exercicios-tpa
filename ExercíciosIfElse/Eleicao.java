import java.util.Scanner;
public class Eleicao {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double ae, dn, i;
		System.out.println("digite o ano da pr�xima elei��o:");
		ae= ler.nextDouble();
		System.out.println("digite o ano de nascimento:");
		dn= ler.nextDouble();
		i=ae-dn;
		System.out.println("Sua idade no ano da elei��o ser�:" + i);
		if(i>=16) {
			System.out.println("Voc� pode votar");
			
		} else {
			System.out.println("Voc� n�o pode votar");
		}
		ler.close();
	}
}
