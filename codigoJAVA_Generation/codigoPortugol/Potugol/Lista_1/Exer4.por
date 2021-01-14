programa
{
	inclua biblioteca Matematica --> Mat
	funcao inicio()
	{
		inteiro numeroA, numeroB, numeroC, R, S
		real D
		
		escreva("Digite o primeiro numero inteiro: ")
		leia(numeroA)

		escreva("Digite o segundo numero inteiro: ")
		leia(numeroB)

		escreva("Digite o terceiro numero inteiro: ")
		leia(numeroC)

		R = Mat.potencia((numeroA + numeroB),2)
		S = Mat.potencia((numeroB + numeroC), 2)

		D = ((R + S) / 2)

		escreva("O calculo do três valores e: " + D)
		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 325; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */