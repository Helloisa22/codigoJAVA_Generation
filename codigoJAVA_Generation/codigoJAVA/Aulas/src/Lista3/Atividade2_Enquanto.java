package Lista3;

import java.util.Scanner;

public class Atividade2_Enquanto {
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner (System.in);

				int numero, i = 0;
				System.out.println("Digite um n�mero: ");
				numero = teclado.nextInt();

				while (i < 100)
				{
					numero = (numero * 3);
					i++;
					System.out.println("Os n�meros s�o: " + numero);
				}

		}
}
