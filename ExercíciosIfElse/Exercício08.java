import java.util.Scanner;
public class Exerc�cio08 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	double n1, n2, m, ne, me;
	
	System.out.println("Digite a primeira nota");
	n1 = ler.nextDouble();
	
	System.out.println("Digite a segunda nota");
	n2 = ler.nextDouble();
	
	m=(n1+n2)/2;
	System.out.println("A m�dia das suas notas � igual a:" + m );
	
	if(m<3)
		System.out.println("Reprovado");
	
	else if (m>6)
		System.out.println("Aprovado");
	
	else if (m<6)
		System.out.println("O aluno est� em exame");
	
	System.out.println("Digite a nota do exame");
	ne = ler.nextDouble();
	
	me=(ne+m)/2;
	System.out.println("A m�dia da nota do exame com a m�dia anterior �:" + me );
	
	if(me<=6)
		System.out.println("Aprovado no exame");
	
	else {
		System.out.println("Reprovado no exame");
	} ler.close();
	
}
}
