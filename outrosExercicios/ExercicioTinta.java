import java.util.Scanner;
public class ExercicioTinta {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		double c, l, ln;
		
		System.out.println("Digite o comprimento da parede:");
		c = ler.nextDouble();
		
		System.out.println("Digite a a largura da parede:");
		l = ler.nextDouble();
		ln=(l*c)/3.8;
		
		System.out.println("Você precisará de:" + ln + " tintas");
		ler.close();
	}
}