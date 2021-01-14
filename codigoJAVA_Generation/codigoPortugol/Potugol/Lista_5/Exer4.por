programa
{
	inclua biblioteca Matematica --> Mat
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
			Faça um programa que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50
		*/

		real numerador = 0.00
		real resposta = 0.00
		para (inteiro i = 1; i <= 50; i++)
		{
			numerador = Util.sorteia(1,50)
			numerador = numerador + 2
			resposta = resposta + (numerador / i)
		}

		escreva("A soma é: ", Mat.arredondar((resposta),2))

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */