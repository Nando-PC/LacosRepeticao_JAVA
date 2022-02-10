package ExerciciosRepeticao;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, jovem=0, idoso=0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("\nDigite -99 para encerrar ou entre com a idade: ");
			idade = ler.nextInt();
			if(idade>0 && idade<=21) {
				jovem++;
			}
			else if(idade>50) {
				idoso++;
			}
		}while(idade != -99);
		
		System.out.println("\nO total de pessoas menores de 21 anos é: "+jovem+"\nO total de pessoas maiores de 50 anos é: "+idoso);

	}
}
	
	
