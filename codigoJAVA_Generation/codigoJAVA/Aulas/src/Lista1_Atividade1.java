import java.util.Scanner;

public class Lista1_Atividade1 {
	public static void main(String[] srgs)
	{
		/*
		 * Faça um sistema que leia a idade de 
		 * uma pessoa expressa em anos, meses e 
		 * dias e mostre-a expressa apenas em dias.
		 * 
		 */
		
		//VARIAVEIS
		int ano = 0; int mes; int dia;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite seu ano de Nascimento:");
		ano = leia.nextInt();
		
		System.out.println("Digite seus meses de nascimento:");
		mes = leia.nextInt();
		
		System.out.println("Digite seus dias de nascimento:");
		dia = leia.nextInt();
		
		dia = (dia+(ano*365)+(mes*30));
		
		System.out.println("Seus dias vivo são: " + dia);
	}
}
