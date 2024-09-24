package exercicio030924;

public class exercicioA {
	public static void main(String[] args) {
		
		int i = 1;
		double j = 134;
		double p = 145;
		
		while (j<=p) {
					
			j = j+2.5;
			
			p = p+2.0;
			
			i = i + 1;	
			
		}
		System.out.println("joão vai ter:" + j);
		System.out.println("pedro vai ter:"+p);
		System.out.println("João vai ser mais alto que Pedro depois de:" + i);
		
	}
}
