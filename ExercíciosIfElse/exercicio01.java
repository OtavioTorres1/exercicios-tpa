import java.util.Scanner;
public class exercicio01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double s;
		System.out.println("Digite o valor do sal�rio:");
		s= ler.nextDouble();
		if(s<1302.00) {
			System.out.println("O seu sal�rio � menor que o sal�rio m�nimo");
		
	}else if(s==1302.00) {
		System.out.println("O seu sal�rio � igual ao sal�rio m�nimo");
	}else {
		System.out.println("Seu sal�rio � maior que o s�lario m�nimo");
	} ler.close();
	}}
