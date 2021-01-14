package Lista3;

import java.util.Scanner;

public class Atividade2_FacaEnquanto {
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
				int numero, soma, i = 0;
				System.out.println("Digite um número");
				numero = teclado.nextInt();
				
				do 
				{
					soma = numero + 1;
					System.out.println(soma);
				}while (i <= soma);
				
		}
}
