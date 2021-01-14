programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
			Um dado é lançado 10 vezes e o valor
			correspondente é anotado. Faça um programa 
			que gere um vetor com os lançamentos, escreva 
			esse vetor. A seguir determine e imprima a média 
			aritmética dos lançamentos, contabilize e apresente 
			também quantas foram as ocorrências da maior pontuação.
		*/

		inteiro lancamento[10]
		real media = 0.0, soma = 0.0
		inteiro maiorPosicao = 0, maior = 0
		const inteiro divisao = 10
		
		para(inteiro i = 0; i<10; i++ )
		{
			lancamento[i] = Util.sorteia(1,6)
			escreva("\nLançamento:", lancamento[i])

			soma = lancamento[i] + soma
			se(lancamento[i] > maior)
			{
				maior = lancamento[i]
			}
		}

		para(inteiro i = 0; i < 10; i++)
		{
			se(lancamento[i] == maior)
			{
				maiorPosicao++
			}
		}

		escreva("\nA média foi: ", soma/divisao)
		escreva("\nO maior numero é: ", maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 811; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */