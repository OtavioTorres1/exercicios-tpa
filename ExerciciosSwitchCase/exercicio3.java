package exercicioSwitchCase;
import java.util.Scanner;
public class exercicio3 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int a;
	double mb, b, r, i, p1, p2, p3, p4;
	
	System.out.println("Digite o número total de alunos da sala:");
	a = ler.nextInt();
	
	System.out.println("Digite o número de alunos que tiraram MB:");
	mb = ler.nextDouble();
	
	System.out.println("Digite o número de alunos que tiraram B:");
	b = ler.nextDouble();
	
	System.out.println("Digite o número de alunos que tiraram R:");
	r = ler.nextDouble();
	
	System.out.println("Digite o número de alunos que tiraram I:");
	i = ler.nextDouble();
	
	switch(a) {
	case a:
		p1 = mb/a*100;
		System.out.println("A porcentagem é:" + mb +a);
		p2 = b/a*100;
		System.out.println("A porcentagem é:" + b + a);
		p3 = r/a*100;
		System.out.println("A porcentagem é:" + r + a);
		p4 = r/a*100;
		System.out.println("A porcentagem é:" + i + a);
		break;
	default:
			System.out.println("inválido");
		
	}
	ler.close();
}
}
