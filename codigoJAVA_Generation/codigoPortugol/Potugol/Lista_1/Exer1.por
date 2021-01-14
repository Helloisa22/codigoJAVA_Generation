programa
{
	
	funcao inicio()
	{
		inteiro ano, mes, dia
		
		escreva("Digite a seu ano de nascimento: ")
		leia(ano)

		escreva("Digite sua idade somente em meses: ")
		leia(mes)

		escreva("Digite sua idade somente em dias; ")
		leia(dia)

		dia = (dia+(ano*365)+(mes*30))

		escreva("Sua idade em dias é: " + dia)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 116; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */