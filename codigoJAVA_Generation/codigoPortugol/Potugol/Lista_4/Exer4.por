programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		/*
			Crie um programa que receba valores do 
			usuário para preencher uma matriz 3X3, e 
			em seguida, exiba a soma dos valores dela e a
			soma dos valores da primeira diagonal, ou seja, diagonal principal
		*/

		const inteiro LINHA=3, COLUNA=3
		inteiro M1[LINHA][COLUNA]
		inteiro somaDiagonal = 0
		inteiro somaTotal = 0

		para(inteiro linha=0;linha<LINHA; linha++)
		{
			para(inteiro coluna=0; coluna<COLUNA; coluna++))
			{
				M1[linha][coluna]=Util.sorteia(3,6)
				
				se(linha == coluna)
				{
					somaDiagonal=M1[linha][coluna]+somaDiagonal
				}
				somaTotal = M1[linha][coluna] + somaTotal
				escreva(M1[linha][coluna],"\t")
			}
			escreva("\n")
		}
		escreva("\nA soma total: ", somaTotal)
		escreva("\nA soma da Diagonal é: ",somaDiagonal )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 273; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */