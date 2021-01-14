programa
{
	
	funcao inicio()
	{
		/*
			4) Faça um sistema que leia um número inteiro e mostre uma 
			mensagem indicando se este número é par ou ímpar, e se é 
			positivo ou negativo.
		*/

		//Variaveis
		inteiro numeroA

		//entrada
		escreva("Digite um número inteiro: ")
		leia(numeroA)

		//processamento e Saidas
		se(numeroA % 2  == 0)
		{
			escreva("O número ", numeroA, " é par\n")
		}
		senao
		{
			escreva("O número ", numeroA, " é ímpar\n")
		}
		se (numeroA < 0)
		{
			escreva("Este número é Negativo\n")
		}senao
		{
			escreva("Este número é Positivo\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 344; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */