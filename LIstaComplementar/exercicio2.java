package listaComplementar;
import java.util.Scanner;
public class exercicio2 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double h, dp, vtb1, vtb2, vtbcb1, vtbcb2, b, b2, v1, v2;
	
	System.out.println("Digite o horário");
	h = in.nextDouble();
	
	System.out.println("Digite a distância percorrida pelo taxi");
	dp = in.nextDouble();
	
	if (h>=6 && h<20) {
		System.out.println("Bandeira 1");
		
		vtb1 = 4.50+2.75*dp;
		
		System.out.println("Vai usar bagagem? digite 1 para sim, e 2 para não");
		b = in.nextDouble();
		
		if (b==1) {
			System.out.println("digite o valor em kg do volume que vai ocupar o porta-malas:");
			v1 = in.nextDouble();
			
			vtbcb1 = vtb1+2.75*v1;
			System.out.println("o seu valor a pagar com a bagagem é" + vtbcb1);
			
		}else if (b==2) {
			System.out.println("o seu valor a pagar é:" + vtb1);
			
		}else {
			System.out.println("número inválido!!!");
			
		}
		
	}else if (h<20 && h<24 || h>0 && h<6) {
		System.out.println("Bandeira 2");
		
		vtb2 = 5.65+3.58*dp;
		
		System.out.println("Vai usar bagagem? digite 1 para sim, e 2 para não");
		b2 = in.nextDouble();
		
		if (b2==1) {
			System.out.println("digite o valor em kg do volume que vai ocupar o porta-malas:");
			v2 = in.nextDouble();
			
			vtbcb2 = vtb2+2.75*v2;
			System.out.println("o seu valor a pagar com a bagagem é" + vtbcb2);
			
		}else if (b2==2) {
			System.out.println("o seu valor a pagar é:" + vtb2);
			
		}else {
			System.out.println("número inválido!!!");
			
		}
	}
	in.close();
	}
}

