import java.util.Scanner;
public class ExercicioConversao {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double vl, ce, vr;
		//leia (vl)
		System.out.println("Digite o valor em euros: ");
		vl = ler.nextDouble();
		//leia ce
		System.out.println("Digite a cotação do euro: ");
		ce = ler.nextDouble();
		vr=(vl*ce);
		//apresente vr
		System.out.println("O valor convertido em reais é: " + vr);
		ler.close();
	}
}