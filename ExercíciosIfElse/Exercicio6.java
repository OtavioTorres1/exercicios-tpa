import java.util.Scanner;
public class Exercicio6 {
public static void main(String[] args) {
	Scanner ler= new Scanner (System.in);
	int a, b, c;
	
	System.out.println("Digite o número A");
	a = ler.nextInt();
	
	System.out.println("Digite o número B");
	b = ler.nextInt();
	
	System.out.println("Digite o número C");
	c = ler.nextInt();
	
	if (a>b) (b>c) {
	
		System.out.println("c, b, a");
		
	} else if (a>c) {
		if (c>b)
		System.out.println("b, c, a");
		
	} else if (b>a) {
		if (a>c)
		System.out.println("c, a, b");
		
	} else if (b>c) {
		if (c>a)
		System.out.println("a, c, b");
		
	} else if (c>a) {
		if (a>b)
		System.out.println("b, a, c");
		
	} else {
		System.out.println("a, b, c");
		
	}
	ler.close();
}
}
