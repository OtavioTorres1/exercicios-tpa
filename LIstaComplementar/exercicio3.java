package listaComplementar;
import java.util.Scanner;
public class exercicio3 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double s, sf, vf, abn;
	
	System.out.println("Digite o seu salário");
	s = in.nextDouble();
	
	System.out.println("você vai querer vender suas férias? digite 1 para sim, e 2 para não.");
	vf = in.nextDouble();
	
	if (vf==1) {
		abn = (s/30)*10+s;
		System.out.println("seu salário com ABONO será:" + abn);
		
	}else  if (vf==2) {
		sf = s+(s/3);
		System.out.println("seu salário durante as férias será:" + sf);
		
	} else {
		System.out.println("número inválido!!!");
	}
	in.close();
	
}
}
