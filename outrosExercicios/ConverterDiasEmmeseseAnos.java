import java.util.Scanner;
public class ConverterDiasEmmeseseAnos {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int numDias, numMeses, numAnos;
		//leia(numDias)
		System.out.println("Digite o número de dias:");
		numDias = ler.nextInt();
		//escreva numMeses
		numMeses=(numDias/30);
		System.out.println("O número convertido em meses é:" + numMeses);
		//escreva numAnos
		numAnos=(numDias/365);
		System.out.println("O número convertido em anos é:" + numAnos);
		ler.close();
		
	}
}
