package listaComplementar;
import java.util.Scanner;
public class questao1 {
public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	double c, d, d1;
	 
	System.out.println("Digite um n�mero de 1 a 2");
	c = in.nextDouble();
	
	if (c>2) {
		System.out.println("n�o foi autorizado");
		
	} else if (c==2) {
		System.out.println("Digite a quantidade de dias");
		d = in.nextDouble();
		
		if (d>10) {
			System.out.println("Voc� deve pagar RS 620.00");
			
		} else if (d<5) {
			System.out.println("Voc� deve pagar RS 500.00");
			
		} else {
			System.out.println("Voc� dev pagar RS 560.00");
			
		}
	} else {
		System.out.println("Ler a quantidade de dias");
		d1 = in.nextDouble();
		
		if (d1>10) {
			System.out.println("Voc� deve pagar RS 360.00");
			
		} else if (d1<5) {
			System.out.println("Voc� deve pagar RS 240.00");
			
		} else {
			System.out.println("Voc� deve pagar RS 350.00");
		}
	}
	in.close();
	}
	
		
	}


