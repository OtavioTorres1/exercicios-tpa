import java.util.Scanner;
public class exercicioFesta {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double sf, sm, tp, qs, qd, qgb, qml;
		System.out.println("Digite a quantidade de pessoas do sexo feminino:");
		sf = ler.nextDouble();	
		System.out.println("Digite a quantidade de pessoas do sexo masculino:");
		sm = ler.nextDouble();
		tp=(sf+sm);
		System.out.println("O n�mero total de pessoas �:" + tp);
		qs=(sf*10)+(sm*15);
		System.out.println("A quantidade de salgados a ser comprada �:" + qs);
		qd=(sf*8)+(sm*6);
		System.out.println("A quantidade de doces a ser comprada �:" + qd);
		qgb=tp*100;
		System.out.println("A quantidade de gramas do bolo �:" + qgb);
		qml=(sf*500)+(sm*600);
		System.out.println("A quantidade em ml de bebidas �:" + qml);
		ler.close();
		
	}
}
