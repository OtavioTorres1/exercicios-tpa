import java.util.Scanner;
public class IpvaVeiculo {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double precoCarro, ipva;
		//leia (precoCarro)
		System.out.println("Digite o preço do carro:");
		precoCarro = ler.nextDouble();
		ipva=(precoCarro*0.04);
		//apresente ipva
		System.out.println("O valor do ipva é:" + ipva);
		ler.close();
		
		
	}
}
