package exercicioSwitchCase;
import java.util.Scanner;
public class exercicio3 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int a;
	double mb, b, r, i, p1, p2, p3, p4;
	
	System.out.println("Digite o n�mero total de alunos da sala:");
	a = ler.nextInt();
	
	System.out.println("Digite o n�mero de alunos que tiraram MB:");
	mb = ler.nextDouble();
	
	System.out.println("Digite o n�mero de alunos que tiraram B:");
	b = ler.nextDouble();
	
	System.out.println("Digite o n�mero de alunos que tiraram R:");
	r = ler.nextDouble();
	
	System.out.println("Digite o n�mero de alunos que tiraram I:");
	i = ler.nextDouble();
	
	switch(a) {
	case a:
		p1 = mb/a*100;
		System.out.println("A porcentagem �:" + mb +a);
		p2 = b/a*100;
		System.out.println("A porcentagem �:" + b + a);
		p3 = r/a*100;
		System.out.println("A porcentagem �:" + r + a);
		p4 = r/a*100;
		System.out.println("A porcentagem �:" + i + a);
		break;
	default:
			System.out.println("inv�lido");
		
	}
	ler.close();
}
}
