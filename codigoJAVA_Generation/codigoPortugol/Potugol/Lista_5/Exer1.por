programa
{
	
	funcao inicio()
	{
		/*
			Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado. 
			Código Condição de pagamento 
			1 À vista em dinheiro ou cheque, recebe 20% de desconto 
			2 À vista no cartão de crédito, recebe 15% de desconto 
			3 Em duas vezes, preço normal de etiqueta sem juros 
			4 Em três vezes, preço normal de etiqueta mais juros de 10%
		*/

		real valorProduto, recebeValor
		caracter pagamento

		escreva("======== Forma de Pagemento ==========\n")
		pula()
		escreva("Insira o valor do produto: ")
		leia(valorProduto)
		pula()
		escreva("Escolha a forma de pagamento: [1] Á vista em dinheiro ou cheque...[2] Á vista no cartão de crédito..[3]Em duas vezes..[4]Em três vezes:")
		leia(pagamento)

		se(pagamento == '1')
		{
			recebeValor = valorProduto*0.20
			escreva("O valor do produto é: ", valorProduto-recebeValor)
		} 
		senao se(pagamento == '2')
		{
			recebeValor = valorProduto*0.15
			escreva("O valor do produto é: ", valorProduto-recebeValor)
		}
		senao se(pagamento == '3')
		{
			escreva("O valor do produto é: ", valorProduto)
		}
		senao se(pagamento == '4')
		{
			escreva("O valor do produto é: ", valorProduto*0.10)
		}senao{
			escreva("Código invalido! Digite um código valido")
		}
	}

	funcao pula()
	{
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 654; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */