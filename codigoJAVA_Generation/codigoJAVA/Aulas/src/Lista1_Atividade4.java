import java.util.Scanner;

public class Lista1_Atividade4 {
	
	public static void main(String[] args)
	{
		
		/*
		 *  Escreva  um sistema que leia tr�s n�meros 
		 *  inteiros e positivos (A, B, C) e calcule a 
		 *  seguinte express�o:
		 * */
		
		Scanner leia = new Scanner (System.in);
		
		int numeroA;int numeroB;int numeroC;int R;int S;
		float D;
		
		System.out.println("Digite o primeiro numero inteiro: ");
		numeroA = leia.nextInt();

		System.out.println("Digite o segundo numero inteiro: ");
		numeroB = leia.nextInt();

		System.out.println("Digite o terceiro numero inteiro: ");
		numeroC = leia.nextInt();

		R = (int) Math.sqrt(numeroA + numeroB);
		S = (int) Math.sqrt(numeroB + numeroC);

		D = (R + S) / 2;

		System.out.println("O calculo do tr�s valores e: " + D);
	}
}
