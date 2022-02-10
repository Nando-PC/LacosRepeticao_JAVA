package ExerciciosRepeticao;

import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=1, N, multiplo=0, soma=0, media=0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("\nEntre com o número: ");
			N = ler.nextInt();
			if(N != 0) {
				multiplo = N*3;
				soma +=multiplo;
				media = soma/x;
				x++;
			}
			
			
		}while(N != 0);
		
		
		
		System.out.println("\nA média dos múltiplos dos valores digitados é: "+media);


	}

}
