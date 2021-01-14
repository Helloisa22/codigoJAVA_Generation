import java.util.Scanner;

public class Lista1_Atividade7 {
	
	public static void main(String args []) {
		
		Scanner leia = new Scanner (System.in);
		
		/*
		 * 7. Um sistema de equações lineares do tipo:  
		 */
		
		//Variaveis
				int A; int B; int C; int D; int E; int F; int X; int Y;

				System.out.println("escreva um numero para o A: ");
				A = leia.nextInt();

				System.out.println("escreva um numero para o B: ");
				B = leia.nextInt();

				System.out.println("escreva um numero para o C: ");
				C = leia.nextInt();

				System.out.println("escreva um numero para o D: ");
				D = leia.nextInt();

				System.out.println("escreva um numero para o E: ");
				E = leia.nextInt();

				System.out.println("escreva um numero para o F: ");
				F = leia.nextInt();

				X = ((C*E) - (B*F)/(A*E) - (B*D));
				Y = ((A*F) - (C*D)/(A*E) - (B*D));

				System.out.println("O valores de X é: " + X + " e Y é " + Y);
	}
}
