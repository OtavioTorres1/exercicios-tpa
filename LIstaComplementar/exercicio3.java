package listaComplementar;
import java.util.Scanner;
public class exercicio3 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	double s, sf, vf, abn;
	
	System.out.println("Digite o seu sal�rio");
	s = in.nextDouble();
	
	System.out.println("voc� vai querer vender suas f�rias? digite 1 para sim, e 2 para n�o.");
	vf = in.nextDouble();
	
	if (vf==1) {
		abn = (s/30)*10+s;
		System.out.println("seu sal�rio com ABONO ser�:" + abn);
		
	}else  if (vf==2) {
		sf = s+(s/3);
		System.out.println("seu sal�rio durante as f�rias ser�:" + sf);
		
	} else {
		System.out.println("n�mero inv�lido!!!");
	}
	in.close();
	
}
}
