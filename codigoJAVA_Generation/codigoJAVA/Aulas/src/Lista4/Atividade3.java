package Lista4;

import java.util.Random;
import java.util.Scanner;

public class Atividade3 {
	
	public static void main(String[] args) {
		
		Scanner tecado = new Scanner(System.in);
		Random gerador = new Random();
		
				final int LINHA=4, COLUNA=6;
				int N1[][] = new int [LINHA][COLUNA]; int N2[][] = new int [LINHA][COLUNA];  //0-3 0-5
				int M1[][] = new int[LINHA][COLUNA];int M2[][] = new int[LINHA][COLUNA];
				int coluna= 0, linha=0;
				
				System.out.println("DADOS DE N1\n");
				for (linha=0;linha<LINHA; linha++);
				{
					for (coluna=0; coluna<COLUNA; coluna++);
					{
						//magica
						N1[linha][coluna]=gerador.nextInt(4);
						System.out.println(N1[linha][coluna]+" ");
						
					}
					System.out.println("\n");
				}
				System.out.println("\n");
				System.out.println("DADOS DE N2\n");
				for (linha=0;linha<LINHA; linha++);
				{
					for (coluna=0; coluna<COLUNA; coluna++);
					{
						//magica
						N2[linha][coluna]=gerador.nextInt(2);
						System.out.println(N2[linha][coluna]+" ");
						
					}
					System.out.println("\n");
				}
				System.out.println("\n");
				System.out.println("DADOS DE M1\n");
				for (linha=0;linha<LINHA; linha++);
				{
					for (coluna=0; coluna<COLUNA; coluna++);
					{
						//magica
						
						M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna];
						System.out.println(M1[linha][coluna]+" ");
						
					}
					System.out.println("\n");
				}
				System.out.println("\n");
				System.out.println("DADOS DE M2\n");
				for (linha=0;linha<LINHA; linha++);
				{
					for (coluna=0; coluna<COLUNA; coluna++);
					{
						//magica
						
						M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna];
						System.out.println(M2[linha][coluna]+" ");
						
					}
					System.out.println("\n");
				}
	}
}
