import java.util.Scanner;
public class DescontoProduto {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double valorP, porcentagemDesc, valorDesc, valorFinal;
		//leia(valorP)
		System.out.println("Digite o valor do produto:");
		valorP = ler.nextDouble();
		//leia(porcentagemDesc)
		System.out.println("Digite a porcentagem do desconto:");
		porcentagemDesc = ler.nextDouble();
		valorDesc=(porcentagemDesc/100)*valorP;
		//escreva valorDesc
		System.out.println("Seu desconto é:" + valorDesc);
		valorFinal=(valorP-valorDesc);
		//escreva valorFinal
		System.out.println("O valor do produto com o desconto é:" + valorFinal);
		ler.close();
	}
}
