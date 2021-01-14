package Lista4;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
				int TAMANHO = 5;
				double notas[] = new double [TAMANHO];
				int maiorNota = 0;

				for(int i = 0; i < TAMANHO; i++)
				{
					System.out.println("\nDigite a "+ (i+1) + "°" +" nota: ");
					notas[i] = teclado.nextDouble();
					
					if(notas[i] > maiorNota);
					{
						maiorNota = (int) notas[i];
					}
				}
				System.out.println("\nA maior nota é: "+ maiorNota);

	}
}
