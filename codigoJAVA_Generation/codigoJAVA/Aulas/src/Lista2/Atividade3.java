package Lista2;

import java.util.Scanner;

public class Atividade3 {
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
			
		//variaveis
				int NumA; int NumB; int NumC; int NumD;

				//Entrada
				System.out.println("Escreva o primeiro número: ");
				NumA = teclado.nextInt();

				System.out.println("Escreva o segundo número: ");
				NumB = teclado.nextInt();

				System.out.println("Escreva o terceiro número: ");
				NumC  = teclado.nextInt();

				System.out.println("Escreva o quarto número: ");
				NumD = teclado.nextInt();

				int NA1;int NA2; int NA3;int NA4;
				NA1 = (NumA * NumA);
				NA2 = (NumB * NumB);
				NA3 = (NumC * NumC);
				NA4 = (NumD * NumD);

				//Processamento
				if(NA3 >= 1000)
				{
					System.out.println("O resutado da terceira conta é maior que 1000");
				}
				else
				{
					System.out.println("Resultado do primeiro: " + NA1 + "\n" +
						   "Resultado do segundo: " + NA2 +  "\n" + 
						   "Resultado do terceiro: " + NA3 +  "\n" +
						   "Resultado do quarto: " + NA4); 
				}//Saidas
				
	}
}
