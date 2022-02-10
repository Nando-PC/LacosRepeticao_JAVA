package ExerciciosRepeticao;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, par=0, impar=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int i = 1; i<=10; i++) {
			System.out.println("Digite o "+i+"º número: ");
			System.out.println("\nEntre com o número: ");
			N = ler.nextInt();
			if(N%2==0) {
				par++;
			}
			else {
				impar++;
			}			
		}
		System.out.println("\nA quantidade de números pares informados é: "+par+" e números ímpares: "+impar);

	}

}
