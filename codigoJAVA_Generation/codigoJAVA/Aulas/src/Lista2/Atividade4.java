package Lista2;

import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numeroA;

		//entrada
		System.out.println("Digite um n�mero inteiro: ");
		numeroA = teclado.nextInt();

		//processamento e Saidas
		if(numeroA % 2  == 0)
		{
			System.out.println("O n�mero " + numeroA + " � par\n");
		}
		else
		{
			System.out.println("O n�mero " + numeroA + " � �mpar\n");
		}
		if (numeroA < 0)
		{
			System.out.println("Este n�mero � Negativo\n");
		}
		else
		{
			System.out.println("Este n�mero � Positivo\n");
		}
	}
}
