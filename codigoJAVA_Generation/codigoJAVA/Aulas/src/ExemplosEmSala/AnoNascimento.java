package ExemplosEmSala;

import java.util.Scanner;

public class AnoNascimento {
	
	public static void main(String [] args) {
		
		//Variaveis
		int anoNascimento;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira seu ano de nascimento: ");
		anoNascimento = teclado.nextInt();
		
		System.out.println(ano(anoNascimento) + " anos de idade!");
		
		if(ano(anoNascimento) < 18)
		{
			System.out.println("sua idade � " + ano(anoNascimento) + "Voc� � Infanto Juvenil.");
		} 
		else if(ano(anoNascimento)<= 60)
		{
			System.out.println("Voc� � adulto!");
		} 
		else 
		{
			System.out.println("Voc� � idoso");
		}
	}
	
	 static int ano(int anoNascimento) {
		 int idade;
		
		idade = 2020 - anoNascimento;
		return idade;
	}
}
