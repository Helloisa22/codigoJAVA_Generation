package Lista2;

import java.util.Scanner;

public class Atividade8 {
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*Construa um sistema para ler uma vari�vel 
		num�rica N e imprimi-la somente se a mesma 
		for maior que 100, caso contr�rio imprimi-la
		com o valor zero.*/

	//Variaveis
		int numeroN;

	//Entrada
		System.out.println("Digite um n�mero de sua escolha: ");
		numeroN = teclado.nextInt();

	//Processamento
		if(numeroN >= 100)
		{
			System.out.println("o n�mero �: "+ numeroN);
		}
		else{
			System.out.println("N�mero 0");	//Saidas
		}
	}
}
