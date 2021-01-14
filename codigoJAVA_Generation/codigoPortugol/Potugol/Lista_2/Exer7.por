programa
{
	
	funcao inicio()
	{
		/*
		Receber valores de base e altura de um triângulo e 
		verificar se são valores válidos (positivos maiores que zero). 
		Em caso afirmativo, calcular a área do triângulo.

		 (base*altura)/2
		*/

		inteiro base, altura, area

		escreva("Digite o valor da base: ")
		leia(base)
		pula()
		escreva("Digite o valor da altura: ")
		leia(altura)

		se((base >= 0) e (altura >= 0)){
			area = ((base*altura)/2)
			pula()
			
			escreva("A area do trinagulo é: " + area)
		}
		senao{
			escreva("Valor incorreto, digite valores positivos maiores que zero")
		}
	}

	funcao pula(){
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 458; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */