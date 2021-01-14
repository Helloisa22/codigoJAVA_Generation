package Lista5;

import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.println("======== Calculando o IMC ==========\n");
		System.out.printf("Digite seu peso: ");
		peso = teclado.nextDouble();
		System.out.printf("Digite sua altura: ");
		altura = teclado.nextDouble();
		System.out.println("====================================");

		imc = (peso / Math.pow((altura),2));

		if(imc <= 18.5)
		{
			System.out.printf("Abaixo do peso\n");
		} 
		else if (imc > 18.5 && imc <= 25)
		{
			System.out.printf("Peso normal\n");
		}
		else if(imc > 25 && imc <= 30)
		{
			System.out.printf("Acima do peso\n");
		}
		else if(imc > 30)
		{
			System.out.println("Obeso");
		}
	}
}
