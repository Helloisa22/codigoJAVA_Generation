import java.util.Scanner;

public class Lista1_Atividade8 {
	
	public static void main(String args []) {
		
		Scanner leia = new Scanner (System.in);
		
		/*
		 *  8. O custo ao consumidor de um carro novo é a soma 
		 *  do custo de fábrica com a percentagem do distribuidor e
		 *   dos impostos (aplicados ao custo de fábrica). Supondo que a
		 *    percentagem do distribuidor seja de 28% e os impostos de 
		 *    45%, escrever um sistema que leia o custo de fábrica de um 
		 *    carro e escreva o custo ao consumidor.
		 */
		
		//variaveis
			double custoFabrica; double custoCarroNovo; double porcDistribuidor = 1.28; double imposto = 1.45;

				//entrada de dados
				System.out.println("Qual o custo de fabrica do carro: 	");
				custoFabrica = leia.nextDouble()
;
				//Processamento
				custoCarroNovo = ((custoFabrica * porcDistribuidor)* imposto);

				System.out.println("O valor do carro novo será: " + custoCarroNovo);
	}
}
