programa
{
	
	funcao inicio()
	{
		/*
			1) Faça um programa que crie um vetor por leitura 
			com 5 valores de pontuação de uma atividade e 
			o escreva em seguida. Encontre após a maior 
			pontuação e a apresente.
		*/
		
		const inteiro TAMANHO = 5
		real notas[TAMANHO]
		inteiro maiorNota = 0

		para(inteiro i = 0; i < TAMANHO; i++)
		{
			escreva("\nDigite a ", i+1," nota: ")
			leia(notas[i])
			se(notas[i] > maiorNota)
			{
				maiorNota = notas[i]
			}
		}
		escreva("\nA maior nota é: ", maiorNota)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 222; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */