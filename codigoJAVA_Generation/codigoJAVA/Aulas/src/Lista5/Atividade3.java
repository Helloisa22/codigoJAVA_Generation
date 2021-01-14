package Lista5;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numA = 0, numB = 0, numC = 0, numD = 0, contador = 0, i;
				System.out.println("Digite um número até 100: ");
				i = teclado.nextInt();
				
				while( i < 0)
				{
					if(i >= 0 && i <= 25)
					{
						numA = i + 1;
					}
					else if( i >= 26 && i <= 50)
					{
						numB = i + 1;
					}
					else if( i >= 51 && i <= 75)
					{
						numC = i + 1;
					}
					else if( i >= 76 && i <= 100)
					{
						numD = i + 1;
					}
				}

					System.out.println("Intervalo1 "+numA);
					System.out.println("Intervalo2 "+numB);
					System.out.println("Intervalo3 "+numC);
					System.out.println("Intervalo4 "+numD);

	}

}
