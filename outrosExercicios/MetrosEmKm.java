import java.util.Scanner;
public class MetrosEmKm {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int metros, quilometros;
		//leia (metros)
		System.out.println("Digite o valor em metros:");
		metros = ler.nextInt();
		quilometros=(metros/1000);
		//apresente quilometros
		System.out.println("O valor em quilômetros é:" + quilometros);
		ler.close();
	}
}
