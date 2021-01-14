package Lista4;

import java.util.Scanner;

import java.util.Random;

public class Atividade2 {
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		 		Random gerador = new Random();
		
				int lancamento [] = new int [10];
				double media = 0.0, soma = 0.0;
				int maiorPosicao = 0, maior = 0;
				int divisao = 10;
				
				for(int i = 0; i<10; i++ )
				{
					lancamento[i] = gerador.nextInt(20);
					System.out.println("\nLançamento:"+ lancamento[i]);

					soma = lancamento[i] + soma;
					if(lancamento[i] > maior)
					{
						maior = lancamento[i];
					}
				}

				for(int i = 0; i < 10; i++);
				{
					int i = 0;
					if(lancamento[i] == maior)
					{
						maiorPosicao++;
					}
				}

				System.out.println("\nA média foi: " + soma/divisao);
				System.out.println("\nO maior numero é: " + maior);
	}
}
