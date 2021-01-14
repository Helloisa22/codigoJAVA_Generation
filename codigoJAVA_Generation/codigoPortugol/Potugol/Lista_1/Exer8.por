programa
{
	inclua biblioteca Matematica --> Mat
	funcao inicio()
	{
		//variaveis
		real custoFabrica, custoCarroNovo, porcDistribuidor = 1.28, imposto = 1.45

		//entrada de dados
		escreva("Qual o custo de fabrica do carro: 	")
		leia(custoFabrica)

		//Processamento
		custoCarroNovo = ((custoFabrica * porcDistribuidor)* imposto)

		escreva("O valor do carro novo será: " + Mat.arredondar(custoCarroNovo, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 299; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */