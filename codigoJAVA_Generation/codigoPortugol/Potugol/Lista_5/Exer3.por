programa
{
	
	funcao inicio()
	{
		/*
		Escrever um programa que leia uma quantidade desconhecida de 
		números e conte quantos deles estão nos seguintes intervalos:
		[0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve 
		terminar quando for lido um número negativo.
		*/

		inteiro numA = 0, numB = 0, numC = 0, numD = 0, contador = 0, i

			escreva("Digite um número até 100: ")
			leia(i)

		enquanto( i > 0)
		{

			se(i >= 0 e i <= 25)
			{
				numA = numA + 1
			}
			senao se( i >= 26 e i <= 50)
			{
				numB = numB + 1
			}
			senao se( i >= 51 e i <= 75)
			{
				numC = numC + 1
			}
			senao se( i >= 76 e i <= 100)
			{
				numD = numD + 1
			}
		}

			escreva("Intervalo1 ",numA)
			pula()
			escreva("Intervalo2 ",numB)
			pula()
			escreva("Intervalo3 ",numC)
			pula()
			escreva("Intervalo4 ",numD)
		
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
 * @POSICAO-CURSOR = 348; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */