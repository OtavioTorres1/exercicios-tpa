package listaComplementar;
import java.util.Scanner;
public class exercicio5 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double v, e, ufpa, tcpa, ufpd, cd, vfd, ce, ufe;
	
	System.out.println("Digite o valor:");
	v = in.nextDouble();
	
	System.out.println("Digite um número de 1 a 4");
	e = in.nextDouble();
	
	if (e>4 || e<1) {
		System.out.println("Número inválido!!!");
		
	}else if (e>3) {
		ufpa = v*166.78;
		System.out.println("o valor convertido em pesos Argentinos é:" + ufpa);
		
	}else if (e<2) {
		System.out.println("o valor será o mesmo " + v);
		
	}else if (e==3) {
		vfd = 0.18*v;
		System.out.println("O valor convertido em dólares é: " + vfd);
		
	}else {
		ufe = v*0.17;
		System.out.println("O valor convertido em euros é: " + ufe);
		
	}
	in.close();
}
}
