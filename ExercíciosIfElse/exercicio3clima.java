import java.util.Scanner;
public class exercicio3clima {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double f, c;
		System.out.println("Digite os graus em fahrenheit:");
		f= ler.nextInt();
		c=(f-32)/ 1.8;
		System.out.println( c + " graus celsius" );
		if(c<15) {
			System.out.println("Est� frio.");
		
	}else if(c<22) {
		System.out.println("Est� ameno.");
	}else {
		System.out.println("Est� calor.");
	} ler.close();
	}}

