package Lista2;

import java.util.Scanner;

public class Atividade7 {
	
	public static void main(String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*
		Receber valores de base e altura de um tri�ngulo e 
		verificar se s�o valores v�lidos (positivos maiores que zero). 
		Em caso afirmativo, calcular a �rea do tri�ngulo.

		 (base*altura)/2
		*/

		int base;int altura;int area;

		System.out.print("Digite o valor da base: ");
		base = teclado.nextInt();
		pula();
		System.out.print("Digite o valor da altura: ");
		altura = teclado.nextInt();
		pula();
		
		if((base >= 0) && (altura >= 0)){
			area = ((base*altura)/2);
			
			System.out.println("A area do trinagulo �: " + area);
		}
		else{
			System.out.println("Valor incorreto, digite valores positivos maiores que zero");
		}
	
	}
	
	public static void pula() {
		System.out.println("\n");
		
	}
}
