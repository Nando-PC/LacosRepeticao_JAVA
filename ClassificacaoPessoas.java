package ExerciciosRepeticao;

import java.util.Scanner;

public class ClassificacaoPessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 	pessoas=1, sexo, psico, idade, calmos=0, 
				mulherNervosa=0, homemAgressivo=0, outroCalmo=0, 
				nervosoQuarenta=0, calmoDezoito=0;
		
		Scanner ler = new Scanner(System.in);
		while(pessoas<=150) {
			System.out.println("\nQuantidade de Entrevistados: "+pessoas);
			System.out.println("\nEntre com sua idade: ");
			idade = ler.nextInt();
			while(idade<0) {
				System.out.println("\nIdade inválida. Entre com a idade: ");
				idade = ler.nextInt();
			}
		
			System.out.println("\n1 - Feminino");
			System.out.println("\n2 - Masculino");
			System.out.println("\n3 - Outros");
			System.out.println("Qual seu sexo: ");
			sexo = ler.nextInt();			
			
			System.out.println("\n1 - Calmo");
			System.out.println("\n2 - Nervoso");
			System.out.println("\n3 - Agressivo");
			System.out.println("Qual seu estado psicológico: ");
			psico = ler.nextInt();
			
			if(psico == 1) {
				calmos++;
			}
			else if(sexo == 1 && psico == 2) {
				mulherNervosa++;
			}
			else if(sexo == 2 && psico == 3) {
				homemAgressivo++;
			}
			else if(sexo ==3 && psico == 1) {
				outroCalmo++;
			}
			else if(idade>40 && psico == 2) {
				nervosoQuarenta++;
			}
			else if(idade<18 && psico == 1) {
				calmoDezoito++;
			}		
			
			pessoas++;
		}
		System.out.println("\nNúmero de Pessoas Calmas: "+calmos);
		System.out.println("\nNúmero de Mulheres Nervosas:"+mulherNervosa);
		System.out.println("\nNúmero de Homens Agressivos: "+homemAgressivo);
		System.out.println("\nNúmero de Outros Calmos: "+outroCalmo);
		System.out.println("\nNúmero de pessoas nervosas acima de 40anos: "+nervosoQuarenta);
		System.out.println("\nNúmero de pessoas calmas menores de 18anos: "+calmoDezoito);
		

	}

}
