import java.util.Scanner;
public class ConverterDiasEmmeseseAnos {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int numDias, numMeses, numAnos;
		//leia(numDias)
		System.out.println("Digite o n�mero de dias:");
		numDias = ler.nextInt();
		//escreva numMeses
		numMeses=(numDias/30);
		System.out.println("O n�mero convertido em meses �:" + numMeses);
		//escreva numAnos
		numAnos=(numDias/365);
		System.out.println("O n�mero convertido em anos �:" + numAnos);
		ler.close();
		
	}
}
