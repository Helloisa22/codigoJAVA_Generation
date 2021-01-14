import java.util.Scanner;

public class Lista1_Atividade2 {
	
	/*
	 * Faça um sistema que leia a idade de 
	 * uma pessoa expressa em dias e mostre-a 
	 * expressa em anos, meses e dias.
	 */
	
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		
		int ano;int mes;int dias;int tempoDias = 0;
		
		
		System.out.println("Digite o tempo de vida em dias:");
		tempoDias = leia.nextInt();
		
		ano = (tempoDias/365);
		mes = (tempoDias%365)/30;
		dias = (tempoDias%365)%30;
		
		System.out.println("Ano(s): " + ano + " - mes(es): " + mes + " e " + dias + " dia(s).");
		
	}
}
