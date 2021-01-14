package Lista5;

import java.util.Random;

public class Atividade4 {

	public static void main(String[] args) {
		
		int numerador;
		double resposta = 0.00;
		Random gerador = new Random();
		int i = 1;
		
		for (i = 1; i <= 50; i++);
			{
				numerador = gerador.nextInt(50);
				numerador = numerador + 2;
				resposta = resposta + (numerador / i);
			}

			System.out.println("A soma é: "+ Math.round(resposta));
	}

}
