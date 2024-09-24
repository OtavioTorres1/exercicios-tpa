import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		double pu, au, imc;
		
		System.out.println("Digite o seu peso");
		pu = in.nextDouble();
		
		System.out.println("Digite a altura do usuário");
		au = in.nextDouble();
		
		imc = pu/(au*au);
		System.out.println("seu imc é:" + imc);
		
		if (imc<18.5) {
			System.out.println("Excesso de magreza");
			 
		} else if (imc<=25) {
			System.out.println("Peso normal");
			
		} else if (imc<=30) {
			System.out.println("Excesso de peso" );
			
		} else if (imc<=35) {
			System.out.println("obesidade grau 1");
			
		} else if (imc<=40) {
			System.out.println("obesidade grau 2");
			
		} else {
			System.out.println("obesidade grau 3");
			
		}
		
	in.close();
	}
}
