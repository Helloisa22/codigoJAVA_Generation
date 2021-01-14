import java.util.Scanner;

public class Lista1_Atividade6 {
	
	public static void main(String args []) {
		
		/*
		 * Construa um programa em c que, tendo como dados 
		 * de entrada dois pontos quaisquer no plano, P(x1, y1) e 
		 * P(x2, y2), escreva a distância entre eles. A fórmula 
		 *
		 */
		
		Scanner leia = new Scanner (System.in);
		
		//variaveis
				double x1=0.0; double x2=0.0; double y1=0.0; double y2=0.0; double d=0.0; double p1=0.0; double p2=0.0;

				//entradas de dados
				System.out.println("Valor de  X1:");
				x1 = leia.nextDouble();
				System.out.println("Valor de  X2:");
				x2 = leia.nextDouble();
				System.out.println("Valor de  Y1:");
				y1 = leia.nextDouble();
				System.out.println("Valor de  Y2:");
				y2 = leia.nextDouble();

				//Processamentos
				p1 = Math.sqrt((x2-x1));
				p2 = Math.sqrt((y2-y1));
				d =  Math.pow(p1 + p2,2);

				//Saida
				System.out.println("Valor de distância é "+ d);
	}
}
