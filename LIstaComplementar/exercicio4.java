package listaComplementar;
import java.util.Scanner;
public class exercicio4 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	double vp, j1, x1, x2, t1, da, xx1, t2;
	
	System.out.println("Digite o valor da prestação:");
	vp = in.nextDouble();
	
	System.out.println("digite os dias de atraso");
	da = in.nextDouble();
	
	j1 = (2*vp)/100;

	
	x1 = (0.01*vp)/100;
	
	
	x2 = x1*da;
	
	
	t1 = x2+j1+vp;
	
	
	if (da==45) {
		System.out.println("o valor atualizado da prestação é:" + t1);
		
	}else {
		xx1 = (3*t1)/100;
		
		t2 = xx1+t1;
		System.out.println("o valor atualizado da prestação é:" + t2);
		
	}
	in.close();
}
}
