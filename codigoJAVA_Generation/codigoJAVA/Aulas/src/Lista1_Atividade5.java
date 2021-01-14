import java.util.Scanner;

public class Lista1_Atividade5 {
	
	public static void main(String agrs []) {
		
		/*
		 * Faça um sistema que leia as 3 notas de um aluno e calcule 
		 * a média final deste aluno. Considerar que a média é ponderada 
		 * e que o peso das notas é: 2,3 e 5, respectivamente.
		 * */
		
		Scanner leia = new Scanner(System.in);
		
		
				//Variaveis
				float nota1;float nota2; float nota3; float media;

				//Entrada de dados
				System.out.println("Digite a nota 1: ");
				nota1 = leia.nextFloat();
				System.out.println("Digite a nota 2: ");
				nota2 = leia.nextFloat();
				System.out.println("Digite a nota 3: ");
				nota3 = leia.nextFloat();

				//Processamento
				media = (((nota1*2)+(nota2*3)+(nota3*5))/10);

				//Saida de dados
				System.out.println("A média ponderada é: "+ media);
		
	}
}
