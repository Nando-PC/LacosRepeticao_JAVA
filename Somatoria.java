package ExerciciosRepeticao;

import java.util.Scanner;

public class Somatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, soma=0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Entre com o número: ");
			N = ler.nextInt();
			soma +=N;
			
		}while(N != 0);
		
		System.out.println("\nA somatória dos valores digitados são: "+soma);

	}

	
}
