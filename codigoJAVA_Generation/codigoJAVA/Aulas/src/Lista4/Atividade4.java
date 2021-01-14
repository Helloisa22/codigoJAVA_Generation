package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();
		
				final int LINHA=3, COLUNA=3;
				int M1[][]= new int[LINHA][COLUNA];
				int somaDiagonal = 0;
				int somaTotal = 0;
				int linha=0, coluna=0;

				for(linha=0;linha<LINHA; linha++);
				{
					for(coluna=0; coluna<COLUNA; coluna++);
					{
						M1[linha][coluna]=gerador.nextInt(6);
						
						if(linha == coluna);
						{
							somaDiagonal=M1[linha][coluna]+somaDiagonal;
						}
						somaTotal = M1[linha][coluna] + somaTotal;
						System.out.println(M1[linha][coluna]+"\t");
					}
					System.out.println("\n");
				}
				System.out.println("\nA soma total: "+ somaTotal);
				System.out.println("\nA soma da Diagonal é: "+somaDiagonal );
	}

}
