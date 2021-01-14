package Lista2;

import java.util.Scanner;

public class Atividade8 {
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*Construa um sistema para ler uma variável 
		numérica N e imprimi-la somente se a mesma 
		for maior que 100, caso contrário imprimi-la
		com o valor zero.*/

	//Variaveis
		int numeroN;

	//Entrada
		System.out.println("Digite um número de sua escolha: ");
		numeroN = teclado.nextInt();

	//Processamento
		if(numeroN >= 100)
		{
			System.out.println("o número é: "+ numeroN);
		}
		else{
			System.out.println("Número 0");	//Saidas
		}
	}
}
