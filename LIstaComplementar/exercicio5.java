package listaComplementar;
import java.util.Scanner;
public class exercicio5 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double v, e, ufpa, tcpa, ufpd, cd, vfd, ce, ufe;
	
	System.out.println("Digite o valor:");
	v = in.nextDouble();
	
	System.out.println("Digite um n�mero de 1 a 4");
	e = in.nextDouble();
	
	if (e>4 || e<1) {
		System.out.println("N�mero inv�lido!!!");
		
	}else if (e>3) {
		ufpa = v*166.78;
		System.out.println("o valor convertido em pesos Argentinos �:" + ufpa);
		
	}else if (e<2) {
		System.out.println("o valor ser� o mesmo " + v);
		
	}else if (e==3) {
		vfd = 0.18*v;
		System.out.println("O valor convertido em d�lares �: " + vfd);
		
	}else {
		ufe = v*0.17;
		System.out.println("O valor convertido em euros �: " + ufe);
		
	}
	in.close();
}
}
