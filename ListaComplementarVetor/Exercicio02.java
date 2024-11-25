import java.util.Scanner;
public class Exercicio02 {

					/* Criar um vetor A com 5 elementos inteiros. Escreva um programa que 
				imprima a tabuada de cada um dos elementos do vetor A. */
	
	public static void main(String[] args) {
		
Scanner ler = new Scanner(System.in);
		
		final int TAM = 5;
		
		int i, a[], r, t;
		
		a = new int[TAM];
		
		System.out.println("Digite um número:");
		
		//lendo o vetor A

		for (i=0; i<TAM; i++) {
			System.out.println("Entre com o "+(i+1)+" valor de A:");
			a[i] = ler.nextInt();
			
			
		}
		
		
		
		//apresentando o vetor A
			
			System.out.print("A = [");
			for (i=0; i<TAM; i++) {
				if (i==20) {
					System.out.println(a[i]);
				}else {
					System.out.print(a[i]+" ");
				}
			}
			
			System.out.print("]\n");
			
			//apresentando a tabuada
			
			System.out.println("tabuada do 1º número: ");
			for (i=0; i<TAM; i++) {
				if(i==0) {
					
					for(t=1; t<=10; t++) {
						r = a[i]*t;
						System.out.println(a[i]+"*"+ t + "=" + r);
					}
					
				}else {
					System.out.print("");
				}
			}
			
			
			//tabuada do 2º num
			
			System.out.println("tabuada do 2º número: ");
			for (i=0; i<TAM; i++) {
				if(i==1) {
					
					for(t=1; t<=10; t++) {
						r = a[i]*t;
						System.out.println(a[i]+"*"+ t + "=" + r);
					}
					
				}else {
					System.out.print("");
				}
			}
			
			
			//tabuada do 3º num
			
			System.out.println("tabuada do 3º número: ");
			for (i=0; i<TAM; i++) {
				if(i==2) {
					
					for(t=1; t<=10; t++) {
						r = a[i]*t;
						System.out.println(a[i]+"*"+ t + "=" + r);
					}
					
				}else {
					System.out.print("");
				}
			}
			
			
			//tabuada do 4º num
			
			System.out.println("tabuada do 4º número: ");
			for (i=0; i<TAM; i++) {
				if(i==3) {
					
					for(t=1; t<=10; t++) {
						r = a[i]*t;
						System.out.println(a[i]+"*"+ t + "=" + r);
					}
					
				}else {
					System.out.print("");
				}
			}
			
			
			//tabuada do 5º num
			
			System.out.println("tabuada do 5º número: ");
			for (i=0; i<TAM; i++) {
				if(i==4) {
					
					for(t=1; t<=10; t++) {
						r = a[i]*t;
						System.out.println(a[i]+"*"+ t + "=" + r);
					}
					
				}else {
					System.out.print("");
				}
			}
			
			ler.close();

	}}
