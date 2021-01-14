package Lista5;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double valorProduto, recebeValor;
		char pagamento;
		double novoValor;

		System.out.println("======== Forma de Pagemento ==========\n");
		System.out.println("Insira o valor do produto: ");
		valorProduto = teclado.nextDouble();
		System.out.println("Escolha a forma de pagamento:\n[1] Á vista em dinheiro ou cheque\n[2] Á vista no cartão de crédito\n[3]Em duas vezes\n[4]Em três vezes");
		pagamento = teclado.next().charAt(0);

		if(pagamento == '1')
		{
			recebeValor =( valorProduto*0.20);
			System.out.println("O valor do produto é: "+ (valorProduto-recebeValor));
		} 
		else if(pagamento == '2')
		{
			recebeValor = valorProduto*0.15;
			 novoValor = valorProduto-recebeValor;
			System.out.println("O valor do produto é: "+ novoValor);
		}
		else if(pagamento == '3')
		{
			System.out.println("O valor do produto é: "+ valorProduto);
		}
		else if(pagamento == '4')
		{
			System.out.println("O valor do produto é: "+ valorProduto*0.10);
		}else{
			System.out.println("Código invalido! Digite um código valido");
		}
	}
}
