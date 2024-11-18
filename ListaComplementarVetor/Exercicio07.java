import java.util.Scanner;
public class Exercicio07 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM = 15;
		int i, a[], b[], n1, r;
		int j=1;
		
		a = new int[TAM];
		b = new int[TAM];
		
		System.out.println("Digite um número:");
		
		//lendo o vetor A

		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+" valor de A:");
			a[i] = ler.nextInt();
			
		}
		
		//lendo o vetor B
		
		for (i=0; i<TAM; i++) {
			
			b[i] = a[i];
			
		}
		
		//apresentando o vetor A
			
			System.out.print("A = [");
			for (i=0; i<TAM; i++) {
				if (i==15) {
					System.out.println(a[i]);
				}else {
					System.out.print(a[i]+" ");
				}
			}
			
			System.out.print("]\n");
			
			//apresentando o vetor B
			
			System.out.print("B = [");
			for (i=0; i<TAM; i++) {
				if (i==15) {
					
					switch (i) {
						
						case 1:
							
							n1 = a[i]-1;
							
							while (j==0) {
								
								r = a[i]*n1;
								
								n1 = n1-1;
								
								a[i] = r;
								
								j++;
								
								if (j==0) {
									
									System.out.println(r);
									
								}else {
									System.out.println("");
								}
								
							}
							
							break;
							
						case 2:
							
							n1 = a[i]-1;
							
							while (j==0) {
								
								r = a[i]*n1;
								
								n1 = n1-1;
								
								a[i] = r;
								
								j++;
								
								if (j==0) {
									
									System.out.println(r);
									
								}else {
									System.out.println("");
								}
								
							}

							
							break;
							
						case 3:
							
							n1 = a[i]-1;
							
							while (j==0) {
								
								r = a[i]*n1;
								
								n1 = n1-1;
								
								a[i] = r;
								
								j++;
								
								if (j==0) {
									
									System.out.println(r);
									
								}else {
									System.out.println("");
								}
								
							}

							
							break;
							
						case 4:
							
							n1 = a[i]-1;
							
							while (j==0) {
								
								r = a[i]*n1;
								
								n1 = n1-1;
								
								a[i] = r;
								
								j++;
								
								if (j==0) {
									
									System.out.println(r);
									
								}else {
									System.out.println("");
								}
								
							}
							
							break;
							
						case 5:
							
							n1 = a[i]-1;
							
							while (j==0) {
								
								r = a[i]*n1;
								
								n1 = n1-1;
								
								a[i] = r;
								
								j++;
								
								if (j==0) {
									
									System.out.println(r);
									
								}else {
									System.out.println("");
								}
								
							}
							
							break;
							
						case 6:
							
							n1 = a[i]-1;
							
							while (j==0) {
								
								r = a[i]*n1;
								
								n1 = n1-1;
								
								a[i] = r;
								
								j++;
								
								if (j==0) {
									
									System.out.println(r);
									
								}else {
									System.out.println("");
								}
								
							}

							
							break;
							
						case 7:
							
							n1 = a[i]-1;
							
							while (j==0) {
								
								r = a[i]*n1;
								
								n1 = n1-1;
								
								a[i] = r;
								
								j++;
								
								if (j==0) {
									
									System.out.println(r);
									
								}else {
									System.out.println("");
								}
								
							}
							
							break;
							
						case 8:
							
							n1 = a[i]-1;
							
							while (j==0) {
								
								r = a[i]*n1;
								
								n1 = n1-1;
								
								a[i] = r;
								
								j++;
								
								if (j==0) {
									
									System.out.println(r);
									
								}else {
									System.out.println("");
								}
								
							}

							
							break;
							
						case 9:
							
							n1 = a[i]-1;
							
							while (j==0) {
								
								r = a[i]*n1;
								
								n1 = n1-1;
								
								a[i] = r;
								
								j++;
								
								if (j==0) {
									
									System.out.println(r);
									
								}else {
									System.out.println("");
								}
								
							}
							
							break;
							
						case 10:
							
							n1 = a[i]-1;
							
							while (j==0) {
								
								r = a[i]*n1;
								
								n1 = n1-1;
								
								a[i] = r;
								
								j++;
								
								if (j==0) {
									
									System.out.println(r);
									
								}else {
									System.out.println("");
								}
								
							}
							
							break;
							
						case 11:
							
							n1 = a[i]-1;
							
							while (j==0) {
								
								r = a[i]*n1;
								
								n1 = n1-1;
								
								a[i] = r;
								
								j++;
								
								if (j==0) {
									
									System.out.println(r);
									
								}else {
									System.out.println("");
								}
								
							}

							
							break;
							
						case 12:
							
							n1 = a[i]-1;
							
							while (j==0) {
								
								r = a[i]*n1;
								
								n1 = n1-1;
								
								a[i] = r;
								
								j++;
								
								if (j==0) {
									
									System.out.println(r);
									
								}else {
									System.out.println("");
								}
								
							}
							
							break;
							
						case 13:
							
							n1 = a[i]-1;
							
							while (j==0) {
								
								r = a[i]*n1;
								
								n1 = n1-1;
								
								a[i] = r;
								
								j++;
								
								if (j==0) {
									
									System.out.println(r);
									
								}else {
									System.out.println("");
								}
								
							}
							
							break;
							
						case 14:
							
							n1 = a[i]-1;
							
							while (j==0) {
								
								r = a[i]*n1;
								
								n1 = n1-1;
								
								a[i] = r;
								
								j++;
								
								if (j==0) {
									
									System.out.println(r);
									
								}else {
									System.out.println("");
								}
								
							}
							
							break;
							
						case 15:
							
							n1 = a[i]-1;
							
							while (j==0) {
								
								r = a[i]*n1;
								
								n1 = n1-1;
								
								a[i] = r;
								
								j++;
								
								if (j==0) {
									
									System.out.println(r);
									
								}else {
									System.out.println("");
								}
								
							}
							
							break;
							
						
					
					}
					
				}else {
					
					System.out.print(" ");
					
				}
			}
			
			System.out.print("]\n");

			ler.close();
			
		}
	
	}

